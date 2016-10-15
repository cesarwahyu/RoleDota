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
    RadioGroup rgTeam;
    CheckBox cbC, cbS, cbO;
    Spinner spType, spHero;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        bOk = (Button) findViewById(R.id.buttonOk);

        cbC = (CheckBox) findViewById(R.id.cbCarry);
        cbS = (CheckBox) findViewById(R.id.cbSupport);
        cbO = (CheckBox) findViewById(R.id.cbOfflaner);

        spType = (Spinner) findViewById(R.id.spinnerType);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener()
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
        String hasil = null;
        String nama = etNama.getText().toString();
        String job = "\n";

        int startlen = job.length();
        if (cbC.isChecked()) job+=cbC.getText()+"\n";
        if (cbS.isChecked()) job+=cbS.getText()+"\n";
        if (cbO.isChecked()) job+=cbO.getText()+"\n";

        if (job.length()==startlen) job+="Kosong";

        if (rgTeam.getCheckedRadioButtonId() != -1)
        {
            RadioButton rb = (RadioButton)
                    findViewById(rgTeam.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }

            if (hasil == null)
            {
                tvHasil.setText("Data Belum Terisi Dengan Benar");
            }
            else
            {
                tvHasil.setText("Nama Anda : " + nama + "\nTeam Anda : " + hasil + "\nJob Anda :" + job + " Hero Anda : " + spType.getSelectedItem().toString());
            }


        }

    private void doProses()
    {
        String nama = etNama.getText().toString();

        rgTeam = (RadioGroup) findViewById(R.id.radioGroupTeam);

        tvHasil.setText(nama);
    }
}
