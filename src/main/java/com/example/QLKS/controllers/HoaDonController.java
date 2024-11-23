package com.example.QLKS.controllers;

import com.example.QLKS.dto.requestHoaDon.HoaDonCreationRequest;
import com.example.QLKS.dto.requestHoaDon.HoaDonUpdateRequest;
import com.example.QLKS.entities.HoaDon;
import com.example.QLKS.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/hoadon")
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;
    @PostMapping
    HoaDon createHoaDon(@RequestBody HoaDonCreationRequest request) {
        return hoaDonService.createHoaDon(request);
    }
    @GetMapping
    List<HoaDon> getAllHoaDon() {
        return hoaDonService.getAllHoaDon();
    }
    @GetMapping("/{maHoaDon}")
    HoaDon getHoaDon(@PathVariable int maHoaDon) {
        return hoaDonService.getHoaDon(maHoaDon);

    }
    @PutMapping("/{maHoaDon}")
    HoaDon updateHoaDon(@PathVariable int maHoaDon , @RequestBody HoaDonUpdateRequest request) {
        return hoaDonService.updateHoaDon(maHoaDon, request);
    }
    @DeleteMapping("/{maHoaDon}")
    String deleteHoaDon(@PathVariable int maHoaDon) {
        hoaDonService.deleteHoaDon(maHoaDon);
        return "Hoa Don deleted";
    }
}
