package me.localx.icons.straight.outline

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

public val Icons.Outline.Bank: ImageVector
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
                    moveTo(-0.0f, 22.0001f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0001f)
                    horizontalLineTo(-0.0f)
                    verticalLineTo(22.0001f)
                    close()
                    moveTo(24.0f, 7.9091f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.0001f)
                    horizontalLineTo(23.0f)
                    verticalLineTo(20.0001f)
                    horizontalLineTo(1.0f)
                    verticalLineTo(18.0001f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(-0.0f)
                    verticalLineTo(7.9091f)
                    curveTo(-1.0E-4f, 7.3701f, 0.145f, 6.8411f, 0.42f, 6.3776f)
                    curveTo(0.6951f, 5.9141f, 1.0899f, 5.5332f, 1.563f, 5.2751f)
                    lineTo(10.563f, 0.3661f)
                    curveTo(11.0036f, 0.1249f, 11.4977f, -0.0015f, 12.0f, -0.0015f)
                    curveTo(12.5022f, -0.0015f, 12.9964f, 0.1249f, 13.437f, 0.3661f)
                    lineTo(22.437f, 5.2751f)
                    curveTo(22.9101f, 5.5332f, 23.3049f, 5.9141f, 23.58f, 6.3776f)
                    curveTo(23.855f, 6.8411f, 24.0001f, 7.3701f, 24.0f, 7.9091f)
                    close()
                    moveTo(5.0f, 18.0001f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(18.0001f)
                    close()
                    moveTo(10.0f, 10.0001f)
                    verticalLineTo(18.0001f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(10.0001f)
                    horizontalLineTo(10.0f)
                    close()
                    moveTo(19.0f, 10.0001f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(18.0001f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(10.0001f)
                    close()
                    moveTo(22.0f, 7.9091f)
                    curveTo(22.0f, 7.7294f, 21.9517f, 7.5531f, 21.86f, 7.3986f)
                    curveTo(21.7683f, 7.2441f, 21.6367f, 7.1171f, 21.479f, 7.0311f)
                    lineTo(12.479f, 2.1221f)
                    curveTo(12.3321f, 2.0419f, 12.1674f, 1.9999f, 12.0f, 1.9999f)
                    curveTo(11.8326f, 1.9999f, 11.6679f, 2.0419f, 11.521f, 2.1221f)
                    lineTo(2.521f, 7.0311f)
                    curveTo(2.3633f, 7.1171f, 2.2317f, 7.2441f, 2.14f, 7.3986f)
                    curveTo(2.0483f, 7.5531f, 2.0f, 7.7294f, 2.0f, 7.9091f)
                    verticalLineTo(8.0001f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(7.9091f)
                    close()
                }
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
