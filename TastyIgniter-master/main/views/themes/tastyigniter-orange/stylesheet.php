<?php if ( ! defined('BASEPATH')) exit('No direct access allowed');

/**
 * DO NOT EDIT THIS FILE, unless you know what you are doing.
 *
 */

?>

<?php

$style = "<style type=\"text/css\">";

// Body
$style .= "body {";
if (!empty($font['family']))
	$style .= "font-family: {$font['family']};";

if (!empty($font['size']))
	$style .= "font-size: {$font['size']}px;";

if (!empty($font['weight']))
	$style .= "font-weight: {$font['weight']};";

if (!empty($font['style']))
	$style .= "font-style: {$font['style']};";

if (!empty($font['color']))
	$style .= "color: {$font['color']};";
$style .= "}";

if (!empty($font['color']))
	$style .= ".menu-name, .panel-default > .panel-heading {color: {$font['color']};}";

if ( ! empty($sidebar['font'])) {
	$style .= ".text-muted { color: ".adjustColorBrightness($sidebar['font'], '50').";}";
}

$style .= "body, #page-wrapper {";
if (!empty($body['background']))
	$style .= "background-color: {$body['background']};";

if (!empty($body['image']) AND !empty($body['display'])) {
	$style .= "background-image: url('".image_url($body['image'])."');";

	if ($body['display'] === 'tiled') {
		$style .= "background-repeat: repeat;";
	} else if ($body['display'] === 'centered') {
		$style .= "background-repeat: no-repeat; background-position: center center;";
	} else if ($body['display'] === 'cover') {
		$style .= "background-repeat: no-repeat; background-size:cover;";
	} else {
		$style .= "background-size: {$body['display']};";
	}
}
$style .= "}";

// GENERAL COLOR
if (!empty($body['color'])) {
	$style .= ".partial .local-box-fluid, .partial .local-box-fluid .panel { background-color: {$body['color']}; border-color: {$body['color']}}";
	$style .= ".step-item .icon i { color: {$body['color']}; border-color:{$body['color']};}";
	$style .= ".newsletter-subscribe { background-color: {$body['color']}; color:{$font['color']}}";
}

if (!empty($body['color'])) {
	$style .= ".nav-tabs-line > li.active > a, .nav-tabs-line > li.active > a:hover, .nav-tabs-line > li.active > a:focus, .nav-tabs-line > li.open a, .nav-tabs-line > li > a:hover, .nav-tabs-line > li > a:focus,";
	$style .= ".nav-tabs-line > li.open a, .nav-tabs-line > li:hover, .nav-tabs-line > li:focus, .nav-tabs-line > li.active, .nav-tabs-line > li.active:hover, .nav-tabs-line > li.active:focus { border-bottom-color: {$body['color']};}";
}

if (!empty($font['color']))
	$style .= ".newsletter-subscribe { color:{$font['color']}}";

// Header
$style .= "#main-header, #main-header .navbar-collapse, .modal-header {";
if (!empty($header['background']))
	$style .= "background-color: {$header['background']};";

if (!empty($header['image']) AND !empty($header['display'])) {
	$style .= "background-image: url('".image_url($header['image'])."');";

	if ($header['display'] === 'tiled') {
		$style .= "background-repeat: repeat;";
	} else if ($header['display'] === 'centered') {
		$style .= "background-repeat: no-repeat; background-position: center center;";
	} else if ($header['display'] === 'cover') {
		$style .= "background-repeat: no-repeat; background-size:cover;";
	} else {
		$style .= "background-size: {$header['display']};";

	}
}
$style .= "}";

if (!empty($header['color']))
	$style .= "#main-header .dropdown-menu > li > a, .modal-header { color: {$header['color']};}";

if ( ! empty($header['dropdown_background']))
	$style .= "#main-header .dropdown-menu { background-color: {$header['dropdown_background']};}";

