package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thelo extends AppCompatActivity {

    private Button thelo1,thelo2,thelo3,thelo4,thelo5,thelo6,thelo7,thelo8,thelo9,thelo10,
            thelo11,thelo12,thelo13,thelo14,thelo15,thelo16,thelo17,thelo18,back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thelo);

        back1=findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(thelo.this,MainActivity.class);
                startActivity(in);
            }
        });

        thelo1=findViewById(R.id.thelo1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.thelo1);
        thelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();

            }
        });
        thelo2=findViewById(R.id.thelo2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.thelo2);
        thelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();

            }
        });
        thelo3=findViewById(R.id.thelo3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.thelo3);
        thelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();

            }
        });
        thelo4=findViewById(R.id.thelo4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.thelo4);
        thelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();

            }
        });
        thelo5=findViewById(R.id.thelo5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.thelo5);
        thelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();

            }
        });
        thelo6=findViewById(R.id.thelo6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.thelo6);
        thelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();

            }
        });
        thelo7=findViewById(R.id.thelo7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.thelo7);
        thelo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();

            }
        });
        thelo8=findViewById(R.id.thelo8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.thelo8);
        thelo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();

            }
        });
        thelo9=findViewById(R.id.thelo9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.thelo9);
        thelo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();

            }
        });
        thelo10=findViewById(R.id.thelo10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.thelo10);
        thelo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();

            }
        });
        thelo11=findViewById(R.id.thelo11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.thelo11);
        thelo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();

            }
        });
        thelo12=findViewById(R.id.thelo12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.thelo12);
        thelo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();

            }
        });
        thelo13=findViewById(R.id.thelo13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.thelo13);
        thelo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();

            }
        });
        thelo14=findViewById(R.id.thelo14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.thelo14);
        thelo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();

            }
        });
        thelo15=findViewById(R.id.thelo15);
        final MediaPlayer mediaPlayer15= MediaPlayer.create(this,R.raw.thelo15);
        thelo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();

            }
        });
        thelo16=findViewById(R.id.thelo16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.thelo16);
        thelo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();

            }
        });
        thelo17=findViewById(R.id.thelo17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.thelo17);
        thelo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();

            }
        });
        thelo18=findViewById(R.id.thelo18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.thelo18);
        thelo18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();

            }
        });

    }
}