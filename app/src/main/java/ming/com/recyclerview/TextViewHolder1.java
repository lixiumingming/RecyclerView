package ming.com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/5/4.
 */
public class TextViewHolder1 extends RecyclerView.ViewHolder {

    public final ImageView mImageView;
    public final TextView mTextView;

    public TextViewHolder1(View view) {
        super(view);
        mImageView = (ImageView) view.findViewById(R.id.id_index_gallery_item_image);
        mTextView = (TextView) view.findViewById(R.id.id_index_gallery_item_text);
    }
}
