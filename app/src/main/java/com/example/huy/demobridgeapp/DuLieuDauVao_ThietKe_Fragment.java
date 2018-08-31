package com.example.huy.demobridgeapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DuLieuDauVao_ThietKe_Fragment extends Fragment {
    public DuLieuDauVao_ThietKe_Fragment (){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dulieudauvao_thietke_fragment,container,true);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       // TextView textView = view.findViewById(R.id.tvDemo);
        // Tới đây code y chang như Activity. Đây là Fragment, nó là layout con của Activity
    }
}
