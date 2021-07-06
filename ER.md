```startuml
@startuml

!define MASTER_MARK_COLOR Orange
!define TRANSACTION_MARK_COLOR DeepSkyBlue

package "ECサイト" as target_system{
 
  
  entity "購入テーブル" as purchase <d_purchase> <<T,TRANSACTION_MARK_COLOR>> {
    + order_id [PK]
    --
    customer_code
    purchase_date
    total_price
  }
  
  entity "購入詳細テーブル" as purchase_detail <d_purchase_detail> <<T,TRANSACTION_MARK_COLOR>> {
   + order_id [PK]
   + detail_id [PK]
   --
   item_code
   price
   num
}

@enduml
```
