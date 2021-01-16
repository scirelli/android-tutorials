package org.cirelli.steve.test.expandablerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by kls602 on 2/1/18.
 */

public class TagListAdapter extends ExpandableRecyclerViewAdapter<TagDataGroupViewHolder, TagDataViewHolder> {
    public TagListAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public TagDataGroupViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.taggroup_title, parent, false);
        return new TagDataGroupViewHolder(view);
    }

    @Override
    public TagDataViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tag_details, parent, false);
        return new TagDataViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(TagDataViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final PString string = ((TagDataGroup) group).getItems().get(childIndex);
        holder.setText(string);
    }

    @Override
    public void onBindGroupViewHolder(TagDataGroupViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setTagGroupTitle(group);
    }
}
