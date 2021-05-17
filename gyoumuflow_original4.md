```uml
@startuml
user -> Webserver : お気に入り登録
Webserver -> DBserver : 登録処理
DBserver -> DBserver : 登録処理
DBserver -> Webserver : お気に入り登録結果
Webserver -> user : お気に入り登録結果
@enduml
```
