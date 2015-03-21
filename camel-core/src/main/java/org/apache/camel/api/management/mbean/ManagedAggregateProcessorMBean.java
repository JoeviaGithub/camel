/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.api.management.mbean;

import org.apache.camel.api.management.ManagedAttribute;
import org.apache.camel.api.management.ManagedOperation;

public interface ManagedAggregateProcessorMBean extends ManagedProcessorMBean {

    @ManagedAttribute(description = "Correlation Expression")
    String getCorrelationExpression();

    @ManagedAttribute(description = "Completion timeout in millis")
    long getCompletionTimeout();

    @ManagedAttribute(description = "Completion timeout expression")
    String getCompletionTimeoutExpression();

    @ManagedAttribute(description = "Completion interval in millis")
    long getCompletionInterval();

    @ManagedAttribute(description = "Completion size")
    int getCompletionSize();

    @ManagedAttribute(description = "Completion size expression")
    String getCompletionSizeExpression();

    @ManagedAttribute(description = "Complete from batch consumers")
    boolean isCompletionFromBatchConsumer();

    @ManagedAttribute(description = "Ignore invalid correlation keys")
    boolean isIgnoreInvalidCorrelationKeys();

    @ManagedAttribute(description = "Whether to close the correlation group on completion")
    Integer getCloseCorrelationKeyOnCompletion();

    @ManagedAttribute(description = "Parallel mode")
    boolean isParallelProcessing();

    @ManagedAttribute(description = "Optimistic locking")
    boolean isOptimisticLocking();

    @ManagedAttribute(description = "Whether or not to eager check for completion when a new incoming Exchange has been received")
    boolean isEagerCheckCompletion();

    @ManagedAttribute(description = "A Predicate to indicate when an aggregated exchange is complete")
    String getCompletionPredicate();

    @ManagedAttribute(description = "Whether or not exchanges which complete due to a timeout should be discarded")
    boolean isDiscardOnCompletionTimeout();

    @ManagedAttribute(description = "Indicates to complete all current aggregated exchanges when the context is stopped")
    boolean isForceCompletionOnStop();

    @ManagedAttribute(description = "Number of completed exchanges which are currently in-flight")
    int getInProgressCompleteExchanges();

    @ManagedOperation(description = "Number of groups currently in the aggregation repository")
    int aggregationRepositoryGroups();

    @ManagedOperation(description = "To force completing a specific group by its key")
    int forceCompletionOfGroup(String key);

    @ManagedOperation(description = "To force complete of all groups")
    int forceCompletionOfAllGroups();

}