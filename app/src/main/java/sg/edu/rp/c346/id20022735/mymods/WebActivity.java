package sg.edu.rp.c346.id20022735.mymods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        tv1 = findViewById(R.id.textViewC);
        tv2 = findViewById(R.id.textViewName);
        tv3 = findViewById(R.id.textViewYr);
        tv4 = findViewById(R.id.textViewSem);
        tv5 = findViewById(R.id.textViewCr);
        tv6 = findViewById(R.id.textViewPl);
        btn1 = findViewById(R.id.button);

        Intent intentRec = getIntent();

        String mc = intentRec.getStringExtra("Module Code");
        String mn = intentRec.getStringExtra("Module Name");
        int yr = intentRec.getIntExtra("Academic Year ",0);
        int sem = intentRec.getIntExtra("Semester",0);
        int mcr = intentRec.getIntExtra("Module Credit", 0);
        String ven = intentRec.getStringExtra("Venue");

        tv1.setText("Module Code: " + mc);
        tv2.setText("Name: " + mn );
        tv3.setText("Academic Year: " + yr);
        tv4.setText("Semester: " + sem);
        tv5.setText("Credit: " + mcr);
        tv6.setText("Venue: " + ven);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}