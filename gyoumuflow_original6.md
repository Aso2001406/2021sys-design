```uml
@startuml
user -> Webserver : 住所編集
Webserver -> DBserver : 住所編集
DBserver -> DBserver : 編集処理
DBserver -> Webserver : 編集結果
Webserver -> user : 編集結果
@enduml
```
