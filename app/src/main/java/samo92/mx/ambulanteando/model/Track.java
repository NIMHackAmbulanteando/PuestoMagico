package samo92.mx.ambulanteando.model;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public class Track {
    int initial_spot_x;
    int initial_spot_y;
    int final_spot_x;
    int final_spot_y;
    float total_kilomeers;

    public int getInitial_spot_x() {
        return initial_spot_x;
    }

    public void setInitial_spot_x(int initial_spot_x) {
        this.initial_spot_x = initial_spot_x;
    }

    public int getInitial_spot_y() {
        return initial_spot_y;
    }

    public void setInitial_spot_y(int initial_spot_y) {
        this.initial_spot_y = initial_spot_y;
    }

    public int getFinal_spot_x() {
        return final_spot_x;
    }

    public void setFinal_spot_x(int final_spot_x) {
        this.final_spot_x = final_spot_x;
    }

    public int getFinal_spot_y() {
        return final_spot_y;
    }

    public void setFinal_spot_y(int final_spot_y) {
        this.final_spot_y = final_spot_y;
    }

    public float getTotal_kilomeers() {
        return total_kilomeers;
    }

    public void setTotal_kilomeers(float total_kilomeers) {
        this.total_kilomeers = total_kilomeers;
    }
}
