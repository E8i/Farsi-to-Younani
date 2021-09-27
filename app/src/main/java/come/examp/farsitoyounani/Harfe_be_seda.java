package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Harfe_be_seda extends AppCompatActivity {

    private Button back68,home34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfe_be_seda);

        back68=findViewById(R.id.back68);
        back68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harfe_be_seda.this,grammar.class);
                startActivity(in);
            }
        });
        home34=findViewById(R.id.home34);
        home34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Harfe_be_seda.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}