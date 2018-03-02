package com.dhamu.waveproject.retro;

import com.dhamu.waveproject.model.Product;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by dhame on 3/2/2018.
 */
public interface ApiInterface {

    @GET
    Call<ArrayList<Product>> getProductList(@Url String url);

    @GET("businesses/{business_id}/products?access_token={access_token}")
    Call<ArrayList<Product>> getProductList2(@Query("business_id") String businessId, @Query("access_token") String accessToken);

}
