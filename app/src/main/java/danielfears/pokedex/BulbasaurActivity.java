package danielfears.pokedex;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import gif.decoder.GifRun;


public class BulbasaurActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulbasaur);

        SurfaceView v = (SurfaceView) findViewById(R.id.bulbasaur);
        v.setZOrderOnTop(true);
        GifRun w = new  GifRun();
        w.LoadGiff(v, this, R.drawable.bulbasaur);

        final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        videoView.setVideoPath(
                "http://www.drawable.co.uk/bulbasaur.mp4");

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        Button playbutton = (Button) findViewById(R.id.playbutton);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });

        Button pausebutton = (Button) findViewById(R.id.pausebutton);

        pausebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });
    }

}
