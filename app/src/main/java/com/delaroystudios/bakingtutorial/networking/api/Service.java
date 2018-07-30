package com.delaroystudios.bakingtutorial.networking.api;

import com.delaroystudios.bakingtutorial.model.BakingProcess;
import com.delaroystudios.bakingtutorial.networking.Routes;
import com.google.gson.JsonArray;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by delaroy on 7/24/18.
 */

public interface Service {
    @GET(Routes.END_POINT)
    Call<JsonArray> fetchBakingData();

}
