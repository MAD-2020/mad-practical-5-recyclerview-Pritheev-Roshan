package sg.edu.np.mad.mad_recyclerview;

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
        ListViewHolder holder = new ListViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position){
        holder.txt.setText(list_objects.get(position));

        String item = holder.txt.getText().toString();

    }

    public int getItemCount(){
        return list_objects.size();
    }


    public ArrayList<String> returnList()
    {
        return list_objects;
    }

}
