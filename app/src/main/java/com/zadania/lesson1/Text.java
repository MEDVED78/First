package com.zadania.lesson1;

import android.os.Parcel;
import android.os.Parcelable;

public class Text implements Parcelable {
    private String text = "";
    private float numb1;
    private float numb2;

    Text() {
    }

    protected Text(Parcel in) {
        text = in.readString();
        numb1 = in.readFloat();
        numb2 = in.readFloat();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(text);
        dest.writeFloat(numb1);
        dest.writeFloat(numb2);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Text> CREATOR = new Creator<Text>() {
        @Override
        public Text createFromParcel(Parcel in) {
            return new Text(in);
        }

        @Override
        public Text[] newArray(int size) {
            return new Text[size];
        }
    };

    public String getText() {
        return text;
    }

    public float getNumb1() {
        return numb1;
    }

    public float getNumb2() {
        return numb2;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNumb1(float numb1) {
        this.numb1 = numb1;
    }

    public void setNumb2(float numb2) {
        this.numb2 = numb2;
    }
}
