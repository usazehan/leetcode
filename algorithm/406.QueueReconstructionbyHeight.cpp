class Solution {
public:
    vector<pair<int, int>> reconstructQueue(vector<pair<int, int>>& people) {
        int n = people.size();
        if (n < 2) return people;
        
        sort(people.begin(), people.end(), [](const pair<int,int> &a, const pair<int, int> &b) {
            return a.first > b.first || (a.first == b.first && a.second < b.second);
        });
        
        for (int i = 0; i < n; i++) {
            if (people[i].second != i) {
                auto x = people[i];
                people.erase(people.begin() + i);
                people.insert(people.begin() + x.second, x);
            }
        }
        return people;
    }
};
