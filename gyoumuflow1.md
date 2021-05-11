```uml
@startuml
ユーザー -> webサーバー : 商品検索
webサーバー -> DBサーバー : 検索処理
DBサーバー ->   DBサーバー : 検索処理
DBサーバー -> webサーバー : 検索結果
webサーバー -> ユーザー : 検索結果
@enduml
```
