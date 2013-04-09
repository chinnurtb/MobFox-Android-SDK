package com.adsdk.sdk;

import java.io.Serializable;

public interface Ad extends Serializable {
	public int getType();

	public void setType(int adType);
}
