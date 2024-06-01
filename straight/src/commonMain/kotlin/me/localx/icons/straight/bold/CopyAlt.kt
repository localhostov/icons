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

public val Icons.Bold.CopyAlt: ImageVector
    get() {
        if (_copyAlt != null) {
            return _copyAlt!!
        }
        _copyAlt = Builder(name = "CopyAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 4.879f)
                    lineTo(12.1212f, 0.0f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 0.0f, 3.4414f, 0.3161f, 2.8788f, 0.8787f)
                    curveTo(2.3162f, 1.4413f, 2.0001f, 2.2043f, 2.0001f, 3.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(4.879f)
                    close()
                    moveTo(5.0002f, 16.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(10.0002f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(5.0002f)
                    close()
                    moveTo(22.0002f, 9.879f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(6.879f)
                    lineTo(22.0002f, 9.879f)
                    close()
                }
            }
        }
        .build()
        return _copyAlt!!
    }

private var _copyAlt: ImageVector? = null
