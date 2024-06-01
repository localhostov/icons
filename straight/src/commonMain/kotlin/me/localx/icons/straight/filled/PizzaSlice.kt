package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

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
                    moveTo(16.9f, 20.9578f)
                    lineTo(15.676f, 23.9998f)
                    horizontalLineTo(15.0f)
                    curveTo(11.0231f, 23.9953f, 7.2104f, 22.4135f, 4.3984f, 19.6015f)
                    curveTo(1.5863f, 16.7894f, 0.0045f, 12.9767f, 0.0f, 8.9998f)
                    lineTo(0.0f, 8.3238f)
                    lineTo(3.042f, 7.0998f)
                    curveTo(3.454f, 15.4588f, 8.541f, 20.5458f, 16.9f, 20.9578f)
                    close()
                    moveTo(23.832f, 3.6728f)
                    lineTo(17.687f, 18.9888f)
                    curveTo(9.613f, 18.8738f, 5.126f, 14.3888f, 5.011f, 6.3138f)
                    lineTo(20.3f, 0.1808f)
                    curveTo(20.7895f, -0.0042f, 21.3217f, -0.0449f, 21.8336f, 0.0636f)
                    curveTo(22.3455f, 0.1721f, 22.8155f, 0.4252f, 23.1878f, 0.7929f)
                    curveTo(23.5601f, 1.1606f, 23.8191f, 1.6274f, 23.934f, 2.1379f)
                    curveTo(24.0489f, 2.6484f, 24.0149f, 3.1811f, 23.836f, 3.6728f)
                    horizontalLineTo(23.832f)
                    close()
                    moveTo(13.0f, 10.9998f)
                    curveTo(13.0f, 10.4694f, 12.7893f, 9.9607f, 12.4142f, 9.5856f)
                    curveTo(12.0391f, 9.2105f, 11.5304f, 8.9998f, 11.0f, 8.9998f)
                    curveTo(10.4696f, 8.9998f, 9.9609f, 9.2105f, 9.5858f, 9.5856f)
                    curveTo(9.2107f, 9.9607f, 9.0f, 10.4694f, 9.0f, 10.9998f)
                    curveTo(9.0f, 11.5303f, 9.2107f, 12.039f, 9.5858f, 12.414f)
                    curveTo(9.9609f, 12.7891f, 10.4696f, 12.9998f, 11.0f, 12.9998f)
                    curveTo(11.5304f, 12.9998f, 12.0391f, 12.7891f, 12.4142f, 12.414f)
                    curveTo(12.7893f, 12.039f, 13.0f, 11.5303f, 13.0f, 10.9998f)
                    close()
                    moveTo(18.784f, 10.8828f)
                    lineTo(20.63f, 6.2828f)
                    curveTo(20.3225f, 6.1284f, 19.9862f, 6.0395f, 19.6426f, 6.0217f)
                    curveTo(19.2989f, 6.0039f, 18.9553f, 6.0576f, 18.6335f, 6.1795f)
                    curveTo(18.3116f, 6.3013f, 18.0186f, 6.4886f, 17.7729f, 6.7295f)
                    curveTo(17.5271f, 6.9705f, 17.3341f, 7.2598f, 17.2059f, 7.5791f)
                    curveTo(17.0778f, 7.8985f, 17.0173f, 8.241f, 17.0283f, 8.5849f)
                    curveTo(17.0393f, 8.9289f, 17.1216f, 9.2668f, 17.2699f, 9.5773f)
                    curveTo(17.4182f, 9.8878f, 17.6294f, 10.1642f, 17.89f, 10.3889f)
                    curveTo(18.1506f, 10.6136f, 18.455f, 10.7818f, 18.784f, 10.8828f)
                    close()
                }
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
