package org.cirelli.steve.test.expandablerecyclerview;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by kls602 on 1/28/18.
 */

public class TagDataGroup extends ExpandableGroup<PString> {
    public TagDataGroup(String title, List<PString> items){
        super(title, items);
    }
}
