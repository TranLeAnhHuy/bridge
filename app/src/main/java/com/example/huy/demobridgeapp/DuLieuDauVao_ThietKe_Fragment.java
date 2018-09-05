package com.example.huy.demobridgeapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.example.huy.demobridgeapp.R.layout.dulieudauvao_thietke_fragment;

public class DuLieuDauVao_ThietKe_Fragment extends Fragment {
    EditText edtTenDuAn;


    public DuLieuDauVao_ThietKe_Fragment (){


    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(dulieudauvao_thietke_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       // TextView textView = view.findViewById(R.id.tvDemo);

         addControls();
         addEvents();


        // ánh xạ spinner
        Spinner spinnerDanhSach = view.findViewById(R.id.spinner);
        final ArrayList<String> arrayDanhSach= new ArrayList<String>();
        arrayDanhSach.add("Dầm thép liên hợp");
        arrayDanhSach.add("Dầm thép không liên hợp");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,  arrayDanhSach);
        spinnerDanhSach.setAdapter(arrayAdapter);
        // sự kiện
   }
    public void tinhToan (View v){
        String edtenDuAn = edtTenDuAn.getText().toString();


    }

    private void addControls() {
        edtTenDuAn = getView().findViewById(R.id.edtTenDuAn);



    }
    private void addEvents() {

    }


}