// Logo
if (empty($logo_text) AND !empty($logo_height)) {
	$style .= "#main-header .logo img {height: {$logo_height}px !important;}";
} else if ( ! empty($logo_height)) {
	$style .= "#main-header .logo a {font-size: {$logo_height}px}";
}

$style .= "#main-header .logo {";
if ( ! empty($logo_padding_top))
	$style .= "padding-top: {$logo_padding_top}px;";

if ( ! empty($logo_padding_bottom))
	$style .= "padding-bottom: {$logo_padding_bottom}px;";
$style .= "}";

// MENU
$style .= "#main-header .navbar-nav > li > a {";
if (!empty($menu_font['family']))
	$style .= "font-family: {$menu_font['family']};";

if (!empty($menu_font['size']))
	$style .= "font-size: {$menu_font['size']}px;";

if (!empty($menu_font['weight']))
	$style .= "font-weight: {$menu_font['weight']};";

if (!empty($menu_font['style']))
	$style .= "font-style: {$menu_font['style']};";

if (!empty($menu_font['color']))
	$style .= "color: {$menu_font['color']};";
$style .= "}";

$style .= "#main-header .navbar-nav > li > a:focus, #main-header .navbar-nav > li > a:hover, .local-box-fluid h2  {";
if (!empty($menu_font['color']))
	$style .= "color: {$menu_font['color']};";
$style .= "}";


// FOREGROUND
if ( ! empty($body['foreground'])) {
	$style .= "#page-content div.content, div.content .panel, div.content .list-group-item, .modal-content { background-color: {$body['foreground']};}";
	$style .= "#page-content div.content-wrap { background-color: {$body['foreground']}; border-width: 1px; border-style: solid; padding:15px; border-radius:4px;margin-bottom: 20px;}";
}

if ( ! empty($body['border']))
	$style .= "#page-content div.content-wrap, #page-content div.content, #page-content .panel, #page-content .panel .panel-heading, #page-content .nav-tabs, #page-content .list-group-item, #page-content th, #page-content td, #page-content .tab-content-line, .modal-content, #local-information .list-group-item { border-color: {$body['border']};}";

// Heading
$style .= "#heading {";
if (empty($heading['image']) AND !empty($heading['background'])) {
	$style .= "background: {$heading['background']} !important;";
} else if (!empty($heading['image']) AND !empty($heading['display'])) {
	$style .= "background-color: {$heading['background']};";
	$style .= "background-image: url('".image_url($heading['image'])."');";

	if ($heading['display'] === 'tiled') {
		$style .= "background-repeat: repeat;";
	} else if ($heading['display'] === 'centered') {
		$style .= "background-repeat: no-repeat; background-position: center center;";
	} else if ($heading['display'] === 'cover') {
		$style .= "background-repeat: no-repeat; background-size:cover;";
	} else {
		$style .= "background-size: {$heading['display']};";
	}
}

if ( ! empty($heading['color']))
	$style .= "color: {$heading['color']};";
$style .= "}";

$style .= ".under-heading {";
if ( ! empty($heading['under_image'])) {
	$style .= "background-image: url('".image_url($heading['under_image'])."');";
} else if ( isset($heading['under_image']) AND  empty($heading['under_image'])) {
	$style .= "background-image: none; height: auto;";
}
if ( ! empty($heading['under_height']))
	$style .= "height: {$heading['under_height']}px;";
$style .= "}";

// Sidebar
$style .= ".partial .panel {";
if (!empty($sidebar['background']))
	$style .= "background-color: {$sidebar['background']};";

if (!empty($sidebar['image'])) {
	$style .= "background-image: url('".image_url($sidebar['image'])."');";

	if ($sidebar['display'] === 'tiled') {
		$style .= "background-repeat: repeat;";
	} else if ($sidebar['display'] === 'centered') {
		$style .= "background-repeat: no-repeat; background-position: center center;";
	} else if ($sidebar['display'] === 'cover') {
		$style .= "background-repeat: no-repeat; background-size:cover;";
	} else {
		$style .= "background-size: {$sidebar['display']};";
	}
}
$style .= "}";

