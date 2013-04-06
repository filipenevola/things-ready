jQuery.noConflict();
jQuery(document).on('keypress', '.formEnterBehavior', function(e) {
	if (e.keyCode == 13) {
		e.preventDefault();
		jQuery('.pressEnterBehavior').click();
	}
});

jQuery(document).ready(function() {
	jQuery('.blockCutCopyPaste').bind("cut copy paste", function(e) {
		e.preventDefault();
	});
});