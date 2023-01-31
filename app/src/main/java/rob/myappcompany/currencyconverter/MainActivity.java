package rob.myappcompany.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton(View view) {

        Log.i("info", "convert pressed");

        EditText editText = (EditText) findViewById(R.id.moneyEditTextNumber);
        String amountIntEnn = editText.getText().toString();

        double amountInEnnDouble;
        //Try-Catch for handle Error of ediText
        try {
            amountInEnnDouble = Double.parseDouble(amountIntEnn); //convert editText value into int
        } catch (Exception e) {
            Toast.makeText(this, amountIntEnn + "数値を入れて、もう一度！", Toast.LENGTH_LONG).show();
            return;
        }


//        double amountInEnnDouble = Double.parseDouble(amountIntEnn);

        double amountInDollarsDouble = amountInEnnDouble * 0.0071;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Log.i("info", "moneyEditTextNumber" + editText.getText().toString());
        Log.i("info", "$" + amountInDollarsString);


        Toast.makeText(this, "¥" + amountIntEnn + "= $" + amountInDollarsString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
