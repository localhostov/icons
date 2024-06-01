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

public val Icons.Bold.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 6.0f)
                    curveTo(18.0f, 4.4087f, 17.3679f, 2.8826f, 16.2426f, 1.7574f)
                    curveTo(15.1174f, 0.6321f, 13.5913f, 0.0f, 12.0f, 0.0f)
                    curveTo(10.4087f, 0.0f, 8.8826f, 0.6321f, 7.7574f, 1.7574f)
                    curveTo(6.6321f, 2.8826f, 6.0f, 4.4087f, 6.0f, 6.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0f)
                    curveTo(0.0f, 21.7956f, 0.3161f, 22.5587f, 0.8787f, 23.1213f)
                    curveTo(1.4413f, 23.6839f, 2.2043f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 24.0f, 22.5587f, 23.6839f, 23.1213f, 23.1213f)
                    curveTo(23.6839f, 22.5587f, 24.0f, 21.7956f, 24.0f, 21.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(18.0f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(12.7956f, 3.0f, 13.5587f, 3.3161f, 14.1213f, 3.8787f)
                    curveTo(14.6839f, 4.4413f, 15.0f, 5.2043f, 15.0f, 6.0f)
                    horizontalLineTo(9.0f)
                    curveTo(9.0f, 5.2043f, 9.3161f, 4.4413f, 9.8787f, 3.8787f)
                    curveTo(10.4413f, 3.3161f, 11.2044f, 3.0f, 12.0f, 3.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
