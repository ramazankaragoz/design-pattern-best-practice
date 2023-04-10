package com.example.designpattern.demo.structural.proxy;

class RemoteServiceProxy implements RemoteService {
    private RemoteService remoteService;

    public RemoteServiceProxy() {
        this.remoteService = new RemoteServiceImpl();
    }

    @Override
    public void performOperation() {
        if (hasAccess()) {
            remoteService.performOperation();
        } else {
            System.out.println("Access denied");
        }
    }

    private boolean hasAccess() {
        // check access permissions
        return false;
    }
}