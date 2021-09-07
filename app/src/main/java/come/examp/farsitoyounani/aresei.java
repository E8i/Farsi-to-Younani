package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aresei extends AppCompatActivity {

    private Button home30,back64,arese1,arese2,arese3,arese4,arese5,arese6,arese7,arese8,arese9,
            arese10,arese11,arese12,arese13,arese14,arese15,arese16,arese17,arese18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresei);

        home30=findViewById(R.id.home30);
        home30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(aresei.this,MainActivity.class);
                startActivity(in);
            }
        });
        back64=findViewById(R.id.back64);
        back64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(aresei.this,Edame2.class);
                startActivity(in);
            }
        });
    }
}