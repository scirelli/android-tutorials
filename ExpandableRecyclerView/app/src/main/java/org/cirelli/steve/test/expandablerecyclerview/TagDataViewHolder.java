package org.cirelli.steve.test.expandablerecyclerview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by kls602 on 1/30/18.
 */

public class TagDataViewHolder extends ChildViewHolder {
    private TextView tagDataView;

    public TagDataViewHolder(View itemView){
        super(itemView);
        tagDataView = itemView.findViewById(R.id.tagDetailsTextView);
    }

    public void onBind(PString data){
        tagDataView.setText(data.getString());
    }

    public void setText(PString str){
        tagDataView.setText(str.getString());
    }
}
