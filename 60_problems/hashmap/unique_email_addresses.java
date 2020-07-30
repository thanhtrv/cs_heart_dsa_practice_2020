class Solution {
    public int numUniqueEmails(String[] emails) {
//         loop thru the emails
//         Using hashset because it takes only constant time O(1) to do operations such as contains/in 
        // Set<String> seen = new HashSet();
        
        int count_received_emails = 0;
        for (String email : emails) {
//            
            int i = email.indexOf('@');
//             Store local part
            String local = email.substring(0,i);
//             Store domain part
            String rest = email.substring(i, email.length() - 1);
//             Work on the + case ignoring the substring after +
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
//             Work on the . case
//         By removing it
            local = local.replaceAll("\\.", "");
//         In the case of HashMap, it replaces the old value with the new one.

//         In the case of HashSet, the item isn't inserted.
            seen.add(local + rest);
        }
        
        // return seen.size();
    }
}
