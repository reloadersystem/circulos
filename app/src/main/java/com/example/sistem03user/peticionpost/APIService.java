package com.example.sistem03user.peticionpost;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {

    @GET("/FacturacionElectronicaSIIAA/api/v1/estudiante/obtenerDatos/")
    @FormUrlEncoded
    Call<Post> savePost(@Field("turno_nombre") String turno_nombre);

}
