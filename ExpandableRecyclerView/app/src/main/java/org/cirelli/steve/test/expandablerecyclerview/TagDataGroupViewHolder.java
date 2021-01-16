package org.cirelli.steve.test.expandablerecyclerview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by kls602 on 1/28/18.
 */

public class TagDataGroupViewHolder extends GroupViewHolder {
    private TextView tagGroupTitle;

    TagDataGroupViewHolder(View itemView){
        super(itemView);
        tagGroupTitle = itemView.findViewById(R.id.textView);
    }

    public void setTagGroupTitle(ExpandableGroup group){
        tagGroupTitle.setText(group.getTitle());
    }
}
