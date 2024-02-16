# String_Map_exception

## 作成内容
国名を指定した時にその国の首都が表示されるプログラムを組みました。  
String型のMapを作り、例外を起こしました。  

### String型のMapを作る。
``` 
public class Main {
    public static void main(String[] args) {
        Map<String, String> northEuropeMap = new HashMap<>();
        northEuropeMap.put("フィンランド", "ヘルシンキ");
        northEuropeMap.put("ノルウェー", "オスロ");
        northEuropeMap.put("スウェーデン", "ストックホルム");
        northEuropeMap.put("デンマーク", "コペンハーゲン");
        :
        //(以下省略)
    }
}
```
HashMapを使ってString型の値が出力されるようにしました。
keyには国名、valueには首都を設定しました。  

#### Mapについて
JavaのMapは、キーと値のペアを格納するデータ構造です。  
キーと値は1対1の関係であり、キーを使用して値にアクセスすることができます。  
Mapは、キーが一意であることを保証します。  
JavaのMapは、java.utilパッケージに含まれています。  

JavaのMapインターフェースは、次の主要な実装を提供しています。  
1. HashMap  
   ハッシュテーブルを使用して実装されたMapです。  
   キーと値のペアがハッシュ値に基づいて格納され、追加、削除、検索が高速に行えます。  
   ただし、イテレーションの順序は保証されません。  
2. TreeMap  
   キーの自然な順序でキーをソートし、それに従って値を保持します。  
   キーがソートされた状態で保持されるため、イテレーションした際にはキーがソートされた状態で取得できます。  
3. LinkedHashMap  
   キーと値の順序を保持します。  
   追加された順序やアクセスされた順序でエントリを保持することができます。　　
     
これらのMap実装は、異なる使用ケースや要件に応じて選択することができます。  
例えば、データの追加や検索が頻繁に行われる場合はHashMapが適していますが、ソートされたキーが必要な場合はTreeMapを使用すると便利です。  

### Mapに格納された値を全出力表示させる。
```
for (String key : northEuropeMap.keySet()) {
                //(以下省略)
                    System.out.println(key + "の首都は" + northEuropeMap.get(key));
                }
```

### 指定した条件に対して例外を発生させる
```
try {
            for (String key : northEuropeMap.keySet()) {
                if (key.equals("デンマーク")) {
                    throw new Exception();
                } else {
                    System.out.println(key + "の首都は" + northEuropeMap.get(key));
                }
            }
        } catch (Exception e) {
            System.out.println("エラー: 指定したキーでの検索は禁止されています。");
        }
```
try-catch構文を使用しました。  
