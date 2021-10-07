package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class murizo extends AppCompatActivity {

    private Button back65,home31,murizo1,murizo2,murizo3,murizo4,murizo5,murizo6,murizo7,murizo8,murizo9,
            murizo10,murizo11,murizo12,murizo13,murizo14,murizo15,murizo16,murizo17,murizo18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murizo);

        home31=findViewById(R.id.home31);
        home31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(murizo.this,MainActivity.class);
                startActivity(in);
            }
        });

        back65=findViewById(R.id.back65);
        back65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(murizo.this,Edame2.class);
                startActivity(in);
            }
        });
        murizo1=findViewById(R.id.murizo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.murizo1);
        murizo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        murizo2=findViewById(R.id.murizo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.murizo2);
        murizo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        murizo3=findViewById(R.id.murizo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.murizo3);
        murizo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        murizo4=findViewById(R.id.murizo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.murizo4);
        murizo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        murizo5=findViewById(R.id.murizo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.murizo5);
        murizo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        murizo6=findViewById(R.id.murizo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.murizo6);
        murizo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        murizo7=findViewById(R.id.murizo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.murizo7);
        murizo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        murizo8=findViewById(R.id.murizo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.murizo8);
        murizo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        murizo9=findViewById(R.id.murizo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.murizo9);
        murizo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        murizo10=findViewById(R.id.murizo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.murizo10);
        murizo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        murizo11=findViewById(R.id.murizo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.murizo11);
        murizo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        murizo12=findViewById(R.id.murizo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.murizo12);
        murizo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        murizo13=findViewById(R.id.murizo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.murizo13);
        murizo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        murizo14=findViewById(R.id.murizo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.murizo14);
        murizo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        murizo15=findViewById(R.id.murizo15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.murizo15);
        murizo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        murizo16=findViewById(R.id.murizo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.murizo16);
        murizo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        murizo17=findViewById(R.id.murizo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.murizo17);
        murizo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        murizo18=findViewById(R.id.murizo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.murizo18);
        murizo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });


    }
}