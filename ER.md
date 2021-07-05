```startuml
@startuml

!define MASTER_MARK_COLOR Orange

package "ECサイト" as target_system{
  entity "顧客マスタ" as customer <m_customers> <<M,MASTER_MARK_COLOR>> {
    + customer_code [PK]
    --
    pass
    name
    address
    tel
    mail
    del_flag
    reg_date
  }
  
  entity "カテゴリマスタ" as category <m_category> <<M,MASTER_MARK_COLOR>> {
    + category_id [PK]
    --
    name
    reg_class
  }
}

@enduml
```
