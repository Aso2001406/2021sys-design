```uml
@startuml
[*] -> 商品一覧
商品一覧 : do/商品一覧を表示
商品一覧 -> 商品詳細 : 商品をクリック
商品詳細 -> 商品一覧 : 前の画面へ戻るをクリック/商品一覧をクリック
商品詳細 -> カート : カートの中をクリック
商品詳細 -> 登録情報 : 登録情報をクリック
商品詳細 : do/商品説明を表示
商品一覧 -> カート : カートの中をクリック
カート -> 商品一覧 : 商品一覧をクリック
カート -> 登録情報 : 登録情報をクリック
カート : do/カートの中の商品を表示
商品一覧 -> 登録情報 : 登録情報をクリック
登録情報 -> 商品一覧 : 商品一覧をクリック
登録情報 -> カート : カートの中へをクリック
登録情報 : do/登録情報を表示
@enduml
```