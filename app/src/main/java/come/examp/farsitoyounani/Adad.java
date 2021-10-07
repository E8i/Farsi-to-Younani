package come.examp.farsitoyounani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adad extends AppCompatActivity {

    private Button back73,home39,adad0,adad1,adad2,adad3,adad4,adad5,adad6,adad7,adad8,adad9,
            adad10,adad11,adad12,adad13,adad14,adad15,adad16,adad17,adad18,adad19,adad20,adad21,adad22,
            adad23,adad24,adad25,adad26,adad27,adad28,adad29,adad30,adad40,adad50,adad60,adad70,
            adad80,adad90,adad100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adad);

        back73=findViewById(R.id.back73);
        back73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Adad.this,grammar.class);
                startActivity(in);
            }
        });
        home39=findViewById(R.id.home39);
        home39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Adad.this,MainActivity.class);
                startActivity(in);
            }
        });

        adad0=findViewById(R.id.adad0);
        final MediaPlayer mediaPlayer0 = MediaPlayer.create(this,R.raw.adad0);
        adad0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer0.start();
            }
        });
        adad1=findViewById(R.id.adad1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.adad1);
        adad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        adad2=findViewById(R.id.adad2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.adad2);
        adad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        adad3=findViewById(R.id.adad3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.adad3);
        adad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        adad4=findViewById(R.id.adad4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.adad4);
        adad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        adad5=findViewById(R.id.adad5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.adad5);
        adad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        adad6=findViewById(R.id.adad6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.adad6);
        adad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        adad7=findViewById(R.id.adad7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.adad7);
        adad7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        adad8=findViewById(R.id.adad8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.adad8);
        adad8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        adad9=findViewById(R.id.adad9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.adad9);
        adad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        adad10=findViewById(R.id.adad10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.adad10);
        adad10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        adad11=findViewById(R.id.adad11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.adad11);
        adad11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        adad12=findViewById(R.id.adad12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.adad12);
        adad12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        adad13=findViewById(R.id.adad13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.adad13);
        adad13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        adad14=findViewById(R.id.adad14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.adad14);
        adad14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        adad15=findViewById(R.id.adad15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.adad15);
        adad15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        adad16=findViewById(R.id.adad16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.adad16);
        adad16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        adad17=findViewById(R.id.adad17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.adad17);
        adad17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        adad18=findViewById(R.id.adad18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.adad18);
        adad18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });
        adad19=findViewById(R.id.adad19);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this,R.raw.adad19);
        adad19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });
        adad20=findViewById(R.id.adad20);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this,R.raw.adad20);
        adad20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });
        adad21=findViewById(R.id.adad21);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this,R.raw.adad21);
        adad21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });
        adad22=findViewById(R.id.adad22);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this,R.raw.adad22);
        adad22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });
        adad23=findViewById(R.id.adad23);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this,R.raw.adad23);
        adad23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });
        adad24=findViewById(R.id.adad24);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this,R.raw.adad24);
        adad24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });
        adad25=findViewById(R.id.adad25);
        final MediaPlayer mediaPlayer25 = MediaPlayer.create(this,R.raw.adad25);
        adad25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });
        adad26=findViewById(R.id.adad26);
        final MediaPlayer mediaPlayer26 = MediaPlayer.create(this,R.raw.adad26);
        adad26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer26.start();
            }
        });
        adad27=findViewById(R.id.adad27);
        final MediaPlayer mediaPlayer27 = MediaPlayer.create(this,R.raw.adad27);
        adad27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer27.start();
            }
        });
        adad28=findViewById(R.id.adad28);
        final MediaPlayer mediaPlayer28 = MediaPlayer.create(this,R.raw.adad28);
        adad28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer28.start();
            }
        });
        adad29=findViewById(R.id.adad29);
        final MediaPlayer mediaPlayer29 = MediaPlayer.create(this,R.raw.adad29);
        adad29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer29.start();
            }
        });
        adad30=findViewById(R.id.adad30);
        final MediaPlayer mediaPlayer30 = MediaPlayer.create(this,R.raw.adad30);
        adad30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer30.start();
            }
        });
        adad40=findViewById(R.id.adad40);
        final MediaPlayer mediaPlayer40 = MediaPlayer.create(this,R.raw.adad40);
        adad40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer40.start();
            }
        });
        adad50=findViewById(R.id.adad50);
        final MediaPlayer mediaPlayer50 = MediaPlayer.create(this,R.raw.adad50);
        adad50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer50.start();
            }
        });
        adad60=findViewById(R.id.adad60);
        final MediaPlayer mediaPlayer60 = MediaPlayer.create(this,R.raw.adad60);
        adad60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer60.start();
            }
        });
        adad70=findViewById(R.id.adad70);
        final MediaPlayer mediaPlayer70 = MediaPlayer.create(this,R.raw.adad70);
        adad70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer70.start();
            }
        });
        adad80=findViewById(R.id.adad80);
        final MediaPlayer mediaPlayer80 = MediaPlayer.create(this,R.raw.adad80);
        adad80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer80.start();
            }
        });
        adad90=findViewById(R.id.adad90);
        final MediaPlayer mediaPlayer90 = MediaPlayer.create(this,R.raw.adad90);
        adad90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer90.start();
            }
        });
        adad100=findViewById(R.id.adad100);
        final MediaPlayer mediaPlayer100 = MediaPlayer.create(this,R.raw.adad100);
        adad100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer100.start();
            }
        });
    }
}