package rgbGame;

import java.util.ArrayList;

public class Monster {
	String monsterName;
	int monsterLife;
	public Monster(){
		
	}
	public  Monster(String monsterName,int monsterLife){
		this.monsterName=monsterName;
		this.monsterLife=monsterLife;
	}
	
	@Override
	public String toString() {
		return "monsterName:"+monsterName+"monsterLife:"+monsterLife;
	}
	
	public static void main(String[] args) {
		ArrayList<Monster> arrayList=new ArrayList<Monster>();
		arrayList.add(new Monster("“∞ Û",999));
		arrayList.add(new Monster("“∞≈£",888));
		arrayList.add(new Monster("“∞ª¢",777));
		arrayList.add(new Monster("“∞Õ√",666));
		arrayList.add(new Monster("“∞¡˙",555));
		arrayList.add(new Monster("“∞…ﬂ",444));
		System.out.println(arrayList);
	}	
}
