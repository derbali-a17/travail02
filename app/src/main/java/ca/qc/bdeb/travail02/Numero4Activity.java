package ca.qc.bdeb.travail02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Numero4Activity extends AppCompatActivity {

    //attributs
    EditText txtAmount, txtTipPercent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero4);
        setTitle("Tip Calculator");
        //init
        txtAmount = findViewById(R.id.calculator_amount);
        txtTipPercent = findViewById(R.id.calculator_tip_percent);
    }

    public void clickCalculate(View view) {
        float amount = Float.parseFloat(txtAmount.getText().toString());
        float tipPercent = Float.parseFloat(txtTipPercent.getText().toString());

        float result  =  amount  + (amount * tipPercent / 100);
        displayToast("Amount with tip is " + result + " $");
    }

    private void displayToast(String message){
        Toast toast = new Toast(getApplicationContext()); // contexte de l'app en général
        toast.setText(message);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}