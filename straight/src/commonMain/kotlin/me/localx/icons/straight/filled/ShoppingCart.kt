package me.localx.icons.straight.filled

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

public val Icons.Filled.ShoppingCart: ImageVector
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
                    moveTo(24.0f, 3.0f)
                    horizontalLineTo(4.242f)
                    lineTo(4.2f, 2.649f)
                    curveTo(4.114f, 1.9194f, 3.7634f, 1.2467f, 3.2145f, 0.7585f)
                    curveTo(2.6656f, 0.2702f, 1.9566f, 3.0E-4f, 1.222f, 0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(1.222f)
                    curveTo(1.4669f, 2.0f, 1.7033f, 2.09f, 1.8864f, 2.2527f)
                    curveTo(2.0694f, 2.4155f, 2.1863f, 2.6398f, 2.215f, 2.883f)
                    lineTo(3.8f, 16.351f)
                    curveTo(3.886f, 17.0806f, 4.2366f, 17.7533f, 4.7855f, 18.2415f)
                    curveTo(5.3344f, 18.7298f, 6.0434f, 18.9997f, 6.778f, 19.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(6.778f)
                    curveTo(6.5329f, 16.9999f, 6.2964f, 16.9099f, 6.1133f, 16.7469f)
                    curveTo(5.9303f, 16.5839f, 5.8134f, 16.3594f, 5.785f, 16.116f)
                    lineTo(5.654f, 15.0f)
                    horizontalLineTo(21.836f)
                    lineTo(24.0f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0001f, 24.0006f)
                    curveTo(8.1047f, 24.0006f, 9.0001f, 23.1052f, 9.0001f, 22.0006f)
                    curveTo(9.0001f, 20.896f, 8.1047f, 20.0006f, 7.0001f, 20.0006f)
                    curveTo(5.8955f, 20.0006f, 5.0001f, 20.896f, 5.0001f, 22.0006f)
                    curveTo(5.0001f, 23.1052f, 5.8955f, 24.0006f, 7.0001f, 24.0006f)
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
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
