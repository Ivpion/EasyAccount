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
* supplier_id (?)

## Suppliers goods store
* supplier_id
* goods_id
* price

supplier_id       goods_id       price
       1             1              20
       2             1              22
       2             2              40
       1             2              36

