var app = angular.module("app", []);

app.controller('EventsController', EventsController);

EventsController.$inject = [ '$scope', '$http' ];

function EventsController($scope, $http) {
	$http.get('http://localhost:8080/EventTracker/events.json').then(
			function(resp) {
				$scope.events = resp.data;
			});
}