$style .= ".partial .panel, .partial .panel-default > .panel-heading, .partial .panel-cart, #page-content .cart-total .table td,";
$style .= ".panel-cart .location-control, .panel-cart .cart-coupon, #local-info .panel-local, .panel-local .panel-heading {";
//$style .= ".nav-tabs-line > li.open a, .nav-tabs-line > li > a:hover, .nav-tabs-line > li > a:focus";
if ( ! empty($sidebar['border']))
	$style .= "border-color: {$sidebar['border']};";
$style .= "}";

$style .= ".partial .module-box li, .partial > .module-box .list-group-item, #category-box .list-group-item a, .cart-items ul li {";
if ( ! empty($sidebar['border']))
	$style .= "background-color: transparent;border-color: {$sidebar['border']}; border-width: 0 0 1px; border-style: solid;";
$style .= "}";

$style .= ".partial .module-box .panel, .partial .list-group-item a, .cart-items ul li .amount, .cart-total .table td,";
$style .= ".cart-items ul li .name, .cart-items ul li .name-image:focus .name, .cart-items ul li .name-image:hover .name {";
if ( ! empty($sidebar['font']))
	$style .= "color: {$sidebar['font']};";
$style .= "}";

if ( ! empty($sidebar['font'])) {
	$color = adjustColorBrightness($sidebar['font'], '50');
	$style .= ".partial .text-muted { color: {$color};}";
}

// Link
if ( ! empty($link['color'])) {
	$style .= "a, .btn-link { color: {$link['color']};}";
}

if ( ! empty($link['hover'])) {
	$style .= "a:hover, a:focus, .btn-link:focus, .btn-link:hover,";
	$style .= "#page-footer .main-footer a:hover, #page-footer .main-footer a:focus,";
	$style .= "#page-footer .bottom-footer a:hover, #page-footer .bottom-footer a:focus,";
	$style .= "a.list-group-item:hover, .list-group-item > a:hover,";
	$style .= ".side-bar a.list-group-item.active, .side-bar .list-group-item.active > a,";
	$style .= ".side-bar a.list-group-item:hover, .side-bar .list-group-item > a:hover,";
	$style .= "a.list-group-item.active, .list-group-item > a.active { color: {$link['hover']};}";
}

$button_color_step = '-20';
// Button Default
$style .= ".btn-default, .panel-default .panel-heading, .panel-nav-tabs.panel-default .panel-heading {";
if ( ! empty($button['default']['background']))
	$style .= "background-color: {$button['default']['background']};";

if ( ! empty($button['default']['hover']))
	$style .= "border-color: {$button['default']['hover']};";

if ( ! empty($button['default']['font']))
	$style .= "color: {$button['default']['font']};";
$style .= "}";

$style .= ".btn-default:hover, .btn-default:focus, .btn-default.active, .btn-default:active {";
if ( ! empty($button['default']['background']))
	$style .= "background-color: ".adjustColorBrightness($button['default']['background'], $button_color_step).";";

if ( ! empty($button['default']['hover']))
	$style .= "border-color: ".adjustColorBrightness($button['default']['hover'], $button_color_step).";";

if ( ! empty($button['default']['font']))
	$style .= "color: ".adjustColorBrightness($button['default']['font'], $button_color_step).";";
$style .= "}";

// Button Primary
$style .= ".btn-primary, .panel-primary .panel-heading, .panel-nav-tabs.panel-primary .panel-heading {";
if ( ! empty($button['primary']['background']))
	$style .= "background-color: {$button['primary']['background']};";

if ( ! empty($button['primary']['hover']))
	$style .= "border-color: {$button['primary']['hover']};";

if ( ! empty($button['primary']['font']))
	$style .= "color: {$button['primary']['font']};";
$style .= "}";

$style .= ".btn-primary:hover, .btn-primary:focus, .btn-primary.active, .btn-primary:active {";
if ( ! empty($button['primary']['background']))
	$style .= "background-color: ".adjustColorBrightness($button['primary']['background'], $button_color_step).";";

