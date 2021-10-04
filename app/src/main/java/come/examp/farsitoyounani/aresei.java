package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
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
        aresei1=findViewById(R.id.aresei1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        aresei2=findViewById(R.id.aresei2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        aresei3=findViewById(R.id.aresei3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        aresei4=findViewById(R.id.aresei4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        aresei5=findViewById(R.id.aresei5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        aresei6=findViewById(R.id.aresei6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });aresei7=findViewById(R.id.aresei7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        aresei8=findViewById(R.id.aresei8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        aresei9=findViewById(R.id.aresei9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        aresei10=findViewById(R.id.aresei10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        aresei11=findViewById(R.id.aresei11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        aresei12=findViewById(R.id.aresei12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        aresei13=findViewById(R.id.aresei13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        aresei14=findViewById(R.id.aresei14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        aresei15=findViewById(R.id.aresei15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        aresei16=findViewById(R.id.aresei16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        aresei17=findViewById(R.id.aresei17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        aresei18=findViewById(R.id.aresei18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.dipsao1);
        aresei18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}