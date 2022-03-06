$.ajax({
    type:'post',
    url:'/usercontroller/user',
    data:{username: data.username}
    // success:function (result){
    //     if (result===0) window.location.reload()
    //     else layer.msg('失败'+result.msg)
    // }
})