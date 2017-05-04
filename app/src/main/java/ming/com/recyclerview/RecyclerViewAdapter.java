package ming.com.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/3.
 */

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
private final ArrayList <String> list;
    private static final int HEADER_TYPE = 0;
    private static final int ITEM_TYPE = 1;

    public RecyclerViewAdapter(int count){
        list = new ArrayList<String>(count);
        for (int i = 0 ; i < count; i++){
            list.add(String.valueOf(i));
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == HEADER_TYPE){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item, parent, false);
            return new TextViewHolder1(view);
        }else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item, parent, false);
            return new TextViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
       if (viewType == HEADER_TYPE){
           ((TextViewHolder1)holder).mTextView.setText("000000000");
       }else{
           ((TextViewHolder)holder).mTextView.setText(list.get(position-1));
       }
    }

    @Override
    public int getItemCount() {
        return list.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0) {
            return HEADER_TYPE;
        }else {
            return ITEM_TYPE;
        }
    }
}
