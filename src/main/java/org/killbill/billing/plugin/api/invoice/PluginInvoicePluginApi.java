/*
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2020-2020 Equinix, Inc
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

package org.killbill.billing.plugin.api.invoice;

import java.util.List;

import org.killbill.billing.invoice.api.Invoice;
import org.killbill.billing.invoice.api.InvoiceItem;
import org.killbill.billing.invoice.plugin.api.InvoiceContext;
import org.killbill.billing.invoice.plugin.api.InvoicePluginApi;
import org.killbill.billing.invoice.plugin.api.OnFailureInvoiceResult;
import org.killbill.billing.invoice.plugin.api.OnSuccessInvoiceResult;
import org.killbill.billing.invoice.plugin.api.PriorInvoiceResult;
import org.killbill.billing.osgi.libs.killbill.OSGIConfigPropertiesService;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillAPI;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillLogService;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.plugin.api.PluginApi;
import org.killbill.billing.util.callcontext.CallContext;
import org.killbill.clock.Clock;

import com.google.common.collect.ImmutableList;

public class PluginInvoicePluginApi extends PluginApi implements InvoicePluginApi {

    public PluginInvoicePluginApi(final OSGIKillbillAPI killbillAPI, final OSGIConfigPropertiesService configProperties, final OSGIKillbillLogService logService, final Clock clock) {
        super(killbillAPI, configProperties, logService, clock);
    }

    @Override
    public PriorInvoiceResult priorCall(final InvoiceContext context, final Iterable<PluginProperty> properties) {
        return new PluginPriorInvoiceResult();
    }

    @Override
    public List<InvoiceItem> getAdditionalInvoiceItems(final Invoice invoice, final boolean dryRun, final Iterable<PluginProperty> properties, final CallContext context) {
        return ImmutableList.<InvoiceItem>of();
    }

    @Override
    public OnSuccessInvoiceResult onSuccessCall(final InvoiceContext context, final Iterable<PluginProperty> properties) {
        return new PluginOnSuccessInvoiceResult();
    }

    @Override
    public OnFailureInvoiceResult onFailureCall(final InvoiceContext context, final Iterable<PluginProperty> properties) {
        return new PluginOnFailureInvoiceResult();
    }
}
