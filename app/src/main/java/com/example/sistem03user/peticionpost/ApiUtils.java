package com.example.sistem03user.peticionpost;

public class ApiUtils {

    private ApiUtils()    {  }

    public static final String BASE_URL="http://pruebasiiaa.sacooliveros.edu.pe:8080/";


    public static APIService getAPIService()
    {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);

    }
}
