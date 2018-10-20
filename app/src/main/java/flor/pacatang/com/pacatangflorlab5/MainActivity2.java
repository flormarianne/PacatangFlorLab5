package flor.pacatang.com.pacatangflorlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button act1 = (Button) findViewById(R.id.act1);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(act1);


            }
        });


        Button map = (Button) findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:14.6096767,120.9874574");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });
    }
    @Override

    protected void onStart(){
        super.onStart();
        Log.d("LAB5", "onStart() has executed");
    }
    protected void onResume(){
        super.onResume();
        Log.d("LAB5", "onResume() has executed");
    }
    protected void onPause(){
        super.onPause();
        Log.d("LAB5", "onPause() has executed");
    }
    protected void onStop(){
        super.onStop();
        Log.d("LAB5", "onStop() has executed");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LAB5", "onDestroy() has executed");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("LAB5", "onRestart() has executed");
    }
}