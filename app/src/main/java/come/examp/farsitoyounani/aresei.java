package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aresei extends AppCompatActivity {

    private Button home30,back64,aresei1,aresei2,aresei3,aresei4,aresei5,aresei6,aresei7,aresei8,aresei9,
            aresei10,aresei11,aresei12,aresei13,aresei14,aresei15,aresei16,aresei17,aresei18;

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