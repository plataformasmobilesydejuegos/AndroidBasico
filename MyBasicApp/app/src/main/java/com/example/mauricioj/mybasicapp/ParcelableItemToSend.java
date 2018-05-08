package com.example.mauricioj.mybasicapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by MauricioJ on 5/2/2018.
 */

public class ParcelableItemToSend implements Parcelable {

    private String Name;
    private int NumberOfItems;
    private String Value;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumberOfItems() {
        return NumberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        NumberOfItems = numberOfItems;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public ParcelableItemToSend(String name, int numberOfItems, String value) {
        Name = name;
        NumberOfItems = numberOfItems;
        Value = value;
    }

    public ParcelableItemToSend(Parcel in) {
        Name = in.readString();
        NumberOfItems = in.readInt();
        Value = in.readString();
    }

    public static final Creator<ParcelableItemToSend> CREATOR = new Creator<ParcelableItemToSend>() {
        @Override
        public ParcelableItemToSend createFromParcel(Parcel in) {
            return new ParcelableItemToSend(in);
        }

        @Override
        public ParcelableItemToSend[] newArray(int size) {
            return new ParcelableItemToSend[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Name);
        parcel.writeInt(NumberOfItems);
        parcel.writeString(Value);
    }

    @Override
    public String toString() {
        return "ParcelableItemToSend{" +
                "Name='" + Name + '\'' +
                ", NumberOfItems=" + NumberOfItems +
                ", Value='" + Value + '\'' +
                '}';
    }
}
