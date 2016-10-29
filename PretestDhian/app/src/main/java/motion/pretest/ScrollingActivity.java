package motion.pretest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import motion.pretest.adapter.MyAdapter;
import motion.pretest.model.Mahasiswa;

public class ScrollingActivity extends AppCompatActivity {

    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String url = getIntent().getStringExtra("url");
        List<Mahasiswa>mahasiswaList = new ArrayList<>();
        for (int i = 0; i< 5; i++) {
            mahasiswaList.add(new Mahasiswa("1102144135", "Dhian", "Sukabirus",url, "Me is Me"));
            mahasiswaList.add(new Mahasiswa("1102144135", "Zherath", "Sukabirus",url, "Me is Me"));
            mahasiswaList.add(new Mahasiswa("1102144135", "Heirith", "Sukabirus",url, "Me is Me"));
            mahasiswaList.add(new Mahasiswa("1102144135", "Eirith", "Sukabirus",url, "Me is Me"));
        }
        MyAdapter myAdapter = new MyAdapter(ScrollingActivity.this, mahasiswaList);

        recyclerView = (RecyclerView) findViewById(R.id.content_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(ScrollingActivity.this));
        recyclerView.setAdapter(myAdapter);
        ;
    }
}
