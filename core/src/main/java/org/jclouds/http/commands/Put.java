/**
 *
 * Copyright (C) 2009 Global Cloud Specialists, Inc. <info@globalcloudspecialists.com>
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 */
package org.jclouds.http.commands;

import org.jclouds.http.HttpFutureCommand;
import org.jclouds.http.HttpMethod;
import org.jclouds.http.commands.callables.ReturnTrueIf2xx;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 * PUT a string and respond with true if successful.
 * 
 * @author Adrian Cole
 */
public class Put extends HttpFutureCommand<Boolean> {

   @Inject
   public Put(ReturnTrueIf2xx callable, @Assisted("uri") String uri,
            @Assisted("payload") String payload) {
      super(HttpMethod.PUT, uri, callable);
      this.getRequest().setPayload(payload);
   }
}