package com.perondev.timacagropolska;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class glowna_produkty extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glowna_produkty);

        Button button_granulowane = (Button) findViewById(R.id.b_produkty_plyny_title_button);
        button_granulowane.setOnClickListener(this);

        Button button_plynne = (Button) findViewById(R.id.b_produkty_granule_title_button);
        button_plynne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_produkty_plyny_title_button:
                Intent act_glowna_plynne = new Intent(this, glowna_plynne.class);
                startActivity(act_glowna_plynne);
                break;

            case R.id.b_produkty_granule_title_button:
                Intent act_glowna_granulowane = new Intent(this, glowna_granulowane.class);
                startActivity(act_glowna_granulowane);
                break;
        }
    }


}
