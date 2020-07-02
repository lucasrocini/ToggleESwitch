package com.example.toggleeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResultado;
    private TextView textResultado2;
    private TextView textResultado3;
    private CheckBox checkSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);
        textResultado2 = findViewById(R.id.textResultado2);
        textResultado3 = findViewById(R.id.textResultado3);
        checkSenha = findViewById(R.id.checkSenha);

        adicionarListener();
    }

    public void adicionarListener(){

        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( switchSenha.isChecked() ){
                    textResultado.setText("switch ligado");
                }else{
                    textResultado.setText("switch desligado");
                }
            }
        });

    }

    public void enviar(View view){
        if( switchSenha.isChecked() ){
            textResultado.setText("switch ligado");
        }else{
            textResultado.setText("switch desligado");
        }

        if( toggleSenha.isChecked() ){
            textResultado2.setText("toggle ligado");
        }else{
            textResultado2.setText("toggle desligado");
        }

        if( checkSenha.isChecked() ){
            textResultado3.setText("check ligado");
        }else{
            textResultado3.setText("check desligado");
        }
    }
}

