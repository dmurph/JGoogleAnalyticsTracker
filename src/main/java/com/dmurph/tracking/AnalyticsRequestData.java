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
 * Created on Jul 20, 2010, 4:53:44 AM
 */
package com.dmurph.tracking;

/**
 * Tracking data that is pertinent to each individual tracking
 * request.
 * @author Daniel Murphy
 */
public class AnalyticsRequestData {
	
	private String pageTitle = null;
	private String hostName = null;
	private String referrer = null;
	private String pageURL = null;
	private String eventCategory = null;
	private String eventAction = null;
	private String eventLabel = null;
	private String eventValue = null;

	/**
	 * @return the eventAction
	 */
	public String getEventAction() {
		return eventAction;
	}
	/**
	 * @return the eventCategory
	 */
	public String getEventCategory() {
		return eventCategory;
	}
	/**
	 * @return the eventLabel
	 */
	public String getEventLabel() {
		return eventLabel;
	}
	/**
	 * @return the eventValue
	 */
	public String getEventValue() {
		return eventValue;
	}
	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}
	/**
	 * @return the contentTitle
	 */
	public String getPageTitle() {
		return pageTitle;
	}
	/**
	 * @return the pageURL
	 */
	public String getPageURL() {
		return pageURL;
	}
	/**
	 * @return the referrer
	 */
	public String getReferrer() {
		return referrer;
	}
	/**
	 * Sets the event action, which is required for
	 * tracking events.
	 * @param argEventAction the eventAction to set
	 */
	public void setEventAction(String argEventAction) {
		eventAction = argEventAction;
	}
	/**
	 * Sets the event category, which is required for
	 * tracking events.
	 * @param argEventCategory the eventCategory to set
	 */
	public void setEventCategory(String argEventCategory) {
		eventCategory = argEventCategory;
	}
	/**
	 * Sets the event label, which is optional for
	 * tracking events.
	 * @param argEventLabel the eventLabel to set
	 */
	public void setEventLabel(String argEventLabel) {
		eventLabel = argEventLabel;
	}
	/**
	 * Sets the event value, which is optional for tracking
	 * events.
	 * @param argEventValue the eventValue to set
	 */
	public void setEventValue(String argEventValue) {
		eventValue = argEventValue;
	}
	/**
	 * The host name of the page
	 * @param argHostName the hostName to set
	 */
	public void setHostName(String argHostName) {
		hostName = argHostName;
	}
	/**
	 * Sets the page title, which will be the Content Title
	 * in Google Analytics
	 * @param argContentTitle the contentTitle to set
	 */
	public void setPageTitle(String argContentTitle) {
		pageTitle = argContentTitle;
	}
	/**
	 * The page url, which is required.  Traditionally
	 * this is of the form "/content/page.html", but you can
	 * put anything here (like "/com/dmurph/test.java").
	 * @param argPageURL the pageURL to set
	 */
	public void setPageURL(String argPageURL) {
		pageURL = argPageURL;
	}
	/**
	 * The referrer of this request.  This is used by
	 * google analytics to track trends.  For that to
	 * work this has to equal hostname+pageurl of referring
	 * request.
	 * @param argReferrer the referrer to set
	 */
	public void setReferrer(String argReferrer) {
		referrer = argReferrer;
	}
}
