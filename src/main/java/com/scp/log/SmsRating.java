package com.scp.log;

import org.apache.log4j.Logger;

public class SmsRating {
	Logger log=Logger.getLogger(SmsRating.class);
	public void applyRate() {
		log.info("Inside applyrate()");
	}

}
