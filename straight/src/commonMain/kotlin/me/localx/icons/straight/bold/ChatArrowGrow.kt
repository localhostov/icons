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

public val Icons.Bold.ChatArrowGrow: ImageVector
    get() {
        if (_chatArrowGrow != null) {
            return _chatArrowGrow!!
        }
        _chatArrowGrow = Builder(name = "ChatArrowGrow", defaultWidth = 24.0.dp, defaultHeight =
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
                    moveTo(22.5001f, 5.0001f)
                    horizontalLineTo(17.0001f)
                    lineTo(19.4391f, 7.4391f)
                    lineTo(16.0001f, 10.8791f)
                    lineTo(13.5001f, 8.3791f)
                    lineTo(6.4391f, 15.4391f)
                    lineTo(8.5611f, 17.5611f)
                    lineTo(13.5001f, 12.6211f)
                    lineTo(16.0001f, 15.1211f)
                    lineTo(21.5611f, 9.5611f)
                    lineTo(24.0001f, 12.0001f)
                    verticalLineTo(6.5001f)
                    curveTo(24.0001f, 6.1023f, 23.8421f, 5.7208f, 23.5607f, 5.4395f)
                    curveTo(23.2794f, 5.1582f, 22.8979f, 5.0001f, 22.5001f, 5.0001f)
                    close()
                }
            }
        }
        .build()
        return _chatArrowGrow!!
    }

private var _chatArrowGrow: ImageVector? = null
