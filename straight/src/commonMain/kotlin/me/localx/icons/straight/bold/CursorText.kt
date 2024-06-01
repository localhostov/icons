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

public val Icons.Bold.CursorText: ImageVector
    get() {
        if (_cursorText != null) {
            return _cursorText!!
        }
        _cursorText = Builder(name = "CursorText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0001f, 3.0f)
                    horizontalLineTo(18.5001f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(16.0001f)
                    curveTo(15.25f, 5.0E-4f, 14.508f, 0.155f, 13.82f, 0.4537f)
                    curveTo(13.1319f, 0.7525f, 12.5125f, 1.1893f, 12.0001f, 1.737f)
                    curveTo(11.4876f, 1.1893f, 10.8682f, 0.7525f, 10.1802f, 0.4537f)
                    curveTo(9.4922f, 0.155f, 8.7502f, 5.0E-4f, 8.0001f, 0.0f)
                    lineTo(5.5001f, 0.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(8.0001f)
                    curveTo(8.6631f, 3.0f, 9.299f, 3.2634f, 9.7678f, 3.7322f)
                    curveTo(10.2367f, 4.2011f, 10.5001f, 4.837f, 10.5001f, 5.5f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(6.5001f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(10.5001f)
                    verticalLineTo(18.5f)
                    curveTo(10.5001f, 19.163f, 10.2367f, 19.7989f, 9.7678f, 20.2678f)
                    curveTo(9.299f, 20.7366f, 8.6631f, 21.0f, 8.0001f, 21.0f)
                    horizontalLineTo(5.5001f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(8.0001f)
                    curveTo(8.7502f, 23.9995f, 9.4922f, 23.845f, 10.1802f, 23.5463f)
                    curveTo(10.8682f, 23.2475f, 11.4876f, 22.8107f, 12.0001f, 22.263f)
                    curveTo(12.5125f, 22.8107f, 13.1319f, 23.2475f, 13.82f, 23.5463f)
                    curveTo(14.508f, 23.845f, 15.25f, 23.9995f, 16.0001f, 24.0f)
                    horizontalLineTo(18.5001f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(16.0001f)
                    curveTo(15.337f, 21.0f, 14.7011f, 20.7366f, 14.2323f, 20.2678f)
                    curveTo(13.7635f, 19.7989f, 13.5001f, 19.163f, 13.5001f, 18.5f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(17.5001f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(13.5001f)
                    verticalLineTo(5.5f)
                    curveTo(13.5001f, 4.837f, 13.7635f, 4.2011f, 14.2323f, 3.7322f)
                    curveTo(14.7011f, 3.2634f, 15.337f, 3.0f, 16.0001f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
