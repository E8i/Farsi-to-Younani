package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Harfe_seda_dar extends AppCompatActivity {

    private Button back67,home33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfe_seda_dar);

        back67=findViewById(R.id.back67);
        back67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harfe_seda_dar.this,grammar.class);
                startActivity(in);
            }
        });

        home33=findViewById(R.id.home33);
        home33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harfe_seda_dar.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}