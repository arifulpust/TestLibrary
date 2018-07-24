package com.oceanize.testlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.oceanize.testlib.Calculator;
import com.oceanize.testlib.RssFeedProvider;
import com.oceanize.testlib.RssItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator();
        Log.e("calculator", "" + calculator.Add(10, 40));
    }
    public void updateDetail(String uri) {  //
        List<RssItem> list = RssFeedProvider
                .parse("http://www.vogella.com/article.rss");
        String itemListAsString = list.toString();
       // listener.onRssItemSelected(itemListAsString);
    }
}
