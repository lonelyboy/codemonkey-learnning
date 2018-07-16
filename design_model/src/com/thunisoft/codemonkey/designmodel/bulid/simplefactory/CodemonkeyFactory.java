package com.thunisoft.codemonkey.designmodel.bulid.simplefactory;

public class CodemonkeyFactory {

	/**
	 * JAVA 程序员
	 */
	public static final int MOBNKEYTYPE_JAVA = 1;
	/**
	 * js程序员
	 */
	public static final int MOBNKEYTYPE_JAVASCRIPT = 2;

	public static ICodemonkey create(int type) {

		if (type == MOBNKEYTYPE_JAVA) {
			return new Wujch();
		}

		if (type == MOBNKEYTYPE_JAVASCRIPT) {
			return new Qingyy();
		}

		return null;
	}

	public static void main(String[] args) {
		int type = 1;
		ICodemonkey monkey = CodemonkeyFactory.create(2);
		monkey.coding();
	}
}
