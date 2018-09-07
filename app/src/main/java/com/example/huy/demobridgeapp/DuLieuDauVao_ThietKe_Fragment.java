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
    double Adt,heSoHoatTai, L,Ls,Bxc, Blc,B,fc,yc,Ec,ts,taf,yaf,Es,Fu,Fy,ys,ndc,S,de,D, Bft, tft, Bfb, tfb, tw ,Dw;

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
        addEvents();
        // sự kiện
        // TextView textView = view.findViewById(R.id.tvDemo);

        //Lấy tên của dự án
        String edtenDuAn = edtTenDuAn.getText().toString();
        edtTenDuAn.setFilters(new InputFilter[]{new InputFilter.AllCaps()});




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
        //Hoạt tải tiêu chuẩn
        try {
            double heSoHoatTai= Double.parseDouble(edtHoatTaiTieuChuan.getText().toString());

            if (heSoHoatTai <0){

                edtHoatTaiTieuChuan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtHoatTaiTieuChuan.setError("Hãy nhập giá trị");
        }
        // Chiều dài nhịp
        try {
            double L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

            if (L <0){

                edtChieuDaiNhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaiNhip.setError("Hãy nhập giá trị");
        }


        //Chiều dài nhịp tính toán
        try {
            double Ls = Double.parseDouble(edtChieuDaiNhipTinhToan.getText().toString());

            if (Ls <0){

                edtChieuDaiNhipTinhToan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaiNhipTinhToan.setError("Hãy nhập giá trị");
        }

        //Chiều rộng phần xe chạy
        try {
            double Bxc = Double.parseDouble(edtBeRongPhanXeChay.getText().toString());

            if (Bxc<0){

                edtBeRongPhanXeChay.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtBeRongPhanXeChay.setError("Hãy nhập giá trị");
        }

        // Bề rộng lan can
        try {
            double Blc = Double.parseDouble(edtBeRongLanCan.getText().toString());

            if (Blc<0){

                edtBeRongLanCan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtBeRongLanCan.setError("Hãy nhập giá trị");
        }

        //Bề rộng toàn cầu
        try {
            double B = Double.parseDouble(edtTongBeRongToanCuaCau.getText().toString());

            if (B<0){

                edtTongBeRongToanCuaCau.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtTongBeRongToanCuaCau.setError("Hãy nhập giá trị");
        }

        //Loại liên kết sử dụng
        String edtlienKetSuDung = edtLoaiLienKetSuDung.getText().toString();

        //Cấu tạo dầm chủ
        String edtcauTaoDamChu = edtCauTaoDamChu.getText().toString();

        //Mặt cắt ngang dầm chủ
        String edtmatCatNgangDamChu = edtMatCatNgangDamChu.getText().toString();

        //Cường độ chịu nén của bê tông
        try {
            double fc = Double.parseDouble(edtCuongDoChiuNenCuaBeTong.getText().toString());

            if (fc<0){

                edtCuongDoChiuNenCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtCuongDoChiuNenCuaBeTong.setError("Hãy nhập giá trị");
        }


        //Tỉ trọng của bê tông
        try {
            double yc = Double.parseDouble(edtTiTrongCuaBeTong.getText().toString());

            if ( yc<0){

                edtTiTrongCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtTiTrongCuaBeTong.setError("Hãy nhập giá trị");
        }

        //Moduyn đàn hồi BT
        //Tỉ trọng của bê tông
        try {
            double Ec = Double.parseDouble(edtModuynDanHoiCuaBeTong.getText().toString());

            if ( Ec<0){

                edtModuynDanHoiCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtModuynDanHoiCuaBeTong.setError("Hãy nhập giá trị");
        }

        //Chiều dày của BMC
        try {
            double ts= Double.parseDouble(edtChieuDayBMC.getText().toString());

            if ( ts<0){

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }

        //Chiều dày lớp phủ
        try {
            double taf= Double.parseDouble(edtChieuDayLopPhu.getText().toString());

            if ( taf<0){
                edtChieuDayLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDayLopPhu.setError("Hãy nhập giá trị");
        }

        //Tyr trọng VL lớp phủ
        try {
            double yaf = Double.parseDouble(edtTytrongVLlamLopPhu.getText().toString());

            if ( yaf<0){

                edtTytrongVLlamLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtTytrongVLlamLopPhu.setError("Hãy nhập giá trị");
        }


        //Thép kết cấu
        String edtthepKetCau = edtThepKetCau.getText().toString();

        //Moduyn đàn hồi thép
        try {
            double Es = Double.parseDouble(edtModuynDanHoiThep.getText().toString());

            if (Es <0){

                edtModuynDanHoiThep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtModuynDanHoiThep.setError("Hãy nhập giá trị");
        }


        //Cường đọ chịu kéo nhỏ nhất
        try {
            double Fu = Double.parseDouble(edtCuongDoChiuKeoMIN.getText().toString());

            if (Fu <0){

                edtCuongDoChiuKeoMIN.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtCuongDoChiuKeoMIN.setError("Hãy nhập giá trị");
        }

        // Cường độ chảy nhỏ nhất
        try {
            double Fy = Double.parseDouble(edtCuongDoChayMIN.getText().toString());

            if (Fy <0){

                edtCuongDoChayMIN.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtCuongDoChayMIN.setError("Hãy nhập giá trị");
        }

        // Tỉ trọng thép
        try {
            double ys = Double.parseDouble(edtTiTrongThep.getText().toString());

            if (ys <0){

                edtTiTrongThep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtTiTrongThep.setError("Hãy nhập giá trị");
        }

        //Số lượng dầm chủ
        try {
            double ndc= Double.parseDouble(edtSoLuongDamChu.getText().toString());

            if (ndc <0){

                edtSoLuongDamChu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtSoLuongDamChu.setError("Hãy nhập giá trị");
        }


        //Khoảng cách giữa các dầm chủ
        try {
            double S = Double.parseDouble(edtKhoangCachGiuaDC.getText().toString());

            if (S <0){

                edtKhoangCachGiuaDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtKhoangCachGiuaDC.setError("Hãy nhập giá trị");
        }

        //Chiều dài phần hẫng
        try {
            double de= Double.parseDouble(edtChieuDaiPhanHang.getText().toString());

            if (de <0){

                edtChieuDaiPhanHang.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaiPhanHang.setError("Hãy nhập giá trị");
        }

        //Chiều cao dàm chủ
        try {
            double D= Double.parseDouble(edtChieuCaoDC.getText().toString());

            if (D <0){

                edtChieuCaoDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuCaoDC.setError("Hãy nhập giá trị");
        }


        //Chiều rộng bản cánh trên
        try {
            double Bft= Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft<0){

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }


        //Chiều dày bản cánh trên
        try {
            double tft= Double.parseDouble(edtChieuDayBCT.getText().toString());

            if (tft<0){

                edtChieuDayBCT.setError("Hãy nhập giá trị");
            }
        } catch (Exception e){
            edtChieuDayBCT.setError("Hãy nhập giá trị");
        }

        //Chiều rộng bản cánh dưới
        try {
            double Bfb= Double.parseDouble(edtChieuRongBCD.getText().toString());

            if (Bfb<0){

                edtChieuRongBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuRongBCD.setError("Hãy nhập giá trị");
        }

        //Chiều dày bản cánh dưới
        try {
            double tfb= Double.parseDouble(edtChieuDayBCD.getText().toString());

            if (tfb<0){

                edtChieuDayBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDayBCD.setError("Hãy nhập giá trị");
        }

        //Chiều dày sườn dầm
        try {
            double tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw<0){

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }

        //Chiều cao sườn dầm
        try {
            double Dw = Double.parseDouble(edtChieuCaoSuon.getText().toString());

            if (Dw<0){

                edtChieuCaoSuon.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuCaoSuon.setError("Hãy nhập giá trị");
        }

        // Diện tích dầm thép // Adt
        Adt= Bft*tft+Bfb*tfb+Dw*tw;

        txtDienTichDamThep.setText("Kết quả="+Adt);
    }
}