function addCustomer(){
    let tel = $("#C_Tel").val();

    if(tel == ""){
        alert("연락처는 필수 입력입니다.");
        return;
    }
    $("#writeForm").submit();
}

function deleteCustomer(){
    $("#deleteForm").submit();
}