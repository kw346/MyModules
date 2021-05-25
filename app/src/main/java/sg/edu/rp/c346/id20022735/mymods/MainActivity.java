package sg.edu.rp.c346.id20022735.mymods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.buttonWeb);
        b2 = findViewById(R.id.buttonSoft);
        b3 = findViewById(R.id.buttonUIUX);
        b4 = findViewById(R.id.buttonSecurity);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("Module Code","C203");
                intent.putExtra("Module Name","Web AppIn Development in php");
                intent.putExtra("Academic Year ",2021);
                intent.putExtra("Semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W67N");
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("Module Code","C206");
                intent.putExtra("Module Name","Software Development Process");
                intent.putExtra("Academic Year ",2021);
                intent.putExtra("Semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W67N");
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("Module Code","C218");
                intent.putExtra("Module Name","UI/UX Design for Apps");
                intent.putExtra("Academic Year ",2021);
                intent.putExtra("Semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W64G");
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("Module Code","C235");
                intent.putExtra("Module Name","IT Security and Management");
                intent.putExtra("Academic Year ",2021);
                intent.putExtra("Semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W67N");
                startActivity(intent);
            }
        });

    }
}