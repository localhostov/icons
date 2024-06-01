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

public val Icons.Filled.ShoppingBag: ImageVector
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
                    moveTo(24.0f, 9.0f)
                    curveTo(24.0f, 8.2044f, 23.6839f, 7.4413f, 23.1213f, 6.8787f)
                    curveTo(22.5587f, 6.3161f, 21.7956f, 6.0f, 21.0f, 6.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.0f, 4.4087f, 17.3679f, 2.8826f, 16.2426f, 1.7574f)
                    curveTo(15.1174f, 0.6321f, 13.5913f, 0.0f, 12.0f, 0.0f)
                    curveTo(10.4087f, 0.0f, 8.8826f, 0.6321f, 7.7574f, 1.7574f)
                    curveTo(6.6321f, 2.8826f, 6.0f, 4.4087f, 6.0f, 6.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 6.0f, 1.4413f, 6.3161f, 0.8787f, 6.8787f)
                    curveTo(0.3161f, 7.4413f, 0.0f, 8.2044f, 0.0f, 9.0f)
                    lineTo(0.0f, 19.0f)
                    curveTo(0.0016f, 20.3256f, 0.5289f, 21.5964f, 1.4662f, 22.5338f)
                    curveTo(2.4036f, 23.4711f, 3.6744f, 23.9984f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9984f, 21.5964f, 23.4711f, 22.5338f, 22.5338f)
                    curveTo(23.4711f, 21.5964f, 23.9984f, 20.3256f, 24.0f, 19.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(8.0f, 6.0f)
                    curveTo(8.0f, 4.9391f, 8.4214f, 3.9217f, 9.1716f, 3.1716f)
                    curveTo(9.9217f, 2.4214f, 10.9391f, 2.0f, 12.0f, 2.0f)
                    curveTo(13.0609f, 2.0f, 14.0783f, 2.4214f, 14.8284f, 3.1716f)
                    curveTo(15.5786f, 3.9217f, 16.0f, 4.9391f, 16.0f, 6.0f)
                    horizontalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
