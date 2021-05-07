/*
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
package org.apache.catalina;

/**
 * <p>Decoupling interface which specifies that an implementing class is
 * associated with at most one <strong>Container</strong> instance.</p>
 * 包含容器对象的接口，主要实现 ValveBase、Pipeline
 * @author Craig R. McClanahan
 * @author Peter Donald
 */
public interface Contained {

    /**
     * 获得关联的容器对象
     * Get the {@link Container} with which this instance is associated.
     *
     * @return The Container with which this instance is associated or
     *         <code>null</code> if not associated with a Container
     */
    Container getContainer();


    /**
     * 设置关联容器对象
     * Set the <code>Container</code> with which this instance is associated.
     *
     * @param container The Container instance with which this instance is to
     *  be associated, or <code>null</code> to disassociate this instance
     *  from any Container
     */
    void setContainer(Container container);
}
