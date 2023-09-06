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
package com.alipay.sofa.serverless.arklet.core.command.coordinate;

import com.alipay.sofa.serverless.arklet.core.common.exception.ArkletRuntimeException;

/**
 * @author mingmen
 * @date 2023/6/14
 */
public class CommandMutexException extends ArkletRuntimeException {
    public CommandMutexException() {
    }

    public CommandMutexException(String message) {
        super(message);
    }

    public CommandMutexException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommandMutexException(Throwable cause) {
        super(cause);
    }

    public CommandMutexException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CommandMutexException(String format, Object... args) {
        super(format, args);
    }

    public CommandMutexException(Throwable cause, String format, Object... args) {
        super(cause, format, args);
    }
}