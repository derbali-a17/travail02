package ca.qc.bdeb.travail02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Numero2Activity extends AppCompatActivity {

    //attributs de classe
    EditText txtEmail, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero2);
        //initialisation des attributs
        txtEmail = findViewById(R.id.login_email);
        txtPassword = findViewById(R.id.login_password);
    }

    public void clickLogin(View view) {
        String email = txtEmail.getText().toString();
        String password = txtPassword.getText().toString();
        if(email.equals("test@test.com") && password.equals("admin2023")){
            displayToast("Connexion réussie");
        }else{
            displayToast("Vérifier vos entrées");
        }
    }

    private void displayToast(String message){
        Toast toast = new Toast(getApplicationContext()); // contexte de l'app en général
        toast.setText(message);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}