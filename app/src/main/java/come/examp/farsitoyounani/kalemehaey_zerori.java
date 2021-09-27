package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kalemehaey_zerori extends AppCompatActivity {

    private Button back71,home37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalemehaey_zerori);

        back71=findViewById(R.id.back71);
        back71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kalemehaey_zerori.this,grammar.class);
                startActivity(in);
            }
        });
        home37=findViewById(R.id.home37);
        home37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kalemehaey_zerori.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}