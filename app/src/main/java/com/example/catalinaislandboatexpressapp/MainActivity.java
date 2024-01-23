package com.example.catalinaislandboatexpressapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
        double costPerTicket= 34;
        int numberOfTickets;
        double totalCost;
        String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ticket= findViewById(R.id.editTextNumber);
        final Spinner group= findViewById(R.id.spinner);
        Button cost= findViewById(R.id.button);
        NumberFormat format=NumberFormat.getCurrencyInstance(Locale.UK);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result= findViewById(R.id.textView2);
            @Override
            public void onClick(View view) {
                numberOfTickets= Integer.parseInt(ticket.getText().toString());
                totalCost= costPerTicket*numberOfTickets;
                groupChoice= group.getSelectedItem().toString();
                result.setText("Cost for "+groupChoice+" is "+format.format(totalCost));
            }
        });
    }
}