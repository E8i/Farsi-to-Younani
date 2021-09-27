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

        grammer2=findViewById(R.id.grammer2);
        grammer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Harfe_seda_dar.class);
                startActivity(in);
            }
        });
        grammer3=findViewById(R.id.grammer3);
        grammer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Harfe_be_seda.class);
                startActivity(in);
            }
        });
        grammer4=findViewById(R.id.grammer4);
        grammer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Zamaer_maleki.class);
                startActivity(in);
            }
        });
        grammer5=findViewById(R.id.grammer5);
        grammer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Esme.class);
                startActivity(in);
            }
        });
        grammer6=findViewById(R.id.grammer6);
        grammer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,kalemehaey_zerori.class);
                startActivity(in);
            }
        });
        grammer7=findViewById(R.id.grammer7);
        grammer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Adad.class);
                startActivity(in);
            }
        });

        grammer9=findViewById(R.id.grammer9);
        grammer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Hafte_mah.class);
                startActivity(in);
            }
        });

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
        grammer1=findViewById(R.id.grammer1);
        grammer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(grammar.this,Alphabet.class);
                startActivity(in);
            }
        });
    }
}