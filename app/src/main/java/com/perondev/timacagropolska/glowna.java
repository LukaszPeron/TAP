package com.perondev.timacagropolska;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class glowna extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glowna);
        // Zmiana czcionki na własną w okreslonym tekście
        /* Typeface  f_b_produkty = Typeface.createFromAsset(getAssets(), "fonts/WorkSans-Regular.otf");
        TextView f_b_produkty_text = (TextView) findViewById(R.id.b_produkty);
        f_b_produkty_text.setTypeface(f_b_produkty); */

        // Button button_produkty = (Button) findViewById(R.id.b_glowna_about_app_icon_button);
        // button_produkty.setOnClickListener(this);

        /* Button button_produkty = (Button) findViewById(R.id.b_glowna_about_tap_logo_button);
        button_produkty.setOnClickListener(this);

        Button button_produkty = (Button) findViewById(R.id.b_glowna_about_roullier_logo_button);
        button_produkty.setOnClickListener(this);

        */

        Button button_produkty = (Button) findViewById(R.id.b_glowna_produkty_title_button);
            button_produkty.setOnClickListener(this);

        Button button_programy = (Button) findViewById(R.id.b_glowna_programy_title_button);
            button_programy.setOnClickListener(this);

        Button button_serwis = (Button) findViewById(R.id.b_glowna_serwis_title_button);
            button_serwis.setOnClickListener(this);

        Button button_kontakt = (Button) findViewById(R.id.b_glowna_kontakt_title_button);
            button_kontakt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            /* case R.id.b_glowna_about_app_icon_button:
                Intent about_app = new Intent(this, glowna_about_app.class);
                startActivity(about_app);
                break;

            case R.id.b_glowna_about_tap_logo_button:
                Intent act_about_tap = new Intent(this, glowna_about_tap.class);
                startActivity(act_about_tap);
                break;

            case R.id.b_glowna_about_roullier_logo_button:
                Intent act_about_roullier = new Intent(this, glowna_about_roullier.class);
                startActivity(act_about_roullier);
                break;
            */

            case R.id.b_glowna_produkty_title_button:
                Intent act_glowna_produkty = new Intent(this, glowna_produkty.class);
                startActivity(act_glowna_produkty);
                break;

            case R.id.b_glowna_programy_title_button:
                Intent act_glowna_programy = new Intent(this, glowna_programy.class);
                startActivity(act_glowna_programy);
                break;

            case R.id.b_glowna_serwis_title_button:
                Intent act_glowna_serwis = new Intent(this, glowna_serwis.class);
                startActivity(act_glowna_serwis);
                break;

            case R.id.b_glowna_kontakt_title_button:
                Intent act_glowna_kontakt = new Intent(this, glowna_kontakt.class);
                startActivity(act_glowna_kontakt);
                break;
        }
    }


}
