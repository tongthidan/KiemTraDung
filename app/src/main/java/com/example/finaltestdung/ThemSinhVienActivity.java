package com.example.finaltestdung;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.finaltestdung.DataBase.SinhVienSQLiteHelper;
import com.example.finaltestdung.Model.SinhVien;

public class ThemSinhVienActivity extends AppCompatActivity {
    EditText tenSV, namSinh, queQuan;
    Button btnAddSV;
    AutoCompleteTextView namHoc;
    SinhVienSQLiteHelper sinhVienSQLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_sinh_vien);
        initView();
        sinhVienSQLiteHelper = new SinhVienSQLiteHelper(this);
        String[] st = getResources().getStringArray(R.array.array_namHoc);
        namHoc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, st));
        btnAddSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = tenSV.getText().toString();
                String namsinh = namSinh.getText().toString();
                String que = queQuan.getText().toString();
                String nam = namHoc.getText().toString();
                SinhVien sv = new SinhVien(ten,namsinh, que,nam );

                sinhVienSQLiteHelper.addSinhVien(sv);
                System.out.println("Da luu trong DB");

            }
        });

    }
    void initView(){
        tenSV = findViewById(R.id.addStudent_tenSV);
        namSinh = findViewById(R.id.addStudent_namSinh);
        queQuan =   findViewById(R.id.addStudent_queQuan);
        namHoc = findViewById(R.id.addStudent_namHoc);
        btnAddSV =  findViewById(R.id.btnAddSV);


    }
}