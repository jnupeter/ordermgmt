-- Customer
insert into customer(name, contact_number, address, id_number) values('阮芳', '13751878861', '广东广州黄埔区丰乐南路88号大院A11栋1203房', '1234567890')

-- Shipment Provider
insert into shipment_provider(name, address, contact_number, comment) values('King & Kong', '88 Pineland Centre', '0731990005', 'with King Freight')

-- Shipment
insert into shipment(shipment_number, receipt_name, receipt_address, receipt_contact_number, shipment_provider_id, cost) values('KF652352', '阮芳', '广东广州黄埔区丰乐南路88号大院A11栋1203房', '13751878861', 1, 15.00)

-- Product
insert into product(name, specification, normal_purchase_price, suggest_sale_price, notes) values('product1', 'spec1', '5.00', '25.00', 'chemical warehouse')
insert into product(name, specification, normal_purchase_price, suggest_sale_price, notes) values('product2', 'spec2', '3.00', '20.00', 'terrywhite')

-- Order
insert into tborder(customer_id, comment, status) values(1, 'first order', 0)

-- OrderItem
insert into order_item(order_id, product_id, quantity, unit, purchase_price, sellout_price) values(1, 1, 1,'bottle', 5.50, 30.00)
insert into order_item(order_id, product_id, quantity, unit, purchase_price, sellout_price) values(1, 2, 3,'bottle', 2.45, 15.00)

-- order_shipments
insert into tborder_shipments(tborder_id, shipments_id) values(1, 1)