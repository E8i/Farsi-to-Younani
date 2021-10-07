package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aresei extends AppCompatActivity {

    private Button home30,back64,aresei1,aresei2,aresei3,aresei4,aresei5,aresei6;

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
        aresei1=findViewById(R.id.aresei1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.aresei1);
        aresei1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        aresei2=findViewById(R.id.aresei2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.aresei2);
        aresei2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        aresei3=findViewById(R.id.aresei3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.aresei3);
        aresei3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        aresei4=findViewById(R.id.aresei4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.aresei4);
        aresei4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        aresei5=findViewById(R.id.aresei5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.aresei5);
        aresei5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        aresei6=findViewById(R.id.aresei6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.aresei6);
        aresei6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

    }
}