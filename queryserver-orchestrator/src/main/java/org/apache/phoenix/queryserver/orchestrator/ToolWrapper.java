/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.phoenix.queryserver.orchestrator;

import com.google.common.base.Joiner;
import org.apache.phoenix.tool.PhoenixCanaryTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/*
    This is a wrapper class runs the PhoenixCanaryTool.
 */
public class ToolWrapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(ToolWrapper.class);

    public void executeMain(String [] args){
        if(Arrays.asList(args).contains(null)){
            LOGGER.error("Bad argument list passed to executeMain. Skipping QueryServerCanaryTool.");
            return;
        }
        LOGGER.info("Passing args to QueryServerCanaryTool: " + Joiner.on(",").join(args));
        PhoenixCanaryTool.main(args);
    }
}
