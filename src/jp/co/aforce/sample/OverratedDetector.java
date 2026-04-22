package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

class Player {
    String name;
    double avg;      // 打率
    int wrcPlus;     // wRC+
    double war;      // WAR
    
    Player(String name, double avg, int wrcPlus, double war) {
        this.name = name;
        this.avg = avg;
        this.wrcPlus = wrcPlus;
        this.war = war;
    }
}

public class OverratedDetector {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        
        // データの投入
        players.add(new Player("K_ZONO", 0.296, 95, 1.5));      // 打率は高いが貢献が低い
        players.add(new Player("IZUGUCHI", 0.275, 125, 6.5)); // 効率の鬼
        players.add(new Player("MURABAYASHI", 0.241, 92, 3.8)); // 低打率でも高貢献
        players.add(new Player("NAKANO", 0.232, 85, 2.5));      // 24年のスランプ時
        
        System.out.println("=== セイバーメトリクス異常検知開始 ===");
        
        for (Player p : players) {
            checkOverrated(p);
        }
    }

    public static void checkOverrated(Player p) {
        // ロジック：打率が .280 以上なのに wRC+ が 100 未満、または WAR が低い場合を「過大評価」とする
        if (p.avg >= 0.280 && p.wrcPlus < 100) {
            System.out.printf("[WARNING] %s は過大評価の疑いがあります。\n", p.name);
            System.out.printf(" >> 打率: %.3f (見た目よし) / wRC+: %d (中身スカスカ)\n", p.avg, p.wrcPlus);
        } else if (p.war > 5.0) {
            System.out.printf("[EXCELLENT] %s は真の貢献者です。WAR: %.1f\n", p.name, p.war);
        } else {
            System.out.printf("[OK] %s は適正評価、もしくは守備職人枠です。\n", p.name);
        }
    }
}