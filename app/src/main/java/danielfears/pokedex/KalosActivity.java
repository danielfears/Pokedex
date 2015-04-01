package danielfears.pokedex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class KalosActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalos);

        Button fennekin = (Button) findViewById(R.id.fennekin);

        fennekin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( KalosActivity.this, FennekinActivity.class);
                startActivity(i);
            }
        });

        Button chespin = (Button) findViewById(R.id.chespin);

        chespin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( KalosActivity.this, ChespinActivity.class);
                startActivity(i);
            }
        });

        Button froakie = (Button) findViewById(R.id.froakie);

        froakie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( KalosActivity.this, FroakieActivity.class);
                startActivity(i);
            }
        });
    }

}
