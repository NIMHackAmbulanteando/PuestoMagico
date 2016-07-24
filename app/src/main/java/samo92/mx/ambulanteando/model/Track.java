package samo92.mx.ambulanteando.model;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public class Track {
    double initial_spot_x;
    double initial_spot_y;
    double final_spot_x;
    double final_spot_y;
    double total_kilomeers;

    public Track(double lat, double lon) {
        this.initial_spot_x=lat;
        this.initial_spot_y=lon;
    }

    public Track(double lat_init, double lon_init, double lat_final, double lon_final, double dis) {
        this.initial_spot_x=lat_init;
        this.initial_spot_y=lon_init;
        this.final_spot_x=lat_final;
        this.final_spot_y=lon_final;
        this.total_kilomeers=dis;
    }

    public double getInitial_spot_x() {
        return initial_spot_x;
    }

    public double getInitial_spot_y() {
        return initial_spot_y;
    }

    public double getFinal_spot_x() {
        return final_spot_x;
    }

    public double getFinal_spot_y() {
        return final_spot_y;
    }

    public double getTotal_kilomeers() {
        return total_kilomeers;
    }

    public void setInitial_spot_x(double initial_spot_x) {
        this.initial_spot_x = initial_spot_x;
    }

    public void setInitial_spot_y(double initial_spot_y) {
        this.initial_spot_y = initial_spot_y;
    }

    public void setFinal_spot_x(double final_spot_x) {
        this.final_spot_x = final_spot_x;
    }

    public void setFinal_spot_y(double final_spot_y) {
        this.final_spot_y = final_spot_y;
    }

    public void setTotal_kilomeers(double total_kilomeers) {
        this.total_kilomeers = total_kilomeers;
    }
}