package danielfears.pokedex;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.SurfaceView;
import gif.decoder.GifRun;


public class KantoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanto);
        SurfaceView v = (SurfaceView) findViewById(R.id.charmander);
        v.setZOrderOnTop(true);    // necessary

        GifRun w = new  GifRun();

        w.LoadGiff(v, this, R.drawable.charmander);



    }

}
