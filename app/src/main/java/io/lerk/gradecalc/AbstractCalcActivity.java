package io.lerk.gradecalc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This is the base calc class which defines the basic UI and initialize our
 * inputs to use them in the extending classes.
 *
 * @author Lukas F&uuml;lling (l.fuelling@micromata.de)
 */
public abstract class AbstractCalcActivity extends AppCompatActivity {

    protected EditText input;
    protected TextView output;

    /**
     * In this method, we initialize the two variables above.
     * Initializing them directly above would fail because the
     * current running activity is not active at the Moment.
     * As the method name suggests, this method is run when
     * the activity is created.
     *
     * @param savedInstanceState the saved state when switching apps.
     *                           The @Nullable annotation means that it's
     *                           okay for this object to be null (eg. not
     *                           existing) and the method will throw no
     *                           {@link java.lang.NullPointerException}.
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        input = (EditText) findViewById(R.id.editText);

        output = (TextView) findViewById(R.id.textView);

    }

    /**
     * This method should implement the calculating logic, get the input from
     * the UI and update the UI with the result.
     *
     * @param view the thing that was clicked (required by Android)
     */
    public abstract void doCalculation(View view);
}
