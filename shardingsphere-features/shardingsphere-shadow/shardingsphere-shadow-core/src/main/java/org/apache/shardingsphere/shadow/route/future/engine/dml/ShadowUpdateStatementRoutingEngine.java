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

package org.apache.shardingsphere.shadow.route.future.engine.dml;

import org.apache.shardingsphere.infra.binder.LogicSQL;
import org.apache.shardingsphere.infra.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.infra.metadata.ShardingSphereMetaData;
import org.apache.shardingsphere.infra.route.context.RouteContext;
import org.apache.shardingsphere.shadow.route.future.engine.ShadowRouteEngine;
import org.apache.shardingsphere.shadow.rule.ShadowRule;

/**
 * Shadow update statement routing engine.
 */
public final class ShadowUpdateStatementRoutingEngine implements ShadowRouteEngine {
    
    @Override
    public void route(final RouteContext routeContext, final LogicSQL logicSQL, final ShardingSphereMetaData metaData, final ShadowRule shadowRule, final ConfigurationProperties props) {
        // TODO decorate route in update statement case
    }
}
