package danielfears.pokedex;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;

import gif.decoder.GifRun;


public class CyndaquilActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyndaquil);

        SurfaceView v = (SurfaceView) findViewById(R.id.cyndaquil);
        v.setZOrderOnTop(true);
        GifRun w = new  GifRun();
        w.LoadGiff(v, this, R.drawable.cyndaquil);
    }

}
