package org.cirelli.steve.test.expandablerecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kls602 on 1/28/18.
 */

public class PString implements Parcelable {
    private String s;

    public PString (String s){
        this.s = s;
    }

    public String setString(String s){
        this.s = s;
        return s;
    }
    public String getString(){
        return s;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.getString());
    }

    public static final Parcelable.Creator<PString> CREATOR
            = new Parcelable.Creator<PString>() {
        public PString createFromParcel(Parcel in) {
            return new PString(in);
        }

        public PString[] newArray(int size) {
            return new PString[size];
        }
    };

    private PString(Parcel in) {
        s = in.readString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PString pString = (PString) o;

        return s != null ? s.equals(pString.s) : pString.s == null;
    }

    @Override
    public int hashCode() {
        return s != null ? s.hashCode() : 0;
    }
}
