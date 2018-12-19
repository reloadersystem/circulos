package com.example.sistem03user.peticionpost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class masterP {
    @SerializedName("estado")
    @Expose
    private Boolean estado;
    @SerializedName("data")
    @Expose
    private List<Post> data = null;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Post> getData() {
        return data;
    }

    public void setData(List<Post> data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "masterP{" +
                "estado=" + estado +
                ", data=" + data +
                '}';
    }
}
