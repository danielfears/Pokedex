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


public class TepigActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tepig);

        SurfaceView v = (SurfaceView) findViewById(R.id.tepig);
        v.setZOrderOnTop(true);
        GifRun w = new  GifRun();
        w.LoadGiff(v, this, R.drawable.tepig);

        final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        videoView.setVideoPath(
                "http://www.drawable.co.uk/tepig.mp4");

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
