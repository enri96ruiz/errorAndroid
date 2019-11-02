package com.example.vt2_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*Siempre debe llamar a su superclase al implementar estos métodos.*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView.append("onCreate;\n");
        String texto = "onCreate()";
        //AVISOS
        /*Primero, crea una instancia de un objeto Toast con uno de los métodos makeText().
         Este método toma tres parámetros: el valor Context de la app, el mensaje de texto y la duración del aviso.
          Devuelve un objeto de aviso correctamente inicializado. Puedes mostrar el aviso con show()*/
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart(){
        /*Siempre debe llamar a su superclase al implementar estos métodos.*/
        //se llama al constructor padre
        super.onStart();
        textView.append("onStart;\n");
        String texto = "onStart()";
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        textView.append("onResume;\n");
        String texto = "onResume()";
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        /*Siempre debe llamar a su superclase al implementar estos métodos.*/
        super.onRestart();
        textView.append("onRestart;\n");
        String texto = "onRestart()";
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        /*Siempre debe llamar a su superclase al implementar estos métodos.*/
        super.onStop();
        textView.append("onStop;\n");
        String texto = "onStop()";
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        /*Siempre debe llamar a su superclase al implementar estos métodos.*/
        super.onPause();
        textView.append("onPause;\n");
        String texto = "onPause()";
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        textView.append("onDestroy;\n");
        String texto = "onDestroy()";
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }


    public void irActivity0(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
        finish();
    }

    public void changeActivityForResult(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("name","value");
        startActivityForResult(intent,2);

    }
}

