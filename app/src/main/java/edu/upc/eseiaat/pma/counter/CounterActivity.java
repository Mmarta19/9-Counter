package edu.upc.eseiaat.pma.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    private int con;
    TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        num = (TextView) findViewById(R.id.number);
        con=0;
    }


    public void plus(View view) {
        con++;
        num.setText(String.format("%d",con));

    }

    public void minus(View view) {
        con--;
        num.setText(String.format("%d",con));
    }

    public void exit(View view) {
        finish();

    }
}
