/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package org.appcelerator.titanium.module.map;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

public class TitaniumOverlayItem extends OverlayItem
{
	private String leftButtonPath;
	private String rightButtonPath;

	public TitaniumOverlayItem(GeoPoint location, String title, String snippet) {
		super(location,title,snippet);
	}

	public void setLeftButton(String path) {
		leftButtonPath = path;
	}

	public String getLeftButton() {
		return leftButtonPath;
	}

	public void setRightButton(String path) {
		rightButtonPath = path;
	}

	public String getRightButton() {
		return rightButtonPath;
	}

	public boolean hasData() {
		return getTitle() != null || getSnippet() != null | leftButtonPath != null || rightButtonPath != null;
	}
}
