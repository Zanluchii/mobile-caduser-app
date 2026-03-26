package com.joaovinicius.cadastrodeusuario;

import android.text.style.AlignmentSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


//Classe Adapter: Gerencia e criação e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    //Atributo privado que armazena a referencia dos dados que serão exibidos
    private List<String> ListaUsuario;

    //Construtor que permite que MainActivity "entregue" a lista de dados para este Adapter

    public UserAdapter(List<String> lista){
        this .ListaUsuario = lista;
    }

    //Método 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType){
        //LayoutInflater transforma o arquivo XML em um objeto View java
        //Aqui usamos um layout padrão do Android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        //Retorna uma nova instancia da nossa classe interna ViewHolder com a View Criada
        return new ViewHolder(view);
    }

    //Metodo 2: Vincula os dados de um objeto de lista a uma linha especifica da tela
    @Override
    public void onBindViewHolder (@NonNull RecyclerView.ViewHolder holder, int position){
        //Recupera os dados da lista de acordo com a posição que o android está desenhando agora
        String nome = ListaUsuario.get(position);

        //Define o texto no componente visual que está guardado dentro de 'holder'
        holder.tvNome.setText(nome);
    }

    //Metodo 3: Informa ao Android quantos itens de lista possui ao todo
    @Override
    public int getItemCount(){
        //Se a lista existir, retorna o tamanho. Se não, retorna zero
        return ListaUsuario != null ? ListaUsuario.size(): 0;
    }

    //Classe interna ViewHolder: Servir para "segurar" as referencias dos componentes de cada linha
    //Evitar chmadas respectivas ao findeViewById, melhorando a performace do RecycleView
    public class ViewHolder extends RecyclerView.ViewHolder{
        //Referencia para o TextView  da linha
        TextView tvNome;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            //Faz o mapeamento do ID do layout para o objeto java
            //android.R.id.text1 é o ID padrão do layout 'simple_list_item_1'
            tvNome = itemView.findViewById(android.R.id.text1);

        }
    }

}
