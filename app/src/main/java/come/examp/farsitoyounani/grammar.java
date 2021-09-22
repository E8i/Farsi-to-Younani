package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grammar extends AppCompatActivity {

    private Button grammer1,grammer2,grammer3,grammer4,grammer5,grammer6,grammer7,grammer8,grammer9,
            grammer10,grammer11,grammer12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        grammer10=findViewById(R.id.grammer10);
        grammer10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Edame2.class);
                startActivity(in);

            }
        });

        grammer12=findViewById(R.id.grammer12);
        grammer12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}