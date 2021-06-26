module HeatMap {
    requires javax.inject;
    requires spring.tx;

    exports heatmap.system.domain.model;
    // exports heatmap.system.domain.service;
    exports heatmap.system.port;
    exports heatmap.adapter;

    // opens heatmap.system.domain.service;
    opens heatmap.adapter;
}