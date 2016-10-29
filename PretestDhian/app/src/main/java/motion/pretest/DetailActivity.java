package motion.pretest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = (TextView) findViewById(R.id.yootext);
        String name = getIntent().getStringExtra("name");
        textView.setText("Hellow "+name);
    }
}
