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

public val Icons.Filled.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.0f, 0.0f)
                    horizontalLineTo(19.0f)
                    curveTo(21.7614f, 0.0f, 24.0f, 2.2386f, 24.0f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(24.0f, 21.7614f, 21.7614f, 24.0f, 19.0f, 24.0f)
                    horizontalLineTo(5.0f)
                    curveTo(2.2386f, 24.0f, 0.0f, 21.7614f, 0.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(0.0f, 2.2386f, 2.2386f, 0.0f, 5.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
