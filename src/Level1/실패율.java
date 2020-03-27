package Level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ������ {

	public static void main(String[] args) {

		int n = 4;
		int[] stages = { 
				4,4,4,4,4
		};

		int[] result = solution( n , stages );
		
		System.out.println(Arrays.toString(result));



	}//main

	public static int[] solution(int N, int[] stages) {

		//�ܰ� �� Ŭ�������� ���� ����� ���� ����.
		int[] noClear = new int[N+1];
		
		for ( int stage : stages ) {
			if ( stage == N+1 ) continue;
			noClear[stage]++;
		}
		
		//System.out.println(" Ŭ�������� ���� ��� �� : " + Arrays.toString(noClear));
		
		// �ܰ躰 �������� ���� ����.
		int[] challenger = new int[N+1];
		
		//1�ܰ�� ������� ����.
		challenger[1] = stages.length;
		
		for ( int i = 2 ; i <= N ; i++ ) {
			challenger[i] = challenger[i-1] - noClear[i-1];
		}
		
		//System.out.println(" ������ ��  : " + Arrays.toString(challenger));
		
	    // �ܰ躰 �������� ����.
		double[] failRate = new double[N+1];
		
		// ������ key�� ����.
		Set<Double> fails = new HashSet<Double>();
		
		for ( int i = 1; i <= N ; i++ ) {
			if ( challenger[i] == 0 ) {
				failRate[i] = 0 ;
			}else failRate[i] = (double)noClear[i]/challenger[i];
			fails.add(failRate[i]);
		}
		
		// �������� ���� ��. ( �������������ϰ� , �ڿ����� ��ȸ�� ���� )
		List<Double> failList = new ArrayList<Double>(fails);
		Collections.sort(failList);
		
		//System.out.println(failList.toString());
		
		int[] answer = new int[N];
		
		int index = N-1 ;
		for ( int i = 0 ; i < failList.size(); i++ ) {
				double rate = failList.get(i);
			for ( int j = failRate.length-1; j > 0 ; j-- ) {
				if ( rate == failRate[j] ) {
					answer[index] = j ;
					index--;
				}
			}
		}
		return answer;
	}

}