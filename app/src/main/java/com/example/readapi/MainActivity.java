package com.example.readapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.readapi.Common.Common;
import com.example.readapi.Model.Affenpinscher;
import com.example.readapi.Model.Message;
import com.example.readapi.Model.RootObject;
import com.example.readapi.Retrofit.IReadAPI;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;

import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private IReadAPI iReadAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iReadAPI = Common.getApi();
        fetchAffenpinscherName();
    }

    private void fetchAffenpinscherName() {
        final String[] name = {""};
        compositeDisposable.add(iReadAPI.getObject()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RootObject>() {
                    @Override
                    public void accept(RootObject rootObject) throws Exception {
                        name[0] = rootObject.getMessage().getName();
                        fetchAffenpinscher(name[0]);
                    }
                }));

    }

    private void fetchAffenpinscher(String name) {

        compositeDisposable.add(iReadAPI.getAffenpinscher(name)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Affenpinscher>() {
                    @Override
                    public void accept(Affenpinscher affenpinscher) throws Exception {
                        Log.d("123123",affenpinscher.getMessage().size()+"");
                    }
                }));


    }
}
