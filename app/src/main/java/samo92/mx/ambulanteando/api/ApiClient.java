package samo92.mx.ambulanteando.api;

import retrofit.Callback;
import retrofit.RestAdapter;
import samo92.mx.ambulanteando.constant.Constant;
import samo92.mx.ambulanteando.model.ShowSpotsNearby;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public class ApiClient {
 private static ApiService apiService;
    public static ApiService getApiService(){
        if(apiService==null){
            RestAdapter restAdapter= new RestAdapter.Builder()
                    .setEndpoint(Constant.URL_BASE)
                    .setLogLevel(RestAdapter.LogLevel.BASIC).build();
            apiService=restAdapter.create(ApiService.class);
        }
        return apiService;
    }

    public static void showSpotNearby(Callback<ShowSpotsNearby>serverResponseShowSpotsNearby){
        getApiService().showSpotNearby(serverResponseShowSpotsNearby);
    }

    public static void showAllSpot(Callback<ShowSpotsNearby>serverResponseAllSpot){
        getApiService().showAllSpot(serverResponseAllSpot);
    }
}
