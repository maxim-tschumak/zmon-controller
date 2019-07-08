CREATE OR REPLACE FUNCTION get_alert_statistics(
    IN alert_id int
  ) RETURNS alert_statistics AS
$BODY$
   SELECT as_alert_id,
          as_false_positive_rate
     FROM zzm_data.alert_statistics
    WHERE (as_alert_id = alert_id);
$BODY$
LANGUAGE SQL VOLATILE SECURITY DEFINER;
