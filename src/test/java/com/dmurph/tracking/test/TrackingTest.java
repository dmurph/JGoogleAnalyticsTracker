/**
 * Copyright (c) 2010 Daniel Murphy
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
/**
 * Created at Jul 23, 2010, 2:45:40 AM
 */
package com.dmurph.tracking.test;

import com.dmurph.tracking.AnalyticsConfigData;
import com.dmurph.tracking.JGoogleAnalyticsTracker;
import com.dmurph.tracking.JGoogleAnalyticsTracker.GoogleAnalyticsVersion;

import junit.framework.TestCase;

/**
 * @author Daniel Murphy
 *
 */
public class TrackingTest extends TestCase {
	public void testPageView(){
		JGoogleAnalyticsTracker.DEBUG_PRINT = true;
		JGoogleAnalyticsTracker tracker = JGoogleAnalyticsTracker.getInstance();
		AnalyticsConfigData config = new AnalyticsConfigData("UA-17109202-5");
		tracker.initialize(config, GoogleAnalyticsVersion.V_4_7_2);
		tracker.trackPageView("/pagewitheverything.java", "page with everything", "www.dmurph.com", "www.dmurph.com");
		tracker.trackPageView("pagewithonlyurl", null, null, null);
		tracker.trackPageView("/pagewithtitle", "Page with Title", null, null);
		tracker.trackPageView("pagewithtitleandhost", "Page With Title And Host", "pagewithtitlehost", null);
		tracker.trackPageView("pagewithonlyreferrer", null, null, "www.pagewithonlyreferrer.com");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void testEventTracking(){
		JGoogleAnalyticsTracker.DEBUG_PRINT = true;
		JGoogleAnalyticsTracker tracker = JGoogleAnalyticsTracker.getInstance();
		AnalyticsConfigData config = new AnalyticsConfigData("UA-17109202-5");
		tracker.initialize(config, GoogleAnalyticsVersion.V_4_7_2);
		tracker.trackEvent("Greetings", "Hello");
		tracker.trackEvent("Greetings", "Goodbye");
		tracker.trackEvent("Greetings", "Hello");
		tracker.trackEvent("Greetings", "Goodbye", "Slap");
		tracker.trackEvent("Greetings", "Goodbye", "Slap", "3");
		tracker.trackEvent("Greetings", "Goodbye", "Slap", "4");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
