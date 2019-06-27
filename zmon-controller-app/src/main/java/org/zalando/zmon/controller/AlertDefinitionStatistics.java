package org.zalando.zmon.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zalando.zmon.domain.AlertStatistics;
import org.zalando.zmon.service.AlertService;

@Controller
@RequestMapping(value = "/rest")
public class AlertDefinitionStatistics extends AbstractZMonController {

    private AlertService alertService;

    public AlertDefinitionStatistics(final AlertService alertService) {
        this.alertService = alertService;
    }

    @RequestMapping(value="/alertStatistics", method = RequestMethod.GET)
    public ResponseEntity<AlertStatistics> getAlertStatistics(
            @RequestParam(value = "alert_id", required = true) final int id) {
        AlertStatistics alertStats = alertService.getAlertStatisticsById(id);
        return new ResponseEntity<>(alertStats, HttpStatus.OK);
    }

    @RequestMapping(value="/alertStatistics", method = RequestMethod.POST)
    public ResponseEntity<AlertStatistics> createOrUpdateAlertStatistics(
            @RequestParam(value = "alert_id", required = true) final int id) {
        AlertStatistics alertStats = alertService.getAlertStatisticsById(id);
        return new ResponseEntity<>(alertStats, HttpStatus.OK);
    }
}
