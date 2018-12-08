package com.heatmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Button> V = new ArrayList<Button>(16);

        V.add(0, (Button)findViewById(R.id.view1));
        V.add(1, (Button)findViewById(R.id.view2));
        V.add(2, (Button)findViewById(R.id.view3));
        V.add(3, (Button)findViewById(R.id.view4));
        V.add(4, (Button)findViewById(R.id.view5));
        V.add(5, (Button)findViewById(R.id.view6));
        V.add(6, (Button)findViewById(R.id.view7));
        V.add(7, (Button)findViewById(R.id.view8));
        V.add(8, (Button)findViewById(R.id.view9));
        V.add(9, (Button)findViewById(R.id.view10));
        V.add(10, (Button)findViewById(R.id.view11));
        V.add(11, (Button)findViewById(R.id.view12));
        V.add(12, (Button)findViewById(R.id.view13));
        V.add(13, (Button)findViewById(R.id.view14));
        V.add(14, (Button)findViewById(R.id.view15));
        V.add(15, (Button)findViewById(R.id.view16));

        ClickListener Listener = new ClickListener();

        for (int i = 0; i < 16; i++)
        {
            V.get(i).setOnClickListener(Listener);
        }
    }
}
