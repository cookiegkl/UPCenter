$(function() {
    $("#submitForm").validate({
        focusCleanup:true,
        focusInvalid:false,
        ignore:'',
        showText:true,
        rules:{
            datacode:{
                required:true,
                maxlength:15
            },
            dataname:{
                required:true,
                maxlength:30
            },
            typeId:{
                required:true
            },
            sort:{
                required:true,
                min:0,
                max:999
            }
        },
        messages:{
            datacode:{
                required:"字典编码不允许为空！",
                maxlength:"最大长度不能长于15位！"
            },
            dataname:{
                required:"字典名称不允许为空！",
                integer:"最大长度不能长于30位！"
            },
            typeId:{
                required:"字典类型不允许为空！"
            },
            sort:{
                required:"排序值不允许为空！",
                min:"排序值不能小于0",
                max:"排序值不能大于999"
            }
        }
    });
    $(".submit").on("click",function() {
        var options={
            beforeSubmit:function() {
                var check=$.fn.validForm();
                if(!check){
                    return false;
                }
                showTipsDialog("操作提示","服务器处理中，请稍候...");
            },
            success:function(rsp) {
                if(rsp.code=='1000'){
                    showTipsDialog("保存成功","数据保存成功！",function() {
                        closeDialog();
                        window.close();
                    });
                    if(window.opener){
                        opener.search();
                    }
                }else{
                    var msg=rsp.msg?rsp.msg:"数据保存失败，请联系管理员或稍后再试！";
                    showTipsDialog("错误信息",msg,true);
                }
            },
            error:function(rsp) {
                if(rsp.status==404||rsp.status=='404'){
                    showTipsDialog("错误信息","数据保存失败，无法访问目标地址！",true);
                }else{
                    showTipsDialog("错误信息","数据保存失败，请联系管理员或稍后再试！",true);
                }
            }
        };
        $sessionAjaxSubmit($("#submitForm"),options);
    });
    $('#submitForm').on('change','select[name="typeId"]',function(){
        console.log("cc");
        var datatype=$(this).find('option:selected').attr('data-type'),tdDatavalue=$('#td_datavalue'),html=[];
        if(datatype=='N'){
            tdDatavalue.css('padding','8px');
            html.push('无数据');
        }else if(datatype=='B'){
            tdDatavalue.css('padding','4px');
            html.push('<label class="radio-inline">');
            html.push('<input type="radio" name="datavalue" value="Y">是');
            html.push('</label>');
            html.push('<label class="radio-inline">');
            html.push('<input type="radio" name="datavalue" value="N" checked="checked">否');
            html.push('</label>');
        }else if(datatype=='T'){
            tdDatavalue.css('padding','4px');
            html.push('<input name="datavalue" data-type="text" class="form-control input-sm myspan6" type="text" placeholder="字典值" value="">');
        }else if(datatype=='I'){
            tdDatavalue.css('padding','4px');
            html.push('<input name="datavalue" data-type="int" class="form-control input-sm myspan6" type="text" placeholder="字典值" value="">');
        }else if(datatype=='F'){
            tdDatavalue.css('padding','4px');
            html.push('<input name="datavalue" data-type="float" class="form-control input-sm myspan6" type="text" placeholder="字典值" value="">');
        }
        console.log(html.join('\r\n'));
        tdDatavalue.html(html.join('\r\n'));
    });
});

