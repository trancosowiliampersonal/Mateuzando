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

        popularFotos();
        desculpas = getResources().getStringArray(R.array.desculpas);
        geraDesulpa(null);
    }

    private void popularFotos(){
        fotos = new Drawable[]{
                getResources().getDrawable(R.drawable.mateus001),
                getResources().getDrawable(R.drawable.mateus002),
                getResources().getDrawable(R.drawable.mateus003),
                getResources().getDrawable(R.drawable.mateus004),
                getResources().getDrawable(R.drawable.mateus005),
                getResources().getDrawable(R.drawable.mateus006),
                getResources().getDrawable(R.drawable.mateus007),
                getResources().getDrawable(R.drawable.mateus008),
                getResources().getDrawable(R.drawable.mateus009),
                getResources().getDrawable(R.drawable.mateus010),
                getResources().getDrawable(R.drawable.mateus011),
                getResources().getDrawable(R.drawable.mateus012),
                getResources().getDrawable(R.drawable.mateus013),
                getResources().getDrawable(R.drawable.mateus014),
                getResources().getDrawable(R.drawable.mateus015),
                getResources().getDrawable(R.drawable.mateus016),
                getResources().getDrawable(R.drawable.mateus017),
                getResources().getDrawable(R.drawable.mateus018),
                getResources().getDrawable(R.drawable.mateus019)
        };
    }

    public void geraDesulpa(View v){
        fotoToolBar.setImageDrawable(fotos[r.nextInt(fotos.length-1)]);
        mensage.setText(desculpas[r.nextInt(desculpas.length-1)]);
    }

}
