package com.example.huy.demobridgeapp;

import android.content.Context;
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

import static com.example.huy.demobridgeapp.R.layout.dulieudauvao_thietke_fragment;

public class DuLieuDauVao_ThietKe_Fragment extends Fragment {
    EditText edtTenDuAn, edtHoatTaiTieuChuan, edtChieuDaiNhip, edtChieuDaiNhipTinhToan, edtBeRongPhanXeChay, edtBeRongLanCan, edtTongBeRongToanCuaCau ;
    EditText edtLoaiLienKetSuDung, edtCauTaoDamChu, edtMatCatNgangDamChu, edtCuongDoChiuNenCuaBeTong, edtTiTrongCuaBeTong, edtModuynDanHoiCuaBeTong ;
    EditText edtChieuDayBMC, edtChieuDayLopPhu, edtTytrongVLlamLopPhu, edtThepKetCau, edtModuynDanHoiThep, edtCuongDoChiuKeoMIN, edtCuongDoChayMIN ;
    EditText edtTiTrongThep, edtSoLuongDamChu, edtKhoangCachGiuaDC, edtChieuDaiPhanHang, edtChieuCaoDC, edtChieuRongBanCanhTren, edtChieuDayBCT;
    EditText edtChieuRongBCD, edtChieuDayBCD, edtChieuDaySuonDam, edtChieuCaoSuon, edtSoLuongDamNgang1Nhip, edtTongSoDamNgang;
    EditText edtKhoangCachTimDNĐenauDC, edtS2,edthn, edtLdn, edtbn, edttfdn, edttwdn, edthwdn, edta, edtnlkn, edthlkn, edtSlkn, edtb;
    TextView txtDienTichDamThep,txtModuynDanHoiCuaBeTong, txtAdn, txtnlkd;
    Button btnTinhToan;
    double Adt,heSoHoatTai, L,Ls,Bxc, Blc,B,fc,yc,Ec,ts,taf,yaf,Es,Fu,Fy,ys,ndc,S,de,D, Bft, tft, Bfb, tfb, tw ,Dw, ndn1, ndn, S1;
    double S2, hn, Ldn, bn, tfdn, twdn,hwdn, Adn, a, nlkn, hlkn, Slkn, b, nlkd, bi, bc, bi1,bi2,bi3, bii ;
    double bc1, bc2, bc3, bcc, n;
    // biến tính đặc trung hh gd 1
    double Snct, Yncd, Anc, Ynct, Inc,Sncd;
    CommunicationInterface listener;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof CommunicationInterface) {
            listener = (CommunicationInterface) context;
        } else {
            throw new RuntimeException(context.toString() + "Can phai implement");
        }
    }

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


        addControls();
        addEvents();
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
        txtModuynDanHoiCuaBeTong = getView().findViewById(R.id.txtModuynDanHoiCuaBeTong);
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
        edtSoLuongDamNgang1Nhip= getView().findViewById(R.id.edtSoLuongDamNgang1Nhip);
        edtTongSoDamNgang= getView().findViewById(R.id.edtTongSoDamNgang);
        edtKhoangCachTimDNĐenauDC= getView().findViewById(R.id.edtKhoangCachTimDNĐenauDC);
        edtS2= getView().findViewById(R.id.edtS2);
        edthn= getView().findViewById(R.id.edthn);
        edtLdn= getView().findViewById(R.id.edtLdn);
        edtbn= getView().findViewById(R.id.edtbn);
        edttfdn= getView().findViewById(R.id.edttfdn);
        edttwdn= getView().findViewById(R.id.edttwdn);
        edthwdn= getView().findViewById(R.id.edthwdn);
        txtAdn= getView().findViewById(R.id.txtAdn);
        edta= getView().findViewById(R.id.edta);
        edtnlkn= getView().findViewById(R.id.edtnlkn);
        edthlkn= getView().findViewById(R.id.edthlkn);
        edtSlkn= getView().findViewById(R.id.edtSlkn);
        edtb= getView().findViewById(R.id.edtb);
        txtnlkd= getView().findViewById(R.id.txtnlkd);
    }
    public void addEvents() {
        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                              // tính toán diện tích thép
                tinhToanDienTichThep();
                tinhToanEBeTong();
                tinhToanDienTichDamNgang();
                tinhToanTongSoHLKDoc();
                tinhChieuRongHuuHieuBanCanhDamGiua();
                tinhChieuRongHuuHieuBanCanhDamBien();
                tinhTisoModuyn();
                tinhDTHHGiaiDoan1();
                chuaBien();

                
                listener.onClickTopFragment( Adt,heSoHoatTai, L,Ls,Bxc, Blc,B,
                        fc,yc,Ec,ts,taf,yaf,Es,Fu,Fy,ys,ndc,S,de,D, Bft, tft, Bfb, tfb, tw ,
                        Dw, ndn1, ndn, S1, S2, hn, Ldn, bn, tfdn, twdn,hwdn, Adn, a, nlkn, hlkn,
                        Slkn, b, nlkd, bi, bc, bi1,bi2, bii, bi3, bc1, bc2, bc3, bcc, n, Snct, Yncd, Anc, Ynct, Inc,Sncd );

            }
        });

    }
    public void tinhDTHHGiaiDoan1(){
        //Chiều cao dàm chủ
        try {
            D= Double.parseDouble(edtChieuCaoDC.getText().toString());

            if (D <0){

                edtChieuCaoDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuCaoDC.setError("Hãy nhập giá trị");
        }
        //Diện tích mặt cắt nguyên
        Anc=Adt;
        //Momen tĩnh đối với đáy dầm
        Snct=Math.ceil(((Bft*tft)*(D-(tft/2)))+((Dw*tw)*(D-tft-(Dw/2)))+((Bfb*tfb)*(tfb/2)));
        Toast.makeText(getActivity(),""+Snct, Toast.LENGTH_LONG).show();
        Yncd=Math.ceil(Snct/Anc);
        Toast.makeText(getActivity(),""+Yncd, Toast.LENGTH_LONG).show();
        Ynct=Math.ceil(D-Yncd);
        Toast.makeText(getActivity(),""+Ynct,Toast.LENGTH_LONG).show();
        Inc=Math.ceil((Bft*(Math.pow(tft,3))/12)+(Bft*tft)*Math.pow((Ynct-0.5*tft),2)+(Bfb*Math.pow(tfb,3)/12)+(Bfb*tfb)*Math.pow((Yncd-0.5*tfb),2)+(tw*Math.pow(Dw,3)/12)+(tw*Dw)+(tw*Dw)*Math.pow((0.5*Dw+tfb-Yncd),2));
        Toast.makeText(getActivity(),""+Inc,Toast.LENGTH_LONG).show();
        Sncd=Math.ceil(Anc*Ynct);
        Toast.makeText(getActivity(),""+Sncd,Toast.LENGTH_LONG).show();


    }

    public void tinhTisoModuyn(){
        //Moduyn đàn hồi thép
        try {
            Es = Double.parseDouble(edtModuynDanHoiThep.getText().toString());

            if (Es <0){

                edtModuynDanHoiThep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtModuynDanHoiThep.setError("Hãy nhập giá trị");
        }
        n=Math.ceil(Es/Ec);
       Toast.makeText(getActivity(), "n="+n,Toast.LENGTH_LONG).show();
    }
    // bản cánh biên đủ biến
    public void tinhChieuRongHuuHieuBanCanhDamBien(){
        // Chiều dài nhịp
        try {
            L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

            if (L <0){

                edtChieuDaiNhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaiNhip.setError("Hãy nhập giá trị");
        }
        bc1= 1000*L/8;
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw<0){

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }
        //Chiều dày của BMC
        try {
            ts= Double.parseDouble(edtChieuDayBMC.getText().toString());

            if ( ts<0){

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }
        //Chiều rộng bản cánh trên
        try {
            Bft= Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft<0){

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }

        //Chiều dài phần hẫng
        try {
            de= Double.parseDouble(edtChieuDaiPhanHang.getText().toString());

            if (de <0){

                edtChieuDaiPhanHang.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaiPhanHang.setError("Hãy nhập giá trị");
        }
        bc2= 6*ts+Math.max((tw/2),(Bft/4));
        bc3=de;
        bcc=Math.min(bc1,bc2);
        bc=(0.5*bi)+Math.min(bcc,bc3);
        Toast.makeText(getActivity(),"bc="+bc,Toast.LENGTH_LONG).show();
    }
    // BỀ RỘNG HỮU HIỆU ĐỦ BIẾN
    public void tinhChieuRongHuuHieuBanCanhDamGiua(){
        // Chiều dài nhịp
        try {
            L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

            if (L <0){

                edtChieuDaiNhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaiNhip.setError("Hãy nhập giá trị");
        }
        //Chiều dày của BMC
        try {
            ts= Double.parseDouble(edtChieuDayBMC.getText().toString());

            if ( ts<0){

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw<0){

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }
        //Chiều rộng bản cánh trên
        try {
            Bft= Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft<0){

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }

        //Khoảng cách giữa các dầm chủ
        try {
            S = Double.parseDouble(edtKhoangCachGiuaDC.getText().toString());

            if (S <0){

                edtKhoangCachGiuaDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtKhoangCachGiuaDC.setError("Hãy nhập giá trị");
        }
        bi1=(1000*L)/4;
        bi2=12*ts+Math.max(tw,0.5*Bft);
        bi3=S;
        bii=Math.min(bi1,bi2);
        bi=Math.min(bii,bi3);
      Toast.makeText(getActivity(),"bi="+bi, Toast.LENGTH_LONG).show();
    }

// TÍNH SỐ HỆ LIÊN KẾT DỌC ĐỦ BIẾN
    public void tinhToanTongSoHLKDoc(){
        //Số lượng dầm chủ
        try {
            ndc= Double.parseDouble(edtSoLuongDamChu.getText().toString());

            if (ndc <0){

                edtSoLuongDamChu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtSoLuongDamChu.setError("Hãy nhập giá trị");
        }
        //Số lượng hệ liên kết dọc theo phương dọc
        try {
            b = Double.parseDouble(edtb.getText().toString());

            if (b<0){

                edtb.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtb.setError("Hãy nhập giá trị");
        }
        nlkd= b*(ndc/2);
        txtnlkd.setText(""+nlkd);
    }
    // DIỆN TÍCH DẦM NGANG ĐỦ BIẾN
    public void tinhToanDienTichDamNgang(){
        // Số lượng dầm ngang theo phương dọc cầu trong 1 nhịp edtSoLuongDamNgang1Nhip
        try {
            ndn1 = Double.parseDouble(edtSoLuongDamNgang1Nhip.getText().toString());

            if (ndn1<0){

                edtSoLuongDamNgang1Nhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtSoLuongDamNgang1Nhip.setError("Hãy nhập giá trị");
        }
        //Bề rộng bản cánh dầm ngang
        try {
            bn = Double.parseDouble(edtbn.getText().toString());

            if (bn<0){

                edtbn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtbn.setError("Hãy nhập giá trị");
        }
        // Chiều dày bản cánh dầm ngang
        try {
            tfdn = Double.parseDouble(edttfdn.getText().toString());

            if (tfdn<0){

                edttfdn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edttfdn.setError("Hãy nhập giá trị");
        }

        // Chiều dày sườn dầm ngang
        try {
            twdn = Double.parseDouble(edttwdn.getText().toString());

            if (twdn<0){

                edttwdn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edttwdn.setError("Hãy nhập giá trị");
        }

        // Chiều cao sườn dâm ngang
        try {
            hwdn = Double.parseDouble(edthwdn.getText().toString());

            if (hwdn<0){

                edthwdn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edthwdn.setError("Hãy nhập giá trị");
        }
        // Diện tích mặt cắt dâm ngang
        Adn= (twdn*hwdn)+(bn*tfdn*ndn1);
        txtAdn.setText(""+Adn);

    }
    // DIỆN TÍCH THÉP ĐỦ BIẾN
    public void tinhToanDienTichThep() {
                //Chiều rộng bản cánh trên
        try {
             Bft= Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft<0){

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }


        //Chiều dày bản cánh trên
        try {
             tft= Double.parseDouble(edtChieuDayBCT.getText().toString());

            if (tft<0){

                edtChieuDayBCT.setError("Hãy nhập giá trị");
            }
        } catch (Exception e){
            edtChieuDayBCT.setError("Hãy nhập giá trị");
        }

        //Chiều rộng bản cánh dưới
        try {
             Bfb= Double.parseDouble(edtChieuRongBCD.getText().toString());

            if (Bfb<0){

                edtChieuRongBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuRongBCD.setError("Hãy nhập giá trị");
        }

        //Chiều dày bản cánh dưới
        try {
             tfb= Double.parseDouble(edtChieuDayBCD.getText().toString());

            if (tfb<0){

                edtChieuDayBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDayBCD.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw<0){

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }

        //Chiều cao sườn dầm
        try {
             Dw = Double.parseDouble(edtChieuCaoSuon.getText().toString());

            if (Dw<0){

                edtChieuCaoSuon.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtChieuCaoSuon.setError("Hãy nhập giá trị");
        }

        // Diện tích dầm thép // Adt
        Adt= Bft*tft+Bfb*tfb+Dw*tw;
        txtDienTichDamThep.setText(""+Adt);
    }
    public void tinhToanEBeTong(){
        //Cường độ chịu nén của bê tông ĐỦ BIẾN
        try {
            fc = Double.parseDouble(edtCuongDoChiuNenCuaBeTong.getText().toString());

            if (fc<0){

                edtCuongDoChiuNenCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtCuongDoChiuNenCuaBeTong.setError("Hãy nhập giá trị");
        }


        //Tỉ trọng của bê tông
        try {
            yc = Double.parseDouble(edtTiTrongCuaBeTong.getText().toString());

            if ( yc<0){

                edtTiTrongCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e){
            edtTiTrongCuaBeTong.setError("Hãy nhập giá trị");
        }
        Ec= Math.ceil(0.043*Math.pow((yc*100),1.5)*(Math.sqrt(fc)));
       txtModuynDanHoiCuaBeTong.setText(""+Ec);

    }
   public void chuaBien(){

       //Số lượng hệ liên kết ngang theo phương dọc cầu trong nhịp
       try {
           a = Double.parseDouble(edta.getText().toString());

           if (a<0){

               edta.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edta.setError("Hãy nhập giá trị");
       }

       // Tổng số hệ liên kết ngang trong 1 nhịp
       try {
           nlkn = Double.parseDouble(edtnlkn.getText().toString());

           if (nlkn<0){

               edtnlkn.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtnlkn.setError("Hãy nhập giá trị");
       }

       // Chiều cao hệ liên kết ngang
       try {
           hlkn = Double.parseDouble(edthlkn.getText().toString());

           if (hlkn<0){

               edthlkn.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edthlkn.setError("Hãy nhập giá trị");
       }
       //Hoạt tải tiêu chuẩn
       try {
           heSoHoatTai= Double.parseDouble(edtHoatTaiTieuChuan.getText().toString());

           if (heSoHoatTai <0){

               edtHoatTaiTieuChuan.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtHoatTaiTieuChuan.setError("Hãy nhập giá trị");
       }


       //Chiều dài nhịp tính toán
       try {
           Ls = Double.parseDouble(edtChieuDaiNhipTinhToan.getText().toString());

           if (Ls <0){

               edtChieuDaiNhipTinhToan.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtChieuDaiNhipTinhToan.setError("Hãy nhập giá trị");
       }

       //Chiều rộng phần xe chạy
       try {
           Bxc = Double.parseDouble(edtBeRongPhanXeChay.getText().toString());

           if (Bxc<0){

               edtBeRongPhanXeChay.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtBeRongPhanXeChay.setError("Hãy nhập giá trị");
       }

       // Bề rộng lan can
       try {
           Blc = Double.parseDouble(edtBeRongLanCan.getText().toString());

           if (Blc<0){

               edtBeRongLanCan.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtBeRongLanCan.setError("Hãy nhập giá trị");
       }

       //Bề rộng toàn cầu
       try {
           B = Double.parseDouble(edtTongBeRongToanCuaCau.getText().toString());

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



       //Chiều dày lớp phủ
       try {
           taf= Double.parseDouble(edtChieuDayLopPhu.getText().toString());

           if ( taf<0){
               edtChieuDayLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtChieuDayLopPhu.setError("Hãy nhập giá trị");
       }

       //Tyr trọng VL lớp phủ
       try {
           yaf = Double.parseDouble(edtTytrongVLlamLopPhu.getText().toString());

           if ( yaf<0){

               edtTytrongVLlamLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtTytrongVLlamLopPhu.setError("Hãy nhập giá trị");
       }


       //Thép kết cấu
       String edtthepKetCau = edtThepKetCau.getText().toString();




       //Cường đọ chịu kéo nhỏ nhất
       try {
           Fu = Double.parseDouble(edtCuongDoChiuKeoMIN.getText().toString());

           if (Fu <0){

               edtCuongDoChiuKeoMIN.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtCuongDoChiuKeoMIN.setError("Hãy nhập giá trị");
       }

       // Cường độ chảy nhỏ nhất
       try {
           Fy = Double.parseDouble(edtCuongDoChayMIN.getText().toString());

           if (Fy <0){

               edtCuongDoChayMIN.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtCuongDoChayMIN.setError("Hãy nhập giá trị");
       }

       // Tỉ trọng thép
       try {
           ys = Double.parseDouble(edtTiTrongThep.getText().toString());

           if (ys <0){

               edtTiTrongThep.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtTiTrongThep.setError("Hãy nhập giá trị");
       }



       //Tổng số dầm ngang 1 nhịp
       try {
           ndn = Double.parseDouble(edtTongSoDamNgang.getText().toString());

           if (ndn<0){

               edtTongSoDamNgang.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtTongSoDamNgang.setError("Hãy nhập giá trị");
       }
       // edtKhoangCachTimDNĐenauDC Khoàng cách dm đến dầm chủ
       try {
           S1 = Double.parseDouble(edtKhoangCachTimDNĐenauDC.getText().toString());

           if (S1<0){

               edtKhoangCachTimDNĐenauDC.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtKhoangCachTimDNĐenauDC.setError("Hãy nhập giá trị");
       }

       //Khoảng cách tim dầm ngang dến hệ Liên kết ngang
       try {
           S2 = Double.parseDouble(edtS2.getText().toString());

           if (S2<0){

               edtS2.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtS2.setError("Hãy nhập giá trị");
       }

       // Chiều cao dầm ngang
       try {
           hn = Double.parseDouble(edthn.getText().toString());

           if (hn<0){

               edthn.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edthn.setError("Hãy nhập giá trị");
       }



       //Chiều dài dầm ngang
       try {
           Ldn = Double.parseDouble(edtLdn.getText().toString());

           if (Ldn<0){

               edtLdn.setError("Lỗi: Nhập số lớn hơn 0");
           }
       } catch (Exception e){
           edtLdn.setError("Hãy nhập giá trị");
       }
    }

}