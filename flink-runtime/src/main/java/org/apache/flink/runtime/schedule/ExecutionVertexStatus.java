/*
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

package org.apache.flink.runtime.schedule;

import org.apache.flink.runtime.execution.ExecutionState;
import org.apache.flink.runtime.jobgraph.ExecutionVertexID;

import java.io.Serializable;

/**
 * This class represents current status of a vertex.
 */
public class ExecutionVertexStatus implements Serializable {

	private final ExecutionVertexID executionVertexID;

	private final ExecutionState executionState;

	public ExecutionVertexStatus(
		final ExecutionVertexID executionVertexID,
		final ExecutionState executionState) {

		this.executionVertexID = executionVertexID;
		this.executionState = executionState;

	}

	/**
	 * Get the id of the vertex.
	 *
	 * @return id of the vertex
	 */
	ExecutionVertexID getExecutionVertexID() {
		return executionVertexID;
	}

	/**
	 * Get the execution state of the vertex.
	 *
	 * @return execution state of the vertex
	 */
	ExecutionState getExecutionState() {
		return executionState;
	}
}