CREATE TABLE zzm_data.alert_statistics (
    as_alert_id                    int,
    as_false_positive_rate         real,
    FOREIGN KEY (as_alert_id) REFERENCES zzm_data.alert_definition_tree (adt_id)
);
