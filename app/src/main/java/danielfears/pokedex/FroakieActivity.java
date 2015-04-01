package danielfears.pokedex;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;

import gif.decoder.GifRun;


public class FroakieActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_froakie);

        SurfaceView v = (SurfaceView) findViewById(R.id.froakie);
        v.setZOrderOnTop(true);
        GifRun w = new  GifRun();
        w.LoadGiff(v, this, R.drawable.froakie);
    }

}
