package ca.qc.bdeb.travail02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Numero1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero1);
        //initialiser des variables
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = new Toast(getApplicationContext()); // contexte de l'app en général
        toast.setText("Activité en pause");
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    /*
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = new Toast(getApplicationContext());
        toast.setText("Activté détruite");
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //sauvergarder de données dans les fichiers journaux (logfiles)

    }
     */

    public void clickButton(View view) {
        Toast toast = new Toast(this);
        toast.setText("Bouton cliqué");
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}