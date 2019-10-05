package id.ac.poliban.mi.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten view dihubungkan dengan koding java kita

        //menghubungkan view dengan source kode kita
        setContentView(R.layout.activity_main);
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btForth = findViewById(R.id.btForth);

        //interface onClickListener merupakan interface yang ada dikelas view
        //hanya berisi satu method onCLick(View view)

        //berikut kode memasang event listener onCLick pada oject Button

        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Ini adalah yang pertama", Toast.LENGTH_SHORT).show();
            }
        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini ke dua", Toast.LENGTH_SHORT).show();
            }
        });
        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ketiga", Toast.LENGTH_SHORT).show();
            }
        });

        btForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "keempat", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
