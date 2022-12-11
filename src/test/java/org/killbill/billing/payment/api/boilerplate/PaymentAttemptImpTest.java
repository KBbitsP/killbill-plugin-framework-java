/*
 *  Generated by https://github.com/killbill/api-pojos. Do not edit!
 *
 *  Copyright 2022-2022 The Billing Project, LLC
 *
 *  The Billing Project licenses this file to you under the Apache License,
 *  version 2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

package org.killbill.billing.payment.api.boilerplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import java.io.IOException;
import org.killbill.billing.payment.api.PaymentAttempt;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(groups = { "fast" })
public class PaymentAttemptImpTest {
    @Test
    public void anInstanceShouldBeEqualToItself()
    {
      PaymentAttemptImp a = new PaymentAttemptImp.Builder<>().build();
      Assert.assertTrue(a.equals(a));
    }
    @Test
    public void anInstanceShouldBeEqualToItsCopy()
    {
      PaymentAttemptImp a = new PaymentAttemptImp.Builder<>().build();
      PaymentAttemptImp b = new PaymentAttemptImp(a);

      Assert.assertTrue(a.equals(b));
    }
    @Test
    public void twoNewInstancesShouldBeEqual()
    {
      PaymentAttemptImp a = new PaymentAttemptImp.Builder<>().build();
      PaymentAttemptImp b = new PaymentAttemptImp.Builder<>().build();

      Assert.assertTrue(a.equals( b));
    }
    @Test
    public void twoNewInstancesHashcodeShouldBeEqual()
    {
      PaymentAttemptImp a =  new PaymentAttemptImp.Builder<>().build();
      PaymentAttemptImp b =  new PaymentAttemptImp.Builder<>().build();

      Assert.assertTrue(a.hashCode() == b.hashCode());
    }
    @Test
    public void twoNewInstancesStringShouldBeEqual()
    {
      PaymentAttemptImp a =  new PaymentAttemptImp.Builder<>().build();
      PaymentAttemptImp b =  new PaymentAttemptImp.Builder<>().build();

      Assert.assertTrue(a.toString().equals(b.toString()));
    }
    @Test
    public void callIssers()
    {
      PaymentAttemptImp a =  new PaymentAttemptImp.Builder<>().build();

    }
    @Test
    public void callGetters()
    {
      PaymentAttemptImp a =  new PaymentAttemptImp.Builder<>().build();

      a.getAccountId();
      a.getAmount();
      a.getCreatedDate();
      a.getCurrency();
      a.getEffectiveDate();
      a.getId();
      a.getPaymentExternalKey();
      a.getPaymentMethodId();
      a.getPluginName();
      a.getPluginProperties();
      a.getStateName();
      a.getTransactionExternalKey();
      a.getTransactionId();
      a.getTransactionType();
      a.getUpdatedDate();
    }
    @Test
    public void jsonRoundtrip()
      throws IOException,
        JsonParseException,
        JsonProcessingException,
        JsonMappingException
    {
      ObjectMapper mapper = new ObjectMapper();
      mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
      mapper.registerModule(new JodaModule());
      mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
      mapper.findAndRegisterModules();

      PaymentAttemptImp a =  new PaymentAttemptImp.Builder<>().build();
      String s =  mapper.writeValueAsString(a);;
      PaymentAttempt b = mapper.readValue(s, PaymentAttempt.class);

      Assert.assertTrue(a.equals( b));
    }
}