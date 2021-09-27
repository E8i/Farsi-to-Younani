package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zamaer_maleki extends AppCompatActivity {

    private Button back69,home35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamaer_maleki);

        back69=findViewById(R.id.back69);
        back69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Zamaer_maleki.this,grammar.class);
                startActivity(in);
            }
        });
        home35=findViewById(R.id.home35);
        home35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Zamaer_maleki.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}