package io.lerk.gradecalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * This is the activity where you can decide which calculation to do.
 * @author Lukas F&uuml;lling (l.fuelling@micromata.de)
 */
public class MainActivity extends AppCompatActivity {

    //TODO: refactor this into a tabbed activity and use the other activities as fragments.

    /**
     * We just set the content layout resource here.
     *
     * @param savedInstanceState saved instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This onClick handler launches the {@link PointToGradeActivity}.
     * @param view the thing that was clicked.
     */
    public void openPTGView(View view) {
        // create a new intent
        Intent i = new Intent(getApplicationContext(), PointToGradeActivity.class);
        // start the activity
        startActivity(i);
        // stop this activity (may be better without this because you lose the
        // back-button behavior but it's here to show this is possible and sometimes
        // important.)
        finish();
    }

    /**
     * Basically the same thing as above but this opens the {@link GradeToPointActivity}.
     *
     * @param view the thing that was clicked.
     */
    public void openGTPView(View view) {
        Intent i = new Intent(getApplicationContext(), GradeToPointActivity.class);
        startActivity(i);
        finish();
    }
}
