package com.example.finaltestdung.RecycleViewAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finaltestdung.Model.SinhVien;
import com.example.finaltestdung.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienViewHolder>{
    List<SinhVien> list = new ArrayList<>();
    public void setSVS(List<SinhVien> mSV) {
        list = mSV;
    }
    @NonNull
    @Override
    public SinhVienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View contact = inflater.inflate(R.layout.sinhvien_card,parent,false);
        SinhVienViewHolder sinhVienViewHolder = new SinhVienViewHolder(contact);
        return  sinhVienViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SinhVienViewHolder holder, int position) {
        SinhVien s = list.get(position);
        holder.textViewID.setText(s.getId()+"");
        holder.textViewTenSV.setText(s.getTenSV());
        holder.textViewNamSinh.setText(s.getNamSinh());
        holder.textViewQueQuan.setText(s.getQueQuan());
        holder.textViewNamHoc.setText(s.getNamHoc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class SinhVienViewHolder extends RecyclerView.ViewHolder{
    TextView textViewID, textViewTenSV, textViewNamSinh, textViewQueQuan, textViewNamHoc;
    public SinhVienViewHolder(@NonNull View v) {
        super(v);
        textViewID = v.findViewById(R.id.sinhvien_card_id);
        textViewTenSV = v.findViewById(R.id.sinhvien_card_tenSV);
        textViewNamSinh = v.findViewById(R.id.sinhvien_card_namSinh);
        textViewQueQuan = v.findViewById(R.id.sinhvien_card_queQuan);
        textViewNamHoc = v.findViewById(R.id.sinhvien_card_namHoc);
    }
}
