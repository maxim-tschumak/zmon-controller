CREATE OR REPLACE FUNCTION get_alert_statistics(id int) RETURNS SETOF jsonb AS
$$
RETURN QUERY
    SELECT  ads_false_positive_rate,
            ad_id
   FROM zzm_data.alert_stats
   WHERE (ad_id = int (id));
$$ LANGUAGE SQL VOLATILE SECURITY DEFINER;
