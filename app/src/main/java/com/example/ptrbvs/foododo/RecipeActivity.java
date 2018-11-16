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
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Pasta met rode saus","400 gram (runder) gehakt, 2 uien, 2 tenen knoflook, 500 gram pasta (spaghetti of tagliatelle), 1 blik tomaatstukjes (à 400 gr),2 blikjes tomatenpuree, 2 paprika\u0092s (of prei, of courgette) in (niet al te kleine) stukken Olijfolie Peper en zout Geraspte kaas","Zet een ruime hoeveelheid water in een grote pan met een snuf zout op het gas. Terwijl het water aan de kook komt, kun je beginnen met de rest. Verhit in een (grote) koekenpan of hapjespan een flinke scheut olijfolie en fruit daarin de ui en het knoflook. Voeg wanneer de ui van kleur verandert het gehakt toe en bak dit tot het gaar is. Voeg de paprika\u0092s toe en bak dit twee minuten mee. Doe nu de pasta in de pan, meestal ( voor de precieze kooktijd; zie de verpakking). Proef ongeveer elke minuut hoe de smaak van de pasta verandert. Als de pasta zacht wordt, maar nog wel een \u0091bite\u0092 heeft, is deze klaar (al dente). De pasta gaart namelijk nog even door. Voeg vervolgens aan het gehaktmengsel de tomaatstukjes en de tomatenpuree toe en laat dit rustig warm worden (tegen het koken aan), proef de saus en voeg eventueel zout en peper toe. Giet de pasta af en serveer de saus en de pasta en de kaas apart."));
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Zuurkool","1¼ kg kruimige aardappelen, 500 g zuurkool, 2 elstar-appels, 2 boeren scharrelrookworsten (à 250 g), 40 g ongezouten boter (of margarine), 150 ml halfvolle melk","Schil de aardappelen en kook in 20 min. gaar. Laat de zuurkool uitlekken. Voeg na 10 min. de zuurkool toe aan de aardappelen.Giet het mengsel af als de aardappelen gaar zijn. Vang wat kookvocht op. Schil de appels en snijd in kwarten. Verwijder het klokhuis en snijd in plakjes. Verwarm de worst. Verhit de boter en bak de appel 5 min. op hoog vuur. Verwarm de melk. Stamp de aardappelen en zuurkool grof. Voeg de melk toe en wat kookvocht. Schep de appel en boter erbij en serveer met de worst."));
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Pizza Calzone","1 pak mix voor pizzabodem(Honig), 4 eetlepels olijfolie, 2 uien, 2 teentjes knoflook, 40g pijnboompitten, 5 takjes peterselie, 200g rundergehakt, 200g roerbakgroenten,1/2 pakje tomaten fritto(Heinz), cayennepeper, paar druppels citroensap.","Bereid 1 pak mix voor pizzabodem(Honig) met 250ml water en 2 eetlepels olijfolie, volgens de gebruiksaanwijzing. Verwarm de oven voor op 220?C(hetelucht 200?C). Bekleed een bakplaat met bakpapier. Pel 2 uien en snij ze in ringen. Pel 2 teentjes knoflook en snij ze in plakjes. Rooster 40g pijnboompitten in een droge Koekenpan goudbruin. Was en hak 5 takjes peterselie. Verhit 2 eetlepels olijfolie in een koekenpan en bak hierin 200g rundergehakt rul. Voeg de ui, knoflook en 200g roerbakgroenten toe aan het gehakt en bak ca. 4 minuten. Roer 1/2 pakje tomaten fritto(Heinz), pijnboompitten en de peterselie door het gehakt. Breng op smaak met cayennepeper en een paar druppels citroensap. Rol het deeg uit tot een grote lap. Verdeel het gehaktmengsel over de helft van de pizzabodem en laat de randen vrij. Maak de deegranden nat met een beetje water en vouw de pizza dicht. Druk de randen goed aan. Bak de pizza midden in de oven in ca. 25 minuten gaar en goudbruin."));
        mExampleList.add(new ExampleItem(R.drawable.pokemon, "Brocolli-aardappeltaart","700 g broccoli, 700 g aardappelschijfjes, 6 middelgrote eieren 150 g, volle Franse kwark (bak), 2 tenen knoflook, 100 g geraspte belegen kaas, 100 g eikenbladslamelange (zak),3 el sladressing knoflook","Verwarm de oven voor op 200 °C. Leg een royaal vel bakpapier in de springvorm en druk in de rand goed aan. Snijd de broccoli in kleine roosjes en de steel in plakjes. Kook de broccoli in weinig water met zout 5 min, giet af en laat goed uitlekken. Verdeel de aardappelschijfjes en broccoli in laagjes in de springvorm en druk voorzichtig aan. Klop de eieren los en meng de kwark en de kaas erdoor. Pers de knoflook erboven. Breng op smaak met peper en zout. Schenk het geheel over de aardappel en de broccoli. Bak de taart in 35-40 min. goudbruin en gaar. Neem de taart uit de oven en laat 5 min. staan. Maak ondertussen de slamelange aan met de dressing. Snijd de taart in punten en serveer met de salade."));
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
