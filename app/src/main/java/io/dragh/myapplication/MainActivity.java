package io.dragh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = (ImageButton) findViewById(R.id.fab_1);
        imageButton.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
                outline.setOval(0, 0, size, size);
            }
        });
    }

    public void onClick(View view){
        Toast.makeText(this, "Hola estoy escuchando", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MyMusic.class);
        startActivity(intent);
    }

}
