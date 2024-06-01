package me.localx.icons.straight.bold

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

public val Icons.Bold.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.4111f, 1.5f)
                    curveTo(23.0988f, 1.0382f, 22.6781f, 0.6601f, 22.1858f, 0.3986f)
                    curveTo(21.6934f, 0.1371f, 21.1445f, 2.0E-4f, 20.5871f, 0.0f)
                    horizontalLineTo(3.4131f)
                    curveTo(2.8562f, -4.0E-4f, 2.3077f, 0.1357f, 1.8155f, 0.3964f)
                    curveTo(1.3233f, 0.657f, 0.9025f, 1.0342f, 0.5899f, 1.4951f)
                    curveTo(0.2772f, 1.956f, 0.0822f, 2.4864f, 0.0219f, 3.04f)
                    curveTo(-0.0384f, 3.5937f, 0.0379f, 4.1536f, 0.2441f, 4.671f)
                    curveTo(1.0943f, 6.7713f, 2.4961f, 8.6029f, 4.3014f, 9.9722f)
                    curveTo(6.1067f, 11.3414f, 8.2484f, 12.1975f, 10.5001f, 12.45f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(13.5001f)
                    verticalLineTo(12.45f)
                    curveTo(15.7518f, 12.1975f, 17.8935f, 11.3414f, 19.6988f, 9.9722f)
                    curveTo(21.5041f, 8.6029f, 22.9059f, 6.7713f, 23.7561f, 4.671f)
                    curveTo(23.9619f, 4.1544f, 24.038f, 3.5954f, 23.9779f, 3.0426f)
                    curveTo(23.9177f, 2.4898f, 23.7231f, 1.9602f, 23.4111f, 1.5f)
                    close()
                    moveTo(12.0001f, 9.541f)
                    curveTo(10.1591f, 9.5604f, 8.3516f, 9.0479f, 6.7948f, 8.065f)
                    curveTo(5.238f, 7.082f, 3.9981f, 5.6705f, 3.2241f, 4.0f)
                    horizontalLineTo(20.7761f)
                    curveTo(20.0021f, 5.6705f, 18.7622f, 7.082f, 17.2054f, 8.065f)
                    curveTo(15.6486f, 9.0479f, 13.8411f, 9.5604f, 12.0001f, 9.541f)
                    close()
                }
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
