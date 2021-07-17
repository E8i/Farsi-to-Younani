package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class darm extends AppCompatActivity {

    private Button back2, darm1,darm2,darm3,darm4,darm5,darm6,darm7,darm8,darm9,darm10,
            darm11,darm12,darm13,darm14,darm15,darm16,darm17,darm18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darm);

        back2=findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(darm.this,MainActivity.class);
                startActivity(in);
            }
        });

        darm1=findViewById(R.id.darm1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.exo1);
        darm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        darm2=findViewById(R.id.darm2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.exo2);
        darm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        darm3=findViewById(R.id.darm3);
        final  MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.exo3);
        darm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        darm4=findViewById(R.id.darm4);
        final  MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.exo4);
        darm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        darm5=findViewById(R.id.darm5);
        final  MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.exo5);
        darm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        darm6=findViewById(R.id.darm6);
        final  MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.exo6);
        darm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        darm7=findViewById(R.id.darm7);
        final  MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.exo7);
        darm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        darm8=findViewById(R.id.darm8);
        final  MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.exo8);
        darm8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        darm9=findViewById(R.id.darm9);
        final  MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.exo9);
        darm9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        darm10=findViewById(R.id.darm10);
        final  MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.exo10);
        darm10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        darm11=findViewById(R.id.darm11);
        final  MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.exo11);
        darm11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        darm12=findViewById(R.id.darm12);
        final  MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.exo12);
        darm12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        darm13=findViewById(R.id.darm13);
        final  MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.exo13);
        darm13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        darm14=findViewById(R.id.darm14);
        final  MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.exo14);
        darm14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        darm15=findViewById(R.id.darm15);
        final  MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.exo15);
        darm15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        darm16=findViewById(R.id.darm16);
        final  MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.exo16);
        darm16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        darm17=findViewById(R.id.darm17);
        final  MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.exo17);
        darm17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        darm18=findViewById(R.id.darm18);
        final  MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.exo18);
        darm18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });

    }
}