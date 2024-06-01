package me.localx.icons.straight.filled

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

public val Icons.Filled.ChatArrowGrow: ImageVector
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
                    moveTo(2.0f, 20.9762f)
                    verticalLineTo(-0.0238f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9762f)
                    curveTo(0.0f, 21.7718f, 0.3161f, 22.5349f, 0.8787f, 23.0975f)
                    curveTo(1.4413f, 23.6601f, 2.2043f, 23.9762f, 3.0f, 23.9762f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(21.9762f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 21.9762f, 2.4804f, 21.8708f, 2.2929f, 21.6833f)
                    curveTo(2.1054f, 21.4958f, 2.0f, 21.2414f, 2.0f, 20.9762f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5f, 3.9761f)
                    horizontalLineTo(17.0f)
                    lineTo(19.793f, 6.7691f)
                    lineTo(15.5f, 11.0621f)
                    lineTo(13.5f, 9.0621f)
                    lineTo(6.281f, 16.2811f)
                    lineTo(7.7f, 17.7001f)
                    lineTo(13.505f, 11.9001f)
                    lineTo(15.505f, 13.9001f)
                    lineTo(21.212f, 8.1931f)
                    lineTo(24.0f, 10.9761f)
                    verticalLineTo(5.4761f)
                    curveTo(24.0f, 5.0782f, 23.842f, 4.6967f, 23.5607f, 4.4154f)
                    curveTo(23.2794f, 4.1341f, 22.8978f, 3.9761f, 22.5f, 3.9761f)
                    close()
                }
            }
        }
        .build()
        return _chatArrowGrow!!
    }

private var _chatArrowGrow: ImageVector? = null
