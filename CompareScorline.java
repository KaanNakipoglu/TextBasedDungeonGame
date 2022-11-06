import java.util.*;

    public class CompareScorline implements Comparator<ScoreLine> {
        @Override
        public int compare(ScoreLine sl1, ScoreLine sl2) {
            return Integer.compare(sl2.getExperience(), sl1.getExperience());
        }
}
