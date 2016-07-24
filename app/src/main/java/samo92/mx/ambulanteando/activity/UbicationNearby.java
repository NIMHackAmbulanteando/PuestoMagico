package samo92.mx.ambulanteando.activity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import samo92.mx.ambulanteando.R;
import samo92.mx.ambulanteando.adapter.AdapterUbicationNearby;
import samo92.mx.ambulanteando.api.ApiClient;
import samo92.mx.ambulanteando.interfaces.MyOnItemClickListener;
import samo92.mx.ambulanteando.model.ShowSpotsNearby;
import samo92.mx.ambulanteando.model.Spots;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public class UbicationNearby extends AppCompatActivity implements AdapterView.OnClickListener, MyOnItemClickListener {

    RecyclerView recyclerView;
    Context context;
    AdapterUbicationNearby adapterUbicationNearby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubication_nearby);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_ubication_nearby);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        executeWithRetrofit();

    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onClick(View v) {

    }

    public void executeWithRetrofit() {
        ApiClient.showSpotNearby(new Callback<ShowSpotsNearby>() {
            @Override
            public void success(ShowSpotsNearby showSpotsNearby,
                                Response response) {
                List<Spots> spotNearby = showSpotsNearby.getSpotNearby();
                adapterUbicationNearby.setData(spotNearby);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
