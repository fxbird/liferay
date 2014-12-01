function getNodeArray(tree) {
	var array = new Array()
	tree.eachChildren(function(node) {
		if (node.isChecked()) {
			array.push({
				id : node.get('id'),
				text : node.get('label')
			})
		}
	}, true)

	//alert(array.length+" nodes selected")
	return array;
}

function fillDdlist(ddlistId, valueArray) {
	if (valueArray.length > 0) {
		$.each(valueArray, function(idx, ele) {
			//alert(existInOption(ddlistId,ele['id']))
			if (!existInOption(ddlistId, ele['id'])) {
				$('#' + ddlistId).append(
						$("<option value='" + ele['id'] + "'>" + ele['text']
								+ "</option>"))
			}
		})
	}

}

/**
 * 数组中是否存在某值
 * @param value
 * @param array
 * @returns {boolean}
 */
function existInArray(value, array) {
	var exist = false;
	$.each(array, function(idx, ele) {
		alert(ele['id'])
		if (ele['id'] == value) {
			exist = true;
		}
	})

	return exist;
}

/**
 * 下拉列表中是否存在某个项了，按值查询
 * @param id
 * @param value
 * @returns {boolean}
 */
function existInOption(id, value) {
	var options = $('#' + id + " option")
	var exist = false
	if (options.length == 0) {
		return false;
	} else {
		options.each(function(idx, ele) {
			if ($(this).val() == value) {
				exist = true
			}
		})

		return exist
	}
}

function HashMap() {
	/** Map 大小 **/
	var size = 0;
	/** 对象 **/
	var entry = new Object();

	/** 存 **/
	this.put = function(key, value) {
		if (!this.containsKey(key)) {
			size++;
		}
		entry[key] = value;
	}

	/** 取 **/
	this.get = function(key) {
		if (this.containsKey(key)) {
			return entry[key];
		} else {
			return null;
		}
	}

	/** 删除 **/
	this.remove = function(key) {
		if (delete entry[key]) {
			size--;
		}
	}

	/** 是否包含 Key **/
	this.containsKey = function(key) {
		return (key in entry);
	}

	/** 是否包含 Value **/
	this.containsValue = function(value) {
		for ( var prop in entry) {
			if (entry[prop] == value) {
				return true;
			}
		}
		return false;
	}

	/** 所有 Value **/
	this.values = function() {
		var values = new Array(size);
		for ( var prop in entry) {
			values.push(entry[prop]);
		}
		return values;
	}

	/** 所有 Key **/
	this.keys = function() {
		var keys = new Array(size);
		for ( var prop in entry) {
			keys.push(prop);
		}
		return keys;
	}

	/** Map Size **/
	this.size = function() {
		return size;
	}
}

/**
 * 下拉列表添加一个项
 * @param ddlistId
 * @param value
 * @param text
 */
function addOption(ddlistId, value, text) {
	if (!existInOption(ddlistId, value)){
		$('#' + ddlistId).append($("<option value='" + value + "'>" + text + "</option>"))
	}
	
}


function getCheckedRowData(containerId) {
	var dataArr = new Array()
	$('#' + containerId + " tr td :checkbox").each(function() {
		if ($(this).prop('checked')) {
			var rowArr = new Array()
			dataArr.push(rowArr)
			$(this).parent().parent().children().each(function(idx, ele) {
				if (idx == 0) {
					rowArr.push($(this).find(':input').val())
				} else {
					rowArr.push($.trim($(this).text()))
				}
			})
		}
	})

	return dataArr
}

/**
 * 下拉列表中删除选择的项
 * @param ddlistId
 */
function removeSelectedOption(ddlistId) {
	$.each($('#' + ddlistId + ' option:selected'), function() {
		$(this).remove()
	})
}

/**
 * 选中下拉列表的所有项
 * @param id
 */
function selectAllOption(id) {
	$('#' + id + ' option').each(function() {
		$(this).prop('selected', true)
	})
}

/**
 * 下拉列表是否有子项，是否不为空
 * @param id
 * @returns {boolean}
 */
function hasOption(id) {
	return $('#' + id + ' option').length > 0

}

/**
 * 清空下拉列表
 * @param selectId
 */
function clearOptions(selectId){
	/* $.each($('#'+selectId+" :option"),function(idx,ele){
		$(ele).remove()
	}) */
	$('#'+selectId).empty()
}

/**
 * 下拉列表是否有选中的项
 * @param id
 * @returns {boolean}
 */
function isSelectOption(id) {
	return $('#' + id + ' option:selected').length > 0
}

/**
 * 下拉列表选中的项的个数
 * @param id
 * @returns {Number|jQuery.length|*|jQuery}
 */
function getOptionLength(id) {
	return $('#' + id + ' option').length
}

