package com.example.finaltestdung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finaltestdung.DataBase.SinhVienSQLiteHelper;
import com.example.finaltestdung.Model.SinhVien;
import com.example.finaltestdung.RecycleViewAdapter.SinhVienAdapter;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSvActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SinhVienSQLiteHelper sinhVienSQLiteHelper;
    SinhVienAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_sv);
        recyclerView = findViewById(R.id.revSV);
        sinhVienSQLiteHelper = new SinhVienSQLiteHelper(this);
        adapter = new SinhVienAdapter();
        List<SinhVien> listSV = new ArrayList<>();
        adapter.setSVS(listSV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    public void onStart() {
        super.onStart();
        List<SinhVien> list = sinhVienSQLiteHelper.getAll();

        adapter.setSVS(list);
        recyclerView.setAdapter(adapter);
    }
}