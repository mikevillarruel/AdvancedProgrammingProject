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
<form class="formoid-biz-red" style="background-color:#1A2223;font-size:14px;font-family:'Open Sans','Helvetica Neue', 'Helvetica', Arial, Verdana, sans-serif;color:#ECECEC;max-width:480px;min-width:150px" method="post"><div class="title"><h2>Register  Seller</h2></div>
	<div class="element-input<?php frmd_add_class("input"); ?>" title="username"><label class="title"></label><input class="large" type="text" name="input" placeholder="username"/></div>
	<div class="element-password<?php frmd_add_class("password"); ?>"><label class="title"></label><input class="large" type="password" name="password" value="" placeholder="password"/></div>
	<div class="element-name<?php frmd_add_class("name"); ?>"><label class="title"></label><span class="nameFirst"><input placeholder="Name First" type="text" size="8" name="name[first]" /></span><span class="nameLast"><input placeholder="Name Last" type="text" size="14" name="name[last]" /></span></div>
	<div class="element-input<?php frmd_add_class("input4"); ?>" title="address"><label class="title"></label><input class="large" type="text" name="input4" placeholder="address"/></div>
	<div class="element-input<?php frmd_add_class("input5"); ?>" title="telephone"><label class="title"></label><input class="large" type="text" name="input5" placeholder="telephone"/></div>
	<div class="element-input<?php frmd_add_class("input6"); ?>" title="email"><label class="title"></label><input class="large" type="text" name="input6" placeholder="email"/></div>
	<div class="element-number<?php frmd_add_class("number"); ?>" title="pendingValues"><label class="title"></label><input class="large" type="text" min="0" max="99999" name="number" placeholder="pendingValues" value=""/></div>
<div class="submit"><input type="submit" value="Submit"/></div></form><script type="text/javascript" src="<?php echo dirname($form_path); ?>/formoid-biz-red.js"></script>

<!-- Stop Formoid form-->
<?php endif; ?>

<?php frmd_end_form(); ?>