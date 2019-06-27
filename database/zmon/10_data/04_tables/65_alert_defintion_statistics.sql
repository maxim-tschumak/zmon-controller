CREATE TABLE zzm_data.alert_stats (
    ads_false_positive_rate         int             DEFAULT 10
    FOREIGN KEY (ac_alert_definition_id) REFERENCES zzm_data.alert_definition_tree (adt_id)
);
