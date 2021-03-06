package com.thistech.spotlink.util;

/*
 * The contents of this file are subject to the SpotLink Public License,
 * version 1.0 (the “License”); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.thistech.com/spotlink/spl.
 *
 * Software distributed under the License is distributed on an “AS IS”
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.  See
 * the License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is SpotLink Server Code, release date February 14, 2011
 * The Initial Developer of the Original Code is This Technology, LLC.
 * Copyright (C) 2010-2011, This Technology, LLC
 * All Rights Reserved.
 */

import com.thistech.spotlink.AbstractSpotlinkTest;
import org.apache.http.client.HttpClient;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;


@ContextConfiguration
public class HttpClientFactoryTest extends AbstractSpotlinkTest {

    @Test
    public void testNewInstance() throws Exception {
        HttpClientFactory httpClientFactory = (HttpClientFactory) this.applicationContext.getBean("httpClientFactory");
        assertNotNull(httpClientFactory);

        HttpClient client = httpClientFactory.newInstance();
        assertNotNull(client);
    }
}
