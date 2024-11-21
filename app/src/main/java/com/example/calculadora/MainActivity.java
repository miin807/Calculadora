package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView num1,num2,visua;
    private Button sum, res,div,mul;
    private EditText edit1, edit2;


    private int valor1, valor2, resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //textview
        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);
        visua = findViewById(R.id.visualizar);
        //botones
        sum = findViewById(R.id.sumar);
        res = findViewById(R.id.restar);
        div = findViewById(R.id.dividir);
        mul = findViewById(R.id.multiplicar);

        //editable
        edit1 = findViewById(R.id.editable1);
        edit2 = findViewById(R.id.editable2);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Integer.parseInt(edit1.getText().toString());
                valor2 = Integer.parseInt(edit2.getText().toString());

                resultado=valor1+valor2;
                visua.setText("El resultado es "+resultado);
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Integer.parseInt(edit1.getText().toString());
                valor2 = Integer.parseInt(edit2.getText().toString());

                resultado=valor1-valor2;
                visua.setText("El resultado es "+resultado);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Integer.parseInt(edit1.getText().toString());
                valor2 = Integer.parseInt(edit2.getText().toString());

                resultado=valor1*valor2;
                visua.setText("El resultado es "+resultado);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Integer.parseInt(edit1.getText().toString());
                valor2 = Integer.parseInt(edit2.getText().toString());

                resultado=valor1/valor2;
                visua.setText("El resultado es "+resultado);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}