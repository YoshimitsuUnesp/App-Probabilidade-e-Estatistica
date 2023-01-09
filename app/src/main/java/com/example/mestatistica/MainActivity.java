package com.example.mestatistica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtEmail;
    private EditText edtSenha;
    private TextView txtEsqueciSenha;
    private Button btnEntrar;
    private Button btnNaoPossuiConta;
    private TextView txtComecarSemLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void leDados(){

    }
}