package com.example.ptrbvs.foododo;

public class mealData {

    public Meal[] generateMeals() {
        //Pasta met rode saus
        String ingr1 =   "400g rundergehakt,"           +
                " 2 uien, gesnipperd,"          +
                " 2 tenen knoflook, "           +
                " 500g pasta, "                 +
                " 1 blik tomatenstukjes (400g)" +
                " 2 blikjes tomatenpuree,"      +
                " 2 paprika's,"                 +
                " Olijfolie,"                   +
                " Peper en zout,"               +
                " Geraspte kaas";

        String tags1 =   " italiaans, " +
                " warm,"       +
                " kinderen,"   +
                " pasta,"      +
                " hoofdgerecht";

        String instr1 = "Zet een ruime hoeveelheid water in een grote pan met een snuf zout op het gas." +
                " Terwijl het water aan de kook komt, kun je beginnen met de rest. Verhit in een (grote)" +
                " koekenpan of hapjespan een flinke scheut olijfolie en fruit daarin de ui en het knoflook." +
                " Voeg wanneer de ui van kleur verandert het gehakt toe en bak dit tot het gaar is." +
                " Voeg de paprika\u0092s toe en bak dit twee minuten mee. Doe nu de pasta in de pan, " +
                "meestal ( voor de precieze kooktijd; zie de verpakking). Proef ongeveer elke minuut" +
                " hoe de smaak van de pasta verandert. Als de pasta zacht wordt, maar nog wel een" +
                " \u0091bite\u0092 heeft, is deze klaar (al dente). De pasta gaart namelijk nog even door." +
                " Voeg vervolgens aan het gehaktmengsel de tomaatstukjes en de tomatenpuree toe en " +
                "laat dit rustig warm worden (tegen het koken aan), proef de saus en voeg eventueel" +
                " zout en peper toe. Giet de pasta af en serveer de saus en de pasta en de kaas apart.\n";
        //*haalt adem*

        Meal ml1 =  new Meal("Pasta m. rode saus", ingr1.split(", "), tags1.split(", "), 4, 20, instr1);


        //Zuurkool
        String ingr2 =  "1.25kg aardappelen,"               +
                " 500g zuurkool,"                   +
                " 2 elstar-appels,"                 +
                " 2 boeren scharrelrookworsten,"    +
                " 40g ongezouten boter/margarine,"  +
                " 150ml halfvolle melk";

        String tags2 =  "Kool,"         +
                " Groente,"     +
                " aardappel,"   +
                " Hollands,"    +
                " Duits";

        String instr2 = "Schil de aardappelen en kook in 20 min. gaar. Laat de zuurkool uitlekken." +
                " Voeg na 10 min. de zuurkool toe aan de aardappelen.Giet het mengsel af als de" +
                " aardappelen gaar zijn. Vang wat kookvocht op. Schil de appels en snijd in kwarten." +
                " Verwijder het klokhuis en snijd in plakjes. Verwarm de worst. Verhit de boter en" +
                " bak de appel 5 min. op hoog vuur. Verwarm de melk. Stamp de aardappelen en " +
                "zuurkool grof. Voeg de melk toe en wat kookvocht. Schep de appel en boter erbij en" +
                " serveer met de worst.";

        Meal ml2 =  new Meal("Pasta m. rode saus", ingr2.split(", "), tags2.split(", "), 4, 40, instr2);


        //Pizza Calzone
        String ingr3 =  "7g gedroogde gist (zakje),"    +
                " 1 tl witte basterdsuiker,"    +
                " 200ml water (lauwwarm),"      +
                " 250g tarwebloem,"             +
                " 1 tl zout,"                   +
                " 4 el traditionele olijfolie," +
                " 2 tenen knoflook,"            +
                " 8g verse tijm,"               +
                " 250g kastanjechampignons,"    +
                " 400g artisjokharten in blik," +
                " 150g yorkham,"                +
                " 250g romatomaten,"            +
                " 125g mozzarella";

        String tags3 = "Pizza,"     +
                " Italiaans,"   +
                " Kinderen";

        String instr3 = "Doe de gist en het suiker in een kom en roer er 50 ml (per 4 personen)" +
                " van het water door. Laat 5 min. rusten op een warme, tochtvrije plek. Meng " +
                "ondertussen in een kom de bloem met het zout en schenk er het gistmengsel, de helft" +
                " van de olie en de rest van het water bij. Kneed in 8 min. tot een soepel deeg dat" +
                " droog aanvoelt. Vet de binnenkant van een grote kom in met olie. Leg het deeg erin" +
                " en laat afgedekt met een vochtige theedoek 1 ½ uur rijzen op een warme," +
                " tochtvrije plek.\n" +
                "Verwarm de oven voor op 250 ºC. Snijd de knoflook fijn en ris de blaadjes van de" +
                " tijm. Maak de champignons schoon met keukenpapier en snijd in kwarten. Laat de" +
                " artisjokken uitlekken en snijd in kwarten. Snijd de ham in reepjes en halveer " +
                "de romaatjes. Verhit de rest van de olie in een koekenpan en fruit de knoflook " +
                "en tijm 1 min. Voeg de champignons toe en bak 3 min. mee. Voeg de artisjokken, " +
                "ham en romaatjes toe. Verwarm nog 2 min. en neem de pan van het vuur.\n" +
                "Duw het deeg plat en snijd doormidden. Bestuif de deegroller met bloem en rol het " +
                "deeg uit tot 2 dunne ronde lappen. Verdeel het ham-groentemengsel over de helft" +
                " van elke pizza, laat 1 cm van de rand vrij. Snijd de mozzarella in stukjes en " +
                "beleg de pizza ermee en vouw dubbel. Druk de randen aan en vouw naar binnen." +
                " Leg de pizza's op een met bakpapier beklede bakplaat. Bak net onder het midden " +
                "van de oven in ca. 15 min. goudbruin.\n";

        Meal ml3 = new Meal("Pizza Calzone", ingr3.split(", "), tags3.split(", "), 4, 30, instr3);

        //Brocolli-aardappeltaart
        String ingr4 = " 700 g broccoli,"               +
                " 700 g aardappelschijfjes,"        +
                " 6 middelgrote eieren,"            +
                " 150 g volle Franse kwark (bak),"  +
                " 2 tenen knoflook,"                +
                " 100 g geraspte belegen kaas,"     +
                " 100 g eikenbladslamelange (zak)," +
                " 3 el sladressing knoflook";

        String tags4 =  "vegetarisch,"          +
                " groente,"             +
                " gezond,"              +
                " bagger";

        String instr4 = "Verwarm de oven voor op 200 °C. Leg een royaal vel bakpapier in de " +
                "springvorm en druk in de rand goed aan.\n" +
                "Snijd de broccoli in kleine roosjes en de steel in plakjes. Kook de broccoli in" +
                " weinig water met zout 5 min, giet af en laat goed uitlekken. Verdeel de" +
                " aardappelschijfjes en broccoli in laagjes in de springvorm en druk voorzichtig aan.\n" +
                "Klop de eieren los en meng de kwark en de kaas erdoor. Pers de knoflook erboven. " +
                "Breng op smaak met peper en zout. Schenk het geheel over de aardappel en de broccoli." +
                " Bak de taart in 35-40 min. goudbruin en gaar.\n" +
                "Neem de taart uit de oven en laat 5 min. staan. Maak ondertussen de slamelange " +
                "aan met de dressing. Snijd de taart in punten en serveer met de salade.\n";

        Meal ml4 = new Meal("Brocolli-aardappeltaart", ingr4.split(", "), tags4.split(", "), 4, 40, instr4);

        Meal[] meals = new Meal[4];
        meals[0] = ml1;
        meals[1] = ml2;
        meals[2] = ml3;
        meals[3] = ml4;

        return meals;
    }
}
