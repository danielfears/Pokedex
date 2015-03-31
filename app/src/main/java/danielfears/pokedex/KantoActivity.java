package danielfears.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import gif.decoder.GifRun;

public class KantoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanto);

        Button charmander = (Button) findViewById(R.id.charmander);

        charmander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( KantoActivity.this, CharmanderActivity.class);
                startActivity(i);
            }
        });

        Button bulbasaur = (Button) findViewById(R.id.bulbasaur);

        bulbasaur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( KantoActivity.this, BulbasaurActivity.class);
                startActivity(i);
            }
        });

        Button squirtle = (Button) findViewById(R.id.squirtle);

        squirtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( KantoActivity.this, SquirtleActivity.class);
                startActivity(i);
            }
        });

    }

}
