package org.zalando.zmon.domain;

import de.zalando.typemapper.annotations.DatabaseField;

import javax.xml.bind.annotation.XmlElement;

public class AlertStatistics {

    @XmlElement(required = true)
    @DatabaseField
    private Integer alertId;

    @DatabaseField
    private int falsePositiveRate;

    public Integer getAlertId() {
        return alertId;
    }

    public void setAlertId(final Integer alertId) { this.alertId = alertId; }

    public int getFalsePositiveRate() {
        return this.falsePositiveRate;
    }

    public void setFalsePositiveRate(final Integer falsePositiveRate) {
        this.falsePositiveRate = falsePositiveRate;
    }

}
