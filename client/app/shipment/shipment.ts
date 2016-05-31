export class Shipment {
  id: number;
  shipmentNumber: string;
  receiptName: string;
  receiptAddress: string;
  receiptContactNumber: string;
  shipmentProvider: ShipmentProvider;
  cost: number;
  status: string;
}

export class ShipmentProvider {
  providerId: number;
  name: string;
  address: string;
  contactNumber: string;
  comment: string;
}
