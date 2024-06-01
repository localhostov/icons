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

public val Icons.Filled.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9997f, 2.5799f)
                    curveTo(13.006f, 1.978f, 12.8003f, 1.3932f, 12.4188f, 0.9277f)
                    curveTo(12.0372f, 0.4622f, 11.5041f, 0.1458f, 10.9127f, 0.0339f)
                    curveTo(10.5544f, -0.0262f, 10.1873f, -0.0074f, 9.837f, 0.0889f)
                    curveTo(9.4867f, 0.1852f, 9.1616f, 0.3567f, 8.8844f, 0.5914f)
                    curveTo(8.6071f, 0.8261f, 8.3843f, 1.1185f, 8.2315f, 1.4481f)
                    curveTo(8.0787f, 1.7776f, 7.9996f, 2.1366f, 7.9997f, 2.4999f)
                    verticalLineTo(16.9999f)
                    horizontalLineTo(5.9997f)
                    verticalLineTo(11.6109f)
                    lineTo(2.8787f, 14.6359f)
                    curveTo(2.5324f, 14.9815f, 2.276f, 15.4066f, 2.1317f, 15.8741f)
                    curveTo(1.9873f, 16.3415f, 1.9595f, 16.8372f, 2.0507f, 17.3179f)
                    curveTo(2.177f, 17.9424f, 2.491f, 18.5136f, 2.9507f, 18.9549f)
                    lineTo(7.9997f, 23.9999f)
                    horizontalLineTo(21.9997f)
                    verticalLineTo(10.1939f)
                    lineTo(12.9997f, 8.1799f)
                    verticalLineTo(2.5799f)
                    close()
                }
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
