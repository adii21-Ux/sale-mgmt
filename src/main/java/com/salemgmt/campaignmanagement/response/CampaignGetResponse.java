package com.salemgmt.campaignmanagement.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.salemgmt.campaignmanagement.model.Campaign;

import java.util.List;

@Data
@AllArgsConstructor
public class CampaignGetResponse {
    private List<Campaign> campaigns;
}