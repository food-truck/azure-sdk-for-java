// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureEventHubsParameter model. */
@Fluent
public final class AzureEventHubsParameter {
    /*
     * Azure Event Hubs connection string
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /*
     * Azure Event Hubs consumer group
     */
    @JsonProperty(value = "consumerGroup", required = true)
    private String consumerGroup;

    /**
     * Get the connectionString property: Azure Event Hubs connection string.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Azure Event Hubs connection string.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureEventHubsParameter object itself.
     */
    public AzureEventHubsParameter setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the consumerGroup property: Azure Event Hubs consumer group.
     *
     * @return the consumerGroup value.
     */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * Set the consumerGroup property: Azure Event Hubs consumer group.
     *
     * @param consumerGroup the consumerGroup value to set.
     * @return the AzureEventHubsParameter object itself.
     */
    public AzureEventHubsParameter setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }
}
