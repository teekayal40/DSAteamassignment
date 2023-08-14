package Source.Group_Assignment_2;

import java.util.*;

public class inptprochm {

        HashMap<Integer,Integer> var_int_day_flr_pos_usr_input = new LinkedHashMap<Integer,Integer>();
        HashMap<Integer,String> var_int_day_flr_pos_usr_output = new LinkedHashMap<Integer,String>();
        int var_int_tot_floors = 0;
        int var_str_flr_size = 0;
        int var_curr_flr_size_pos = 0;
        int var_prev_flr_size_pos = 0;
        String var_str_end_alloc="";
    
        public void input_floor_pos() 
        
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the total no of floors in the building");

            var_int_tot_floors = sc.nextInt();

            for (int i = 1;i<=var_int_tot_floors;i++) 
            
            {

                System.out.println("enter the floor size given on day : " + i);
                var_str_flr_size = sc.nextInt();
                var_int_day_flr_pos_usr_input.put(var_str_flr_size,i);      
    
            }

            for(int j=var_int_tot_floors;j>0;j--)
            
            {

                var_curr_flr_size_pos = var_int_day_flr_pos_usr_input.get(j);

                if (j == var_int_tot_floors )
                {
                    if(var_curr_flr_size_pos == 1)
                    {

                        var_str_end_alloc = Integer.toString(j);
                        var_int_day_flr_pos_usr_output.put(var_curr_flr_size_pos,var_str_end_alloc);

                    }
                    else
                    {

                        var_str_end_alloc = Integer.toString(j);
                        var_int_day_flr_pos_usr_output.put(var_curr_flr_size_pos,var_str_end_alloc);

                    }
                    
                        var_prev_flr_size_pos = var_curr_flr_size_pos;
                }
                else
                {
                    if(var_curr_flr_size_pos > var_prev_flr_size_pos)
                    {
                        
                        if(var_int_day_flr_pos_usr_output.containsKey(var_prev_flr_size_pos) == true)
                        {

                            var_str_end_alloc = Integer.toString(j);
                            var_int_day_flr_pos_usr_output.put(var_curr_flr_size_pos,var_str_end_alloc);
                             
                        }
                        else
                        {

                            var_str_end_alloc = var_str_end_alloc+" "+Integer.toString(j);
                            var_int_day_flr_pos_usr_output.replace(var_prev_flr_size_pos,var_str_end_alloc);
                            var_prev_flr_size_pos = var_curr_flr_size_pos;                            
                        }

                        var_prev_flr_size_pos = var_curr_flr_size_pos;

                    }
                    else
                    {
                        
                        if(var_int_day_flr_pos_usr_output.containsKey(var_prev_flr_size_pos) == true)
                        {

                            var_str_end_alloc = var_str_end_alloc+" "+Integer.toString(j);
                            var_int_day_flr_pos_usr_output.replace(var_prev_flr_size_pos,var_str_end_alloc);
                            
                        
                        }                        

                    }
                       
                }
            }

            System.out.println("The order of construction is as follows");
            System.out.println(" ");

            for (int i = 1;i<=var_int_tot_floors;i++) 
            {
                if(var_int_day_flr_pos_usr_output.containsKey(i) ==false)
                {
                    var_int_day_flr_pos_usr_output.put(i,"");

                }
                    
                System.out.println("Day:  " + i);
                System.out.println(var_int_day_flr_pos_usr_output.get(i));
                System.out.println(" ");

            }

        }

}
