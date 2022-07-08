package com.moli.locationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baidu.mapapi.map.MapView
//https://www.jianshu.com/p/9426b37c38b8 网络错误
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val mMapView:MapView = findViewById(R.id.baidumap);
    }
}