package com.example.mytoast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyToast
{
    //static final val
    private static final int RED = 0;
    private static final int BLUE = 0;
    private static final int ORANGE = 0;
    private static final int GREEN = 0;

    private static final int ICON_ALERT = R.drawable.ic_alert;
    private static final int ICON_ERROR = R.drawable.ic_error;
    private static final int ICON_INFO = R.drawable.ic_info;
    private static final int ICON_SUCCESS = R.drawable.ic_success;

    public static final int SHORT = 0;
    public static final int LONG = 1;

    private Context context;
    public View view;
    Toast toast;

    //constructor method
    public MyToast(Context context)
    {
        //init
        this.context = context;
        this.toast = new Toast(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.view = inflater.inflate(R.layout.toast_layout, null);
        toast.setView(view);
    }

    //methods for Toast
    //return view
    public View getView()
    {
        return view;
    }

    //set message to Toast
    public void setText(String message)
    {
        if (view == null)
        {
            return;
        }
        ((TextView) view.findViewById(R.id.lbl_message)).setText(message);
    }

    //set icon to Toast
    public void setIcon(int iconId)
    {
        if (view == null)
        {
            return;
        }
        ((ImageView) view.findViewById(R.id.img_icon)).setImageResource(iconId);
    }

    //get Toast
    public Toast getToast()
    {
        return toast;
    }

    //Result Methods Alert
    public static Toast Alert(Context context, String message, int duration)
    {
        MyToast toast = new MyToast(context);
        toast.setText(message);
        toast.getToast().setDuration(duration);
        toast.getToast().setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 100);
        toast.setIcon(ICON_ALERT);
        return toast.getToast();
    }

    //Result Methods Error
    public static Toast Error(Context context, String message, int duration)
    {
        MyToast toast = new MyToast(context);
        toast.setText(message);
        toast.getToast().setDuration(duration);
        toast.getToast().setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 100);
        toast.setIcon(ICON_ERROR);
        return toast.getToast();
    }

    //Result Methods Info
    public static Toast Info(Context context, String message, int duration)
    {
        MyToast toast = new MyToast(context);
        toast.setText(message);
        toast.getToast().setDuration(duration);
        toast.getToast().setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 100);
        toast.setIcon(ICON_INFO);
        return toast.getToast();
    }

    //Result Methods Success
    public static Toast Success(Context context, String message, int duration)
    {
        MyToast toast = new MyToast(context);
        toast.setText(message);
        toast.getToast().setDuration(duration);
        toast.getToast().setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 100);
        toast.setIcon(ICON_SUCCESS);
        return toast.getToast();
    }
}
