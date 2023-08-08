package com.salemgmt.campaignmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salemgmt.campaignmanagement.model.Campaign;

public interface CampaignRepo extends JpaRepository<Campaign, Long> {
}