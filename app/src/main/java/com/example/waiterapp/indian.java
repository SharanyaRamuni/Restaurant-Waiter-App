package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class indian extends AppCompatActivity {
Button back1,pbm_1,pbm_2,bn_1,bn_2,jr_1,jr_2,kp_1,kp_2,kul_1,kul_2,mm_1,mm_2,panner65_1,panner65_2,roti_1,roti_2,veg65_1,veg65_2,vegmeals_1,vegmeals_2,vegpulao_1,vegpulao_2;
TextView pbmval,bnval,jrval,kpval,kulval,mmval,panner65val,rotival,veg65val,vegmealsval,vegpulaoval;
    Button submit1;
    itemdetails pbm,bn,jr,kp,kul,mm,panner65,roti,veg65,vegpulao,vegmeals;

    int flag[]={0,0,0,0,0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
        pbmval = (TextView) findViewById(R.id.pbmval);
        bnval = (TextView) findViewById(R.id.bnval);
        jrval = (TextView) findViewById(R.id.jrval);
        kpval = (TextView) findViewById(R.id.kpval);
        kulval = (TextView) findViewById(R.id.kulval);
        mmval = (TextView) findViewById(R.id.mmval);
        panner65val = (TextView) findViewById(R.id.panner65val);
        rotival = (TextView) findViewById(R.id.rotival);
        veg65val = (TextView) findViewById(R.id.veg65val);
        vegmealsval = (TextView) findViewById(R.id.vegmealsval);
        vegpulaoval = (TextView) findViewById(R.id.vegpulaoval);
        submit1 = (Button) findViewById(R.id.submit1);
        back1 = (Button) findViewById(R.id.back1);
        pbm_1 = (Button) findViewById(R.id.pbm_1);
        pbm_2 = (Button) findViewById(R.id.pbm_2);
        bn_1 = (Button) findViewById(R.id.bn_1);
        bn_2 = (Button) findViewById(R.id.bn_2);
        jr_1 = (Button) findViewById(R.id.jr_1);
        jr_2 = (Button) findViewById(R.id.jr_2);
        kp_1 = (Button) findViewById(R.id.kp_1);
        kp_2 = (Button) findViewById(R.id.kp_2);
        kul_1 = (Button) findViewById(R.id.kul_1);
        kul_2 = (Button) findViewById(R.id.kul_2);
        mm_1 = (Button) findViewById(R.id.mm_1);
        mm_2 = (Button) findViewById(R.id.mm_2);
        panner65_1 = (Button) findViewById(R.id.panner65_1);
        panner65_2 = (Button) findViewById(R.id.panner65_2);
        roti_1 = (Button) findViewById(R.id.roti_1);
        roti_2= (Button) findViewById(R.id.roti_2);
        veg65_1 = (Button) findViewById(R.id.veg65_1);
        veg65_2=  (Button) findViewById(R.id.veg65_2);
        vegmeals_1 = (Button) findViewById(R.id.vegmeals_1);
        vegmeals_2 = (Button) findViewById(R.id.vegmeals_2);
        vegpulao_1 = (Button) findViewById(R.id.vegpulao_1);
        vegpulao_2 = (Button) findViewById(R.id.vegpulao_2);
        pbm = new itemdetails();
        bn = new itemdetails();
        jr = new itemdetails();
        kp = new itemdetails();
        kul = new itemdetails();
        mm = new itemdetails();
        panner65 = new itemdetails();
        roti = new itemdetails();
        veg65 = new itemdetails();
        vegpulao = new itemdetails();
        vegmeals = new itemdetails();
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sender1=new Intent(indian.this,Display_1.class);
                int j=1;
                for(int i=0;i<11;i++){
                    if(flag[i]==1){
                        switch (i){
                            case 0:
                                sender1.putExtra("item"+j,"Panner BM");
                                sender1.putExtra("qty"+j,String.valueOf(pbm.qty));
                                ++j;
                                break;
                            case 1:
                                sender1.putExtra("item"+j,"Butter Naan");
                                sender1.putExtra("qty"+j,String.valueOf(bn.qty));
                                ++j;
                                break;
                            case 2:
                                sender1.putExtra("item"+j,"Jeera Rice");
                                sender1.putExtra("qty"+j,String.valueOf(jr.qty));
                                ++j;
                                break;
                            case 3:
                                sender1.putExtra("item"+j,"Kajupanner");
                                sender1.putExtra("qty"+j,String.valueOf(kp.qty));
                                ++j;
                                break;
                            case 4:
                                sender1.putExtra("item"+j,"Kulcha");
                                sender1.putExtra("qty"+j,String.valueOf(kul.qty));
                                ++j;
                                break;
                            case 5:
                                sender1.putExtra("item"+j,"Mushroom Masala");
                                sender1.putExtra("qty"+j,String.valueOf(mm.qty));
                                ++j;
                                break;
                            case 6:
                                sender1.putExtra("item"+j,"Panner 65");
                                sender1.putExtra("qty"+j,String.valueOf(panner65.qty));
                                ++j;
                                break;
                            case 7:
                                sender1.putExtra("item"+j,"Roti");
                                sender1.putExtra("qty"+j,String.valueOf(roti.qty));
                                ++j;
                                break;
                            case 8:
                                sender1.putExtra("item"+j,"Veg 65");
                                sender1.putExtra("qty"+j,String.valueOf(veg65.qty));
                                ++j;
                                break;
                            case 9:
                                sender1.putExtra("item"+j,"Veg Meals");
                                sender1.putExtra("qty"+j,String.valueOf(vegmeals.qty));
                                ++j;
                                break;
                            case 10:
                                sender1.putExtra("item"+j,"Veg Pulao");
                                sender1.putExtra("qty"+j,String.valueOf(vegpulao.qty));
                                ++j;
                                break;

                        }
                    }
                }

                startActivity(sender1);
            }
        });

        back1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(indian.this, Category.class);
                startActivity(intent);
            }
        });
        pbm_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (pbm.qty!=0){
                    pbm.qty=pbm.qty-1;
                    pbmval.setText(String.valueOf(pbm.qty));
                }
                if(pbm.qty==0){
                    flag[0]=0;
                }
            }
        });
        pbm_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               pbm.qty=pbm.qty+1;
                pbmval.setText(String.valueOf(pbm.qty));
                if(flag[0]==0){
                    flag[0]=1;
                }

            }
        });
        bn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (bn.qty!=0){
                    bn.qty=bn.qty-1;
                    bnval.setText(String.valueOf(bn.qty));
                }
                if(bn.qty==0){
                    flag[1]=0;
                }
            }
        });
        bn_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                bn.qty=bn.qty+1;
                bnval.setText(String.valueOf(bn.qty));
                if(flag[1]==0){
                    flag[1]=1;
                }

            }
        });
        jr_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (jr.qty!=0){
                    jr.qty=jr.qty-1;
                    jrval.setText(String.valueOf(jr.qty));
                }
                if(jr.qty==0){
                    flag[2]=0;
                }
            }
        });
        jr_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                jr.qty=jr.qty+1;
                jrval.setText(String.valueOf(jr.qty));
                if(flag[2]==0){
                    flag[2]=1;
                }

            }
        });
        kp_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (kp.qty!=0){
                    kp.qty=kp.qty-1;
                    kpval.setText(String.valueOf(kp.qty));
                }
                if(kp.qty==0){
                    flag[3]=0;
                }
            }
        });
        kp_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                kp.qty=kp.qty+1;
                kpval.setText(String.valueOf(kp.qty));
                if(flag[3]==0){
                    flag[3]=1;
                }

            }
        });
        kul_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (kul.qty!=0){
                    kul.qty=kul.qty-1;
                    kulval.setText(String.valueOf(kul.qty));
                }
                if(kul.qty==0){
                    flag[4]=0;
                }
            }
        });
        kul_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                kul.qty=kul.qty+1;
                kulval.setText(String.valueOf(kul.qty));
                if(flag[4]==0){
                    flag[4]=1;
                }

            }
        });
        mm_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (mm.qty!=0){
                    mm.qty=mm.qty-1;
                    mmval.setText(String.valueOf(mm.qty));
                }
                if(mm.qty==0){
                    flag[5]=0;
                }
            }
        });
        mm_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mm.qty=mm.qty+1;
                mmval.setText(String.valueOf(mm.qty));
                if(flag[5]==0){
                    flag[5]=1;
                }

            }
        });
        panner65_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (panner65.qty!=0){
                    panner65.qty=panner65.qty-1;
                    panner65val.setText(String.valueOf(panner65.qty));
                }
                if(panner65.qty==0){
                    flag[6]=0;
                }
            }
        });
        panner65_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                panner65.qty=panner65.qty+1;
                panner65val.setText(String.valueOf(panner65.qty));
                if(flag[6]==0){
                    flag[6]=1;
                }

            }
        });
        roti_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (roti.qty!=0){
                    roti.qty=roti.qty-1;
                    rotival.setText(String.valueOf(roti.qty));
                }
                if(roti.qty==0){
                    flag[7]=0;
                }
            }
        });
        roti_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                roti.qty=roti.qty+1;
                rotival.setText(String.valueOf(roti.qty));
                if(flag[7]==0){
                    flag[7]=1;
                }

            }
        });
        veg65_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (veg65.qty!=0){
                    veg65.qty=veg65.qty-1;
                    veg65val.setText(String.valueOf(veg65.qty));
                }
                if(veg65.qty==0){
                    flag[8]=0;
                }
            }
        });
        veg65_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                veg65.qty=veg65.qty+1;
                veg65val.setText(String.valueOf(veg65.qty));
                if(flag[8]==0){
                    flag[8]=1;
                }

            }
        });
        vegmeals_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (vegmeals.qty!=0){
                    vegmeals.qty=vegmeals.qty-1;
                    vegmealsval.setText(String.valueOf(vegmeals.qty));
                }
                if(vegmeals.qty==0){
                    flag[9]=0;
                }
            }
        });
        vegmeals_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                vegmeals.qty=vegmeals.qty+1;
                vegmealsval.setText(String.valueOf(vegmeals.qty));
                if(flag[9]==0){
                    flag[9]=1;
                }

            }
        });
        vegpulao_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (vegpulao.qty!=0){
                    vegpulao.qty=vegpulao.qty-1;
                    vegpulaoval.setText(String.valueOf(vegpulao.qty));
                }
                if(vegpulao.qty==0){
                    flag[10]=0;
                }
            }
        });
        vegpulao_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                vegpulao.qty=vegpulao.qty+1;
                vegpulaoval.setText(String.valueOf(vegpulao.qty));
                if(flag[10]==0){
                    flag[10]=1;
                }

            }
        });
    }
    }
