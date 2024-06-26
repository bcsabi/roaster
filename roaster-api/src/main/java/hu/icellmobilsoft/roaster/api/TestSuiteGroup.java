/*-
 * #%L
 * Roaster
 * %%
 * Copyright (C) 2020 i-Cell Mobilsoft Zrt.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package hu.icellmobilsoft.roaster.api;

/**
 * Constants holder for testsuite test groups
 *
 * @author mark.petrenyi
 */
public interface TestSuiteGroup {

    /**
     * Junit + CDI type test
     */
    String WELD_UNIT = "weld-unit";
    /**
     * JAX-RS type test
     */
    String JAXRS = "jaxrs";
    /**
     * Restassured type test
     */
    String RESTASSURED = "restassured";
    /**
     * Selenide type test
     */
    String SELENIDE = "selenide";
    /**
     * Integration type test (combination of any e.g. container + jaxrs)
     */
    String INTEGRATION = "integration";

}
