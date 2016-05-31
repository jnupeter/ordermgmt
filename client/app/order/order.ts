export class Order {
  orderId: number;
  customerId : number;
  orderItems: OrderItem[];
  comment: string;
  createDate: Date;
  shipmentDate: Date;
  uploadIDDate: Date;
  receivedDate: Date;
  paidDate: Date;
  status : number;
}

export class OrderItem {
  orderItemId: number;
  orderId: number;
  productId: number;
  productName: string;
  quantity: number;
  unit: string;
  purchasePrice: number;
  selloutPrice: number;
}
