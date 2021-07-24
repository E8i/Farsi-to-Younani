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

    }
}