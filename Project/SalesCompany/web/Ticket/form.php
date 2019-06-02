<?php

define('EMAIL_FOR_REPORTS', 'ferchoes_16@hotmail.com');
define('RECAPTCHA_PRIVATE_KEY', '@privatekey@');
define('FINISH_URI', 'http://');
define('FINISH_ACTION', 'message');
define('FINISH_MESSAGE', 'Thanks for filling out my form!');
define('UPLOAD_ALLOWED_FILE_TYPES', 'doc, docx, xls, csv, txt, rtf, html, zip, jpg, jpeg, png, gif');

define('_DIR_', str_replace('\\', '/', dirname(__FILE__)) . '/');
require_once _DIR_ . '/handler.php';

?>

<?php if (frmd_message()): ?>
<link rel="stylesheet" href="<?php echo dirname($form_path); ?>/formoid-biz-red.css" type="text/css" />
<span class="alert alert-success"><?php echo FINISH_MESSAGE; ?></span>
<?php else: ?>
<!-- Start Formoid form-->
<link rel="stylesheet" href="<?php echo dirname($form_path); ?>/formoid-biz-red.css" type="text/css" />
<script type="text/javascript" src="<?php echo dirname($form_path); ?>/jquery.min.js"></script>
<form class="formoid-biz-red" style="background-color:#1A2223;font-size:14px;font-family:'Open Sans','Helvetica Neue', 'Helvetica', Arial, Verdana, sans-serif;color:#ECECEC;max-width:480px;min-width:150px" method="post"><div class="title"><h2>Ticket</h2></div>
	<div class="element-number<?php frmd_add_class("number"); ?>" title="price"><label class="title"></label><input class="large" type="text" min="0" max="100" name="number" placeholder="price" value=""/></div>
	<div class="element-input<?php frmd_add_class("input"); ?>" title="departure"><label class="title"></label><input class="large" type="text" name="input" placeholder="departure"/></div>
	<div class="element-input<?php frmd_add_class("input1"); ?>" title="arrival"><label class="title"></label><input class="large" type="text" name="input1" placeholder="arrival"/></div>
	<div class="element-radio<?php frmd_add_class("radio"); ?>" title="class"><label class="title">Class</label>		<div class="column column1"><label><input type="radio" name="radio" value="First" /><span>First</span></label><label><input type="radio" name="radio" value="Normal" /><span>Normal</span></label></div><span class="clearfix"></span>
</div>
	<div class="element-date<?php frmd_add_class("date"); ?>" title="date"><label class="title"></label><input class="large" data-format="yyyy-mm-dd" type="date" name="date" placeholder="date"/></div>
	<div class="element-input<?php frmd_add_class("input2"); ?>" title="hour"><label class="title"></label><input class="large" type="text" name="input2" placeholder="hour"/></div>
	<div class="element-input<?php frmd_add_class("input3"); ?>" title="airline"><label class="title"></label><input class="large" type="text" name="input3" placeholder="airline"/></div>
	<div class="element-input<?php frmd_add_class("input4"); ?>" title="gate"><label class="title"></label><input class="large" type="text" name="input4" placeholder="gate"/></div>
	<div class="element-input<?php frmd_add_class("input5"); ?>" title="flightNumber"><label class="title"></label><input class="large" type="text" name="input5" placeholder="flightNumber"/></div>
	<div class="element-input<?php frmd_add_class("input6"); ?>" title="seat"><label class="title"></label><input class="large" type="text" name="input6" placeholder="seat"/></div>
	<div class="element-number<?php frmd_add_class("number1"); ?>" title="stock"><label class="title"></label><input class="large" type="text" min="0" max="99999" name="number1" placeholder="stock" value=""/></div>
	<div class="element-number<?php frmd_add_class("number2"); ?>" title="discount"><label class="title"></label><input class="large" type="text" min="1" max="99999" name="number2" placeholder="discount" value=""/></div>
<div class="submit"><input type="submit" value="Submit"/></div></form><script type="text/javascript" src="<?php echo dirname($form_path); ?>/formoid-biz-red.js"></script>

<!-- Stop Formoid form-->
<?php endif; ?>

<?php frmd_end_form(); ?>