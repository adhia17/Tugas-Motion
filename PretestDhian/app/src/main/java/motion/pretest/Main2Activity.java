package motion.pretest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView ;
    Button imageClick,moveButon ;

    String imageUrl = "https://s-media-cache-ak0.pinimg.com/736x/3d/56/b9/3d56b91198d0543c6f38eda8351347be.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = (ImageView) findViewById(R.id.imageview);
        imageClick = (Button) findViewById(R.id.ImageDownload);
        moveButon = (Button) findViewById(R.id.MoveButton);


        imageClick.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Glide.with(Main2Activity.this).load(imageUrl).into(imageView);
                Toast.makeText(Main2Activity.this, "Succes", Toast.LENGTH_SHORT).show();
            }
        });
        moveButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, ScrollingActivity.class);
                intent.putExtra("Url",imageUrl);
                startActivity(intent);
            }
        });
    }
}
