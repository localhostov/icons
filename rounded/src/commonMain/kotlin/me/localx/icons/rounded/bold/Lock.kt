package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0443f, 8.5096f)
                    verticalLineTo(7.0444f)
                    curveTo(19.0443f, 3.1539f, 15.8905f, 0.0f, 12.0f, 0.0f)
                    curveTo(8.1095f, 0.0f, 4.9557f, 3.1539f, 4.9557f, 7.0443f)
                    verticalLineTo(8.5095f)
                    curveTo(3.1049f, 9.454f, 1.939f, 11.3556f, 1.9367f, 13.4335f)
                    verticalLineTo(18.4652f)
                    curveTo(1.9401f, 21.5206f, 4.4161f, 23.9967f, 7.4715f, 24.0f)
                    horizontalLineTo(16.5285f)
                    curveTo(19.5839f, 23.9966f, 22.06f, 21.5206f, 22.0633f, 18.4652f)
                    verticalLineTo(13.4335f)
                    curveTo(22.0611f, 11.3556f, 20.8952f, 9.454f, 19.0443f, 8.5096f)
                    close()
                    moveTo(12.0f, 3.019f)
                    curveTo(14.2231f, 3.019f, 16.0253f, 4.8212f, 16.0253f, 7.0443f)
                    verticalLineTo(7.8987f)
                    horizontalLineTo(7.9747f)
                    verticalLineTo(7.0443f)
                    curveTo(7.9747f, 4.8212f, 9.7769f, 3.019f, 12.0f, 3.019f)
                    close()
                    moveTo(19.0443f, 18.4652f)
                    curveTo(19.0443f, 19.8546f, 17.918f, 20.981f, 16.5285f, 20.981f)
                    horizontalLineTo(7.4716f)
                    curveTo(6.0821f, 20.981f, 4.9557f, 19.8546f, 4.9557f, 18.4652f)
                    verticalLineTo(13.4335f)
                    curveTo(4.9557f, 12.0441f, 6.0821f, 10.9177f, 7.4716f, 10.9177f)
                    horizontalLineTo(16.5285f)
                    curveTo(17.918f, 10.9177f, 19.0443f, 12.0441f, 19.0443f, 13.4335f)
                    verticalLineTo(18.4652f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.4969f, 13.9366f)
                    horizontalLineTo(12.5032f)
                    curveTo(13.3369f, 13.9366f, 14.0127f, 14.6125f, 14.0127f, 15.4461f)
                    curveTo(14.0127f, 16.2798f, 13.3369f, 16.9556f, 12.5032f, 16.9556f)
                    horizontalLineTo(11.4969f)
                    curveTo(10.6633f, 16.9556f, 9.9874f, 16.2798f, 9.9874f, 15.4461f)
                    curveTo(9.9874f, 14.6125f, 10.6633f, 13.9366f, 11.4969f, 13.9366f)
                    close()
                }
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
