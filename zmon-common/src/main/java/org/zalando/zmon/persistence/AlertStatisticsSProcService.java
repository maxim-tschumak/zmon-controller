package org.zalando.zmon.persistence;

import de.zalando.sprocwrapper.SProcCall;
import de.zalando.sprocwrapper.SProcParam;
import de.zalando.sprocwrapper.SProcService;

import org.zalando.zmon.domain.AlertStatistics;

@SProcService
public interface AlertStatisticsSProcService {

    @SProcCall
    AlertStatistics getAlertStatistics(@SProcParam Integer alertId);

}
