package com.multipurposetoilet.multipurposetoilet_light;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.multipurposetoilet.multipurposetoilet_light.R;


public class MainSearchActivity extends Activity {

    private LocationManager locationManager;
    Globals globals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_serch);

        globals = (Globals)this.getApplication();

        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        boolean gpsFlg = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        Log.d("GPS Enabled", gpsFlg ? "OK" : "NG");
        LocationProvider provider = locationManager.getProvider(LocationManager.GPS_PROVIDER);


        for (int i = 0; i < 20; i++) {
            Log.v("内容" + i, "合計: " + globals.attSum[i]);
        }

    }


    public void getList(View view){     // ボタンクリック時の処理

//        //LocationManagerの取得
//        locationManager = (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
//        // GPSではなくネットワークから現在地の情報を取得
//        Location myLocate = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
//
//        // 緯度の取得
//        double myLatitude =  myLocate.getLatitude();
//        //経度の取得
//        double myLongitude = myLocate.getLongitude();

//        //////////////  属性マッチングテスト  //////////////
//
//        int userAttribute[] =     {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0};    // ユーザー属性 全11桁　1桁目はヘッダ:1
//        int toiletAttribute[][] = {{0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0},   // トイレ属性   全11桁　1桁目はヘッダ:0
//                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
//
//        MatchingActivity.MatchingAttribute(userAttribute, toiletAttribute);
//        ////////////////////////////////////////////////////

        // csvテスト
        //////////////////////////////////////////////////////////////////////////
//        ArrayList<ArrayList<String>> array= new ArrayList<ArrayList<String>>();
//                array = CSVParser.ReadCSV(getApplicationContext(), "避難所データ.csv");
//        for(int i = 0; i<array.size(); i++){
//                Log.v("内容", "内容" + i + ": " + array.get(i));
//                for(int j = 0; j<array.get(i).size(); j++){
//                    Log.v("内容" + i, "内容" + j + ": " + array.get(i).get(j));
//                }
//        }
        //////////////////////////////////////////////////////////////////////////


        // 次の画面へ
        Intent ListIntent = new Intent(this, ListActivity.class);
//        ListIntent.putExtra("myLatitude", myLatitude);
//        ListIntent.putExtra("myLongitude", myLongitude);
        startActivity(ListIntent);
    }

    public void getAttributeSetting(View view) {     // ボタンクリック時の処理
//        Intent AttributeIntent = new Intent(this, AttributeActivity.class);
//        startActivity(AttributeIntent);
    }


}
