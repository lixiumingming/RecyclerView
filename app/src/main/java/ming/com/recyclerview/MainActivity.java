package ming.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridLayoutManager manager = new GridLayoutManager(this, 2);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.id_recyclerview_horizontal);
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(19);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(mAdapter);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(){

            @Override
            public int getSpanSize(int position) {
                return  position == 0? manager.getSpanCount():1;
            }
        });
    }
}
