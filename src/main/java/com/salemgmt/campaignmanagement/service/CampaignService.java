package com.salemgmt.campaignmanagement.service;

import com.salemgmt.campaignmanagement.model.CampaignDiscount;
import com.salemgmt.campaignmanagement.model.Campaign;
import com.salemgmt.campaignmanagement.dao.CampaignDiscountRepo;
import com.salemgmt.campaignmanagement.dao.CampaignRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {
    private final CampaignRepo campaignRepository;
    private final CampaignDiscountRepo campaignDiscountRepository;

    @Autowired
    public CampaignService(CampaignRepo campaignRepository, CampaignDiscountRepo campaignDiscountRepository) {
        this.campaignRepository = campaignRepository;
        this.campaignDiscountRepository = campaignDiscountRepository;
    }

    public Campaign createCampaign(Campaign campaign, List<CampaignDiscount> campaignDiscounts) {
        campaign = campaignRepository.save(campaign);
        for (CampaignDiscount campaignDiscount : campaignDiscounts) {
            campaignDiscount.setCampaign(campaign);
            campaignDiscountRepository.save(campaignDiscount);
        }
        return campaign;
    }
}

