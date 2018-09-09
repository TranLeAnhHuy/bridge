package com.example.huy.demobridgeapp;

import android.widget.EditText;
import android.widget.TextView;

public interface CommunicationInterface {
    void onClickTopFragment(EditText edtTenDuAn, EditText edtHoatTaiTieuChuan, EditText edtChieuDaiNhip, EditText edtChieuDaiNhipTinhToan, EditText edtBeRongPhanXeChay, EditText edtBeRongLanCan, EditText edtTongBeRongToanCuaCau,
                            EditText edtLoaiLienKetSuDung, EditText edtCauTaoDamChu, EditText edtMatCatNgangDamChu, EditText edtCuongDoChiuNenCuaBeTong, EditText edtTiTrongCuaBeTong, EditText edtModuynDanHoiCuaBeTong,
                            EditText edtChieuDayBMC,EditText edtChieuDayLopPhu,EditText edtTytrongVLlamLopPhu,EditText edtThepKetCau,EditText edtModuynDanHoiThep,EditText edtCuongDoChiuKeoMIN,EditText edtCuongDoChayMIN,
                            EditText edtTiTrongThep,EditText edtSoLuongDamChu,EditText edtKhoangCachGiuaDC,EditText edtChieuDaiPhanHang,EditText edtChieuCaoDC,EditText edtChieuRongBanCanhTren,EditText edtChieuDayBCT,
                            EditText edtChieuRongBCD,EditText edtChieuDayBCD,EditText edtChieuDaySuonDam,EditText edtChieuCaoSuon,EditText edtSoLuongDamNgang1Nhip,EditText edtTongSoDamNgang,
                            EditText edtKhoangCachTimDNĐenauDC,EditText edtS2,EditText edthn,EditText edtLdn,EditText edtbn,EditText edttfdn,EditText edttwdn,EditText edthwdn,EditText edta,EditText edtnlkn,EditText edthlkn,EditText edtSlkn,EditText edtb,
                            TextView txtDienTichDamThep,EditText txtModuynDanHoiCuaBeTong,EditText txtAdn,EditText txtnlkd
                            );

    void onClickTopFragment(String str);
}
