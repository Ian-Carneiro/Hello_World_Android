package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                TextView tv = findViewById(R.id.editText);
                String msg = tv.getText().toString();
                Toast.makeText(MainActivity.this,"Hello "+msg+"!", Toast.LENGTH_LONG).show();
                setContentView(R.layout.hello);

            }
        });
    }
}
