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

public val Icons.Outline.CopyAlt: ImageVector
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
                    moveTo(18.0002f, 5.086f)
                    lineTo(12.9142f, 0.0f)
                    horizontalLineTo(5.0002f)
                    curveTo(4.2045f, 0.0f, 3.4414f, 0.3161f, 2.8788f, 0.8787f)
                    curveTo(2.3162f, 1.4413f, 2.0001f, 2.2043f, 2.0001f, 3.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(18.0002f)
                    verticalLineTo(5.086f)
                    close()
                    moveTo(4.0002f, 18.0f)
                    verticalLineTo(3.0f)
                    curveTo(4.0002f, 2.7348f, 4.1055f, 2.4804f, 4.293f, 2.2929f)
                    curveTo(4.4806f, 2.1054f, 4.7349f, 2.0f, 5.0002f, 2.0f)
                    horizontalLineTo(12.0002f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(16.0002f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(4.0002f)
                    close()
                    moveTo(22.0002f, 9.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(20.0002f)
                    verticalLineTo(7.0f)
                    lineTo(22.0002f, 9.0f)
                    close()
                }
            }
        }
        .build()
        return _copyAlt!!
    }

private var _copyAlt: ImageVector? = null
