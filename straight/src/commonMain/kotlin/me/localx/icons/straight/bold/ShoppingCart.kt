package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.9999f, 24.0006f)
                    curveTo(8.1045f, 24.0006f, 8.9999f, 23.1052f, 8.9999f, 22.0006f)
                    curveTo(8.9999f, 20.896f, 8.1045f, 20.0006f, 6.9999f, 20.0006f)
                    curveTo(5.8954f, 20.0006f, 4.9999f, 20.896f, 4.9999f, 22.0006f)
                    curveTo(4.9999f, 23.1052f, 5.8954f, 24.0006f, 6.9999f, 24.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 24.0006f)
                    curveTo(18.1046f, 24.0006f, 19.0f, 23.1052f, 19.0f, 22.0006f)
                    curveTo(19.0f, 20.896f, 18.1046f, 20.0006f, 17.0f, 20.0006f)
                    curveTo(15.8954f, 20.0006f, 15.0f, 20.896f, 15.0f, 22.0006f)
                    curveTo(15.0f, 23.1052f, 15.8954f, 24.0006f, 17.0f, 24.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.654f, 5.0f)
                    lineTo(5.391f, 2.938f)
                    curveTo(5.2955f, 2.1287f, 4.9064f, 1.3826f, 4.2974f, 0.841f)
                    curveTo(3.6884f, 0.2995f, 2.9019f, 3.0E-4f, 2.087f, 0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(2.087f)
                    curveTo(2.1688f, 3.0009f, 2.2474f, 3.032f, 2.3076f, 3.0874f)
                    curveTo(2.3678f, 3.1428f, 2.4053f, 3.2185f, 2.413f, 3.3f)
                    lineTo(3.913f, 15.059f)
                    curveTo(4.0076f, 15.8689f, 4.3964f, 16.6159f, 5.0055f, 17.1581f)
                    curveTo(5.6146f, 17.7003f, 6.4016f, 17.9999f, 7.217f, 18.0f)
                    horizontalLineTo(20.4f)
                    lineTo(23.974f, 5.0f)
                    horizontalLineTo(5.654f)
                    close()
                    moveTo(18.112f, 15.0f)
                    horizontalLineTo(7.217f)
                    curveTo(7.1352f, 14.9993f, 7.0567f, 14.9682f, 6.9966f, 14.9128f)
                    curveTo(6.9365f, 14.8573f, 6.8992f, 14.7815f, 6.892f, 14.7f)
                    lineTo(6.037f, 8.0f)
                    horizontalLineTo(20.037f)
                    lineTo(18.112f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
