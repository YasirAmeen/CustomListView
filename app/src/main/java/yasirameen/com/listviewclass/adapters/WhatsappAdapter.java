package yasirameen.com.listviewclass.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import yasirameen.com.listviewclass.R;

/**
 * Created by hp on 7/1/2017.
 */

public class WhatsappAdapter extends BaseAdapter {


    public static String[] name = {

            "Ehsan ilahi",
            "Adeel Nazar",
            "Yasir Ameen",
            "Nauman Nasir",
            "Janet John",
            "Shakeel Abbas Rizvi",
            "Maryam Asif Ali",
            "Noor Fatima",
            "Bilal Ahmed"
    };

    public String[] message = {

            "Amazon kb change kroge",
            "Adeel PC upgrage kb krwaoge",
            "New article kb likhoge",
            "How are you?",
            "How about dinner",
            "Shakeel how are you?",
            "How about your work",
            "Are you free right now",
            "Party kb derhe ho"


    };

    public int[] images = {

            R.drawable.image_one,
            R.drawable.image_two,
            R.drawable.my_dp,
            R.drawable.image_four,
            R.drawable.janet_two,
            R.drawable.john,
            R.drawable.janet_two,
            R.drawable.janet,
            R.drawable.my_dp_four

    };

    public String[] time = {

            "08:29 PM",
            "6/26/17",
            "02:00 AM",
            "09:54 PM",
            "07/4/17",
            "YESTERDAY",
            "TODAY",
            "07/4/17",
            "08:29 PM",

    };

    public int[] messageCount = {

            2,
            0,
            0,
            12,
            4,
            3,
            0,
            0,
            0
    };

    private Context context;
    private LayoutInflater inflater = null;


    public WhatsappAdapter(Context ctx) {

        this.context = ctx;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return name.length;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {


        final ViewHolder holder;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_row,null);
            holder = new ViewHolder();

            holder._profile_image = (CircleImageView) convertView.findViewById(R.id.profile_image);
            holder._message = (TextView) convertView.findViewById(R.id.message);
            holder._name = (TextView) convertView.findViewById(R.id.name);
            holder._time = (TextView) convertView.findViewById(R.id.time);
            holder._count_badge = (TextView) convertView.findViewById(R.id.count_badge);
            convertView.setTag(holder);
        }
        else {

            holder = (ViewHolder) convertView.getTag();
        }


        holder._profile_image.setImageResource(images[position]);
        holder._name.setText(name[position]);
        holder._time.setText(time[position]);
        holder._message.setText(message[position]);

        if(messageCount[position] != 0) {
            holder._count_badge.setText(""+messageCount[position]);
        }



        holder._profile_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        return convertView;
    }

    public class ViewHolder {

        CircleImageView _profile_image;
        TextView _name;
        TextView _message;
        TextView _time;
        TextView _count_badge;

    }
}
