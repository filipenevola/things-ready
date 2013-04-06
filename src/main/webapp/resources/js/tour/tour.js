/*! Copyright 2013 Quave, desenvolvimento em TI.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
jQuery.noConflict();
/**
 * 
 * @param stepsNameSuffix
 *            é o nome dos textos sem o tour
 */
function mostrarTour(stepsNameSuffix) {
	var varName = 'tour' + stepsNameSuffix;
	console.log(varName);
	var steps = eval(varName);
	var tour = new Tour({
		name: 'tour',
		keyboard : true,
		useLocalStorage : false,
		labels : {
			end : 'fechar <i class=\"icon icon-thumbs-up\"></i>',
			next : 'próxima <i class=\"icon icon-arrow-right\"></i>',
			prev : '<i class=\"icon icon-arrow-left\"></i> anterior'
		}
	});
	for (var i = 0; i < steps.length; ++i) {
		var step = steps[i].split(";");
		console.log("Step " + (i+1));
		console.log(step);
		var element = ".ts" + (i + 1);
		if (step.length > 2 && step[2] && step[2] != '') {
			element = step[2];
		}
		var placement = "top";
		if (step.length > 3 && step[3] && step[3] != '') {
			placement = step[3];
		}
		var dicas = "";
		if (steps.length > 1) {
			dicas = " <span class=\"pull-right\">(Dica " + (i + 1) + '/'
					+ steps.length + ")</span>";
		}
		var title = step[0] + dicas;
		var content = step[1];
		tour.addStep({
			element : element,
			title : title,
			content : content,
			placement : placement,
			animation : true
		});
	}
	try {
		tour.end();
	} catch (error) { 
		console.log("Do nothing!");
	}
	tour.restart();
	tour.start();
}