/**
 * 获得下拉列表选中项的值，适用于单选
 * @param id
 * @returns {*|jQuery}
 */
function getSelectValue(id) {
	return $('#' + id).val()
}

/**
 * 将一个下拉列表中选择的项移到另一个下拉列表中
 * @param sourceSelectId
 * @param targetSelectId
 */
function moveOption(sourceSelectId, targetSelectId) {
	var souObj = $('#' + sourceSelectId)
	var tarObj = $('#' + targetSelectId)

	$.each(getSelectedOption(sourceSelectId), function(idx, opt) {
		addOption(targetSelectId, opt.val(), opt.text())
		opt.remove()
	})

}

/**
 * 获得选择的所有Option数组
 * @param selectId
 * @returns {Array}
 */
function getSelectedOption(selectId) {
	var arr = new Array()
	$.each($('#' + selectId + " :selected"), function(idx, opt) {
		arr.push($(this))
	})

	return arr
}

/**
 * 选中下拉列表的所有项
 * @param selectId
 */
function selectAll(selectId) {
	$('#' + selectId + ' option').each(function() {
		$(this).attr('selected', true)
	})
}

//only for ztree
/**
 * 树是否有选中的节点
 * @param treeId
 * @returns {boolean}
 */
function isChecked(treeId) {
	return getCheckedNodes(treeId).length > 0

}

//only for ztree
/**
 * 获得树选中的节点数组
 * @param treeId
 * @param onlyLeaf 是否只统计叶子节点
 * @returns {Array}
 */
function getCheckedNodes(treeId,onlyLeaf) {
	var treeObj = $.fn.zTree.getZTreeObj(treeId)
	var checkedNodes = treeObj.getCheckedNodes(true)
	var arr = new Array()
	$.each(checkedNodes, function(idx, ele) {
		if (onlyLeaf) {
			if ( !ele['isParent']){
				arr.push({
					id : ele['id'],
					name : ele['name']
				})
			}
		}else{
			arr.push({
				id : ele['id'],
				name : ele['name']
			})
		}
	})

	return arr
}

function getCheckedNodesFreeDup(treeId,onlyLeaf) {
	var treeObj = $.fn.zTree.getZTreeObj(treeId)
	var checkedNodes = treeObj.getCheckedNodes(true)
	var arr = new Array()
	$.each(checkedNodes, function(idx, ele) {
		if (onlyLeaf) {
			if ( !ele['isParent']){
				arr.push({
					id : ele['id'],
					name : ele['name']
				})
			}
		}else{
			arr.push({
				id : ele['id'],
				name : ele['name']
			})
		}
	})
	
	return arr
}



function getLoginUrl(){
	return '/haier-rsp-portlet/html/message/error.jsp?type=session&locale='+'${locale}';
}

/**
 * 以ajax方式检验是否登录了
 */
function checkLogin(){
	$.ajax({
        dataType: "json",
        url: themeDisplay.getPathMain()	+ '/portal/haier/ajax',
        data : {
        		dataType : 'check_if_login'
        	},
        success: function(data){
        	if (data['isLogin']){
        		doLogin()
        	}else{
        		doUnlogin()
        	}
        }
    });
}

function doLogin(){
	
}

function doUnlogin(){
	document.location.href = getLoginUrl()
}

/**
 * 按值选中下拉列表中的某个项
 * @param id
 * @param value
 */
function selectOption(id,value){
	$('#'+id+' option').each(function(idx,ele){
		if (ele['value']==value){
			$(ele).prop('selected','selected')
		}
	})
	
}

/**
 * 让文本框只能输入数字
 * @param inputObj
 */
function inputOnlyNum(inputObj){
	inputObj.value = inputObj.value.replace(/[^\d]/gi,'')
}

/**
 * 文本框是否为空
 * @param id
 * @param trimFlag 是否删除值的两边空白再比较
 * @returns {boolean}
 */
function isEmptyInput(id,trimFlag){
	if (trimFlag){
		return $('#'+id).val()=='' 
	} else {
		return $('#'+id).val()==''
	}
}

function getCellValues(tableId,startRowNum,colNumArr){
	var values = new Array()
	$('#'+tableId).find('tr').each(function(idx,rowObj){
		if (!(idx>=startRowNum)){
			return
		}
		
		var rowArr=new Array()
		values.push(rowArr)
		$(rowObj).find('td').each(function(idx2,cellObj){
			if (!existInArray(colNumArr,idx2)){
				return
			}
			
			//alert($(cellObj).find('input')[0].value)
			if ($(cellObj).find('input')[0]){
				rowArr.push($(cellObj).find('input')[0].value)
			}
		})
		
	})
	
	return values
	
}

