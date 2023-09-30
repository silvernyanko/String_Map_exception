package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> northEuropeMap = new HashMap<>();
        northEuropeMap.put("フィンランド", "ヘルシンキ");
        northEuropeMap.put("ノルウェー", "オスロ");
        northEuropeMap.put("スウェーデン", "ストックホルム");
        northEuropeMap.put("デンマーク", "コペンハーゲン");

        try {
            for (String key : northEuropeMap.keySet()) {
                if (key.equals("デンマーク")) {
                    throw new Exception();
                } else {
                    System.out.println(key + "の首都は" + northEuropeMap.get(key));
                }
            }
        } catch (Exception e) {
<<<<<<< HEAD
            System.out.println("エラー: 指定したキーでの検索は禁止されています。");
=======
            System.out.println("エラー: インデックスが範囲外です");
>>>>>>> origin/main
        }
    }
}

<<<<<<< HEAD
=======


//課題のソースコードをGitHubにpushしてレビューを依頼する
>>>>>>> origin/main
