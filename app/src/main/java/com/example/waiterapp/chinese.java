package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class chinese extends AppCompatActivity {
    Button back2,noodles_1,noodles_2,soup_1,soup_2,momo_1,momo_2,vegfried_1,vegfried_2,schezwan_1,schezwan_2,sushi_1,sushi_2;
    TextView noodlesval,soupval,momoval,vegfriedval,schezwanval,sushival;
    Button submit2;
    itemdetails noodles,soup,momos,vegfriedrice,schezwan,sushi;

    int flag[]={0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
        noodlesval = (TextView) findViewById(R.id.noodleval);
        soupval =(TextView) findViewById(R.id.soupval);
        momoval = (TextView) findViewById(R.id.momoval);
        vegfriedval =(TextView) findViewById(R.id.vegfriedval);
        schezwanval = (TextView) findViewById(R.id.schezwanval);
        sushival =(TextView) findViewById(R.id.sushival);
        back2 = (Button) findViewById(R.id.back2);
        noodles_1 = (Button) findViewById(R.id.noodles_1);
        noodles_2 = (Button) findViewById(R.id.noodles_2);
        soup_1 = (Button) findViewById(R.id.tomatosoup_1);
        soup_2 = (Button) findViewById(R.id.tomatosoup_2);
        momo_1 = (Button) findViewById(R.id.momos_1);
        momo_2 = (Button) findViewById(R.id.momos_2);
        vegfried_1 = (Button) findViewById(R.id.vegfriedrice_1);
        vegfried_2 = (Button) findViewById(R.id.vegfriedrice_2);
        schezwan_1 = (Button) findViewById(R.id.schezwan_1);
        schezwan_2 = (Button) findViewById(R.id.schezwan_2);
        sushi_1 = (Button) findViewById(R.id.sushi_1);
        sushi_2 = (Button) findViewById(R.id.sushi_2);
        submit2=(Button)findViewById(R.id.submit2);

        noodles=new itemdetails();
        soup=new itemdetails();
        momos=new itemdetails();
        vegfriedrice=new itemdetails();
        schezwan=new itemdetails();
        sushi=new itemdetails();

        noodles.name="Noodles";
        soup.name="Soup";
        momos.name="Momos";
        vegfriedrice.name="Veg Fried Rice";
        schezwan.name="Schezwan Fried Rice";
        sushi.name="Sushi";


        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sender2=new Intent(chinese.this,Display_1.class);
                int j=1;
                for(int i=0;i<6;i++){
                    if(flag[i]==1){
                        switch (i){
                            case 0:
                                sender2.putExtra("item"+j,"Noodles");
                                sender2.putExtra("qty"+j,String.valueOf(noodles.qty));
                                ++j;
                                break;
                            case 1:
                                sender2.putExtra("item"+j,"Soup");
                                sender2.putExtra("qty"+j,String.valueOf(soup.qty));
                                ++j;
                                break;
                            case 2:
                                sender2.putExtra("item"+j,"Momos");
                                sender2.putExtra("qty"+j,String.valueOf(momos.qty));
                                ++j;
                                break;
                            case 3:
                                sender2.putExtra("item"+j,"Veg Fried Rice");
                                sender2.putExtra("qty"+j,String.valueOf(vegfriedrice.qty));
                                ++j;
                                break;
                            case 4:
                                sender2.putExtra("item"+j,"Schezwan Fried Rice");
                                sender2.putExtra("qty"+j,String.valueOf(schezwan.qty));
                                ++j;
                                break;
                            case 5:
                                sender2.putExtra("item"+j,"Sushi");
                                sender2.putExtra("qty"+j,String.valueOf(sushi.qty));
                                ++j;
                                break;

                        }
                    }
                }

                startActivity(sender2);
            }
        });
        back2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(chinese.this, Category.class);
                startActivity(intent);
            }
        });
        noodles_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (noodles.qty!=0){
                    noodles.qty=noodles.qty-1;
                    noodlesval.setText(String.valueOf(noodles.qty));
                }
                if(noodles.qty==0){
                    flag[0]=0;
                }
            }
        });
        noodles_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                noodles.qty=noodles.qty+1;
                noodlesval.setText(String.valueOf(noodles.qty));
                if(flag[0]==0){
                    flag[0]=1;
                }

            }
        });
        soup_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (soup.qty!=0){
                    soup.qty=soup.qty-1;
                    soupval.setText(String.valueOf(soup.qty));
                }
                if(soup.qty==0){
                    flag[1]=0;
                }

            }
        });
        soup_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                soup.qty=soup.qty+1;
                soupval.setText(String.valueOf(soup.qty));
                if(flag[1]==0){
                    flag[1]=1;
                }

            }
        });
        momo_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (momos.qty!=0){
                    momos.qty=momos.qty-1;
                    momoval.setText(String.valueOf(momos.qty));
                }
                if(momos.qty==0){
                    flag[2]=0;
                }
            }
        });
        momo_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                momos.qty=momos.qty+1;
                momoval.setText(String.valueOf(momos.qty));
                if(flag[2]==0){
                    flag[2]=1;
                }

            }
        });
        vegfried_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (vegfriedrice.qty!=0){
                    vegfriedrice.qty=vegfriedrice.qty-1;
                    vegfriedval.setText(String.valueOf(vegfriedrice.qty));
                }
                if(vegfriedrice.qty==0){
                    flag[3]=0;
                }

            }
        });
        vegfried_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                vegfriedrice.qty=vegfriedrice.qty+1;
                vegfriedval.setText(String.valueOf(vegfriedrice.qty));
                if(flag[3]==0){
                    flag[3]=1;
                }

            }
        });
        schezwan_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (schezwan.qty!=0){
                    schezwan.qty=schezwan.qty-1;
                    schezwanval.setText(String.valueOf(schezwan.qty));
                }
                if(schezwan.qty==0){
                    flag[4]=0;
                }

            }
        });
        schezwan_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                schezwan.qty=schezwan.qty+1;
               schezwanval.setText(String.valueOf(schezwan.qty));
                if(flag[4]==0){
                    flag[4]=1;
                }

            }
        });
        sushi_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (sushi.qty!=0){
                    sushi.qty=sushi.qty-1;
                    sushival.setText(String.valueOf(sushi.qty));
                }
                if(sushi.qty==0){
                    flag[5]=0;
                }

            }
        });
        sushi_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sushi.qty=sushi.qty+1;
                sushival.setText(String.valueOf(sushi.qty));
                if(flag[5]==0){
                    flag[5]=1;
                }

            }
        });


    }
}
