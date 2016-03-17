package com.adlabsbd.anup.personal_library_tracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {

    ListView bookListView;

    BookListAdapter adapter;

    //ToDo

    ArrayList<TestBookListClass> bookList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        bookListView = (ListView) findViewById(R.id.bookListViewID);

        TestBookListClass bookListObject  = new TestBookListClass("Harry Potter","Science Fiction");
        TestBookListClass bookListObject1 = new TestBookListClass("Harry Potter","Science Fiction");
        TestBookListClass bookListObject2 = new TestBookListClass("Harry Potter","Science Fiction");
        TestBookListClass bookListObject3 = new TestBookListClass("Harry Potter","Science Fiction");
        TestBookListClass bookListObject4 = new TestBookListClass("Harry Potter","Science Fiction");

        bookList.add(bookListObject);
        bookList.add(bookListObject1);
        bookList.add(bookListObject2);
        bookList.add(bookListObject3);
        bookList.add(bookListObject4);

        adapter = new BookListAdapter(BookListActivity.this,bookList);
        bookListView.setAdapter(adapter);

    }
}
