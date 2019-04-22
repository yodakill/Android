package com.example.media;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //intanciar objeto

    private EditText campo1;
    private EditText campo2;
    private TextView resultado;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Obter id
        campo1 = (EditText)findViewById(R.id.txt_num1);
        campo2 = (EditText)findViewById(R.id.txt_num2);
        resultado = (TextView)findViewById(R.id.txt_resultado);
    }

    // Metodo realizar soma

    public  void  Soma (View view){
        String valor1 = campo1.getText().toString();
        String valor2 = campo2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int caculo = (num1+num2);

        //mostrar resultado

        String result = String.valueOf(caculo);
        resultado.setText(result);




    }



}
