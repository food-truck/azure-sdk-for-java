/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.JobStreamListResultInner;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.JobStreamInner;
import java.util.List;

/**
 * Type representing JobStreamListResult.
 */
public interface JobStreamListResult extends HasInner<JobStreamListResultInner>, HasManager<AutomationManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<JobStreamInner> value();

}