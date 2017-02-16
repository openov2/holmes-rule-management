/**
 * Copyright 2017 ZTE Corporation.
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
package org.openo.holmes.rulemgt.bolt.enginebolt;

import lombok.extern.slf4j.Slf4j;
import org.jvnet.hk2.annotations.Service;
import org.openo.holmes.common.exception.CallException;
import org.openo.holmes.rulemgt.bean.request.CorrelationCheckRule4Engine;
import org.openo.holmes.rulemgt.bean.request.CorrelationDeployRule4Engine;

@Service
@Slf4j
public class EngineWrapper {


    public String deployEngine(CorrelationDeployRule4Engine correlationRule) throws CallException {
        return "";
    }

    public boolean deleteRuleFromEngine(String packageName) throws CallException {
        return true;
    }

    public boolean checkRuleFromEngine(CorrelationCheckRule4Engine correlationCheckRule4Engine)
        throws CallException {
        return true;
    }
}