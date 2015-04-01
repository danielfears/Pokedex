package danielfears.pokedex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class UnovaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unova);

        Button tepig = (Button) findViewById(R.id.tepig);

        tepig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( UnovaActivity.this, TepigActivity.class);
                startActivity(i);
            }
        });

        Button snivy = (Button) findViewById(R.id.snivy);

        snivy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( UnovaActivity.this, SnivyActivity.class);
                startActivity(i);
            }
        });

        Button oshawott = (Button) findViewById(R.id.oshawott);

        oshawott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( UnovaActivity.this, OshawottActivity.class);
                startActivity(i);
            }
        });
    }

}
