package com.mwolfinspace.pascalbook;

import android.app.Application;

/**
 * Created by Master Wolf on 9/2/2017.
 * Be careful in editing and keep asking if you don't get it.
 */

public class storeVar extends Application {

    private String someVariable = "None";

    public String getSelected() {
        return someVariable;
    }

    public void setSelected(String someVariable) {
        this.someVariable = someVariable;
    }


}