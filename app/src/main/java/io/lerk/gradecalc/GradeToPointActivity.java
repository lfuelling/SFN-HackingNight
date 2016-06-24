package io.lerk.gradecalc;

import android.view.View;
import android.widget.Toast;

/**
 * This class implements the logic for calculating grades into points.
 * It extends our abstract class so the <pre>doCompilation()</pre> method
 * needs to be implemented.
 *
 * @author Lukas F&uuml;ling (l.fuelling@micromata.de)
 */
public class GradeToPointActivity extends AbstractCalcActivity {

    /**
     * This method overrides the abstract method in the superclass and converts
     * grades to points. We also check if the input number is a valid grade
     * and we show a Toast in case it's not.
     *
     * @param view the thing that was clicked (required by Android)
     */
    @Override
    public void doCalculation(View view) {

        // Get integer value from the textView by using Integer.valueOf(String s)
        int grade = Integer.valueOf(input.getText().toString());

        // Check if grade is out of bounds...
        if (grade > 6 || grade < 1) {
            // ... if so, build and show a Toast containing a value from strings.xml ...
            Toast.makeText(getApplicationContext(), R.string.grade_incorrect, Toast.LENGTH_LONG).show();
        } else {
            // ... if not, set the output view's value to the calculated points.
            output.setText(String.valueOf((6 - grade) * 3));
        }
    }


}

