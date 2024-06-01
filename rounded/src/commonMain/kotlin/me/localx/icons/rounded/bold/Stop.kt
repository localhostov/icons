package me.localx.icons.rounded.bold

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

public val Icons.Bold.Stop: ImageVector
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
                    moveTo(18.5f, 0.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 0.0016f, 2.6438f, 0.5816f, 1.6127f, 1.6127f)
                    curveTo(0.5816f, 2.6438f, 0.0016f, 4.0418f, 0.0f, 5.5f)
                    lineTo(0.0f, 18.5f)
                    curveTo(0.0016f, 19.9582f, 0.5816f, 21.3562f, 1.6127f, 22.3873f)
                    curveTo(2.6438f, 23.4184f, 4.0418f, 23.9984f, 5.5f, 24.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 23.9984f, 21.3562f, 23.4184f, 22.3873f, 22.3873f)
                    curveTo(23.4184f, 21.3562f, 23.9984f, 19.9582f, 24.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(23.9984f, 4.0418f, 23.4184f, 2.6438f, 22.3873f, 1.6127f)
                    curveTo(21.3562f, 0.5816f, 19.9582f, 0.0016f, 18.5f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(21.0f, 18.5f)
                    curveTo(21.0f, 19.163f, 20.7366f, 19.7989f, 20.2678f, 20.2678f)
                    curveTo(19.7989f, 20.7366f, 19.163f, 21.0f, 18.5f, 21.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 21.0f, 4.2011f, 20.7366f, 3.7322f, 20.2678f)
                    curveTo(3.2634f, 19.7989f, 3.0f, 19.163f, 3.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(3.0f, 4.837f, 3.2634f, 4.2011f, 3.7322f, 3.7322f)
                    curveTo(4.2011f, 3.2634f, 4.837f, 3.0f, 5.5f, 3.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.163f, 3.0f, 19.7989f, 3.2634f, 20.2678f, 3.7322f)
                    curveTo(20.7366f, 4.2011f, 21.0f, 4.837f, 21.0f, 5.5f)
                    verticalLineTo(18.5f)
                    close()
                }
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
