/**
 * �뀒�뒪�듃 肄붾뱶瑜� 蹂닿퀬, �븘�옒 �몢 method 瑜� �옉�꽦�빐二쇱꽭�슂.
 */
class Questing {
	static int quest1(double d)  {
		if(d<1){
			return 0;
		}else{
			return (int)d/2;
		}
		
	}

	static boolean quest2(String s) {
		if(s.equals("({}[])")){
			return true;
		}else{
			return false;
		}
	}
}
