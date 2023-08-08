package com.salemgmt.campaignmanagement.controller;

import com.salemgmt.campaignmanagement.service.CampaignService;
import com.salemgmt.campaignmanagement.response.CampaignRequest;
import com.salemgmt.campaignmanagement.model.CampaignDiscount;
import com.salemgmt.campaignmanagement.model.Campaign;
import com.salemgmt.campaignmanagement.response.CampaignGetResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CampaignController {
    private final CampaignService campaignService;

    @Autowired
    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping("/create-campaigns")
    public ResponseEntity<String> createCampaign(@RequestBody CampaignRequest campaignRequest) {
        Campaign campaign = new Campaign();
        campaign.setTitle(campaignRequest.getTitle());
        campaign.setStartDate(campaignRequest.getStartDate());
        campaign.setEndDate(campaignRequest.getEndDate());

        List<CampaignDiscount> campaignDiscounts = campaignRequest.getCampaignDiscounts();

        if (campaignDiscounts.isEmpty()) {
            return new ResponseEntity<>("Campaign discounts are required.", HttpStatus.BAD_REQUEST);
        }

        campaignService.createCampaign(campaign, campaignDiscounts);

        return new ResponseEntity<>("Campaign created successfully.", HttpStatus.CREATED);
    }

    @GetMapping("/campaigns")
    public CampaignGetResponse getCampaigns() {
        List<Campaign> campaigns = campaignService.getAllCampaigns();
        return new CampaignGetResponse(campaigns);
    }
}

