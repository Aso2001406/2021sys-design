```uml
@startuml
webサーバー -> DBサーバー : 合計金額表示要求
DBサーバー -> DBサーバー : 金額集計処理
DBサーバー -> webサーバー : 合計金額表示
webサーバー -> ユーザー : 合計金額表示
@enduml
```
