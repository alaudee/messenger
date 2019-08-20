package br.com.etecia.messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_relogio:
                Toast.makeText(getApplicationContext(), "Clicou em horários", Toast.LENGTH_LONG).show();
            break;

            case R.id.menu_fone:
                Toast.makeText(getApplicationContext(), "Clicou em chamadas", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu_config:
                Toast.makeText(getApplicationContext(), "Clicou em configrações", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu_conta:
                Toast.makeText(getApplicationContext(), "Clicou em sua conta", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu_contatos:
                Toast.makeText(getApplicationContext(), "Clicou em contatos", Toast.LENGTH_LONG).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
