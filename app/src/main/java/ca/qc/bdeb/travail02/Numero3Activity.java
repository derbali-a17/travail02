package ca.qc.bdeb.travail02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Numero3Activity extends AppCompatActivity {

    //attributs
    EditText txtMessage;
    TextView lblResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero3);
        //init
        setTitle("Contact form");
        txtMessage = findViewById(R.id.contact_message);
        lblResult = findViewById(R.id.contact_result);
    }

    public void clickSend(View view) {
        String message = txtMessage.getText().toString();
        StringBuilder sb  = new StringBuilder(message);
        lblResult.setText(sb.reverse());
    }
}