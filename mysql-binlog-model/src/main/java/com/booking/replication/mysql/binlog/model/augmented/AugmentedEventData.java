package com.booking.replication.mysql.binlog.model.augmented;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public interface AugmentedEventData extends TableEventData {
    Map<String, Map<String, String>> getEventColumns();
    TableSchemaVersion getTableSchemaVersion();
    List<String> getPrimaryKeyColumns();
}