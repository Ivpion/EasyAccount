має робити наступне:
* добавляти, видаляти, редагувати постачальників
* добавляти, видаляти, редагувати товари(від постачальників)
* добавляти, видаляти, редагувати наявні товари на складі
* форма пошуку товарів, що наявні у постачальників
* форма пошуку наявних товарів на складі


## Supplier
* id
* name
* city
* discount

## Goods
* id
* name
* category_id

## Goods category
* id
* name

## Goods storage
* id
* goods_id
* count
* price

## Suppliers goods store
* id
* supplier_id
* goods_id
* price

