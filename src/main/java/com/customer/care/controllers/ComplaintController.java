package com.customer.care.controllers;

import com.customer.care.entities.Complaint;
import com.customer.care.services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/complaints")
public class ComplaintController {
    @Autowired
    private ComplaintService complaintService;

    @GetMapping
    public String listComplaints(Model model) {
        model.addAttribute("complaints", complaintService.getAllComplaints());
        return "complaintsList";
    }

    @GetMapping("/new")
    public String showComplaintForm(Model model) {
        model.addAttribute("complaint", new Complaint());
        return "complaintForm";
    }

    @PostMapping
    public String saveComplaint(@ModelAttribute("complaint") Complaint complaint) {
        complaintService.saveComplaint(complaint);
        return "redirect:/complaints";
    }
}
