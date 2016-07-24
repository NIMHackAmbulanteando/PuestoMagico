package samo92.mx.ambulanteando.model;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public class Spots {

    int spot_x;
    int spot_y;
    String image_url;
    int spot_rate;
    int street_rate;
    String spot_name;
    int giro;

    public int getSpot_x() {
        return spot_x;
    }

    public void setSpot_x(int spot_x) {
        this.spot_x = spot_x;
    }

    public int getSpot_y() {
        return spot_y;
    }

    public void setSpot_y(int spot_y) {
        this.spot_y = spot_y;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getSpot_rate() {
        return spot_rate;
    }

    public void setSpot_rate(int spot_rate) {
        this.spot_rate = spot_rate;
    }

    public int getStreet_rate() {
        return street_rate;
    }

    public void setStreet_rate(int street_rate) {
        this.street_rate = street_rate;
    }

    public String getSpot_name() {
        return spot_name;
    }

    public void setSpot_name(String spot_name) {
        this.spot_name = spot_name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }
}
