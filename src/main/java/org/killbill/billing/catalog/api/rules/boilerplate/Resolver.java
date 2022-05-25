/*
 *  Generated by https://github.com/killbill/api-pojos. Do not edit!
 *
 *  Copyright 2022-2022 The Billing Project, LLC
 *
 *  The Billing Project licenses this file to you under the Apache License, version 2.0
 *  (the "License"); you may not use this file except in compliance with the
 *  License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

package org.killbill.billing.catalog.api.rules.boilerplate;

import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import org.killbill.billing.catalog.api.rules.Case;
import org.killbill.billing.catalog.api.rules.CaseBillingAlignment;
import org.killbill.billing.catalog.api.rules.CaseCancelPolicy;
import org.killbill.billing.catalog.api.rules.CaseChange;
import org.killbill.billing.catalog.api.rules.CaseChangePlanAlignment;
import org.killbill.billing.catalog.api.rules.CaseChangePlanPolicy;
import org.killbill.billing.catalog.api.rules.CaseCreateAlignment;
import org.killbill.billing.catalog.api.rules.CasePhase;
import org.killbill.billing.catalog.api.rules.CasePriceList;
import org.killbill.billing.catalog.api.rules.PlanRules;

public class Resolver extends SimpleAbstractTypeResolver {
    public Resolver(){
        this.addMapping(CaseBillingAlignment.class, CaseBillingAlignmentImp.class);
        this.addMapping(CaseCancelPolicy.class, CaseCancelPolicyImp.class);
        this.addMapping(CaseChange.class, CaseChangeImp.class);
        this.addMapping(CaseChangePlanAlignment.class, CaseChangePlanAlignmentImp.class);
        this.addMapping(CaseChangePlanPolicy.class, CaseChangePlanPolicyImp.class);
        this.addMapping(CaseCreateAlignment.class, CaseCreateAlignmentImp.class);
        this.addMapping(Case.class, CaseImp.class);
        this.addMapping(CasePhase.class, CasePhaseImp.class);
        this.addMapping(CasePriceList.class, CasePriceListImp.class);
        this.addMapping(PlanRules.class, PlanRulesImp.class);
    }
}
