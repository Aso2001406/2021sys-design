```uml
@startuml
user -> Webserver : 住所登録
Webserver -> DBserver : 住所登録
DBserver -> DBserver : 登録処理
DBserver -> Webserver : 登録結果
Webserver -> user : 登録結果
@enduml
```
