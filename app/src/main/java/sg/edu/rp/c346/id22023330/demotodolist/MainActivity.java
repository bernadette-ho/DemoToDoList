package sg.edu.rp.c346.id22023330.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvtodo;
    ArrayList<todo> altodo;
    CustomAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvtodo = findViewById(R.id.listViewtodo);
        altodo = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.AUGUST, 1);

        todo item1 = new todo("Go for Movie", calendar );

        altodo.add(item1);

        adapter = new CustomAdapter(this, R.layout.row, altodo);

       lvtodo.setAdapter(adapter);
    }
}