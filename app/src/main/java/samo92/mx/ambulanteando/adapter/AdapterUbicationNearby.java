package samo92.mx.ambulanteando.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import samo92.mx.ambulanteando.R;
import samo92.mx.ambulanteando.interfaces.MyOnItemClickListener;
import samo92.mx.ambulanteando.model.ShowSpotsNearby;
import samo92.mx.ambulanteando.model.Spots;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by LEONARDO on 23/07/2016.
 */
public class AdapterUbicationNearby extends RecyclerView.Adapter<AdapterUbicationNearby.ViewHolder> implements MyOnItemClickListener{
    private List<Spots> spotsList;
    private LayoutInflater inflater;
    private Context context;

    public AdapterUbicationNearby(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view=inflater.inflate(R.layout.list_ubication_nearby,parent,false);
        ViewHolder viewHolder= new ViewHolder(view, R.id.txt_name_ambulante, R.id.txt_type,
                R.id.ambulante_image);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Spots spots=spotsList.get(position);
        holder.setCircleImageView(spots.getImage_url());
        holder.setTxtNameAmbulante(spots.getSpot_name());
        holder.setTxtType(spots.getSpot_rate());


    }

    @Override
    public int getItemCount() {
        return spotsList.size();
    }


    @Override
    public void onItemClick(int position) {
        Toast.makeText(context,spotsList.get(position).getSpot_name().toString(),LENGTH_SHORT).show();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CircleImageView circleImageView;
        TextView txtNameAmbulante;
        TextView txtType;

        public ViewHolder(View itemView, int idNameAmbulante, int idTxtType, int idCircleImage) {
            super(itemView);
            itemView.setOnClickListener(this);
            txtNameAmbulante = (TextView) itemView.findViewById(idNameAmbulante);
            txtType = (TextView) itemView.findViewById(idTxtType);
            circleImageView=(CircleImageView)itemView.findViewById(idCircleImage);
        }


        @Override
        public void onClick(View v) {

        }

        public void setCircleImageView(String circleImageViewUrl) {
            Picasso.with(context).load(circleImageViewUrl).fit().placeholder(R.mipmap.ic_launcher).into(circleImageView);
        }

        public void setTxtNameAmbulante(String idtxtNameAmbulante) {
            txtNameAmbulante.setText(idtxtNameAmbulante);
        }

        public void setTxtType(int idtxtType) {
            txtType.setText(idtxtType);
        }
    }
    public void setData(List<Spots>data){
        spotsList=data;
        notifyDataSetChanged();
    }


}
