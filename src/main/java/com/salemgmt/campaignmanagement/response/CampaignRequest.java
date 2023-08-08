package com.salemgmt.campaignmanagement.response;

import com.salemgmt.campaignmanagement.model.CampaignDiscount;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CampaignRequest {
    private LocalDate startDate;
    private LocalDate endDate;
    private String title;
    private List<CampaignDiscount> campaignDiscounts;
}
