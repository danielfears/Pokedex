package danielfears.pokedex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class JohtoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_johto);

        Button cyndaquil = (Button) findViewById(R.id.cyndaquil);

        cyndaquil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( JohtoActivity.this, CyndaquilActivity.class);
                startActivity(i);
            }
        });

        Button chikorita = (Button) findViewById(R.id.chikorita);

        chikorita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( JohtoActivity.this, ChikoritaActivity.class);
                startActivity(i);
            }
        });

        Button totodile = (Button) findViewById(R.id.totodile);

        totodile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( JohtoActivity.this, TotodileActivity.class);
                startActivity(i);
            }
        });


    }

}