if ( ! empty($button['primary']['hover']))
	$style .= "border-color: ".adjustColorBrightness($button['primary']['hover'], $button_color_step).";";

if ( ! empty($button['primary']['font']))
	$style .= "color: ".adjustColorBrightness($button['primary']['font'], $button_color_step).";";
$style .= "}";

$style .= ".nav-pills > li.active > a {";
if ( ! empty($button['primary']['background']))
	$style .= "background-color: {$button['primary']['background']};";
if ( ! empty($button['primary']['font']))
	$style .= "color: {$button['primary']['font']};";
$style .= "}";

// Button Success
$style .= ".btn-success, .panel-success .panel-heading, .panel-nav-tabs.panel-success .panel-heading {";
if ( ! empty($button['success']['background']))
	$style .= "background-color: {$button['success']['background']};";

if ( ! empty($button['success']['hover']))
	$style .= "border-color: {$button['success']['hover']};";

if ( ! empty($button['success']['font']))
	$style .= "color: {$button['success']['font']};";
$style .= "}";

$style .= ".btn-success:hover, .btn-success:focus, .btn-success.active, .btn-success:active {";
if ( ! empty($button['success']['background']))
	$style .= "background-color: ".adjustColorBrightness($button['success']['background'], $button_color_step).";";

if ( ! empty($button['success']['hover']))
	$style .= "border-color: ".adjustColorBrightness($button['success']['hover'], $button_color_step).";";

if ( ! empty($button['success']['font']))
	$style .= "color: ".adjustColorBrightness($button['success']['font'], $button_color_step).";";
$style .= "}";

// Button Danger
$style .= ".btn-danger, .panel-danger .panel-heading, .panel-nav-tabs.panel-danger .panel-heading {";
if ( ! empty($button['danger']['background']))
	$style .= "background-color: {$button['danger']['background']};";

if ( ! empty($button['danger']['hover']))
	$style .= "border-color: {$button['danger']['hover']};";

if ( ! empty($button['danger']['font']))
	$style .= "color: {$button['danger']['font']};";
$style .= "}";

$style .= ".btn-danger:hover, .btn-danger:focus, .btn-danger.active, .btn-danger:active {";
if ( ! empty($button['danger']['background']))
	$style .= "background-color: ".adjustColorBrightness($button['danger']['background'], $button_color_step).";";

if ( ! empty($button['danger']['hover']))
	$style .= "border-color: ".adjustColorBrightness($button['danger']['hover'], $button_color_step).";";

if ( ! empty($button['danger']['font']))
	$style .= "color: ".adjustColorBrightness($button['danger']['font'], $button_color_step).";";
$style .= "}";

// Button Warning
$style .= ".btn-warning, .panel-warning .panel-heading, .panel-nav-tabs.panel-warning .panel-heading {";
if ( ! empty($button['warning']['background']))
	$style .= "background-color: {$button['warning']['background']};";

if ( ! empty($button['warning']['hover']))
	$style .= "border-color: {$button['warning']['hover']};";

if ( ! empty($button['warning']['font']))
	$style .= "color: {$button['warning']['font']};";
$style .= "}";

$style .= ".btn-warning:hover, .btn-warning:focus, .btn-warning.active, .btn-warning:active {";
if ( ! empty($button['warning']['background']))
	$style .= "background-color: ".adjustColorBrightness($button['warning']['background'], $button_color_step).";";

if ( ! empty($button['warning']['hover']))
	$style .= "border-color: ".adjustColorBrightness($button['warning']['hover'], $button_color_step).";";

if ( ! empty($button['warning']['font']))
	$style .= "color: ".adjustColorBrightness($button['warning']['font'], $button_color_step).";";
$style .= "}";

// Button Info
$style .= ".btn-info, .panel-info .panel-heading, .panel-nav-tabs.panel-info .panel-heading {";
if ( ! empty($button['info']['background']))
	$style .= "background-color: {$button['info']['background']};";

