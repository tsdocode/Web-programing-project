$().ready(function() {
	$("#validate_reg_form").validate({
		onfocusout: false,
		onkeyup: false,
		onclick: false,
		rules: {
			"username": {
				required: true,
				maxlength: 15
			},
			"password": {
				required: true,
				minlength: 8
			},
            "email": {
				required: true,
				email:true,
			},

			"re-password": {
				required: true,
				equalTo: "#pass",
				minlength: 8
			}
		}
	});
});

$().ready(function() {
	$("#validate_login_form").validate({
		onfocusout: false,
		onkeyup: false,
		onclick: false,
		rules: {
			"email": {
				required: true,
				email:true,
				maxlength:50,
				minlength:5
			},
			"password": {
				required: true,
				minlength: 8,
				maxlength: 30
			}
		}
	});
});