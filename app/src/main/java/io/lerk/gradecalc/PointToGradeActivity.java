package io.lerk.gradecalc;

import android.view.View;
import android.widget.Toast;

/**
 * Created by lerk on 24.06.16.
 */
public class PointToGradeActivity extends AbstractCalcActivity {

    @Override
    public void doCalculation(View view) {

        double points = Double.parseDouble(input.getText().toString());

        if (points > 15 || points < 0) {
            Toast.makeText(getApplicationContext(), R.string.points_incorrect, Toast.LENGTH_LONG).show();
        } else {
            output.setText(String.valueOf(6 - (int) (Math.ceil(points / 3))));
        }

    }

}
