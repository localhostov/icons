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

public val Icons.Filled.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 18.9994f)
                    verticalLineTo(3.9994f)
                    curveTo(24.0f, 3.2037f, 23.6839f, 2.4407f, 23.1213f, 1.8781f)
                    curveTo(22.5587f, 1.3155f, 21.7956f, 0.9994f, 21.0f, 0.9994f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.9994f, 1.4413f, 1.3155f, 0.8787f, 1.8781f)
                    curveTo(0.3161f, 2.4407f, 0.0f, 3.2037f, 0.0f, 3.9994f)
                    lineTo(0.0f, 18.9994f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(20.9994f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(22.9994f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(20.9994f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(18.9994f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(9.035f, 10.9994f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(8.9994f)
                    horizontalLineTo(7.965f)
                    lineTo(10.624f, 5.0114f)
                    lineTo(13.624f, 11.0114f)
                    lineTo(14.965f, 8.9994f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(10.9994f)
                    horizontalLineTo(16.035f)
                    lineTo(13.376f, 14.9874f)
                    lineTo(10.376f, 8.9874f)
                    lineTo(9.035f, 10.9994f)
                    close()
                }
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
