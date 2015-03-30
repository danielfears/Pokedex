package danielfears.pokedex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button redblue = (Button) findViewById(R.id.redblue);
        redblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MenuActivity.this, KantoActivity.class);
                startActivity(i);
            }
        });

        Button goldsilver = (Button) findViewById(R.id.goldsilver);
        goldsilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MenuActivity.this, JohtoActivity.class);
                startActivity(i);
            }
        });

        Button rubysapp = (Button) findViewById(R.id.rubysapp);
        rubysapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MenuActivity.this, HoennActivity.class);
                startActivity(i);
            }
        });

        Button diampearl = (Button) findViewById(R.id.diampearl);
        diampearl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MenuActivity.this, SinnohActivity.class);
                startActivity(i);
            }
        });

        Button blackwhite = (Button) findViewById(R.id.blackwhite);
        blackwhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MenuActivity.this, UnovaActivity.class);
                startActivity(i);
            }
        });

        Button xy = (Button) findViewById(R.id.xy);
        xy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MenuActivity.this, KalosActivity.class);
                startActivity(i);
            }
        });


    }

}
