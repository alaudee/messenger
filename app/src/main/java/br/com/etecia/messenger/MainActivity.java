package br.com.etecia.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String nomeContato[] = {"Carlos", "Rodrigo", "Carla", "Cláudio", "Fernanada", "Renata"};
    int imagemContato[] = {R.drawable.pessoa_icon, R.drawable.pessoa_icon, R.drawable.pessoa_icon, R.drawable.pessoa_icon, R.drawable.pessoa_icon, R.drawable.pessoa_icon};
    int descricaoContato[] = {R.string.descricao_carlos, R.string.descricao_rodrigo, R.string.descricao_carla, R.string.descricao_claudio, R.string.descricao_fernanada, R.string.descricao_renata};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lstContatos);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("name", nomeContato[position]);
                intent.putExtra("descricao", descricaoContato[position]);
                intent.putExtra("imagem", imagemContato[position]);
                startActivity(intent);
            }
        });

    }

    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return imagemContato.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view1 = getLayoutInflater().inflate(R.layout.)

            return null;
        }
    }
}
