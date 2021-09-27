package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Esme extends AppCompatActivity {

    private Button back70,home36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esme);

        back70=findViewById(R.id.back70);
        back70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Esme.this,grammar.class);
                startActivity(in);
            }
        });
        home36=findViewById(R.id.home36);
        home36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Esme.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}