/*
 * Metadata - jQuery plugin for parsing metadata from elements
 *
 * Copyright (c) 2006 John Resig, Yehuda Katz, J�rn Zaefferer
 *
 * Dual licensed under the MIT and GPL licenses:
 *   http://www.opensource.org/licenses/mit-license.php
 *   http://www.gnu.org/licenses/gpl.html
 *
 * Revision: $Id: jquery.metadata.pack.js,v 1.1 2010/08/04 09:08:19 ltis Exp $
 *
 */

(function($){$.meta={type:"class",name:"metadata",setType:function(type,name){this.type=type;this.name=name},cre:/({.*})/,single:'metadata'};var setArray=$.fn.setArray;$.fn.setArray=function(arr){return setArray.apply(this,arguments).each(function(){if(this.nodeType==9||$.isXMLDoc(this)||this.metaDone)return;var data="{}";if($.meta.type=="class"){var m=$.meta.cre.exec(this.className);if(m)data=m[1]}else if($.meta.type=="elem"){if(!this.getElementsByTagName)return;var e=this.getElementsByTagName($.meta.name);if(e.length)data=$.trim(e[0].innerHTML)}else if(this.getAttribute!=undefined){var attr=this.getAttribute($.meta.name);if(attr)data=attr}if(!/^{/.test(data))data="{"+data+"}";eval("data = "+data);if($.meta.single)this[$.meta.single]=data;else $.extend(this,data);this.metaDone=true})};$.fn.data=function(){return this[0][$.meta.single]}})(jQuery);