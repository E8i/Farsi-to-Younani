package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class murizo extends AppCompatActivity {

    private Button back65,home31,murizo1,murizo2,murizo3,murizo4,murizo5,murizo6,murizo7,murizo8,murizo9,
            murizo10,murizo11,murizo12,murizo13,murizo14,murizo15,murizo16,murizo17,murizo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murizo);

        home31=findViewById(R.id.home31);
        home31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(murizo.this,MainActivity.class);
                startActivity(in);
            }
        });

        back65=findViewById(R.id.back65);
        back65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(murizo.this,Edame2.class);
                startActivity(in);
            }
        });

    }
}