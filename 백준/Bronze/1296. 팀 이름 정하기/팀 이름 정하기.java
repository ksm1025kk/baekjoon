

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String yeonduName = br.readLine();
		int count = Integer.parseInt(br.readLine());
		String[] teamNames = new String[count];

		for (int i = 0; i < count; i++) {
			teamNames[i] = br.readLine();
		}

		String bestTeamName = null;
		int bestScore = -1;

		for (String teamName : teamNames) {
			int L = 0, O = 0, V = 0, E = 0;

			String combinedName = yeonduName + teamName;
			for (int i = 0; i < combinedName.length(); i++) {
				char c = combinedName.charAt(i);
				if (c == 'L') L++;
				else if (c == 'O') O++;
				else if (c == 'V') V++;
				else if (c == 'E') E++;
			}

			int score = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;

			if (score > bestScore || (score == bestScore && (bestTeamName == null || teamName.compareTo(bestTeamName) < 0))) {
				bestScore = score;
				bestTeamName = teamName;
			}
		}

		bw.write(bestTeamName);
		bw.flush();
		br.close();
		bw.close();
	}
}
