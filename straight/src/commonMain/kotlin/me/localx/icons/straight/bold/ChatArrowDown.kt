package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.ChatArrowDown: ImageVector
    get() {
        if (_chatArrowDown != null) {
            return _chatArrowDown!!
        }
        _chatArrowDown = Builder(name = "ChatArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0f, 20.5f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.5f)
                    curveTo(0.0f, 21.4283f, 0.3687f, 22.3185f, 1.0251f, 22.9749f)
                    curveTo(1.6815f, 23.6313f, 2.5717f, 24.0f, 3.5f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 21.0f, 3.2402f, 20.9473f, 3.1465f, 20.8536f)
                    curveTo(3.0527f, 20.7598f, 3.0f, 20.6326f, 3.0f, 20.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.5611f, 12.439f)
                    lineTo(16.0001f, 6.879f)
                    lineTo(13.5001f, 9.379f)
                    lineTo(8.5611f, 4.439f)
                    lineTo(6.4391f, 6.561f)
                    lineTo(13.5001f, 13.621f)
                    lineTo(16.0001f, 11.121f)
                    lineTo(19.4391f, 14.561f)
                    lineTo(17.0001f, 17.0f)
                    horizontalLineTo(22.5001f)
                    curveTo(22.8979f, 17.0f, 23.2794f, 16.8419f, 23.5607f, 16.5606f)
                    curveTo(23.8421f, 16.2793f, 24.0001f, 15.8978f, 24.0001f, 15.5f)
                    verticalLineTo(10.0f)
                    lineTo(21.5611f, 12.439f)
                    close()
                }
            }
        }
        .build()
        return _chatArrowDown!!
    }

private var _chatArrowDown: ImageVector? = null
