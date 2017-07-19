package com.example.alumno.promedio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText nf1;
    private EditText nf2;
    private EditText nf3;

    private CheckBox cb1;

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nf1 = (EditText) findViewById(R.id.nf1);
        nf2 = (EditText) findViewById(R.id.nf2);
        nf3 = (EditText) findViewById(R.id.nf3);

        cb1 = (CheckBox) findViewById(R.id.cb1);

        tv1 = (TextView) findViewById(R.id.tv1);
    }

    public void calcular(View view) {
        

        float promedio = (Integer.parseInt(nf1.getText().toString())  +
                          Integer.parseInt(nf2.getText().toString()) +
                          Integer.parseInt(nf3.getText().toString()))
                          / 3;

        if (!cb1.isSelected())
                promedio *= 0.9;

        tv1.setText(String.valueOf(Math.round(promedio)));

        nf1.setText("");
        nf2.setText("");
        nf3.setText("");

    }
}
