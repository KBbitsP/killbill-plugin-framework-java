/*
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2014-2020 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.core.resources.jooby;

import javax.servlet.http.HttpServlet;

import org.jooby.Jooby;
import org.jooby.json.Jackson;
import org.killbill.billing.plugin.core.JoobyServlet;

public class PluginApp extends Jooby {

    public PluginApp() {}

    public PluginApp(final Jackson jackson,
                     final Iterable<Object> services,
                     final Iterable<Class> routeClasses) {
        use(jackson);

        for (final Object service : services) {
            bind(service);
        }

        for (final Class<?> routeClass : routeClasses) {
            use(routeClass);
        }
    }

    // To be registered in your Activator
    public static HttpServlet createServlet(final PluginApp pluginApp) {
        return new JoobyServlet(pluginApp);
    }
}
