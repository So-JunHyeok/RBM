
function go_submit(){
    $("#searchForm").submit();
}



function setCurrentPageNo(obj, move){
    let reqPageNo = 1;
    let searchForm = $("#searchForm");

    if(move == 'num'){
        reqPageNo = $(obj).text();
    }
    else if(move == 'next'){
        reqPageNo = $(obj).data("value");

    }
    else if(move == 'end'){
        reqPageNo = $(obj).data("value");

    }
    else if(move == 'start'){
        reqPageNo = $(obj).data("value");

    }
    else if(move == 'prev'){
        reqPageNo = $(obj).data("value");

    }

    searchForm.append($('<input>',{type:'hidden', name:'currentPageNo', value:reqPageNo}))
    go_submit();
}