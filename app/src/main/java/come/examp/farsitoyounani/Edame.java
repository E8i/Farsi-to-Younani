package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Edame extends AppCompatActivity {

    private Button b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,
            b31,b32,b33,b34,b35,b36,b37,b38,b39,b40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edame);

        b21=findViewById(R.id.button21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Eida.class);
                startActivity(in);
            }
        });
        b37=findViewById(R.id.button37);
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,MainActivity.class);
                startActivity(in);
            }
        });
        b22=findViewById(R.id.button22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Eftasa.class);
                startActivity(in);
            }
        });
        b23=findViewById(R.id.button23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Forao.class);
                startActivity(in);
            }
        });
        b24=findViewById(R.id.button24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,penao.class);
                startActivity(in);
            }
        });
        b25=findViewById(R.id.button25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Agorazo.class);
                startActivity(in);
            }
        });
        b26=findViewById(R.id.button26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Doulevo.class);
                startActivity(in);
            }
        });
        b27=findViewById(R.id.button27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Leo.class);
                startActivity(in);
            }
        });
        b28=findViewById(R.id.button28);
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Fonazo.class);
                startActivity(in);
            }
        });
        b29=findViewById(R.id.button29);
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Dipsao.class);
                startActivity(in);
            }
        });
        b30=findViewById(R.id.button30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Gurizeis.class);
                startActivity(in);
            }
        });
        b31=findViewById(R.id.button31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Xtupao.class);
                startActivity(in);
            }
        });
        b32=findViewById(R.id.button32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Poulao.class);
                startActivity(in);
            }
        });
        b33=findViewById(R.id.button33);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Fovame.class);
                startActivity(in);
            }
        });
        b34=findViewById(R.id.button34);
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Katharizo.class);
                startActivity(in);
            }
        });
        b35=findViewById(R.id.button35);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Grafo.class);
                startActivity(in);
            }
        });
        b36=findViewById(R.id.button36);
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Dino.class);
                startActivity(in);
            }
        });
        b38=findViewById(R.id.button38);
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Pezo.class);
                startActivity(in);
            }
        });
        b39=findViewById(R.id.button39);
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Katalaveno.class);
                startActivity(in);
            }
        });
        b40=findViewById(R.id.button40);
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Edame.this,Edame2.class);
                startActivity(in);
            }
        });


    }
}