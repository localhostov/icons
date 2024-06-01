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

public val Icons.Bold.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 2.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(1.5f)
                    curveTo(18.0f, 1.1022f, 17.842f, 0.7206f, 17.5607f, 0.4393f)
                    curveTo(17.2794f, 0.158f, 16.8978f, 0.0f, 16.5f, 0.0f)
                    verticalLineTo(0.0f)
                    curveTo(16.1022f, 0.0f, 15.7206f, 0.158f, 15.4393f, 0.4393f)
                    curveTo(15.158f, 0.7206f, 15.0f, 1.1022f, 15.0f, 1.5f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(1.5f)
                    curveTo(9.0f, 1.1022f, 8.842f, 0.7206f, 8.5607f, 0.4393f)
                    curveTo(8.2794f, 0.158f, 7.8978f, 0.0f, 7.5f, 0.0f)
                    verticalLineTo(0.0f)
                    curveTo(7.1022f, 0.0f, 6.7206f, 0.158f, 6.4393f, 0.4393f)
                    curveTo(6.158f, 0.7206f, 6.0f, 1.1022f, 6.0f, 1.5f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0413f, 2.0f, 2.6424f, 2.5795f, 1.6109f, 3.6109f)
                    curveTo(0.5795f, 4.6424f, 0.0f, 6.0413f, 0.0f, 7.5f)
                    lineTo(0.0f, 18.5f)
                    curveTo(0.0f, 19.9587f, 0.5795f, 21.3576f, 1.6109f, 22.3891f)
                    curveTo(2.6424f, 23.4205f, 4.0413f, 24.0f, 5.5f, 24.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9587f, 24.0f, 21.3576f, 23.4205f, 22.3891f, 22.3891f)
                    curveTo(23.4205f, 21.3576f, 24.0f, 19.9587f, 24.0f, 18.5f)
                    verticalLineTo(7.5f)
                    curveTo(24.0f, 6.0413f, 23.4205f, 4.6424f, 22.3891f, 3.6109f)
                    curveTo(21.3576f, 2.5795f, 19.9587f, 2.0f, 18.5f, 2.0f)
                    close()
                    moveTo(18.5f, 21.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 21.0f, 4.2011f, 20.7366f, 3.7322f, 20.2678f)
                    curveTo(3.2634f, 19.7989f, 3.0f, 19.163f, 3.0f, 18.5f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.5f)
                    curveTo(21.0f, 19.163f, 20.7366f, 19.7989f, 20.2678f, 20.2678f)
                    curveTo(19.7989f, 20.7366f, 19.163f, 21.0f, 18.5f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
