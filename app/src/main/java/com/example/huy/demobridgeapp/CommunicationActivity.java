package com.example.huy.demobridgeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class CommunicationActivity extends AppCompatActivity implements CommunicationInterface {
    TinhToanSoBo_ThietKe_Fragment TinhToanSoBo_ThietKe_Frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.communication_fragment);
    }
    @Override
    public void onClickTopFragment(String str) {
        TinhToanSoBo_ThietKe_Fragment fragBot = (TinhToanSoBo_ThietKe_Fragment) getSupportFragmentManager().findFragmentById(R.id.TinhToanSoBo_ThietKe_Fragment);
        if (fragBot != null || fragBot.isInLayout()) { // kiểm tra Fragment cần truyền data đến có thực sự tồn tại và đang hiện.
            fragBot.updateFragmetn(str);
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Khong tim thay, hoac fragment khong hien", Toast.LENGTH_SHORT).show();
        }

    }
}
