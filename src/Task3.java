public class Task3 {
    public void runner(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5); // აქ შევქმენი მაგალითში მოცემული ბმული სია: 1->2->3->4->5
        System.out.println("original linked list");
        printLinkedList(head);
        System.out.println("reversed linked list");
        printLinkedList(reverseList(head)); // ბეჭდვის ფუნქციას გადავეცით ახალი სათავე შებრუნებული ბმული სიისთვის

    }

    public ListNode reverseList(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while (curr != null) { // მივდივართ ბმული სიების ბოლომდე
            next = curr.next; // next ცვლადი არის დროებითი ცვლადი, რომელიც ეხმარება curr ცვლადს, შეინახოს მომდევნო კვანძი
            curr.next = prev; // რადგანაც ბმული სიების შეტრიალება გვინდა, კვანძის next-ში ვწერთ წინა ელემენტს. რადგანაც შექმნისას prev ცვლადი არის null, თავდაპირველი სათავე ავტომატურად გამოვა ბმული სიების ბოლო კვანძი
            prev = curr; // შემდეგი იტერაციისთვის ვინახავთ წინა კვანძს
            curr = next; // გადავდივართ შემდეგ კვანძზე
        }
        return prev; // ვაბრუნებთ ახალ სათავეს
    }
    public void printLinkedList(ListNode head){
        ListNode curr = head; // curr ცვლადში ვინახავთ მიმდინარე კვანძს
        while (curr != null) { // ეს ციკლი მიდის ბმული სიების ბოლო კვანძამდე
            if (curr.next != null) // სანამ მიმდინარე კვანძს აქვს გაგრძელება, დაიბეჭდოს მისი მნიშვნელობა და ->
                System.out.print(curr.val + "->");
            else System.out.println(curr.val); // წინაააღმდეგ შემთხვევაში, გამოვა რო ეს ბოლო ელემენტია და ისრის გარეშე დაიბეჭდოს
            curr = curr.next; // ყოველ ჯერზე curr ცვლადში იწერება მისი მომდევნო კვანძი
        }
    }
}

class ListNode { // ვქმნი ListNode კლასს, რათა გავაკეთოტ ბმული სიები
    int val;
    ListNode next;
    ListNode(int x) { this.val = x; }
}
