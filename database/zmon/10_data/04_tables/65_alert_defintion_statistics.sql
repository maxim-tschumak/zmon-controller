CREATE TABLE zzm_data.alert_stats (
    ads_alert_id                        int,
    ads_false_positive_rate         int,
    FOREIGN KEY (ads_alert_id) REFERENCES zzm_data.alert_definition_tree (adt_id)
);