if ( ! empty($button['info']['hover']))
	$style .= "border-color: {$button['info']['hover']};";

if ( ! empty($button['info']['font']))
	$style .= "color: {$button['info']['font']};";
$style .= "}";

$style .= ".btn-info:hover, .btn-info:focus, .btn-info.active, .btn-info:active {";
if ( ! empty($button['info']['background']))
	$style .= "background-color: ".adjustColorBrightness($button['info']['background'], $button_color_step).";";

if ( ! empty($button['info']['hover']))
	$style .= "border-color: ".adjustColorBrightness($button['info']['hover'], $button_color_step).";";

if ( ! empty($button['info']['font']))
	$style .= "color: ".adjustColorBrightness($button['info']['font'], $button_color_step).";";
$style .= "}";

// Footer
$style .= "#page-footer {";
if (!empty($footer['background']))
	$style .= "background-color: {$footer['background']}; background-image:linear-gradient(to bottom, {$footer['background']}, {$footer['background']});";

if (!empty($footer['image']) AND !empty($footer['display'])) {
	$style .= "background-image: url('".image_url($footer['image'])."');";

	if ($footer['display'] === 'tiled') {
		$style .= "background-repeat: repeat;";
	} else if ($footer['display'] === 'centered') {
		$style .= "background-repeat: no-repeat; background-position: center center;";
	} else if ($footer['display'] === 'cover') {
		$style .= "background-repeat: no-repeat; background-size:cover;";
	} else {
		$style .= "background-size: {$footer['display']};";
	}
}
$style .= "}";

$style .= "#page-footer .bottom-footer {";
if ( ! empty($footer['bottom_background']))
	$style .= "background-color: {$footer['bottom_background']};";

if ( ! empty($footer['bottom_image']) AND ! empty($footer['bottom_display'])) {
	$style .= "background-image: url('" . image_url($footer['bottom_image']) . "'); background-position: center center;background-repeat: no-repeat;";

	if ($footer['bottom_display'] === 'tiled') {
		$style .= "background-repeat: repeat;";
	} else if ($footer['bottom_display'] === 'centered') {
		$style .= "background-repeat: no-repeat; background-position: center center;";
	} else if ($footer['bottom_display'] === 'cover') {
		$style .= "background-repeat: no-repeat; background-size:cover;";
	} else {
		$style .= "background-size: {$footer['bottom_display']};";
	}
}
$style .= "}";

if ( ! empty($footer['footer_color'])) {
	$style .= "#page-footer .main-footer, #page-footer .main-footer a, #page-footer .main-footer .footer-title { color: {$footer['footer_color']};}";
}
if ( ! empty($footer['bottom_footer_color'])) {
	$style .= "#page-footer .bottom-footer, #page-footer .bottom-footer a, #page-footer .bottom-footer .footer-title { color: {$footer['bottom_footer_color']};}";
}

if ( ! empty($custom_script['css'])) {
	echo $style . $custom_script['css'];
} else {
	echo $style;
}

function adjustColorBrightness($hex, $steps) {
	// Steps should be between -255 and 255. Negative = darker, positive = lighter
	$steps = max(-255, min(255, $steps));

	// Normalize into a six character long hex string
	$hex = str_replace('#', '', $hex);
	if (strlen($hex) == 3) {
		$hex = str_repeat(substr($hex, 0, 1), 2) . str_repeat(substr($hex, 1, 1), 2) . str_repeat(substr($hex, 2, 1), 2);
	}

	// Split into three parts: R, G and B
	$color_parts = str_split($hex, 2);
	$return = '#';

	foreach ($color_parts as $color) {
		$color = hexdec($color); // Convert to decimal
		$color = max(0, min(255, ($color === 255) ? $color - $steps : $color + $steps)); // Adjust color
		$return .= str_pad(dechex($color), 2, '0', STR_PAD_LEFT); // Make two char hex code
	}

	return $return;
}

?>
</style>