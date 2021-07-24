package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,thelo.class);
                startActivity(in);
            }
        });
        b2=findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,darm.class);
                startActivity(in);
            }
        });
        b3=findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,troo.class);
                startActivity(in);
            }
        });
        b4=findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,grammar.class);
                startActivity(in);
            }
        });
        b5=findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,perpato.class);
                startActivity(in);
            }
        });
        b6=findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,vlepo.class);
                startActivity(in);
            }
        });
        b7=findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,akouo.class);
                startActivity(in);
            }
        });
        b8=findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,gelo.class);
                startActivity(in);
            }
        });
        b9=findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,kemame.class);
                startActivity(in);
            }
        });
        b10=findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,pao.class);
                startActivity(in);
            }
        });
        b11=findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,eime.class);
                startActivity(in);
            }
        });
        b12=findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,perno.class);
                startActivity(in);
            }
        });
        b13=findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,perno.class);
                startActivity(in);
            }
        });
        b14=findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,ertha.class);
                startActivity(in);
            }
        });
        b15=findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,pino.class);
                startActivity(in);
            }
        });
        b16=findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,trecho.class);
                startActivity(in);
            }
        });
        b19=findViewById(R.id.button19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,medical.class);
                startActivity(in);
            }
        });
        b20=findViewById(R.id.button20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,Edame.class);
                startActivity(in);
            }
        });


    }
}