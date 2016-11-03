package les2star7;

public class Operation {
	
	
		public double result (double arg1, String sign, double arg2) {
			double a = arg1;	
			double b = arg2;
			double res;
			String menu = sign;
			
			switch (menu){
			case "+":{
				res = a + b;
				return res;
				//break;
			}
			case "-":{
				res = a - b;
				return res;
				//break;
			}
			case "*":{
				res = a * b;
				return res;
				//break;
			}
			case "/":{
				res = a / b;
				return res;
				//break;
			}
			default:{
				res = 0;
				return res;
				//break;
			}
		}
		}

}
