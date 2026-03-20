package com.joaovinicius.cadastrodeusuario;

//Bloco de Importações
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

//Class principal
public class CreateUser extends AppCompatActivity {
    textInputEditText editNome, editEmail;

    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.create_user);

        //Vincula variavel com elemento de interface gráfica, escrito no arquivo xml
        editNome = findViewById(R.id.nome_completo);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.bntSalvar);


        btnSalvar.setOnClickListener(v -> {
            String nome     = editNome.getText().toString();
            String email    = editEmail.getText().toString();


            if(!nome.isEmpty()){
                MainActivity.listaNomes.add(nome + "(" + email + ") ");
                finish();
            }
        });
    }


}
