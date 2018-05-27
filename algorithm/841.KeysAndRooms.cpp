class Solution {
public:
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        map<int, bool> roomMap;        
        stack<int> roomStack;
        roomStack.push(0);
            
        while (!roomStack.empty())
        {
            int current = roomStack.top(); 
            roomStack.pop();
            roomMap[current] = true;
            
            for (auto &i: rooms[current])
            {
                if (roomMap[i] == false)
                roomStack.push(i);
            }
        }
        
        return roomMap.size() == rooms.size();
    }
};
