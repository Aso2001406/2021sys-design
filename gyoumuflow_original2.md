```uml
@startuml
user -> Webserver : 並び替え
Webserver -> DBserver : 並び替え処理
DBserver -> DBserver : 並び替え処理
DBserver -> Webserver : 並び替え結果
Webserver -> user : 並び替え結果
@enduml
```
