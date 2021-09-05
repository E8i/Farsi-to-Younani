package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact2 extends AppCompatActivity {

    private Button back63,home29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);

        back63=findViewById(R.id.back63);
        back63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(contact2.this,Edame2.class);
                startActivity(in);
            }
        });
        home29=findViewById(R.id.home29);
        home29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(contact2.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}