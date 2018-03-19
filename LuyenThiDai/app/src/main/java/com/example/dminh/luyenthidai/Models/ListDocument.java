package com.example.dminh.luyenthidai.Models;

import android.app.Application;

import com.example.dminh.luyenthidai.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dminh on 12/4/2017.
 */

public class ListDocument{
    String mon;
    String cat;
    String title;
    String duongdanfile;
    String dapan;

    public String getDapan() {
        return dapan;
    }

    public void setDapan(String dapan) {
        this.dapan = dapan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ListDocument(String mon, String cat, String title, String duongdanfile, String dapan) {
        this.mon = mon;
        this.cat = cat;
        this.title = title;
        this.duongdanfile = duongdanfile;
        this.dapan = dapan;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getDuongdanfile() {
        return duongdanfile;
    }

    public void setDuongdanfile(String duongdanfile) {
        this.duongdanfile = duongdanfile;
    }

    public static List<ListDocument> createListDoc(){


        List<ListDocument> listDocuments = new ArrayList<ListDocument>();
        listDocuments.add(new ListDocument("TIẾNG ANH","Mẹo", "4 mẹo làm bài thi tiếng anh", "data/meotienganh/4meolambaithitienganhkhigapcauhoikho2.pdf", ""));
        listDocuments.add(new ListDocument("TIẾNG ANH","Mẹo", "5 mẹo học từ vựng hiệu quả","data/meotienganh/5meohoctuvunghieuqua2.pdf", ""));
        listDocuments.add(new ListDocument("TIẾNG ANH","Mẹo", "Chiến thuật làm bài nhanh và gon", "data/meotienganh/chienthuatlambainhanhvagon2.pdf",""));
        listDocuments.add(new ListDocument("TIẾNG ANH","Mẹo", "Hệ thống lại các kiến thức cơ bản", "data/meotienganh/hethonglaicackienthuccoban2.pdf",""));
        listDocuments.add(new ListDocument("TIẾNG ANH","Mẹo", "Luyện đề theo nhóm", "data/meotienganh/luyendetheonhom2.pdf",""));
        listDocuments.add(new ListDocument("TIẾNG ANH","Mẹo", "Phân bổ thời gian làm bài hợp lí", "data/meotienganh/phanbothoigianlambaihoply2.pdf",""));
        listDocuments.add(new ListDocument("TIẾNG ANH","Mẹo", "Phân bổ thời gian ôn tập khoa học", "data/meotienganh/phanbothoigianontapkhoahoc2.pdf",""));

        listDocuments.add(new ListDocument("TIẾNG ANH", "Công Thức","Công Thức Tiếng Anh","data/ctngoaingu/congthucanh2.pdf",""));

        listDocuments.add(new ListDocument("TIẾNG ANH", "Đề Thi","Đề Thi Anh THPT Quốc Gia 2017", "data/dethi/anh/dethimonanh2107.pdf","data/dapan/anh/dapananh2017.pdf"));
        listDocuments.add(new ListDocument("TIẾNG ANH", "Đề Thi","Đề Thi Thử 2018", "data/dethi/anh/1-dethi.pdf","data/dapan/anh/1-dapan.pdf"));
        listDocuments.add(new ListDocument("TIẾNG ANH", "Đề Thi","Đề Thi Thử 2018 2", "data/dethi/anh/2-dethi.pdf","data/dapan/anh/2-dapan.pdf"));
        listDocuments.add(new ListDocument("TIẾNG ANH", "Đề Thi","Đề Thi Thử 2018 3", "data/dethi/anh/3-dethi.pdf","data/dapan/anh/3-dapan.pdf"));
        listDocuments.add(new ListDocument("TIẾNG ANH", "Đề Thi","Đề Thi Thử 2018 4", "data/dethi/anh/4-dethi.pdf","data/dapan/anh/4-dapan.pdf"));
        listDocuments.add(new ListDocument("TIẾNG ANH", "Đề Thi","Đề Thi Thử 2018 5", "data/dethi/anh/5-dethi.pdf","data/dapan/anh/5-dapan.pdf"));


        listDocuments.add(new ListDocument("TOÁN","Mẹo", "Câu hỏi dễ làm trước và chắc chắn đúng", "data/meomontoan/cauhoidelamtruocvachacchandung2.pdf",""));
        listDocuments.add(new ListDocument("TOÁN","Mẹo","Một số thủ thuật làm nhanh trắc nghiệm toán","data/meomontoan/meomontoan.pdf",""));
        listDocuments.add(new ListDocument("TOÁN","Mẹo", "Làm hết các câu hỏi trung bình", "data/meomontoan/lamhetcaccauhoitrungbinh2.pdf",""));
        listDocuments.add(new ListDocument("TOÁN","Mẹo", "Một số kinh nghiệm khi làm trắc nghiệm môn toán", "data/meomontoan/motsokinhnghiemkhilambaithitracnghiemmontoan2.pdf",""));
        listDocuments.add(new ListDocument("TOÁN","Mẹo", "Năm ăn năm thua", "data/meomontoan/namannamthua2.pdf",""));
        listDocuments.add(new ListDocument("TOÁN","Mẹo", "Sử dụng máy tính casio để giải nhanh", "data/meomontoan/sudungmaytinhcasiodegiainhanhtracnghiemtoan2.pdf",""));
        listDocuments.add(new ListDocument("TOÁN","Mẹo", "Thay đổi cách học và tư duy đối với thi trắc nghiệm", "data/meomontoan/thaydoicachhocvatuduydoivoithitracnghiem2.pdf",""));

        listDocuments.add(new ListDocument("TOÁN", "Công Thức","Công Thức Toán","data/ctngoaingu/congthuctoan2.pdf",""));

        listDocuments.add(new ListDocument("TOÁN", "Đề Thi","Đề Thi Toán THPT Quốc Gia 2017","data/dethi/toan/demontoan2017.pdf","data/dapan/toan/dapantoan.pdf"));
        listDocuments.add(new ListDocument("TOÁN", "Đề Thi","Đề Thi Thử 2018","data/dethi/toan/1-dethi.pdf","data/dapan/toan/1-dapan.pdf"));
        listDocuments.add(new ListDocument("TOÁN", "Đề Thi","Đề Thi Thử 2018 2","data/dethi/toan/2-dethi.pdf","data/dapan/toan/2-dapan.pdf"));
        listDocuments.add(new ListDocument("TOÁN", "Đề Thi","Đề Thi Thử 2018 3","data/dethi/toan/3-dethi.pdf","data/dapan/toan/3-dapan.pdf"));
        listDocuments.add(new ListDocument("TOÁN", "Đề Thi","Đề Thi Thử 2018 4","data/dethi/toan/4-dethi.pdf","data/dapan/toan/4-dapan.pdf"));
        listDocuments.add(new ListDocument("TOÁN", "Đề Thi","Đề Thi Thử 2018 5","data/dethi/toan/5-dethi.pdf","data/dapan/toan/5-dapan.pdf"));


        listDocuments.add(new ListDocument("VẬT LÝ","Mẹo", "Chú ý đến các hiện tượng vật lý", "data/meomonly/chuydencachientuongvatlivaungdungtrongthucte2.pdf",""));
        listDocuments.add(new ListDocument("VẬT LÝ","Mẹo", "Để ý đến các sơ đồ mạch điện và đồ thị", "data/meomonly/deydencacsodomachdienvacaccauhoivedothi2.pdf",""));
        listDocuments.add(new ListDocument("VẬT LÝ","Mẹo", "Dùng phương pháp loại trừ", "data/meomonly/dungphuongphaploaitru2.pdf",""));
        listDocuments.add(new ListDocument("VẬT LÝ","Mẹo", "Làm quen với tốc độ làm trắc nghiệm", "data/meomonly/lamquenvstocdolamtracnghiem2.pdf",""));
        listDocuments.add(new ListDocument("VẬT LÝ","Mẹo", "Nháp khoa học", "data/meomonly/nhapkhoahoc2.pdf",""));
        listDocuments.add(new ListDocument("VẬT LÝ","Mẹo", "Thà tô nhầm còn hơn bỏ sót", "data/meomonly/thatonhamconhonbosot2.pdf",""));

        listDocuments.add(new ListDocument("VẬT LÝ", "Công Thức","Công Thức VẬT LÝ","data/ctngoaingu/congthucli2.pdf",""));

        listDocuments.add(new ListDocument("VẬT LÝ", "Đề Thi","Đề Thi Vật Lý THPT Quốc Gia 2017","data/dethi/vatly/vatly2017.pdf","data/dapan/vatly/dapanly2017.pdf"));
        listDocuments.add(new ListDocument("VẬT LÝ", "Đề Thi","Đề Thi Thử 2018","data/dethi/vatly/1-dethi.pdf","data/dapan/vatly/1-dapan.pdf"));
        listDocuments.add(new ListDocument("VẬT LÝ", "Đề Thi","Đề Thi Thử 2018 2","data/dethi/vatly/2-dethi.pdf","data/dapan/vatly/2-dapan.pdf"));
        listDocuments.add(new ListDocument("VẬT LÝ", "Đề Thi","Đề Thi Thử 2018 3","data/dethi/vatly/3-dethi.pdf","data/dapan/vatly/3-dapan.pdf"));
        listDocuments.add(new ListDocument("VẬT LÝ", "Đề Thi","Đề Thi Thử 2018 4","data/dethi/vatly/4-dethi.pdf","data/dapan/vatly/4-dapan.pdf"));
        listDocuments.add(new ListDocument("VẬT LÝ", "Đề Thi","Đề Thi Thử 2018 5","data/dethi/vatly/5-dethi.pdf","data/dapan/vatly/5-dapan.pdf"));



        listDocuments.add(new ListDocument("HÓA HỌC","Mẹo", "Chuẩn bị trước kỳ thi", "data/meomonhoa/chuanbitruockythi2.pdf",""));
        listDocuments.add(new ListDocument("HÓA HỌC","Mẹo", "Dùng phương pháp loại trừ", "data/meomonhoa/dungphuongphaploaitru2.pdf",""));
        listDocuments.add(new ListDocument("HÓA HỌC","Mẹo", "Mẹo 'khoanh bừa' trắc nghiệm môn hóa ", "data/meomonhoa/meokhoanhbuatracnghiemmonhoa2.pdf",""));
        listDocuments.add(new ListDocument("HÓA HỌC","Mẹo", "Phần lý thuyết", "data/meomonhoa/phanlythuyet2.pdf",""));
        listDocuments.add(new ListDocument("HÓA HỌC","Mẹo", "Tha tô nhầm còn hơn bỏ sót", "data/meomonhoa/thatonhamconhonbosot2.pdf",""));
        listDocuments.add(new ListDocument("HÓA HỌC","Mẹo", "Trong quá trình làm bài thi", "data/meomonhoa/trongquatrinhlambaithi2.pdf",""));

        listDocuments.add(new ListDocument("HÓA HỌC", "Công Thức","Công Thức Hóa Học","data/ctngoaingu/congthuchoa2.pdf",""));

        listDocuments.add(new ListDocument("HÓA HỌC", "Đề Thi","Đề Thi Hóa Học THPT Quốc Gia 2017","data/dethi/hoa/dethihoa2017.pdf","data/dapan/hoa/dapanhoa.pdf"));
        listDocuments.add(new ListDocument("HÓA HỌC", "Đề Thi","Đề Thi Thử 2018","data/dethi/hoa/1-dethi.pdf","data/dapan/hoa/1-dapan.pdf"));
        listDocuments.add(new ListDocument("HÓA HỌC", "Đề Thi","Đề Thi Thử 2018 2","data/dethi/hoa/2-dethi.pdf","data/dapan/hoa/2-dapan.pdf"));
        listDocuments.add(new ListDocument("HÓA HỌC", "Đề Thi","Đề Thi Thử 2018 3","data/dethi/hoa/3-dethi.pdf","data/dapan/hoa/3-dapan.pdf"));
        listDocuments.add(new ListDocument("HÓA HỌC", "Đề Thi","Đề Thi Thử 2018 4","data/dethi/hoa/4-dethi.pdf","data/dapan/hoa/4-dapan.pdf"));
        listDocuments.add(new ListDocument("HÓA HỌC", "Đề Thi","Đề Thi Thử 2018 5","data/dethi/hoa/5-dethi.pdf","data/dapan/hoa/5-dapan.pdf"));


        listDocuments.add(new ListDocument("ĐỊA LÝ","Mẹo", "Chuẩn bị trước kỳ thi", "data/meomondia/chuanbitamlytutin,vungvangtrongphongthi2.pdf",""));
        listDocuments.add(new ListDocument("ĐỊA LÝ","Mẹo", "Chuẩn bị đầy đủ dụng cụ khi thi", "data/meomondia/congcudungcudithi2.pdf",""));
        listDocuments.add(new ListDocument("ĐỊA LÝ","Mẹo", "Không được bỏ trống phương án trả lời", "data/meomondia/khongduocbotrongphuongantraloi2.pdf",""));
        listDocuments.add(new ListDocument("ĐỊA LÝ","Mẹo", "Kỹ năng phỏng đoán loại trừ", "data/meomondia/kynangphongdoan-loaitru2.pdf",""));
        listDocuments.add(new ListDocument("ĐỊA LÝ","Mẹo", "Những lỗi cần tránh khi thi môn địa", "data/meomondia/nhungloithisinhcantranhkhilambaithimondiali2.pdf",""));
        listDocuments.add(new ListDocument("ĐỊA LÝ","Mẹo", "Phân bổ thời gian hợp lý", "data/meomondia/phanbothoigianhopli2.pdf",""));
        listDocuments.add(new ListDocument("ĐỊA LÝ","Mẹo", "Phương pháp tránh điểm liệt", "data/meomondia/phuongphaptranhdiemlietmondiali2.pdf",""));

        listDocuments.add(new ListDocument("ĐỊA LÝ", "Đề Thi","Đề Thi Địa Lý THPT Quốc Gia 2017","data/dethi/dialy/dethidia2017.pdf","data/dapan/dialy/dapandia.pdf"));
        listDocuments.add(new ListDocument("ĐỊA LÝ", "Đề Thi","Đề Thi Thử 2018","data/dethi/dialy/1-dethi.pdf","data/dapan/dialy/1-dapan.pdf"));
        listDocuments.add(new ListDocument("ĐỊA LÝ", "Đề Thi","Đề Thi Thử 2018 2","data/dethi/dialy/2-dethi.pdf","data/dapan/dialy/2-dapan.pdf"));
        listDocuments.add(new ListDocument("ĐỊA LÝ", "Đề Thi","Đề Thi Thử 2018 3","data/dethi/dialy/3-dethi.pdf","data/dapan/dialy/3-dapan.pdf"));
        listDocuments.add(new ListDocument("ĐỊA LÝ", "Đề Thi","Đề Thi Thử 2018 4","data/dethi/dialy/4-dethi.pdf","data/dapan/dialy/4-dapan.pdf"));
        listDocuments.add(new ListDocument("ĐỊA LÝ", "Đề Thi","Đề Thi Thử 2018 5","data/dethi/dialy/5-dethi.pdf","data/dapan/dialy/5-dapan.pdf"));



        listDocuments.add(new ListDocument("LỊCH SỬ","Mẹo", "Chọn đúng thời điểm để học", "data/meomonsu/chondungthoidiemdehoc2.pdf",""));
        listDocuments.add(new ListDocument("LỊCH SỬ","Mẹo", "Không nên học thuộc lòng một cách bài bản", "data/meomonsu/khongnenhocthuoclongmotcachbaiban2.pdf",""));
        listDocuments.add(new ListDocument("LỊCH SỬ","Mẹo", "Làm bài trắc nghiệm nên nhớ các dạng sau", "data/meomonsu/lambaitracnghiemnennhocacdangsau2.pdf",""));
        listDocuments.add(new ListDocument("LỊCH SỬ","Mẹo", "Sử dụng phương pháp loại trừ đáp án sai", "data/meomonsu/sudungphuongphaploaitrunhungdapansai2.pdf",""));
        listDocuments.add(new ListDocument("LỊCH SỬ","Mẹo", "Tính toán thời gian hợp lý", "data/meomonsu/tinhthoigianhoply2.pdf",""));

        listDocuments.add(new ListDocument("LỊCH SỬ", "Đề Thi","Đề Thi Sử THPT Quốc Gia 2017","data/dethi/lichsu/dethisu2017.pdf","data/dapan/lichsu/dapansu.pdf"));
        listDocuments.add(new ListDocument("LỊCH SỬ", "Đề Thi","Đề Thi Thử 2018","data/dethi/lichsu/1-dethi.pdf","data/dapan/lichsu/1-dapan.pdf"));
        listDocuments.add(new ListDocument("LỊCH SỬ", "Đề Thi","Đề Thi Thử 2018 2","data/dethi/lichsu/2-dethi.pdf","data/dapan/lichsu/2-dapan.pdf"));



        listDocuments.add(new ListDocument("NGỮ VĂN","Mẹo", "Bố trí thời gian hợp lý", "data/meomonvan/botrithoigianhoply2.pdf",""));
        listDocuments.add(new ListDocument("NGỮ VĂN","Mẹo", "Chọn đúng thời điểm để học", "data/meomonvan/chondungthoidiemdehoc2.pdf",""));
        listDocuments.add(new ListDocument("NGỮ VĂN","Mẹo", "Chi tiết sáng tạo", "data/meomonvan/hagucbangiamkhaobangchitietsangtao2.pdf",""));
        listDocuments.add(new ListDocument("NGỮ VĂN","Mẹo", "Học văn như nấu ăn", "data/meomonvan/hocvannhunauan2.pdf",""));
        listDocuments.add(new ListDocument("NGỮ VĂN","Mẹo", "Không học tủ nhưng cần có trọng tâm", "data/meomonvan/khonghoctunhungcancotrongtam2.pdf",""));
        listDocuments.add(new ListDocument("NGỮ VĂN","Mẹo", "Mở bài hấp dẫn", "data/meomonvan/mobaihapdan2.pdf",""));
        listDocuments.add(new ListDocument("NGỮ VĂN","Mẹo", "Viết văn cần có luận điểm rõ ràng", "data/meomonvan/vietvanluoncancoluandiemrorang2.pdf",""));

        listDocuments.add(new ListDocument("NGỮ VĂN", "Đề Thi","Đề Thi Ngữ Văn THPT Quốc Gia 2017","data/dethi/nguvan/dethivan2017.pdf","data/dapan/nguvan/dapanvan2017.pdf"));
        listDocuments.add(new ListDocument("NGỮ VĂN", "Đề Thi","Đề Thi Thử 2018","data/dethi/nguvan/dethithuvanhanthuyen.pdf","data/dapan/nguvan/dapanthithuvanhanthuyen.pdf"));
        listDocuments.add(new ListDocument("NGỮ VĂN", "Đề Thi","Đề Thi Thử 2018 2","data/dethi/nguvan/dethithuvanthaibinh.pdf","data/dapan/nguvan/dapanthithuvanthaibinh.pdf"));
        listDocuments.add(new ListDocument("NGỮ VĂN", "Đề Thi","Đề Thi Thử 2018 3","data/dethi/nguvan/dethithuvanyenlac.pdf","data/dapan/nguvan/dapanthithuvanyenlac.pdf"));
        listDocuments.add(new ListDocument("NGỮ VĂN", "Đề Thi","Đề Thi Thử 2018 4","data/dethi/nguvan/dethithuvinhphuc.pdf","data/dapan/nguvan/dapanthithuvanvinhphuc.pdf"));



        listDocuments.add(new ListDocument("SINH HỌC","Mẹo", "Chọn đúng thời điểm để học", "data/meomonsinh/chondungthoidiemdehoc2.pdf",""));
        listDocuments.add(new ListDocument("SINH HỌC","Mẹo", "Mẹp hay cần nhớ", "data/meomonsinh/meo hay can nho2.pdf",""));
        listDocuments.add(new ListDocument("SINH HỌC","Mẹo", "Mẹo khi làm trắc nghiệm môn sinh", "data/meomonsinh/meonhokhilambaithitracnghiemmonsinh2.pdf",""));
        listDocuments.add(new ListDocument("SINH HỌC","Mẹo", "Phân loại câu hỏi", "data/meomonsinh/phanloaicauhoi2.pdf",""));
        listDocuments.add(new ListDocument("SINH HỌC","Mẹo", "Quy trình bốn bước làm bài", "data/meomonsinh/quytrinh4buoclambai2.pdf",""));

        listDocuments.add(new ListDocument("SINH HỌC", "Công Thức","Công Thức Sinh Học","data/ctngoaingu/congthucmonsinh.pdf",""));

        listDocuments.add(new ListDocument("SINH HỌC", "Đề Thi","Đề Thi Sinh THPT Quốc Gia 2017","data/dethi/sinh/dethisinh2017.pdf","data/dapan/sinh/dapansinh.pdf"));
        listDocuments.add(new ListDocument("SINH HỌC", "Đề Thi","Đề Thi Thử 2018","data/dethi/sinh/1-dethi.pdf","data/dapan/sinh/1-dapan.pdf"));
        listDocuments.add(new ListDocument("SINH HỌC", "Đề Thi","Đề Thi Thử 2018 2","data/dethi/sinh/2-dethi.pdf","data/dapan/sinh/2-dapan.pdf"));
        listDocuments.add(new ListDocument("SINH HỌC", "Đề Thi","Đề Thi Thử 2018 3","data/dethi/sinh/3-dethi.pdf","data/dapan/sinh/3-dapan.pdf"));
        listDocuments.add(new ListDocument("SINH HỌC", "Đề Thi","Đề Thi Thử 2018 4","data/dethi/sinh/4-dethi.pdf","data/dapan/sinh/4-dapan.pdf"));
        listDocuments.add(new ListDocument("SINH HỌC", "Đề Thi","Đề Thi Thử 2018 5","data/dethi/sinh/5-dethi.pdf","data/dapan/sinh/5-dapan.pdf"));


        return listDocuments;
    }
}