function existInArray(arr,compareVlu){
	for (var i=0;i<arr.length;i++){
		if (arr[i]==compareVlu){
			return true
		}
	}
	
	return false
}

function validateIntNum(obj){
//    event=event||window.event;
//    var keyCode=window.event?event.keyCode:event.which;
//    return keyCode>=48&&keyCode<=57||keyCode==8;

    var oldValue=obj.value
    obj.value = oldValue.replace(/\D+/ig,'')
    //alert(obj.value)
}



//判断chrome内核的360
function isChrome360() {
    if( navigator.userAgent.toLowerCase().indexOf('chrome') > -1 ) {
        var desc = navigator.mimeTypes['application/x-shockwave-flash'].description.toLowerCase();
        if( desc.indexOf('adobe') > -1 ) {
            return true;
        }
    }
    return false;
}
	

//判断浏览器
function isAllowBrowser(id){
	var userAgent = navigator.userAgent.toLowerCase(); 
      // Figure out what browser is being used 
      jQuery.browser = { 
        version: (userAgent.match( /.+(?:rv|it|ra|ie|chrome)[\/: ]([\d.]+)/ ) || [])[1], 
        safari: /webkit/.test( userAgent ), 
        opera: /opera/.test( userAgent ), 
        msie: /msie/.test( userAgent ) && !/opera/.test( userAgent ), 
        trident: /trident/.test(userAgent),
        mozilla: /mozilla/.test( userAgent ) && !/(compatible|webkit)/.test( userAgent ), 
        chrome: /chrome/.test( userAgent )
      };
      
  	var versionNum = jQuery.browser.version.split(".");
	
     if(!((jQuery.browser.msie && jQuery.browser.trident) || (jQuery.browser.mozilla  && Number(versionNum[0]) >= 6) || (jQuery.browser.chrome && Number(versionNum[0]) >= 15)) || isChrome360()){
        $( "#"+id ).fadeIn(1500);
      }else if((jQuery.browser.chrome && (navigator.userAgent.indexOf('Maxthon')>-1)) || (jQuery.browser.chrome && navigator.userAgent.indexOf('MetaSr')>-1)){
    	  $( "#"+id ).fadeIn(1500);
      }else if(jQuery.browser.chrome && (navigator.userAgent.indexOf('BIDUBrowser')>-1)){
    	  $( "#"+id ).fadeIn(1500);
     }else if((jQuery.browser.msie && jQuery.browser.trident) && (navigator.userAgent.indexOf('QQBrowser')>-1)){
    	 $( "#"+id ).fadeIn(1500);
     }else{
    	 $( "#"+id ).hide();
     }	
}

/**
 * 
 * @param arry
 */
function initActiveDQText(sitePath,arry){
	var activeDqHtml='<p><img src="'+themeDisplay.getPathThemeImages()+'/haier_images/home.png" class="home-icon" />'+sitePath+'';
	for(var i=0; i < arry.length; i++){
		if(i==0){
			activeDqHtml += '<a href="javascript:void(0)" >'+arry[i]+'</a> <i> &gt; </i> ';
		}else{
			if(i==arry.length-1){
				activeDqHtml += '<span>'+arry[i]+'</span>';
			}else{
				activeDqHtml += '<span>'+arry[i]+'</span><i> &gt; </i>';
			}
		}
	}
	activeDqHtml+='</p>';
	$(".active_dq").html(activeDqHtml);
}

/**
 * @param form 要加验证的form document.formName|$("#formId").get(0)
 * @param fieldsAry 要验证filed的数组 格式[{name:'filedName1',required:true,requiredStr:'验证消息',minLength:8,minLengthStr:'验证消息'},{name:'filedName2',required:true,requiredStr:'验证消息'}]
 * @param userDefined 自定义验证 格式[{name:'自定义验证名1',strings:'提示消息',rules:function(val, fieldNode, ruleValue){验证方法}}]
 */
