$(function(){
	
	function changeButtonColor()
	{
		$("#loginSubmit").mouseover(function(){
			if($(this).hasClass("btn-primary")){
				$(this).removeClass("btn-primary");
				$(this).addClass("btn-secondary");
			}
		});
	}
	
	function changeLogoColor()
	{
		$("#logo").mouseover(function(){
			$(this).css({
				color:"red"
			});
		});
		
		$("#logo").mouseout(function(){
			$(this).css({
				color:"white"
			});
		});
	}
	
	function init(){
		changeButtonColor();
		changeLogoColor();
	}
	
	init();
});