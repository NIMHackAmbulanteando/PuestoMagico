package samo92.mx.ambulanteando.api;


import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import samo92.mx.ambulanteando.constant.Constant;
import samo92.mx.ambulanteando.model.ShowSpotsNearby;
import samo92.mx.ambulanteando.model.Track;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public interface ApiService {

    @GET(Constant.PATH_SPOTSNEARBY)
    void showSpotNearby(Callback<ShowSpotsNearby> serviceResponseShowSpotNearby);

    @GET(Constant.PATH_ALLSPOT)
    void showAllSpot(Callback<ShowSpotsNearby> serviceResponseShowAllSpot);

    @POST("/")
    void sendTrack(@Body Track track, Callback<Track> servicePostTrack);


}
