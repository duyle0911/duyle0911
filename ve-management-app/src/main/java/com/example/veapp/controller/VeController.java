package com.example.veapp.controller;

import com.example.veapp.model.Ve;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VeController {

    @GetMapping("/ves")
    public String hienThiDanhSachVe(Model model) {
        try {
            List<Ve> danhSachVe = new ArrayList<>();
            danhSachVe.add(new Ve("VE001", "Nguyen Van A", "HN - SG", 1500000));
            danhSachVe.add(new Ve("VE002", "Tran Thi B", "SG - DN", 1200000));
            danhSachVe.add(new Ve("VE003", "Le Van C", "HN - Hue", 1350000));
            model.addAttribute("danhSachVe", danhSachVe);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Đã xử lý hiển thị danh sách vé.");
        }
        return "list-ve";
    }
}
