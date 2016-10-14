package id.sch.smktelkom_mlg.tugas01.xiirpl4010.roledota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;


public class MainActivity extends AppCompatActivity
{
    EditText etNama;
    Button bOk;
    RadioButton rbR, rbD;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        bOk = (Button) findViewById(R.id.buttonOk);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        bOk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                doProses();
                doClick();
            }
        });
    }

    private void doClick()
    {

    }

    private void doProses()
    {
        String nama = etNama.getText().toString();

        rbR = (RadioButton) findViewById(R.id.radioButtonR);
        rbD = (RadioButton) findViewById(R.id.radioButtonD);

        tvHasil.setText(nama);
    }
}
