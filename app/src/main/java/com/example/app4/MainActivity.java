package com.example.app4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Car> lstCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstCar = new ArrayList<>();
        lstCar.add(new Car("Audi","Description :\"Horch\", meaning \"listen\" in German, becomes \"audi\" in Latin. The four rings of the Audi logo each represent one of four car companies that banded together to create Audi's predecessor company, Auto Union. Audi's slogan is Vorsprung durch Technik, meaning \"Being Ahead through Technology\".",R.drawable.audi));
        lstCar.add(new Car("BMW","Description :Bayerische Motoren Werke AG, commonly known as Bavarian Motor Works, BMW or BMW AG, is a German automobile, motorcycle and engine manufacturing company founded in 1916. BMW is headquartered in Munich, Bavaria. It also owns and produces Mini cars, and is the parent company of Rolls-Royce Motor Cars.",R.drawable.bmw));
        lstCar.add(new Car("Doge","Description :Dodge is an American brand of automobile manufactured by FCA US LLC (formerly known as Fiat Chrysler Group LLC), based in Auburn Hills, Michigan. Dodge vehicles currently include performance cars, though for much of its existence Dodge was Chrysler's mid-priced brand above Plymouth.",R.drawable.dodge));
        lstCar.add(new Car("Ferrari","Description :Ferrari is an Italian luxury sports car manufacturer based in Maranello. Founded by Enzo Ferrari in 1939 out of Alfa Romeo's race division as Auto Avio Costruzioni, the company built its first car in 1940. ... In 2014 Ferrari was rated the world's most powerful brand by Brand Finance.",R.drawable.ferrari));
        lstCar.add(new Car("Ford","Description :Ford Motor Company is a global automotive and mobility company. The Company's business includes designing, manufacturing, marketing, and servicing a full line of Ford cars, trucks, and sport utility vehicles (SUVs), as well as Lincoln luxury vehicles.",R.drawable.ford));
        lstCar.add(new Car("Volkswagen","Description :Volkswagen Group, also called Volkswagen AG, major German automobile manufacturer, founded by the German government in 1937 to mass-produce a low-priced “people's car.” Headquarters are in Wolfsburg, Germany. The company was originally operated by the German Labour Front (Deutsche Arbeitsfront), a Nazi organization..",R.drawable.golf));
        lstCar.add(new Car("Honda","Description :(Honda), incorporated on September 24, 1948, develops, manufactures and markets motorcycles, automobiles and power products across the world. The Company's segments include Motorcycle Business, Automobile business, Financial services business, and Power product and other businesses.",R.drawable.honda));
        lstCar.add(new Car("KIA","Description :Kia Motors Corporation was founded in May 1944 and is Korea's oldest manufacturer of motor vehicles. From humble origins making bicycles and motorcycles, Kia has grown – as part of the dynamic, global Hyundai-Kia Automotive Group – to become the world's fifth largest vehicle manufacturer.",R.drawable.kia));
        lstCar.add(new Car("Lamborghini","Description :Automobili Lamborghini S.p.A. is an Italian brand and manufacturer of luxury sports cars and SUVs based in Sant'Agata Bolognese. The company is owned by the Volkswagen Group through its subsidiary Audi.",R.drawable.lamborghini));
        lstCar.add(new Car("Mazda","Description :Mazda produces sedans, sport wagons, station wagons, minivans, sports cars, light trucks, and commercial vehicles, selling them in Japan under such names as the Demio, Axela, Atenza, Roadster, RX-8, MPV, and Tribute.",R.drawable.mazda));
        lstCar.add(new Car("Mercedes","Description :Mercedes-Benz (German: [mɛɐ̯ˈtseːdəsˌbɛnts, -dɛs-]) is a German global automobile marque and a division of Daimler AG. Mercedes-Benz is known for luxury vehicles, vans, trucks, buses, coaches and ambulances. The headquarters is in Stuttgart, Baden-Württemberg. The name first appeared in 1926 under Daimler-Benz.",R.drawable.mercedes));
        lstCar.add(new Car("Mitsubishi","Description :Mitsubishi Motors was the sixth-largest Japanese automaker and the nineteenth-largest worldwide by production.From October 2016 onwards, Mitsubishi has been one-third (34%) owned by Nissan, and thus a part of the Renault–Nissan–Mitsubishi Alliance.",R.drawable.mitsubishi));
        lstCar.add(new Car("Porsche","Description :Porsche is a German automobile manufacturer specializing in high-performance sports cars, SUVs and sedans. The headquarters of Porsche AG is in Stuttgart, and is owned by Volkswagen AG, a controlling stake of which is owned by Porsche Automobil Holding SE.",R.drawable.porsche));
        lstCar.add(new Car("Subaru","Description :Subaru cars are known for their use of a boxer engine layout in most vehicles above 1500 cc. The Symmetrical All Wheel Drive drive-train layout was introduced in 1972. The flat/boxer engine and all-wheel-drive became standard equipment for mid-size and smaller cars in most international markets by 1996, and is now standard in most North American market Subaru vehicles",R.drawable.subaru));
        lstCar.add(new Car("Toyota","Description :Toyota Motor Corp. engages in the manufacture and sale of motor vehicles and parts. It operates through the following segments: Automotive, Financial Services, and All Other. The Automotive segment designs, manufactures, assembles and sells passenger cars, minivans, trucks, and related vehicle parts and accessories.",R.drawable.toyota));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstCar);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        String str="";
        if(id == R.id.menue_home){
           setContentView(R.layout.activity_main);
        }else{
            setContentView(R.layout.activity_car_);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menue,menu);
        return true;
    }
}
