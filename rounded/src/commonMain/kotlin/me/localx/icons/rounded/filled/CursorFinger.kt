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
                    moveTo(17.9808f, 9.3759f)
                    lineTo(12.9998f, 8.1799f)
                    verticalLineTo(2.5799f)
                    curveTo(13.0061f, 1.978f, 12.8004f, 1.3932f, 12.4189f, 0.9277f)
                    curveTo(12.0373f, 0.4622f, 11.5042f, 0.1458f, 10.9128f, 0.0339f)
                    curveTo(10.5545f, -0.0262f, 10.1874f, -0.0074f, 9.8371f, 0.0889f)
                    curveTo(9.4869f, 0.1852f, 9.1618f, 0.3567f, 8.8845f, 0.5914f)
                    curveTo(8.6072f, 0.8261f, 8.3844f, 1.1185f, 8.2317f, 1.4481f)
                    curveTo(8.0789f, 1.7776f, 7.9998f, 2.1366f, 7.9998f, 2.4999f)
                    verticalLineTo(16.9999f)
                    curveTo(7.9998f, 17.2651f, 7.8944f, 17.5194f, 7.7069f, 17.707f)
                    curveTo(7.5194f, 17.8945f, 7.265f, 17.9999f, 6.9998f, 17.9999f)
                    curveTo(6.7346f, 17.9999f, 6.4802f, 17.8945f, 6.2927f, 17.707f)
                    curveTo(6.1052f, 17.5194f, 5.9998f, 17.2651f, 5.9998f, 16.9999f)
                    verticalLineTo(9.6599f)
                    lineTo(3.2108f, 13.2999f)
                    curveTo(2.3928f, 14.2572f, 1.9644f, 15.487f, 2.0105f, 16.7454f)
                    curveTo(2.0566f, 18.0038f, 2.5739f, 19.1989f, 3.4598f, 20.0939f)
                    lineTo(5.8598f, 22.5189f)
                    curveTo(6.8015f, 23.4638f, 8.0797f, 23.9964f, 9.4138f, 23.9999f)
                    horizontalLineTo(16.9998f)
                    curveTo(18.3259f, 23.9999f, 19.5977f, 23.4731f, 20.5353f, 22.5354f)
                    curveTo(21.473f, 21.5977f, 21.9998f, 20.3259f, 21.9998f, 18.9999f)
                    verticalLineTo(14.2789f)
                    curveTo(21.9998f, 13.123f, 21.5994f, 12.0029f, 20.8667f, 11.109f)
                    curveTo(20.134f, 10.2151f, 19.1142f, 9.6026f, 17.9808f, 9.3759f)
                    close()
                }
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
