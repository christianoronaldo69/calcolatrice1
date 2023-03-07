package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button somma =(Button) findViewById(R.id.btnSomma);
        EditText v1 =(EditText) findViewById(R.id.editTextN2);
        EditText v2 =(EditText) findViewById(R.id.editTextN2);
        TextView tot =(TextView) findViewById(R.id.textViewRisultato);

        somma.setOnCliclListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
            int totale = 0;
            totale=Integer.valueOf(v1.getText().toString()) + Integer.valueOf(v2.getText().toString());
            tot.setText(" "+totale);
            }
        }
    }
}