package com.example.march.demojs.activities;

import android.support.v7.app.AppCompatActivity;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import org.json.JSONArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import org.json.JSONObject;
import android.widget.Toast;

import com.example.march.demojs.R;
import com.example.march.demojs.adapters.ListViewAdapters;
import com.example.march.demojs.models.FruitNames;
import com.example.march.demojs.services.HttpWebServices;

public class MainActivity extends AppCompatActivity {

    ListView FruitsNameListView;

    ProgressBar progressBar;

    String HttpServerURL = "http://192.168.5.22/androidDB/Showfruitname.php";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        FruitsNameListView = (ListView)findViewById(R.id.listview1);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        new GetServerResponseFunction(MainActivity.this).execute();

        FruitsNameListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // TODO Auto-generated method stub


                FruitNames ListViewClickItem = (FruitNames) parent.getItemAtPosition(position);

                Toast.makeText(MainActivity.this, ListViewClickItem.getFruit_Name(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    public class GetServerResponseFunction extends AsyncTask<Void, Void, Void>
    {
        public Context context;

        String DataHolder;

        List<FruitNames> fruitNamesList;

        public GetServerResponseFunction(Context context)
        {
            this.context = context;
        }

        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... arg0)
        {
            HttpWebServices httpWebServices = new HttpWebServices(HttpServerURL);
            try
            {
                httpWebServices.ExecutePostRequest();

                if(httpWebServices.getResponseCode() == 200)
                {
                    DataHolder = httpWebServices.getResponse();

                    if(DataHolder != null)
                    {
                        JSONArray jsonArray = null;

                        try {
                            jsonArray = new JSONArray(DataHolder);

                            JSONObject jsonObject;

                            FruitNames fruitNames;

                            fruitNamesList = new ArrayList<FruitNames>();

                            for(int i=0; i<jsonArray.length(); i++)
                            {
                                fruitNames = new FruitNames();

                                jsonObject = jsonArray.getJSONObject(i);

                                fruitNames.Fruit_Name = jsonObject.getString("Fruit_Name");

                                fruitNamesList.add(fruitNames);
                            }
                        }
                        catch (JSONException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
                else
                {
                    Toast.makeText(context, httpWebServices.getErrorMessage(), Toast.LENGTH_SHORT).show();
                }
            }
            catch (Exception e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result)

        {
            progressBar.setVisibility(View.GONE);

            FruitsNameListView.setVisibility(View.VISIBLE);

            if(fruitNamesList != null)
            {
                ListViewAdapters adapter = new ListViewAdapters(context,fruitNamesList);

                FruitsNameListView.setAdapter(adapter);
            }
        }
    }

}