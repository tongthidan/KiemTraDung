package com.example.finaltestdung.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.finaltestdung.Model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienSQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "STUDENT.db";
    private static final int DATABASE_VERSION = 1;
    public SinhVienSQLiteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE sinhvien (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "tenSV TEXT," +
                "namSinh TEXT," +
                "queQuan TEXT," +
                "namHoc TEXT)";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public long addSinhVien(SinhVien sinhVien) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tenSV", sinhVien.getTenSV());
        contentValues.put("namSinh", sinhVien.getNamSinh());
        contentValues.put("queQuan", sinhVien.getQueQuan());
        contentValues.put("namHoc", sinhVien.getNamHoc());

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.insert("sinhvien", null, contentValues);
    }
    public List<SinhVien> getAll() {
        List<SinhVien> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        // giong resultSet trong sql
        Cursor cursor = sqLiteDatabase.query("sinhvien", null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String namSinh = cursor.getString(2);
            String queQuan = cursor.getString(3);
            String  namHoc = cursor.getString(4);

            list.add(new SinhVien(id, name,namSinh,queQuan,namHoc));
        }
        return list;
    }
}
