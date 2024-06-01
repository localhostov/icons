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

public val Icons.Filled.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 10.0001f)
                    verticalLineTo(7.9091f)
                    curveTo(24.0001f, 7.3701f, 23.855f, 6.8411f, 23.58f, 6.3776f)
                    curveTo(23.3049f, 5.9141f, 22.9101f, 5.5332f, 22.437f, 5.2751f)
                    lineTo(13.437f, 0.3661f)
                    curveTo(12.9964f, 0.1249f, 12.5022f, -0.0015f, 12.0f, -0.0015f)
                    curveTo(11.4977f, -0.0015f, 11.0036f, 0.1249f, 10.563f, 0.3661f)
                    lineTo(1.563f, 5.2751f)
                    curveTo(1.0899f, 5.5332f, 0.6951f, 5.9141f, 0.42f, 6.3776f)
                    curveTo(0.145f, 6.8411f, -1.0E-4f, 7.3701f, -0.0f, 7.9091f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(19.0001f)
                    horizontalLineTo(1.0f)
                    verticalLineTo(22.0001f)
                    horizontalLineTo(-0.0f)
                    verticalLineTo(24.0001f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(22.0001f)
                    horizontalLineTo(23.0f)
                    verticalLineTo(19.0001f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(14.0f, 10.0001f)
                    verticalLineTo(19.0001f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(14.0f)
                    close()
                    moveTo(5.0f, 10.0001f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(19.0001f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(10.0001f)
                    close()
                    moveTo(19.0f, 19.0001f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(19.0001f)
                    close()
                }
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
