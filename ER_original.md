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
 
 entity "購入詳細テーブル" as purchase_detail <d_purchase> <<T,TRANSACTION_MARK_COLOR>> {
  + detail_id [PK]
  + order_id [PK]
  --
  item_code
  price
  num
 }
 
 entity "顧客マスタ" as customers <m_customers> <<M,MASTER_MARK_COLOR>> {
  + customer_code [PK]
  + pass [PK]
  --
  name
  address
  mail
  del_flag
  reg_date
 }
 
 entity "カテゴリマスタ" as category <m_category> <<M,MASTER_MARK_COLOR>> {
  + category_id [PK]
  --
  name
  reg_date
 }
 
 entity "商品" as items <m_items> <<M,MASTER_MARK_COLOR>> {
  + item_code
  --
  item_name
  price
  category_id
  image
  detail
  del_flag
  reg_date
 }
 
 purchase |o-ri-o{ purchase_detail
}

@enduml
```
