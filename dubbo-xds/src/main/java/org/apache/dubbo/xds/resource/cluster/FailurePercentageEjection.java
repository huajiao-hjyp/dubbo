/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.xds.resource.cluster;

import org.apache.dubbo.common.lang.Nullable;

public class FailurePercentageEjection {

    @Nullable
    private final Integer threshold;

    @Nullable
    private final Integer enforcementPercentage;

    @Nullable
    private final Integer minimumHosts;

    @Nullable
    private final Integer requestVolume;

    static FailurePercentageEjection create(
            @Nullable Integer threshold,
            @Nullable Integer enforcementPercentage,
            @Nullable Integer minimumHosts,
            @Nullable Integer requestVolume) {
        return new FailurePercentageEjection(threshold, enforcementPercentage, minimumHosts, requestVolume);
    }

    public FailurePercentageEjection(
            @Nullable Integer threshold,
            @Nullable Integer enforcementPercentage,
            @Nullable Integer minimumHosts,
            @Nullable Integer requestVolume) {
        this.threshold = threshold;
        this.enforcementPercentage = enforcementPercentage;
        this.minimumHosts = minimumHosts;
        this.requestVolume = requestVolume;
    }

    @Nullable
    public Integer getThreshold() {
        return threshold;
    }

    @Nullable
    public Integer getEnforcementPercentage() {
        return enforcementPercentage;
    }

    @Nullable
    public Integer getMinimumHosts() {
        return minimumHosts;
    }

    @Nullable
    public Integer getRequestVolume() {
        return requestVolume;
    }

    @Override
    public String toString() {
        return "FailurePercentageEjection{" + "threshold=" + threshold + ", " + "enforcementPercentage="
                + enforcementPercentage + ", " + "minimumHosts=" + minimumHosts + ", " + "requestVolume="
                + requestVolume + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof FailurePercentageEjection) {
            FailurePercentageEjection that = (FailurePercentageEjection) o;
            return (this.threshold == null ? that.getThreshold() == null : this.threshold.equals(that.getThreshold()))
                    && (this.enforcementPercentage == null
                            ? that.getEnforcementPercentage() == null
                            : this.enforcementPercentage.equals(that.getEnforcementPercentage()))
                    && (this.minimumHosts == null
                            ? that.getMinimumHosts() == null
                            : this.minimumHosts.equals(that.getMinimumHosts()))
                    && (this.requestVolume == null
                            ? that.getRequestVolume() == null
                            : this.requestVolume.equals(that.getRequestVolume()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (threshold == null) ? 0 : threshold.hashCode();
        h$ *= 1000003;
        h$ ^= (enforcementPercentage == null) ? 0 : enforcementPercentage.hashCode();
        h$ *= 1000003;
        h$ ^= (minimumHosts == null) ? 0 : minimumHosts.hashCode();
        h$ *= 1000003;
        h$ ^= (requestVolume == null) ? 0 : requestVolume.hashCode();
        return h$;
    }
}