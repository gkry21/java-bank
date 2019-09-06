package com.lotto.web.pool;

import java.io.File;

public class Constants {
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee_lotto1%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator
			);
	
	public static final String VIEW_PATH = "WEB_INF/views/%s/%s.jsp";
}
