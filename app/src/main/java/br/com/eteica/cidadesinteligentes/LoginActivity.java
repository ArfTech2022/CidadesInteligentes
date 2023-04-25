package br.com.eteica.cidadesinteligentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText btusuario, btsenha;
    Button usua1, senha1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        usua1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                String usuario, senha;
                usuario = btusuario.getText().toString();
                senha = btsenha.getText().toString();

                if (usuario.equals("etecia") && senha.equals("etecia")){
                    startActivity(new Intent(getApplicationContext(),
                            MenuActivity.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Usuario ou senha inválido",
                            Toast.LENGTH_SHORT).show();
                    btusuario.setText("");
                    btsenha.setText("");
                    btusuario.requestFocus();

                }
            }
        });
    }
}