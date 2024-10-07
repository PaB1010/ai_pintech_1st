import React, { CSSProperties } from "react";
import { addSyntheticLeadingComment } from "typescript";

export type AdressProps = {
  address: string;
};

const Address = (props: AdressProps) => {
  const AddressStyle: CSSProperties = {
    color: "#999fa9",
    fontSize: "12px",
    lineHeight: "20px",
  };
  return <span style={AddressStyle}>{props.address}</span>;
};

export default Address;
