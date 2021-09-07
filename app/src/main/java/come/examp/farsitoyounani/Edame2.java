package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Edame2 extends AppCompatActivity {

    private Button b53,home19,b41,b42,b43,b45,b46,b47,b48,b49,b50,b51,b52,b55,b54,b60,b61,b62;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edame2);

        b53=findViewById(R.id.back53);
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,Edame.class);
                startActivity(in);
            }
        });
        home19=findViewById(R.id.home19);
        home19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,MainActivity.class);
                startActivity(in);
            }
        });
        b41=findViewById(R.id.button41);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,ponao.class);
                startActivity(in);
            }
        });
        b42=findViewById(R.id.button42);
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,meno.class);
                startActivity(in);
            }
        });
        b43=findViewById(R.id.button43);
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,kourazome.class);
                startActivity(in);
            }
        });
        b45=findViewById(R.id.button45);
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,diavazo.class);
                startActivity(in);
            }
        });
        b46=findViewById(R.id.button46);
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,perimeno.class);
                startActivity(in);
            }
        });
        b47=findViewById(R.id.button47);
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,cheroume.class);
                startActivity(in);
            }
        });
        b48=findViewById(R.id.button48);
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,agapo.class);
                startActivity(in);
            }
        });
        b49=findViewById(R.id.button49);
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,boro.class);
                startActivity(in);
            }
        });
        b50=findViewById(R.id.button50);
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,milao.class);
                startActivity(in);
            }
        });
        b51=findViewById(R.id.button51);
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,aresei.class);
                startActivity(in);
            }
        });
        b52=findViewById(R.id.button52);
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,murizo.class);
                startActivity(in);
            }
        });
        b55=findViewById(R.id.button55);
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame2.this,contact2.class);
                startActivity(in);
            }
        });
    }
}