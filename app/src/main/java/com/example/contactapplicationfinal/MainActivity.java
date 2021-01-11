package com.example.contactapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;
    EditText editText;
    Button button;
    int count;

  @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editTextTextPersonName);
        button=findViewById(R.id.button2);
      ArrayList<RowModel> rowModelArrayList=new ArrayList<>();
      rowModelArrayList.add(new RowModel("dhanya"));
      rowModelArrayList.add(new RowModel("dhanyamadhuvana"));
      rowModelArrayList.add( new RowModel("daksha"));
      rowModelArrayList.add( new RowModel("dhanya2"));
      rowModelArrayList.add( new RowModel("dhanya3"));
      rowModelArrayList.add( new RowModel("dhanya4"));
      rowModelArrayList.add(new RowModel("dhanya5"));
      rowModelArrayList.add( new RowModel("dhanya6"));

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String value=editText.getText().toString();
        count=0;
       for(RowModel rowModel:rowModelArrayList ){
            if(rowModel.getName().equalsIgnoreCase(value)){
                count++;
            }
        }
        if(count==0) {
            rowModelArrayList.add(new RowModel(value));
            adapter.notifyDataSetChanged();
        }
    }
});


      RowModel[] rowModels=new RowModel[]{
                new RowModel("dhanya"),
                new RowModel("dhanyamadhuvana"),
                new RowModel("daksha"),
                new RowModel("dhanya2"),
                new RowModel("dhanya3"),
                new RowModel("dhanya4"),
                new RowModel("dhanya5"),
                new RowModel("dhanya6"),


        };
      RecyclerView recyclerView=findViewById(R.id.RecyclerView);  adapter=new MyAdapter(rowModelArrayList);
      recyclerView.setHasFixedSize(true);
      LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
       recyclerView.setLayoutManager(linearLayoutManager);
       recyclerView.setAdapter(adapter);

  }
}