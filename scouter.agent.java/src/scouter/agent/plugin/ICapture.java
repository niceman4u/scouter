/*
 *  Copyright 2015 the original author or authors. 
 *  @https://github.com/scouter-project/scouter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */
package scouter.agent.plugin;

abstract public class ICapture extends IPlugIn {

	abstract public void capArgs(ContextWrapper ctx, String className, String methodName, String methodDesc,
			Object[] arg);

	abstract public void capReturn(ContextWrapper ctx, String className, String methodName, String methodDesc,
			Object rtn);

	abstract public void capThis(ContextWrapper ctx, String className, String methodDesc, Object this1);
}
