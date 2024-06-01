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

public val Icons.Bold.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5f, 19.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 18.9984f, 2.6438f, 18.4184f, 1.6127f, 17.3873f)
                    curveTo(0.5816f, 16.3562f, 0.0016f, 14.9582f, 0.0f, 13.5f)
                    lineTo(0.0f, 5.5f)
                    curveTo(0.0016f, 4.0418f, 0.5816f, 2.6438f, 1.6127f, 1.6127f)
                    curveTo(2.6438f, 0.5816f, 4.0418f, 0.0016f, 5.5f, 0.0f)
                    lineTo(13.5f, 0.0f)
                    curveTo(14.9582f, 0.0016f, 16.3562f, 0.5816f, 17.3873f, 1.6127f)
                    curveTo(18.4184f, 2.6438f, 18.9984f, 4.0418f, 19.0f, 5.5f)
                    verticalLineTo(13.5f)
                    curveTo(18.9984f, 14.9582f, 18.4184f, 16.3562f, 17.3873f, 17.3873f)
                    curveTo(16.3562f, 18.4184f, 14.9582f, 18.9984f, 13.5f, 19.0f)
                    close()
                    moveTo(5.5f, 3.0f)
                    curveTo(4.837f, 3.0f, 4.2011f, 3.2634f, 3.7322f, 3.7322f)
                    curveTo(3.2634f, 4.2011f, 3.0f, 4.837f, 3.0f, 5.5f)
                    verticalLineTo(13.5f)
                    curveTo(3.0f, 14.163f, 3.2634f, 14.7989f, 3.7322f, 15.2678f)
                    curveTo(4.2011f, 15.7366f, 4.837f, 16.0f, 5.5f, 16.0f)
                    horizontalLineTo(13.5f)
                    curveTo(14.163f, 16.0f, 14.7989f, 15.7366f, 15.2678f, 15.2678f)
                    curveTo(15.7366f, 14.7989f, 16.0f, 14.163f, 16.0f, 13.5f)
                    verticalLineTo(5.5f)
                    curveTo(16.0f, 4.837f, 15.7366f, 4.2011f, 15.2678f, 3.7322f)
                    curveTo(14.7989f, 3.2634f, 14.163f, 3.0f, 13.5f, 3.0f)
                    horizontalLineTo(5.5f)
                    close()
                    moveTo(24.0f, 18.5f)
                    verticalLineTo(7.0f)
                    curveTo(24.0f, 6.6022f, 23.842f, 6.2206f, 23.5607f, 5.9393f)
                    curveTo(23.2794f, 5.658f, 22.8978f, 5.5f, 22.5f, 5.5f)
                    curveTo(22.1022f, 5.5f, 21.7206f, 5.658f, 21.4393f, 5.9393f)
                    curveTo(21.158f, 6.2206f, 21.0f, 6.6022f, 21.0f, 7.0f)
                    verticalLineTo(18.5f)
                    curveTo(21.0f, 19.163f, 20.7366f, 19.7989f, 20.2678f, 20.2678f)
                    curveTo(19.7989f, 20.7366f, 19.163f, 21.0f, 18.5f, 21.0f)
                    horizontalLineTo(7.0f)
                    curveTo(6.6022f, 21.0f, 6.2206f, 21.158f, 5.9393f, 21.4393f)
                    curveTo(5.658f, 21.7206f, 5.5f, 22.1022f, 5.5f, 22.5f)
                    curveTo(5.5f, 22.8978f, 5.658f, 23.2794f, 5.9393f, 23.5607f)
                    curveTo(6.2206f, 23.842f, 6.6022f, 24.0f, 7.0f, 24.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 23.9984f, 21.3562f, 23.4184f, 22.3873f, 22.3873f)
                    curveTo(23.4184f, 21.3562f, 23.9984f, 19.9582f, 24.0f, 18.5f)
                    close()
                }
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
