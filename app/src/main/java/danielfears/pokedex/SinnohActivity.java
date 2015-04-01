package danielfears.pokedex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class SinnohActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinnoh);

        Button chimchar = (Button) findViewById(R.id.chimchar);

        chimchar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( SinnohActivity.this, ChimcharActivity.class);
                startActivity(i);
            }
        });

        Button turtwig = (Button) findViewById(R.id.turtwig);

        turtwig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( SinnohActivity.this, TurtwigActivity.class);
                startActivity(i);
            }
        });

        Button piplup = (Button) findViewById(R.id.piplup);

        piplup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( SinnohActivity.this, PiplupActivity.class);
                startActivity(i);
            }
        });
    }

}
