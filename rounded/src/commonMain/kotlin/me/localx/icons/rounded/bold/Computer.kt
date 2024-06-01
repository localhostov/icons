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

public val Icons.Bold.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer = Builder(name = "Computer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 0.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 0.0016f, 2.6438f, 0.5816f, 1.6127f, 1.6127f)
                    curveTo(0.5816f, 2.6438f, 0.0016f, 4.0418f, 0.0f, 5.5f)
                    lineTo(0.0f, 13.5f)
                    curveTo(0.0016f, 14.9582f, 0.5816f, 16.3562f, 1.6127f, 17.3873f)
                    curveTo(2.6438f, 18.4184f, 4.0418f, 18.9984f, 5.5f, 19.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(8.0f)
                    curveTo(7.6022f, 21.0f, 7.2206f, 21.158f, 6.9393f, 21.4393f)
                    curveTo(6.658f, 21.7206f, 6.5f, 22.1022f, 6.5f, 22.5f)
                    curveTo(6.5f, 22.8978f, 6.658f, 23.2794f, 6.9393f, 23.5607f)
                    curveTo(7.2206f, 23.842f, 7.6022f, 24.0f, 8.0f, 24.0f)
                    horizontalLineTo(16.0f)
                    curveTo(16.3978f, 24.0f, 16.7794f, 23.842f, 17.0607f, 23.5607f)
                    curveTo(17.342f, 23.2794f, 17.5f, 22.8978f, 17.5f, 22.5f)
                    curveTo(17.5f, 22.1022f, 17.342f, 21.7206f, 17.0607f, 21.4393f)
                    curveTo(16.7794f, 21.158f, 16.3978f, 21.0f, 16.0f, 21.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 18.9984f, 21.3562f, 18.4184f, 22.3873f, 17.3873f)
                    curveTo(23.4184f, 16.3562f, 23.9984f, 14.9582f, 24.0f, 13.5f)
                    verticalLineTo(5.5f)
                    curveTo(23.9984f, 4.0418f, 23.4184f, 2.6438f, 22.3873f, 1.6127f)
                    curveTo(21.3562f, 0.5816f, 19.9582f, 0.0016f, 18.5f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(5.5f, 3.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.163f, 3.0f, 19.7989f, 3.2634f, 20.2678f, 3.7322f)
                    curveTo(20.7366f, 4.2011f, 21.0f, 4.837f, 21.0f, 5.5f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(5.5f)
                    curveTo(3.0f, 4.837f, 3.2634f, 4.2011f, 3.7322f, 3.7322f)
                    curveTo(4.2011f, 3.2634f, 4.837f, 3.0f, 5.5f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _computer!!
    }

private var _computer: ImageVector? = null
