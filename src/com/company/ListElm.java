package com.company;

class ListElm<E> {
    ListElm next;
    E data;
}

class MyList<E> {
    private ListElm head;
    private ListElm tail;

    void addFront(E data) {
        ListElm a = new ListElm();
        a.data = data;
        if(head == null) {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    void addBack(E data) {
        ListElm a = new ListElm();
        a.data = data;
        if (tail == null){
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void printList() {
        ListElm t = head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    void delEl(E data)
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        ListElm t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if(tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}