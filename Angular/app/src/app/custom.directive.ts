import { Directive, ElementRef, HostBinding, HostListener } from '@angular/core';

@Directive({
    selector  : '[custDir]'
})


export class CustomDirective{
    constructor(private e1 : ElementRef){
this.e1.nativeElement.style.backgroundColor = 'red';

    }
    @HostBinding('style.backgroundColor') backgroundColor = 'yellow';
    @HostListener('mouseenter') mouseEnterEvent() {
        this.e1.nativeElement.style.backgroundColor = 'brown';
    }
    @HostListener('mouseleave') mouseLeaveEvent(){
        this.e1.nativeElement.style.backgroundColor = 'yellow';
    }
}