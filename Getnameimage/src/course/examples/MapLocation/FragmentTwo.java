package course.examples.MapLocation;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentTwo extends Fragment {
	ImageView ivIcon;
	TextView tvItemName;

	public static final String IMAGE_RESOURCE_ID = "iconResourceID";
	public static final String ITEM_NAME = "itemName";
    private List<Item> items = new ArrayList<Item>();
	public FragmentTwo()
	{
		
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_layout_two, container,
                false);
        GridView gridView = (GridView) view.findViewById(R.id.gridview);
        items.add(new Item("Peru", R.drawable.peru));
        items.add(new Item("Brasil", R.drawable.brasil));
        items.add(new Item("China", R.drawable.china));
        items.add(new Item("Chile", R.drawable.chile));
        items.add(new Item("Espana", R.drawable.espana));
        items.add(new Item("USA", R.drawable.usa));
        ImageAdapter imgAdap =new ImageAdapter(view.getContext());
        imgAdap.setItems(items);
        gridView.setAdapter(imgAdap);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent intent = new Intent();
                intent.setClass(getActivity().getApplication(),DetailsActivity.class);
                intent.putExtra("position", String.valueOf(position));
                intent.putExtra("titulo", items.get(position).getItemName());
                startActivity(intent);
            }
        });
        return view;
	}
}
