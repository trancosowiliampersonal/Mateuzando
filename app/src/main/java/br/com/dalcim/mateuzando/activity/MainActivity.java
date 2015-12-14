package br.com.dalcim.mateuzando.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.CircularImageView;

import java.util.Random;

import br.com.dalcim.mateuzando.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CircularImageView fotoToolBar;
    private TextView mensage;

    private Drawable[] fotos;
    private String[] desculpas;

    private Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        toolbar = (Toolbar) findViewById(R.id.tool_bar); // Attaching the layout to the toolbar object
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        fotoToolBar = (CircularImageView)findViewById(R.id.foto_toobar);
        mensage = (TextView)findViewById(R.id.mensage);

        desculpas = getResources().getStringArray(R.array.desculpas);
    }

}
