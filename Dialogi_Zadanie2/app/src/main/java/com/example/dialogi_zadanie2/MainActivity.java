package com.example.dialogi_zadanie2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }


    @Override

     public  void  onBackPressed(){
        // Tworzenie buildera dialogu
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        // Ustawianie tytułu i wiadomości
        builder.setTitle("Potwierdzenie");
        builder.setMessage("Czy na pewno chcesz zamknąć aplikację?");

        // Ustawianie przycisku pozytywnego ("Tak")
        builder.setPositiveButton("Tak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Akcja po kliknięciu "Tak" - zamknięcie aktywności
                MainActivity.super.onBackPressed();
            }
        });

        // Ustawianie przycisku negatywnego ("Nie")
        builder.setNegativeButton("Nie", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Akcja po kliknięciu "Nie" - zamknięcie dialogu
                dialog.dismiss();
            }
        });

        // Stworzenie i wyświetlenie dialogu
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}