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

public val Icons.Filled.CopyAlt: ImageVector
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
                    moveTo(16.8602f, 5.0f)
                    horizontalLineTo(12.0002f)
                    verticalLineTo(0.016f)
                    lineTo(16.8602f, 5.0f)
                    close()
                    moveTo(10.0002f, 7.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 0.0f, 3.4414f, 0.3161f, 2.8788f, 0.8787f)
                    curveTo(2.3162f, 1.4413f, 2.0001f, 2.2043f, 2.0001f, 3.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(10.0002f)
                    close()
                    moveTo(19.0002f, 7.01f)
                    verticalLineTo(21.038f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0002f)
                    verticalLineTo(10.0f)
                    lineTo(19.0002f, 7.01f)
                    close()
                }
            }
        }
        .build()
        return _copyAlt!!
    }

private var _copyAlt: ImageVector? = null
