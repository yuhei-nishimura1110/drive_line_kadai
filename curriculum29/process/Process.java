package curriculum29.process;

public class Process {
	public Process(String[][] dates, int[] ints,String c) {
		// 一覧と、面積だけのリストをそれぞれ作る。
		String[][] list = new String[ints.length][3];
		int[] count = new int[ints.length];
		for(int i = 0; i < ints.length ; i++) {
			for(int j = 0; j < 3; j++) {
				list[i][j]=dates[ints[i]][j];
			}
			count[i] = Integer.valueOf(list[i][2]);
		}
		// 昇順降順によってどの値が一番大きいかを決めてその値を表示
		for(int i = 0; i < ints.length; i++) {
			int re = 0;
			if(c.equals("降順")) {
				re = rankdown(count);
			}else {
				re = rankup(count);
			}
			System.out.println("都道府県名：" + list[re][0] + "\n"
					+ "	県庁所在地：" + list[re][1] + "\n"
					+ "	面積：" + list[re][2] + ".0km2\n");
			
			// 表示した情報をもう一度出さないように代入。
			if(c.equals("降順")) {
				count[re] = 200000;
			}else {
				count[re] = 0;
			}
			
		}
	}
	// 昇順の場合。
	// 一番大きな値を出してその値と等しければその値を返す。
	public int rankup(int[] list) {
		int x =0;
		for(int i = 0; i < list.length; i++) {
			if(x < list[i]) {
				x = list[i];
			}
		}
		for(int i = 0; i < list.length; i++) {
			if(list[i] == x) {
				return i;
			}
		}
		return 0;
	}
	// 降順の場合。昇順の逆。
	public int rankdown(int[] list) {
		int x =200000;
		for(int i = 0; i < list.length; i++) {
			if(x > list[i]) {
				x = list[i];
			}
		}
		for(int i = 0; i < list.length; i++) {
			if(list[i] == x) {
				return i;
			}
		}
		return 0;
	}
}
