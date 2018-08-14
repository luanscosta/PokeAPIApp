package br.com.opet.tds.pokeapiapp.Model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Diego on 12/08/2018.
 */

public class Sprites {
    private String front_default;

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    public Sprites(String front_default) {
        this.front_default = front_default;
    }
}


