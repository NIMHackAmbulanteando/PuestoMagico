package samo92.mx.ambulanteando.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public class ShowSpotsNearby {
@SerializedName("spots")
    ArrayList<Spots>main;

    public ArrayList<Spots> getSpotNearby(){
        return main;
    }


}
