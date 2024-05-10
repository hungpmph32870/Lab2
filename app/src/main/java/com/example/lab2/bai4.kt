package com.example.lab2

import java.util.Scanner

fun main(){
    val sv1 = SinhVienModel("Phùng Mạnh Hùng", "PH32870",7f)
    val sv2 = SinhVienModel("Hà Quang Huy", "PH12345",9f)
    sv2.daTotNghiep = false
    sv2.tuoi = 22
    val sv3 = SinhVienModel("Đỗ Thành Đạt", "PH12533", 8.5f, true, 22)

    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)

    fun xoaSinhVien(mssv: String) {
        val sv = listSV.find { it.mssv == mssv }
        sv?.let { listSV.remove(it) }
    }

    val scanner = Scanner(System.`in`)
    var tiepTuc = true
    while (tiepTuc) {
        println("Chọn chức năng:")
        println("1. Thêm sinh viên")
        println("2. Xem danh sách sinh viên")
        println("3. Xóa sinh viên")
        println("4. Thoát")
        print("Nhập lựa chọn của bạn: ")
        val luaChon = scanner.nextInt()
        when (luaChon) {
            1 -> {
                print("Nhập tên sinh viên: ")
                val ten = readLine() ?: ""
                print("Nhập MSSV: ")
                val mssv = readLine() ?: ""
                print("Nhập điểm trung bình: ")
                val diemTB = scanner.nextFloat()
                print("Đã tốt nghiệp? (true/false): ")
                val daTotNghiep = scanner.nextBoolean()
                print("Nhập tuổi (nếu có): ")
                val tuoi: Int? = try {
                    scanner.nextInt()
                } catch (e: Exception) {
                    null
                }
                listSV.add(SinhVienModel(ten, mssv, diemTB, daTotNghiep, tuoi));
                println("Đã thêm sinh viên thành công.")
            }
            2 -> {
                for (i in listSV.indices) {
                    println("SV thu $i: \n ${listSV.get(i).getThongtin()}")
                }
            }

            3 -> {
                print("Nhập MSSV của sinh viên cần xóa: ")
                val mssv = readLine() ?: ""
                xoaSinhVien(mssv)
                println("Đã xóa sinh viên thành công.")
            }
            4 -> {
                tiepTuc = false
                println("Đã thoát chương trình.")
            }
            else -> println("Lựa chọn không hợp lệ.")
        }
    }
}