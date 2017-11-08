# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """

        if l2 == None:
            return l1
        elif l1 == None:
            return l2
        else:
            if l1.val < l2.val:
                l3 = ListNode(l1.val)
                l1 = l1.next
            else:
                l3 = ListNode(l2.val)
                l2 = l2.next
            root = l3
            while l1 != None and l2 != None:
                print('hereh')
                if l1.val <= l2.val:
                    t = ListNode(l1.val)
                    l1 = l1.next
                    l3.next = t
                else:
                    t = ListNode(l2.val)
                    l2 = l2.next
                    l3.next = t
                l3 = l3.next
            while l1 != None:
                t = ListNode(l1.val)
                l3.next = t
                l3 = l3.next
                l1 = l1.next
            while l2 != None:
                t = ListNode(l2.val)
                l3.next = t
                l2 = l2.next
                l3 = l3.next
        return root
            
