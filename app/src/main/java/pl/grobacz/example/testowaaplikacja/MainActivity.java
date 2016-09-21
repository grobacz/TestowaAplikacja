package pl.grobacz.example.testowaaplikacja;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

import pl.grobacz.example.testowaaplikacja.retrofit.RetrofitActivity;
import pl.grobacz.example.testowaaplikacja.szukaniepracy.SzukaniePracyActivity;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

    private Button szukaniePracyStartButton;
    private Button retrofitStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TestingApplication) getApplication()).getAppComponent().inject(this);

        szukaniePracyStartButton = (Button)findViewById(R.id.szukaniePracyStartButton);
        szukaniePracyStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SzukaniePracyActivity.class);
                startActivity(intent);
                finish();
            }
        });

        retrofitStartButton = (Button)findViewById(R.id.retrofitStartButton);
        retrofitStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RetrofitActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
