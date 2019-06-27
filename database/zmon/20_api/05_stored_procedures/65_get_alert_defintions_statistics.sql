CREATE OR REPLACE FUNCTION get_alert_statistics(id int) RETURNS SETOF alert_statistics_type AS
$$
  SELECT  ads_false_positive_rate,
          ads_alert_id
  FROM zzm_data.alert_stats
  WHERE (ads_alert_id = id);
$$ LANGUAGE SQL VOLATILE SECURITY DEFINER;
