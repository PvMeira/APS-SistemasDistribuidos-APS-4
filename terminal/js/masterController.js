var app = angular.module('app', ["ngRoute"]);

app.controller('MasterController', function ($scope, $http) {

    $scope.pool = {};
    $scope.message = {};

    $scope.list = function () {
        $http.get('http://localhost:8080/aps/messagePoll/')
            .success(function (data) {
                $scope.pool = data;
            })
            .error(function () {
            });
    };
    $scope.list();

    $scope.addMessage = function () {
        $http.post('http://localhost:8080/aps/messagePoll/', $scope.message)
            .success(function (data) {
                $scope.message = {}
                $scope.list();
            }).error(function () {
        });
    };
    setInterval(function () {
        $scope.list();
    }, 10000)
})
