package com.joaovinicius.cadastrodeusuario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        //Declaração dos componentes visuais e do adaptador da lista
    RecyclerView recyclerView;
    UserAdapter adapter;
    Button btnCadastrar;

    //Atenção: Atributo estático (static) permite que os dados persistam na memória
    //enquanto o app estiver aberto e sejam acessados diretamente por outras telas (Activities)
    public static List<String> listaNomes = new ArrayList<>();

    //Método de inicialização da Activity (ponto de entrada da tela)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Vincula o arquivo de layout XML (activity_main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        //Regra de nogócio; insere um texto do topo da lista, caso ela esteja vazia
        if (listaNomes.isEmpty()){
            listaNomes.add("Nomes de cadastro");
        }

        //Mapeamento dos componetes do RecyclerView do XML para o objetivo java
        recyclerView = findViewById(R.id.recycle_view);

        //Define o LayoutManager: organiza itens da lista numa coluna  vertical simples
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Intancia o adaptador passando a nossa lista de nomes
        adapter = new UserAdapter(listaNomes);

        //Conecta o adaptador ao RecycleView para que os dados sejam desenhados na tela
        recyclerView.setAdapter(adapter);

        //Mapeamento o botão de cadastro
        btnCadastrar = findViewById(R.id.btnCadastrar);

        //Configura o evento de clique usando a expressão lambda (java 8+)
        btnCadastrar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CreateUser.class));
        });
    }

    //Metodo chamado sempre que a tela volta a ficar visivel para o usuario
    @Override
    protected void onResume(){
        super.onResume();
        //Avisar o adaptador que a fonte de dados (listaNome) pode ter sido alterada
        //na outra tela, forçando a atualização visual da lista
        adapter.notifyDataSetChanged();

    }
}