var globalHaierFormvalidator = null;
function haierFormValidator(form,fieldsAry,userDefined){
	if(globalHaierFormvalidator){
		globalHaierFormvalidator.resetAllFields();
	}
	AUI().use('aui-form-validator','node',function(Y){
		var validatorStrings = {};
		var validatorRules = {};
		if(userDefined){
			Y.each(userDefined,function(item, index, collection){
				validatorStrings[item.name]=item.strings;
				validatorRules[item.name]=item.rules;
			})
		}
		
		if(userDefined && userDefined.length > 0){
			Y.mix(
				YUI.AUI.defaults.FormValidator.STRINGS,
				validatorStrings,
				true
			);
			
			Y.mix(
				YUI.AUI.defaults.FormValidator.RULES,
				validatorRules,
				true
			);
		}	
		var rules = {};
		var fieldStrings={};
		Y.each(fieldsAry,function(item, index, collection){
			rulesTemp = {};
			fieldStringsTemp = {};
			for(var key in item){
				if(key != "name" && (key.lastIndexOf("Str")+3)!=key.length){
					rulesTemp[key] = item[key];
					fieldStringsTemp[key] = item[(key+"Str")]||'';
				}
			}
			rules[item.name]= rulesTemp;
			fieldStrings[item.name]= fieldStringsTemp;
		});
		globalHaierFormvalidator = new Y.FormValidator({
		    			boundingBox: form,
		    			fieldContainer: null,
		    			validateOnInput: true,
		    			showMessages: true,
		    			validClass: '',
		    			rules: rules,
		    			fieldStrings: fieldStrings,
		    			on: {
		    				errorField: function(event) {},
		    				submitError: function(event) {
		    					var formEvent = event.validator.formEvent,
		    						errors = event.validator.errors;
		    				},
		    				submit: function(event) {
		    					var formEvent = event.validator.formEvent;
		    				},
		    				validateField: function(event) {},
		    				validField: function(event) {}
		    			}
   		});
	});
	return globalHaierFormvalidator;
}

/**
 * 切换tab页
 * @param toShowId 当前显示的tab id
 * @param toHideIds 当前隐藏的tab id序列，以逗号分隔
 */
function showTab(toShowId, toHideIds){
	$('#'+toShowId).show()
	var hideIdArr = toHideIds.split(',')
    for(var i=0;i<hideIdArr.length;i++){
        $('#'+hideIdArr[i]).hide()
    }
}


//查询海尔员工 dialog ---单选
function selectHaierUserSearchDialog(thisObj,selectUserId,selectUserName,selectDepartment,url,title,labelTitle){
	
	AUI().use('aui-dialog', 'node','liferay-util-window', function(A) {
		
		var haierUserSearchDialog = Liferay.Util.Window.getWindow({
	         title: title,
	         dialog:{
	        	 bodyContent: '',
	 			constrain2view: true,
	 			draggable: true,
	 			cache: false,
	 			modal:true,
	 			destroyOnClose: true,
	 			destroyOnHide: true,
	 			resizable: {
	 				
	 			},
	 			group: 'default',
	 			height: 400,
	 			stack: true,
	 			width: 700,
	 			uri:url
	         }
	     });
		haierUserSearchDialog.addToolbar(
	               [
	                   {
	                       label: labelTitle,
	                       on:{
	                           click:function(){
	                        	   var checkedRadio = '';
		       						var userInforSelectDialogRadios = document.getElementsByName('userInforInDialog');
		       						for(var k=0;k<userInforSelectDialogRadios.length;k++){
		       							var radio = userInforSelectDialogRadios[k];
		       							if(radio.checked){
		       								checkedRadio = radio.value;
		       							}
		       						}
		       						
		       						var tmpUserInfor = checkedRadio.split('|');
		       						var tmpUserSso = tmpUserInfor[0];
		       						var tmpUserName = tmpUserInfor[1];
		       						var tmpDepartmentId = tmpUserInfor[2];
		       						var tmpDepartmentName = tmpUserInfor[3];
		       						var tmpUserId = tmpUserInfor[4];
		       						A.one('#'+selectUserId).val(tmpUserId);
		       						A.one('#'+selectUserName).val(tmpUserName);
		       						A.one('#'+selectDepartment).val(tmpDepartmentName);
		       						haierUserSearchDialog.hide();
		       						haierUserSearchDialog.destroy();
	                           }
	                       }
	                   }
	               ]
	       );
		
		haierUserSearchDialog.plug(A.Plugin.IO, {
			uri: url,
		});
		haierUserSearchDialog.render().show();
		
	});
	
}

/**
 *添加自定义校验规则，如：
 *校验密码规则：
 *	addCustomRule('AUI()','passwordCustomRule','<liferay-ui:message key="supplier.pwd.hint2"/>',function(val, fieldNode, ruleValue) {
				var pRule=/^(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[a-z].*).{8,512}|(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[\~\!\@\#\$\%\^\&\*\(\)].*).{8,512}|(?=.*[0-9].*)(?=.*[a-z].*)(?=.*[\~\!\@\#\$\%\^\&\*\(\)].*).{8,512}|(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*[\~\!\@\#\$\%\^\&\*\(\)].*).{8,512}$/;
				return pRule.test(val);
			})
 */ 
function addCustomRule(yui,ruleName,errMsg,funcObj){
	eval(yui+".config.FormValidator.STRINGS."+ruleName+"='"+errMsg+"'")
	eval(yui+".config.FormValidator.RULES."+ruleName+"="+funcObj)
}

function setReadonly(objId){
	$('#'+objId).prop("readonly",true)
}

function setDisabled(objId){
	$('#'+objId).prop("disabled",true)
}

