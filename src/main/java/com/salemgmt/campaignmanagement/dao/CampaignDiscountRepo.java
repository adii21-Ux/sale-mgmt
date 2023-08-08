package com.salemgmt.campaignmanagement.dao;

import com.salemgmt.campaignmanagement.model.CampaignDiscount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignDiscountRepo extends JpaRepository<CampaignDiscount, Long> {
}

