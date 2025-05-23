package glg.example.report;

import glg.example.google.CampaignExample;
import io.swagger.client.ApiException;
import io.swagger.client.model.CampaignResponseDto;
import io.swagger.client.model.Experiment;
import glg.example.AuthExample;

public class ReportFlowExampleMain {

    public static void main(String[] args) {
        try {
            // Step 1: Authenticate using provided credentials
            AuthExample.TokenPair authenticate = AuthExample.authenticate("use_provided_credentials", "use_provided_credentials");
            String accessToken = authenticate.getAccessToken();

            // Step 2: Initialize helper classes
            CampaignExample campaignExample = new CampaignExample();
            ReportExample reportExample = new ReportExample();

            // Step 3: Create a Google Ads Search campaign
            CampaignResponseDto googleAdSearchCampaign = campaignExample.createGoogleSearchCampaign(accessToken);
            System.out.println("Campaign for Google Ads Search successfully created: " + googleAdSearchCampaign);

            // Step 4: Retrieve experimentId from the first experiment (if present)
            Long experimentId = googleAdSearchCampaign.getExperiments()
                    .stream()
                    .findFirst()
                    .map(Experiment::getExperimentId)
                    .orElse(null);

//             Step 5: Run message-level reports based on experimentId
            if (experimentId != null) {
                reportExample.getAllMessageByExperimentId(accessToken, experimentId);
                reportExample.topNMessageByExperimentId(accessToken, experimentId);
            } else {
                System.err.println("No experiment ID found in the campaign response.");
            }

            // Step 6: Run grouped time-based reports (e.g., day, week, month, year)
            reportExample.reportsByType(accessToken);

            // Step 7: Get top-performing segments within the time window
            reportExample.topSegments(accessToken);

        } catch (AuthExample.AuthenticationException | ApiException e) {
            throw new RuntimeException("An error occurred while executing the campaign and reporting workflow.", e);
        }
    }


}
