package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.4238f, 21.9744f)
                    curveTo(15.844f, 22.7647f, 15.0424f, 23.3649f, 14.1208f, 23.6986f)
                    curveTo(13.1991f, 24.0322f, 12.1991f, 24.0844f, 11.2478f, 23.8484f)
                    curveTo(8.5949f, 23.1203f, 6.177f, 21.7146f, 4.2318f, 19.7694f)
                    curveTo(2.2865f, 17.8241f, 0.8808f, 15.4063f, 0.1528f, 12.7534f)
                    curveTo(-0.0826f, 11.8031f, -0.0301f, 10.8042f, 0.3036f, 9.8839f)
                    curveTo(0.6373f, 8.9635f, 1.2371f, 8.163f, 2.0268f, 7.5844f)
                    curveTo(2.0371f, 11.3989f, 3.5574f, 15.0541f, 6.2554f, 17.7507f)
                    curveTo(8.9533f, 20.4473f, 12.6093f, 21.9659f, 16.4238f, 21.9744f)
                    close()
                    moveTo(23.8318f, 3.6744f)
                    lineTo(17.3998f, 20.0004f)
                    horizontalLineTo(16.9998f)
                    curveTo(15.2766f, 20.0598f, 13.5595f, 19.7642f, 11.9554f, 19.1319f)
                    curveTo(10.3513f, 18.4997f, 8.8944f, 17.5442f, 7.6751f, 16.325f)
                    curveTo(6.4559f, 15.1058f, 5.5005f, 13.6488f, 4.8682f, 12.0447f)
                    curveTo(4.2359f, 10.4406f, 3.9403f, 8.7236f, 3.9998f, 7.0004f)
                    verticalLineTo(6.6004f)
                    lineTo(20.2998f, 0.1784f)
                    curveTo(20.789f, 7.0E-4f, 21.3186f, -0.0344f, 21.827f, 0.0771f)
                    curveTo(22.3354f, 0.1886f, 22.8017f, 0.4421f, 23.1717f, 0.8082f)
                    curveTo(23.5417f, 1.1743f, 23.8001f, 1.6379f, 23.917f, 2.1451f)
                    curveTo(24.0338f, 2.6523f, 24.0043f, 3.1823f, 23.8318f, 3.6734f)
                    verticalLineTo(3.6744f)
                    close()
                    moveTo(11.9998f, 10.0004f)
                    curveTo(11.9998f, 9.4699f, 11.7891f, 8.9612f, 11.414f, 8.5862f)
                    curveTo(11.0389f, 8.2111f, 10.5302f, 8.0004f, 9.9998f, 8.0004f)
                    curveTo(9.4693f, 8.0004f, 8.9606f, 8.2111f, 8.5856f, 8.5862f)
                    curveTo(8.2105f, 8.9612f, 7.9998f, 9.4699f, 7.9998f, 10.0004f)
                    curveTo(7.9998f, 10.5308f, 8.2105f, 11.0395f, 8.5856f, 11.4146f)
                    curveTo(8.9606f, 11.7896f, 9.4693f, 12.0004f, 9.9998f, 12.0004f)
                    curveTo(10.5302f, 12.0004f, 11.0389f, 11.7896f, 11.414f, 11.4146f)
                    curveTo(11.7891f, 11.0395f, 11.9998f, 10.5308f, 11.9998f, 10.0004f)
                    close()
                    moveTo(18.1218f, 12.7164f)
                    lineTo(20.6758f, 6.2304f)
                    curveTo(16.4158f, 4.7384f, 14.0578f, 10.9064f, 18.1218f, 12.7164f)
                    close()
                }
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
