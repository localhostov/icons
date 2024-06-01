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

public val Icons.Filled.DrinkAlt: ImageVector
    get() {
        if (_drinkAlt != null) {
            return _drinkAlt!!
        }
        _drinkAlt = Builder(name = "DrinkAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.8827f, 2.0f)
                    lineTo(14.6317f, 4.0f)
                    horizontalLineTo(12.6157f)
                    lineTo(13.1157f, 0.0f)
                    horizontalLineTo(19.9997f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(14.8827f)
                    close()
                    moveTo(2.6607f, 5.122f)
                    curveTo(2.3865f, 5.4579f, 2.1905f, 5.8505f, 2.0867f, 6.2715f)
                    curveTo(1.9829f, 6.6924f, 1.9741f, 7.1312f, 2.0607f, 7.556f)
                    lineTo(2.3617f, 10.0f)
                    horizontalLineTo(11.8617f)
                    lineTo(12.6137f, 4.0f)
                    horizontalLineTo(4.9997f)
                    curveTo(4.5505f, 3.9991f, 4.107f, 4.0995f, 3.702f, 4.2937f)
                    curveTo(3.297f, 4.488f, 2.9411f, 4.7711f, 2.6607f, 5.122f)
                    close()
                    moveTo(21.3407f, 5.122f)
                    curveTo(21.0602f, 4.7708f, 20.7039f, 4.4875f, 20.2986f, 4.2932f)
                    curveTo(19.8932f, 4.0989f, 19.4492f, 3.9987f, 18.9997f, 4.0f)
                    horizontalLineTo(14.6317f)
                    lineTo(13.8797f, 10.0f)
                    horizontalLineTo(21.6327f)
                    lineTo(21.9267f, 7.653f)
                    curveTo(22.0258f, 7.2147f, 22.0246f, 6.7597f, 21.9231f, 6.3219f)
                    curveTo(21.8216f, 5.8842f, 21.6225f, 5.475f, 21.3407f, 5.125f)
                    verticalLineTo(5.122f)
                    close()
                    moveTo(12.6257f, 20.0f)
                    horizontalLineTo(10.6097f)
                    lineTo(11.6097f, 12.0f)
                    horizontalLineTo(2.6097f)
                    lineTo(4.1097f, 24.0f)
                    horizontalLineTo(19.8827f)
                    lineTo(21.3827f, 12.0f)
                    horizontalLineTo(13.6287f)
                    lineTo(12.6257f, 20.0f)
                    close()
                }
            }
        }
        .build()
        return _drinkAlt!!
    }

private var _drinkAlt: ImageVector? = null
