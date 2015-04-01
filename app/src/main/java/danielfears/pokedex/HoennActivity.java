package danielfears.pokedex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HoennActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoenn);

        Button torchic = (Button) findViewById(R.id.torchic);

        torchic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( HoennActivity.this, TorchicActivity.class);
                startActivity(i);
            }
        });

        Button treecko = (Button) findViewById(R.id.treecko);

        treecko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( HoennActivity.this, TreeckoActivity.class);
                startActivity(i);
            }
        });

        Button mudkip = (Button) findViewById(R.id.mudkip);

        mudkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( HoennActivity.this, MudkipActivity.class);
                startActivity(i);
            }
        });
    }

}
