package com.example.sistem03user.peticionpost;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

//    @GET("/FacturacionElectronicaSIIAA/api/v1/estudiante/obtenerDatos/")
//    @FormUrlEncoded
//    Call<Post> savePost(@Field("turno_nombre") String turno_nombre);


    @GET("/FacturacionElectronicaSIIAA/api/v1/estudiante/obtenerDatos/{persona_nombre}")
    @Headers("Content-Type: application/json")
    Call<Post> obtenerUsuario(@Path("persona_nombre") String usuarioRequest);

}
