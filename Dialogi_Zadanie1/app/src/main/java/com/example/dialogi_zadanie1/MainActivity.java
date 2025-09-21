package com.example.dialogi_zadanie1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private int licznik = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);

        textView = findViewById(R.id.licznik);


    if(savedInstanceState != null){
        licznik = savedInstanceState.getInt("licznik_KEY");

        textView.setText("ilosc klikniec: "+licznik);
    }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik +=1;
                textView.setText("ilosc klikniec: "+licznik);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){

        outState.putInt("licznik_KEY",licznik);
        super.onSaveInstanceState(outState);

    }

}