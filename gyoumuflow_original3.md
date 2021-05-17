```uml
@startuml
user -> Webserver : 詳細表示要求
Webserver -> DBserver : 詳細表示要求
DBserver -> DBserver : 詳細表示処理
DBserver -> Webserver : 詳細表示
Webserver -> user : 詳細表示
@enduml
```
