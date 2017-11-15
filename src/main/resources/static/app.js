(function() {
    var app = angular.module('beerStore', []);

    app.controller('StoreController', function($scope, $http) {
        var url = "/other";
        $http.get( url
        ).success(function(data){
            $scope.store.products = data;
        });
    });

    app.controller("TabController", function(){
        this.current = 1;
        this.setTab = function(number){
            this.current = number;
        }
        this.isSet = function(number) {
            return number === this.current;
        }

    });

})();

