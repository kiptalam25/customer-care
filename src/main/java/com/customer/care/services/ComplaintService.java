package com.customer.care.services;

import com.customer.care.entities.Complaint;
import com.customer.care.repositories.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository complaintRepository;

    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }

    public void saveComplaint(Complaint complaint) {
        complaint.setStatus("Pending");
        complaintRepository.save(complaint);
    }
}
