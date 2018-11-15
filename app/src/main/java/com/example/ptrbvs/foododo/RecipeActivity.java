package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        createExampleList();
        buildRecyclerView();
    }

    public void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Pasta met rode saus","Pastapennen, tomaten, tomatensaus, ui, gehakt",""));
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Zuurkool","1¼ kg kruimige aardappelen, 500 g zuurkool, 2 elstar-appels, 2 boeren scharrelrookworsten (à 250 g), 40 g ongezouten boter (of margarine), 150 ml halfvolle melk","Schil de aardappelen en kook in 20 min. gaar. Laat de zuurkool uitlekken. Voeg na 10 min. de zuurkool toe aan de aardappelen.Giet het mengsel af als de aardappelen gaar zijn. Vang wat kookvocht op.\n" +
                "Schil de appels en snijd in kwarten. Verwijder het klokhuis en snijd in plakjes. Verwarm de worst. Verhit de boter en bak de appel 5 min. op hoog vuur. Verwarm de melk. Stamp de aardappelen en zuurkool grof. Voeg de melk toe en wat kookvocht. Schep de appel en boter erbij en serveer met de worst."));
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Pizza Calzone","",""));
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Brocolli-aardappeltaart","",""));
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(RecipeActivity.this, RecipeIngredientsActivity.class);
                intent.putExtra("Example Item", mExampleList.get(position));

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.friends_menu, menu);
        return true;
    }
}
