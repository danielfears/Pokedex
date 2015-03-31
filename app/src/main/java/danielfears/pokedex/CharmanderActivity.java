package danielfears.pokedex;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.widget.TextView;

import gif.decoder.GifRun;


public class CharmanderActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charmander);

        SurfaceView v = (SurfaceView) findViewById(R.id.charmander);
        v.setZOrderOnTop(true);
        GifRun w = new  GifRun();
        w.LoadGiff(v, this, R.drawable.charmander);

        //Pokemon style font - might not use
        //TextView tv = (TextView) findViewById(R.id.test);
        //Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/pokemon.ttf");
                //tv.setTypeface(tf);


    }

}
