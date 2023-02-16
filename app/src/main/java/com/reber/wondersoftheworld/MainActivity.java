package com.reber.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.reber.wondersoftheworld.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;
    /*ListView listView;
    * */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark pyramid = new Landmark("Great Pyramid of Giza","Egypt", R.drawable.pyramid, "The Great Pyramid of Giza is the biggest Egyptian pyramid and the tomb of Fourth Dynasty pharaoh Khufu. Built in the early 26th century BC during a period of around 27 years, the pyramid is the oldest of the Seven Wonders of the Ancient World, and the only one to remain largely intact.");
        Landmark colossus = new Landmark("Colossus of Rhodes","Greece",R.drawable.colossus,"Definition. The Colossus of Rhodes was a gigantic 33-metre-high bronze statue of the sun god Helios which stood by the harbour of that city from c. 280 BCE. Rhodes was then one of the most important trading ports in the ancient Mediterranean and the statue was considered one of the Seven Wonders of the Ancient World.");
        Landmark gardens = new Landmark("Hanging Gardens of Babylon","Iraq", R.drawable.gardens,"The Hanging Gardens of Babylon were one of the Seven Wonders of the Ancient World listed by Hellenic culture. They were described as a remarkable feat of engineering with an ascending series of tiered gardens containing a wide variety of trees, shrubs, and vines, resembling a large green mountain constructed of mud bricks. It was said to have been built in the ancient city of Babylon, near present-day Hillah, Babil province, in Iraq. The Hanging Gardens' name is derived from the Greek word κρεμαστός (kremastós, lit. 'overhanging'), which has a broader meaning than the modern English word \"hanging\" and refers to trees being planted on a raised structure such as a terrace");
        Landmark lighthouse = new Landmark("Lighthouse of Alexandria","Egypt",R.drawable.lighthouse,"The lighthouse was intended to guide & protect sailors, & to that end was dedicated to Zeus Soter (Deliverer). Around 300 BCE Ptolemy I Soter (r. 323 - 282 BCE) commissioned the building of a massive lighthouse to guide ships into Alexandria and provide a permanent reminder of his power and greatness.");
        Landmark mausoleum = new Landmark("Mausoleum at Halicarnassus","Turkey",R.drawable.mausoleum,"Mausoleum of Halicarnassus, Halicarnassus also spelled Halikarnassos, one of the Seven Wonders of the World. The monument was the tomb of Mausolus, ruler of Caria, in southwestern Asia Minor. It was built in his capital city, Halicarnassus, between about 353 and 351 bce by his sister and widow, Artemisia II.");
        Landmark statue = new Landmark("Statue of Zeus at Olympia","Greece",R.drawable.statue,"The Statue of Zeus at Olympia was a giant seated figure, about 12.4 m (41 ft) tall, made by the Greek sculptor Phidias around 435 BC at the sanctuary of Olympia, Greece, and erected in the Temple of Zeus there. Zeus is the sky and thunder god in ancient Greek religion, who rules as king of the gods of Mount Olympus.");
        Landmark temple = new Landmark("Temple of Artemis at Ephesus","Turkey",R.drawable.temple,"Temple of Artemis, also called Artemesium, temple at Ephesus, now in western Turkey, that was one of the Seven Wonders of the World. The great temple was built by Croesus, king of Lydia, about 550 bce and was rebuilt after being burned by a madman named Herostratus in 356 bce.");
        landmarkArrayList.add(pyramid);
        landmarkArrayList.add(colossus);
        landmarkArrayList.add(gardens);
        landmarkArrayList.add(lighthouse);
        landmarkArrayList.add(mausoleum);
        landmarkArrayList.add(statue);
        landmarkArrayList.add(temple);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
        /*
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));

        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("landmark",landmarkArrayList.get(position));
                startActivity(intent);
            }
        });
        */

    }

}