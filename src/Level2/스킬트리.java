package Level2;

public class 스킬트리 {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CDABF", "AEDCB", "BDA","AFFCBD"};
		solution(skill, skill_trees);
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for(int i = 0 ; i < skill_trees.length ; i++) {
			
			String[] skills = skill_trees[i].split("");
			boolean flag = true;
			int cnt = 0;
			for(int j = 0 ; j < skills.length ; j++) {
				if(cnt < skill.indexOf(skills[j])) {
					flag = false;
					break;
				}
				else if(cnt == skill.indexOf(skills[j]))
					cnt++;
				
			}
			if(flag)
				answer++;
			
			
		}
		
        System.out.println(answer);
        return answer;
    }
}