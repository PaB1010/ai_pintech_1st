import React from "react";
import { CSSProperties } from "react";

export type CategoryListProps = {
  categories: string;
};

const CategoryList = (props: CategoryListProps) => {
  const CategoryStyle: CSSProperties = {
    color: "#999fa9",
    fontSize: "12px",
    fontWeight: "bold",
    lineHeight: "20px",
  };
  return <span style={CategoryStyle}>{props.categories}</span>;
};

export default CategoryList;
