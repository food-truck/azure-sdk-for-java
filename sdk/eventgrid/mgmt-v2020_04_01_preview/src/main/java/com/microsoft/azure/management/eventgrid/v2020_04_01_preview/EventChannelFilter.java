/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filter for the Event Channel.
 */
public class EventChannelFilter {
    /**
     * An optional string to filter events for an event channel based on a
     * resource path prefix.
     * The format of this depends on the publisher of the events. Wildcard
     * characters are not supported in this path.
     */
    @JsonProperty(value = "subjectBeginsWith")
    private String subjectBeginsWith;

    /**
     * An optional string to filter events for an event channel based on a
     * resource path suffix.
     * Wildcard characters are not supported in this path.
     */
    @JsonProperty(value = "subjectEndsWith")
    private String subjectEndsWith;

    /**
     * A list of applicable event types that need to be part of the event
     * channel. If it is desired to subscribe to all default event types, set
     * the IncludedEventTypes to null.
     */
    @JsonProperty(value = "includedEventTypes")
    private List<String> includedEventTypes;

    /**
     * Specifies if the SubjectBeginsWith and SubjectEndsWith properties of the
     * filter
     * should be compared in a case sensitive manner.
     */
    @JsonProperty(value = "isSubjectCaseSensitive")
    private Boolean isSubjectCaseSensitive;

    /**
     * An array of advanced filters that are used for filtering event channels.
     */
    @JsonProperty(value = "advancedFilters")
    private List<AdvancedFilter> advancedFilters;

    /**
     * Get an optional string to filter events for an event channel based on a resource path prefix.
     The format of this depends on the publisher of the events. Wildcard characters are not supported in this path.
     *
     * @return the subjectBeginsWith value
     */
    public String subjectBeginsWith() {
        return this.subjectBeginsWith;
    }

    /**
     * Set an optional string to filter events for an event channel based on a resource path prefix.
     The format of this depends on the publisher of the events. Wildcard characters are not supported in this path.
     *
     * @param subjectBeginsWith the subjectBeginsWith value to set
     * @return the EventChannelFilter object itself.
     */
    public EventChannelFilter withSubjectBeginsWith(String subjectBeginsWith) {
        this.subjectBeginsWith = subjectBeginsWith;
        return this;
    }

    /**
     * Get an optional string to filter events for an event channel based on a resource path suffix.
     Wildcard characters are not supported in this path.
     *
     * @return the subjectEndsWith value
     */
    public String subjectEndsWith() {
        return this.subjectEndsWith;
    }

    /**
     * Set an optional string to filter events for an event channel based on a resource path suffix.
     Wildcard characters are not supported in this path.
     *
     * @param subjectEndsWith the subjectEndsWith value to set
     * @return the EventChannelFilter object itself.
     */
    public EventChannelFilter withSubjectEndsWith(String subjectEndsWith) {
        this.subjectEndsWith = subjectEndsWith;
        return this;
    }

    /**
     * Get a list of applicable event types that need to be part of the event channel. If it is desired to subscribe to all default event types, set the IncludedEventTypes to null.
     *
     * @return the includedEventTypes value
     */
    public List<String> includedEventTypes() {
        return this.includedEventTypes;
    }

    /**
     * Set a list of applicable event types that need to be part of the event channel. If it is desired to subscribe to all default event types, set the IncludedEventTypes to null.
     *
     * @param includedEventTypes the includedEventTypes value to set
     * @return the EventChannelFilter object itself.
     */
    public EventChannelFilter withIncludedEventTypes(List<String> includedEventTypes) {
        this.includedEventTypes = includedEventTypes;
        return this;
    }

    /**
     * Get specifies if the SubjectBeginsWith and SubjectEndsWith properties of the filter
     should be compared in a case sensitive manner.
     *
     * @return the isSubjectCaseSensitive value
     */
    public Boolean isSubjectCaseSensitive() {
        return this.isSubjectCaseSensitive;
    }

    /**
     * Set specifies if the SubjectBeginsWith and SubjectEndsWith properties of the filter
     should be compared in a case sensitive manner.
     *
     * @param isSubjectCaseSensitive the isSubjectCaseSensitive value to set
     * @return the EventChannelFilter object itself.
     */
    public EventChannelFilter withIsSubjectCaseSensitive(Boolean isSubjectCaseSensitive) {
        this.isSubjectCaseSensitive = isSubjectCaseSensitive;
        return this;
    }

    /**
     * Get an array of advanced filters that are used for filtering event channels.
     *
     * @return the advancedFilters value
     */
    public List<AdvancedFilter> advancedFilters() {
        return this.advancedFilters;
    }

    /**
     * Set an array of advanced filters that are used for filtering event channels.
     *
     * @param advancedFilters the advancedFilters value to set
     * @return the EventChannelFilter object itself.
     */
    public EventChannelFilter withAdvancedFilters(List<AdvancedFilter> advancedFilters) {
        this.advancedFilters = advancedFilters;
        return this;
    }

}