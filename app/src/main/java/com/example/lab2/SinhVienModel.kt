package com.example.lab2

import java.util.Scanner

class SinhVienModel(var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep: Boolean? = null
    var tuoi: Int? = null

    constructor( tenSV: String,  mssv: String,  diemTB: Float, datotnghiep: Boolean?, tuoi: Int?) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = datotnghiep
        this.tuoi = tuoi
    }



    fun  getThongtin(): String{

        var sdatotnghiep :String
        if (daTotNghiep == null){
            sdatotnghiep = "Chưa có dữ liệu"
        }else{
            if (daTotNghiep!!)
                sdatotnghiep = "Đã tốt nghiệp"
            else{
                sdatotnghiep = "Chưa có dữ liệu"
            }
        }

        var stuoi : String
        if (tuoi == null){
            stuoi = "chưa có dữ liệu"
        }else{
            stuoi = tuoi.toString()
        }


        return "Tên: $tenSV, Mssv: $mssv, Điểm TB: $diemTB, Đã tốt nghiệp: $sdatotnghiep, Tuổi: $stuoi"
    }

}



