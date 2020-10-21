package com.mnunes.petagram.pojo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.se.omapi.Session;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mnunes.petagram.R;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class ActivityContacto extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextNombre;
    private EditText editTextEmail;
    private EditText editTextMensaje;
    private Button boton_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        editTextNombre = (EditText) findViewById(R.id.contactoNombre);
        editTextEmail = (EditText) findViewById(R.id.contactoEmail);
        editTextMensaje = (EditText) findViewById(R.id.contactoMensaje);
        boton_enviar = (Button) findViewById(R.id.contactoEnviar);
        boton_enviar.setOnClickListener(this);
    }
    private void sendEmail() {
        String email = editTextEmail.getText().toString().trim();
        String subject = editTextNombre.getText().toString().trim();
        String mensaje = editTextMensaje.getText().toString().trim();

        Properties props = new Properties();
        props.put("mail.smtp.host", "my-mail-server");

    }
    @Override
    public void onClick(View v) {
        sendEmail();
    }
}