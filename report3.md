```uml
@startuml
start
:weather;
if(weather=0)then(true)
 :快晴です;
else if(weather=1)then(true)
 :曇りです;
else if(weather=2)then(true)
 :雨です;
else
 :不明です;
endif
stop
@enduml
```
