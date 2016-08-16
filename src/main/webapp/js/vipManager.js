$(function () {
    //$.ajax({
    //    data: "id=" + 1,
    //    type: "GET",
    //    dataType: 'json',
    //    url: "../vips/getVip",
    //    error: function () {
    //        alert("出错了！！:");
    //    },
    //    success: function (data) {
    //        alert("success:" + data.msg);
    //        $("#content-pane").html(data.msg);
    //    }
    //});
    initTable();
})


function initTable() {
    var width = $("#content-pane").width() - 5;
    $("#vip-table").jqGrid({
        url: '../vips/findAll',
        datatype: "json",
        mtype: "POST",
        colNames: ['id', '姓名', '性别', '卡号', '电话', '生日', '账户', '车牌号', '操作'],
        colModel: [{name: 'id', align: 'center', sortable: true},
            {name: 'name', align: 'center', sortable: true},
            {name: 'gender', align: 'center', sortable: true},
            {name: 'idNumber', align: 'center', sortable: true},
            {name: 'phone', align: 'center', sortable: true},
            {name: 'birthday', align: 'center', sortable: true},
            {name: 'account', align: 'center', sortable: true},
            {name: 'plateNumber', align: 'center', sortable: true},
            {
                name: '', align: 'center', sortable: true, formatter: function (cellvalue, options, rowDate) {
                var vipId = rowDate['id'];

                return '<a onclick="deletevip(\'' + vipId + '\')" style="color: blue">删除</a>';
            }
            },
        ],
        rowNum: 500,
        autoencode: true,
        sortname: 'id',
        scroll: true,
        viewrecords: false,
        sortorder: "desc",
        loadonce: true,
        jsonReader: {
            root: "vipList",
            repeatitems: false,
            id: "0"
        },
        caption: "会员一览",
        height: 'auto',
        width: width,
        gridComplete: function () {
        }
    });
}

function deletevip(vipId) {




    $.ajax({
        data: "vipId=" + vipId,
        type: "POST",
        dataType: 'json',
        url: "../vips/deleteVip",
        error: function () {
            alert("出错了！！:");
        },
        success: function (data) {
            if (data.msg == "success") {
                reloadVipTable();//重新加载数据
            }
        }
    });

}

function reloadVipTable() {
    alert(111);
    $("#vip-table").jqGrid('setGridParam', {
        url:'../vips/findAll',
        datatype:'json',
        //postData:{
        //
        //}
    }).trigger("reloadGrid");
}