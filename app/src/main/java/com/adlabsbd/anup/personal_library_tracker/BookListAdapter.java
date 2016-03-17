package com.adlabsbd.anup.personal_library_tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anup on 17-Mar-16.
 */
public class BookListAdapter extends ArrayAdapter {


    Context context;
    ArrayList<TestBookListClass> bookList;

    public BookListAdapter(Context context, ArrayList<TestBookListClass> objects) {
        super(context, R.layout.book_list_row, objects);
        this.context = context;
        this.bookList = objects;

    }

    static class ViewHolder {

        ImageView bookCoverIV;
        TextView bookNameTV;
        TextView bookCategoryTV;
        TextView bookQtyTV;
        ImageButton editBookIB;
        ImageButton deleteBookIB;
        ImageButton detailBookInfoIB;
        ImageButton addBookQtyIB;
        ImageButton borrowBookIB;

    }

    // generate view by myself
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {

            // to convert my xml custom layout into view!
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.book_list_row, null);

            viewHolder = new ViewHolder();
            viewHolder.bookCoverIV = (ImageView) convertView.findViewById(R.id.bookCoverIVID);
            viewHolder.bookNameTV = (TextView) convertView.findViewById(R.id.bookNameTVID);
            viewHolder.bookCategoryTV = (TextView) convertView.findViewById(R.id.bookCategoryTVID);
            viewHolder.bookQtyTV = (TextView) convertView.findViewById(R.id.bookQtyTVID);
            viewHolder.editBookIB = (ImageButton) convertView.findViewById(R.id.editBookIBID);
            viewHolder.deleteBookIB = (ImageButton) convertView.findViewById(R.id.deleteBookIBID);
            viewHolder.detailBookInfoIB = (ImageButton) convertView.findViewById(R.id.detailBookInfoIBID);
            viewHolder.addBookQtyIB = (ImageButton) convertView.findViewById(R.id.addBookQtyIBID);
            viewHolder.borrowBookIB = (ImageButton) convertView.findViewById(R.id.borrowBookIBID);

            convertView.setTag(viewHolder);

        } else {

            viewHolder = (ViewHolder) convertView.getTag();

        }

        viewHolder.bookCoverIV.setImageResource(R.drawable.open_book);
        viewHolder.bookNameTV.setText(bookList.get(position).getBookName());
        viewHolder.bookCategoryTV.setText(bookList.get(position).getBookCategory());
        viewHolder.bookQtyTV.setText("20/50");
//        viewHolder.editBookIB
//        viewHolder.deleteBookIB
//        viewHolder.detailBookInfoIB
//        viewHolder.addBookQtyIB
//        viewHolder.borrowBookIB



        return convertView;
    }
}
