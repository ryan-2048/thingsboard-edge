/**
 * Copyright © 2016-2024 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.transport.activity.strategy;

public enum ActivityStrategyType {

    ALL {
        @Override
        public ActivityStrategy toStrategy() {
            return AllEventsActivityStrategy.getInstance();
        }
    },
    FIRST {
        @Override
        public ActivityStrategy toStrategy() {
            return new FirstEventActivityStrategy();
        }
    },
    LAST {
        @Override
        public ActivityStrategy toStrategy() {
            return LastEventActivityStrategy.getInstance();
        }
    },
    FIRST_AND_LAST {
        @Override
        public ActivityStrategy toStrategy() {
            return new FirstAndLastEventActivityStrategy();
        }
    };

    public abstract ActivityStrategy toStrategy();

}
