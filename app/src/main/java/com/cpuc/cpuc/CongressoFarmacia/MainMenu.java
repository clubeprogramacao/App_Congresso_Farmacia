
package com.cpuc.cpuc.CongressoFarmacia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.support.v4.content.ContextCompat;
import android.Manifest;
import android.app.Activity;
import java.util.List;
import android.support.v4.app.ActivityCompat;
import android.content.pm.PackageManager;
import 	java.util.ArrayList;
public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.cpuc.cpuc.CongressoFarmacia.R.layout.activity_main_menu);


            ImageButton infoButton = (ImageButton) findViewById(com.cpuc.cpuc.CongressoFarmacia.R.id.BotaoInfo);

            infoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainMenu.this, Informacoes.class);
                    startActivity(intent);
                }
            });

            ImageButton patrButton = (ImageButton) findViewById(com.cpuc.cpuc.CongressoFarmacia.R.id.BotaoPatr);

            patrButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainMenu.this, Patrocionios.class);
                    startActivity(intent);
                }
            });

            ImageButton calendarbutton = (ImageButton) findViewById(com.cpuc.cpuc.CongressoFarmacia.R.id.BotaoCalend);

            calendarbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainMenu.this, MainActivity.class);
                    startActivity(intent);
                }
            });

            ImageButton MapButton = (ImageButton) findViewById(com.cpuc.cpuc.CongressoFarmacia.R.id.BotaoMapa);

            MapButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainMenu.this, mapa.class);
                    startActivity(intent);
                }
            });


        /*
        ImageButton ContactButton = (ImageButton) findViewById(com.cpuc.cpuc.CongressoFarmacia.R.id.BotaoContact);

        ContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });*/
        }

    





}
