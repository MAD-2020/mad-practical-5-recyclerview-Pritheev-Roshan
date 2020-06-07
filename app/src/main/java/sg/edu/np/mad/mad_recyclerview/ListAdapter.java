package sg.edu.np.mad.mad_recyclerview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    private final String TAG = "ListAdapter";

    private ArrayList<String> list_objects;

    public ListAdapter(ArrayList<String> obj){
        this.list_objects = obj;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
        final ListViewHolder holder = new ListViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ListViewHolder holder, final int position){
        holder.txt.setText(list_objects.get(position));

        holder.txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());

                builder.setTitle("Delete");
                builder.setMessage("Are you sure you want to delete " + holder.txt.getText().toString() + "?");
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        list_objects.remove(position);
                        notifyDataSetChanged();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
            }
        });

    }

    public int getItemCount(){
        return list_objects.size();
    }


    public ArrayList<String> returnList()
    {
        return list_objects;
    }


}
