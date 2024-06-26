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
package hu.icellmobilsoft.roaster.oracle.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.Connection;

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.enterprise.util.Nonbinding;
import jakarta.inject.Qualifier;

/**
 * Qualifier for instantiating {@link Connection}
 *
 * @author balazs.joo
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE })
public @interface DBConnection {

    /**
     * Config key of the desired DB schema. <br>
     * ie. if connection details are defined in the project-*.yml by the keys: {@code roaster.oracle.employee.*=...} then configKey should be
     * "employee"
     *
     * @return config key value
     */
    @Nonbinding
    String configKey();

    /**
     * Supports inline instantiation of the {@link DBConnection} qualifier.
     *
     * @author balazs.joo
     */
    final class Literal extends AnnotationLiteral<DBConnection> implements DBConnection {

        private static final long serialVersionUID = 1L;

        /**
         * config key
         */
        private final String configKey;

        /**
         * Instantiates the literal with configKey
         *
         * @param configKey
         *            config key
         */
        public Literal(String configKey) {
            this.configKey = configKey;
        }

        @Nonbinding
        public String configKey() {
            return configKey;
        }

    }

}
