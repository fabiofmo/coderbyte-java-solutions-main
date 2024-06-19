
class SerialNumberr {

	public static String SerialNumber(String str) {

	    if (str.length() < 11) {
	        return "false";
	    }

	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == '0') {
	            return "false";
	        }
	    }

	    int first = Integer.valueOf(str.charAt(0)) + Integer.valueOf(str.charAt(1)) + Integer.valueOf(str.charAt(2));
	    int second = Integer.valueOf(str.charAt(4)) + Integer.valueOf(str.charAt(5)) + Integer.valueOf(str.charAt(6));

	    if (first%2 != 0 || second%2 == 0) {
	        return "false";
	    }

	    if (str.charAt(2) < str.charAt(1) || str.charAt(2) < str.charAt(0) 
	    		|| str.charAt(6) < str.charAt(5) || str.charAt(6) < str.charAt(4)
	    		|| str.charAt(10) < str.charAt(8) || str.charAt(10) < str.charAt(9)) {
	        return "false";
	    } else {
	        return "true";
	    }
	}
	
	
	public static void main(String[] args) {
		System.out.println("11.124.667 : " + SerialNumber("11.124.667"));
		System.out.println("114.568.112 : " + SerialNumber("114.568.112"));
	}

}
