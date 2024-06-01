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

public val Icons.Filled.ShoppingBagAdd: ImageVector
    get() {
        if (_shoppingBagAdd != null) {
            return _shoppingBagAdd!!
        }
        _shoppingBagAdd = Builder(name = "ShoppingBagAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 19.0f)
                    curveTo(14.0f, 17.8418f, 14.3353f, 16.7083f, 14.9653f, 15.7364f)
                    curveTo(15.5954f, 14.7645f, 16.4932f, 13.9957f, 17.5506f, 13.5229f)
                    curveTo(18.6079f, 13.05f, 19.7795f, 12.8933f, 20.9239f, 13.0717f)
                    curveTo(22.0684f, 13.2501f, 23.1367f, 13.7558f, 24.0f, 14.528f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.0f, 4.4087f, 17.3679f, 2.8826f, 16.2426f, 1.7574f)
                    curveTo(15.1174f, 0.6321f, 13.5913f, 0.0f, 12.0f, 0.0f)
                    curveTo(10.4087f, 0.0f, 8.8826f, 0.6321f, 7.7574f, 1.7574f)
                    curveTo(6.6321f, 2.8826f, 6.0f, 4.4087f, 6.0f, 6.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0f)
                    curveTo(0.0f, 21.7956f, 0.3161f, 22.5587f, 0.8787f, 23.1213f)
                    curveTo(1.4413f, 23.6839f, 2.2043f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(16.683f)
                    curveTo(15.8576f, 23.453f, 15.1805f, 22.7101f, 14.7124f, 21.8376f)
                    curveTo(14.2442f, 20.9651f, 13.9994f, 19.9902f, 14.0f, 19.0f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(13.0609f, 2.0f, 14.0783f, 2.4214f, 14.8284f, 3.1716f)
                    curveTo(15.5786f, 3.9217f, 16.0f, 4.9391f, 16.0f, 6.0f)
                    horizontalLineTo(8.0f)
                    curveTo(8.0f, 4.9391f, 8.4214f, 3.9217f, 9.1716f, 3.1716f)
                    curveTo(9.9217f, 2.4214f, 10.9391f, 2.0f, 12.0f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9997f, 17.9994f)
                    horizontalLineTo(20.9997f)
                    verticalLineTo(15.9994f)
                    horizontalLineTo(18.9997f)
                    verticalLineTo(17.9994f)
                    horizontalLineTo(16.9997f)
                    verticalLineTo(19.9994f)
                    horizontalLineTo(18.9997f)
                    verticalLineTo(21.9994f)
                    horizontalLineTo(20.9997f)
                    verticalLineTo(19.9994f)
                    horizontalLineTo(22.9997f)
                    verticalLineTo(17.9994f)
                    close()
                }
            }
        }
        .build()
        return _shoppingBagAdd!!
    }

private var _shoppingBagAdd: ImageVector? = null
