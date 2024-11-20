

function ProductCard(props){
    const cardStyle = {
        backgroundColor : props.inStock ? "lightgreen" : "lightcoral",
        padding : '10px',
        margin : '10px',
        borderRadius: '5px'
    }
    return(
        <div style={cardStyle}>
            <h2>제품명 : {props.productName}</h2>
            <p>가격 : {props.price}원</p>
            <p>설명 : {props.description}</p>
            <p>재고 상태 : {props.inStock ? "재고 있음" : "재고 없음"}</p>
        </div>
    )
}


ProductCard.defaultProps = {
    productName: "상품명 없음",
    price: "가격 정보 없음",
    description: "설명 없음",
    inStock: false,
};

export default ProductCard;