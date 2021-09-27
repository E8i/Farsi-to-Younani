package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hafte_mah extends AppCompatActivity {

    private Button back72,home38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hafte_mah);

        back72=findViewById(R.id.back72);
        back72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Hafte_mah.this,grammar.class);
                startActivity(in);
            }
        });
        home38=findViewById(R.id.home38);
        home38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Hafte_mah.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}