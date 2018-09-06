package com.example.huy.demobridgeapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;
import static com.example.huy.demobridgeapp.R.layout.dulieudauvao_thietke_fragment;

public class DuLieuDauVao_ThietKe_Fragment extends Fragment {
    EditText edtTenDuAn, edtHoatTaiTieuChuan, edtChieuDaiNhip, edtChieuDaiNhipTinhToan, edtBeRongPhanXeChay, edtBeRongLanCan, edtTongBeRongToanCuaCau ;
    EditText edtLoaiLienKetSuDung, edtCauTaoDamChu, edtMatCatNgangDamChu, edtCuongDoChiuNenCuaBeTong, edtTiTrongCuaBeTong, edtModuynDanHoiCuaBeTong ;
    EditText edtChieuDayBMC, edtChieuDayLopPhu, edtTytrongVLlamLopPhu, edtThepKetCau, edtModuynDanHoiThep, edtCuongDoChiuKeoMIN, edtCuongDoChayMIN ;
    EditText edtTiTrongThep, edtSoLuongDamChu, edtKhoangCachGiuaDC, edtChieuDaiPhanHang, edtChieuCaoDC, edtChieuRongBanCanhTren, edtChieuDayBCT;
    EditText edtChieuRongBCD, edtChieuDayBCD, edtChieuDaySuonDam, edtChieuCaoSuon ;
    TextView txtDienTichDamThep;
    Button btnTinhToan;
    double Adt;

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
        // ánh xạ spinner
        Spinner spinnerDanhSach = view.findViewById(R.id.spinner);
        final ArrayList<String> arrayDanhSach= new ArrayList<String>();
        arrayDanhSach.add("Dầm thép liên hợp");
        arrayDanhSach.add("Dầm thép không liên hợp");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,  arrayDanhSach);
        spinnerDanhSach.setAdapter(arrayAdapter);
        addControls();
        // sự kiện
        // TextView textView = view.findViewById(R.id.tvDemo);

        //Lấy tên của dự án
        String edtenDuAn = edtTenDuAn.getText().toString();
        edtTenDuAn.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        //Hoạt tải tiêu chuẩn
        double heSoHoatTai = Double.parseDouble(edtHoatTaiTieuChuan.getText().toString());
        // double c = 0.9 + heSoHoatTai;
        // Toast.makeText(getActivity(), "KQ=" + c , Toast.LENGTH_LONG).show();

        // Chiều dài nhịp
        double L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

        //Chiều dài nhịp tính toán
        double Ls = Double.parseDouble(edtChieuDaiNhipTinhToan.getText().toString());

        //Chiều rộng phần xe chạy
        double Bxc = Double.parseDouble(edtBeRongPhanXeChay.getText().toString());

        // Bề rộng lan can
        double Blc = Double.parseDouble(edtBeRongLanCan.getText().toString());

        //Bề rộng toàn cầu
        double B = Double.parseDouble(edtTongBeRongToanCuaCau.getText().toString());

        //Loại liên kết sử dụng
        String edtlienKetSuDung = edtLoaiLienKetSuDung.getText().toString();

        //Cấu tạo dầm chủ
        String edtcauTaoDamChu = edtCauTaoDamChu.getText().toString();

        //Mặt cắt ngang dầm chủ
        String edtmatCatNgangDamChu = edtMatCatNgangDamChu.getText().toString();

        //Cường độ chịu nén của bê tông
        double fc = Double.parseDouble(edtCuongDoChiuNenCuaBeTong.getText().toString());

        //Tỉ trọng của bê tông
        double yc = Double.parseDouble(edtTiTrongCuaBeTong.getText().toString());

        //Moduyn đàn hồi BT
        double Ec = Double.parseDouble(edtModuynDanHoiCuaBeTong.getText().toString());

        //Chiều dày của BMC
        double ts= Double.parseDouble(edtChieuDayBMC.getText().toString());

        //Chiều dày lớp phủ
        double taf= Double.parseDouble(edtChieuDayLopPhu.getText().toString());

        //Tyr trọng VL lớp phủ
        double yaf = Double.parseDouble(edtTytrongVLlamLopPhu.getText().toString());

        //Thép kết cấu
        String edtthepKetCau = edtThepKetCau.getText().toString();

        //Moduyn đàn hồi thép
        double Es = Double.parseDouble(edtModuynDanHoiThep.getText().toString());

        //Cường đọ chịu kéo nhỏ nhất
        double Fu = Double.parseDouble(edtCuongDoChiuKeoMIN.getText().toString());

        // Cường độ chảy nhỏ nhất
        double Fy = Double.parseDouble(edtCuongDoChayMIN.getText().toString());

        // Tỉ trọng thép
        double ys = Double.parseDouble(edtTiTrongThep.getText().toString());

        //Số lượng dầm chủ
        double ndc= Double.parseDouble(edtSoLuongDamChu.getText().toString());

        //Khoảng cách giữa các dầm chủ
        double S = Double.parseDouble(edtKhoangCachGiuaDC.getText().toString());

        //Chiều dài phần hẫng
        double de= Double.parseDouble(edtChieuDaiPhanHang.getText().toString());

        //Chiều cao dàm chủ
        double D= Double.parseDouble(edtChieuCaoDC.getText().toString());

        //Chiều rộng bản cánh trên
        double Bft= Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

        //Chiều dày bản cánh trên
        double tft= Double.parseDouble(edtChieuDayBCT.getText().toString());

        //Chiều rộng bản cánh dưới
        double Bfb= Double.parseDouble(edtChieuRongBCD.getText().toString());

        //Chiều dày bản cánh dưới
        double tfb= Double.parseDouble(edtChieuDayBCD.getText().toString());

        //Chiều dày sườn dầm
        double tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

        //Chiều cao sườn dầm
        double Dw = Double.parseDouble(edtChieuCaoSuon.getText().toString());

        // Diện tích dầm thép // Adt
        Adt= Bft*tft+Bfb*tfb+Dw*tw;

        addEvents();
    }


    public void addControls() {
        edtTenDuAn = getView().findViewById(R.id.edtTenDuAn);
        edtHoatTaiTieuChuan = getView().findViewById(R.id.edtHoatTaiTieuChuan);
        edtChieuDaiNhip = getView().findViewById(R.id.edtChieuDaiNhip);
        edtChieuDaiNhipTinhToan = getView().findViewById(R.id.edtChieuDaiNhipTinhToan);
        edtBeRongPhanXeChay = getView().findViewById(R.id.edtBeRongPhanXeChay);
        edtBeRongLanCan = getView().findViewById(R.id.edtBeRongLanCan);
        edtTongBeRongToanCuaCau = getView().findViewById(R.id.edtTongBeRongCuaCau);
        edtLoaiLienKetSuDung = getView().findViewById(R.id.edtLoaiLienKetSuDung);
        edtCauTaoDamChu = getView().findViewById(R.id.edtCauTaoDamChu);
        edtMatCatNgangDamChu = getView().findViewById(R.id.edtMatCatNgangDamChu);
        edtCuongDoChiuNenCuaBeTong = getView().findViewById(R.id.edtCuongDoChiuNenCuaBeTong);
        edtTiTrongCuaBeTong = getView().findViewById(R.id.edtTiTrongCuaBeTong);
        edtModuynDanHoiCuaBeTong = getView().findViewById(R.id.edtModuynDanHoiCuaBeTong);
        edtChieuDayBMC = getView().findViewById(R.id.edtChieuDayBMC);
        edtChieuDayLopPhu= getView().findViewById(R.id.edtChieuDayLopPhu);
        edtTytrongVLlamLopPhu= getView().findViewById(R.id.edtTytrongVLlamLopPhu);
        edtThepKetCau = getView().findViewById(R.id.edtThepKetCau);
        edtModuynDanHoiThep= getView().findViewById(R.id.edtModuynDanHoiThep);
        edtCuongDoChiuKeoMIN= getView().findViewById(R.id.edtCuongDoChiuKeoMIN);
        edtCuongDoChayMIN = getView().findViewById(R.id.edtCuongDoChayMIN);
        edtTiTrongThep = getView().findViewById(R.id.edtTiTrongThep);
        edtSoLuongDamChu = getView().findViewById(R.id.edtSoLuongDamChu);
        edtKhoangCachGiuaDC= getView().findViewById(R.id.edtKhoangCachGiuaDC);
        edtChieuDaiPhanHang= getView().findViewById(R.id.edtChieuDaiPhanHang);
        edtChieuCaoDC= getView().findViewById(R.id.edtChieuCaoDC);
        edtChieuRongBanCanhTren= getView().findViewById(R.id.edtChieuRongBanCanhTren);
        edtChieuDayBCT= getView().findViewById(R.id.edtChieuDayBCT);
        edtChieuRongBCD= getView().findViewById(R.id.edtChieuRongBCD);
        edtChieuDayBCD= getView().findViewById(R.id.edtChieuDayBCD);
        edtChieuDaySuonDam= getView().findViewById(R.id.edtChieuDaySuonDam);
        edtChieuCaoSuon= getView().findViewById(R.id.edtChieuCaoSuon);
        txtDienTichDamThep=  getView().findViewById((R.id.txtDienTichDamChu));
        btnTinhToan= getView().findViewById(R.id.btnTinhToan);

    }
    public void addEvents() {

        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tính toán diện tích thép
                tinhToanDienTichThep();

            }
        });

    }
    public void tinhToanDienTichThep() {
        txtDienTichDamThep.setText(""+Adt);
    }
}