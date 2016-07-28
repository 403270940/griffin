/*
	Copyright (c) 2016 eBay Software Foundation.
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	    http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.apache.bark.common;

public class ModelStatusConstants {
	public static final int TESTING = 0;
	public static final int VERIFIED = 1;
	public static final int DEPLOYED = 2;


	private static final String[] array = {"Testing", "Need Verify", "Deployed"};

	public static String val(int type){
		if(type < array.length && type >=0){
			return array[type];
		}else{
			return type + "";
		}

	}

	public static int indexOf(String desc){
		for(int i = 0;i < array.length; i ++){
			if(array[i].equals(desc)){
				return i;
			}
		}

		return -1;
	}

}
