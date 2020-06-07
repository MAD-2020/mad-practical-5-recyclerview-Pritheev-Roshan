package sg.edu.np.mad.mad_recyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ListViewHolder extends RecyclerView.ViewHolder
{

    TextView txt;
    CheckBox checkBox;

    public ListViewHolder(View itemView)
    {
        super(itemView);
        txt = itemView.findViewById(R.id.textView);
        checkBox = itemView.findViewById(R.id.checkBox);
    }
}
