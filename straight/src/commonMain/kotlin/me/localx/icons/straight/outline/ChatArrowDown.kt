package me.localx.icons.straight.outline

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

public val Icons.Outline.ChatArrowDown: ImageVector
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
                    moveTo(21.207f, 13.7809f)
                    lineTo(15.5f, 8.0739f)
                    lineTo(13.5f, 10.0739f)
                    lineTo(7.7f, 4.2739f)
                    lineTo(6.281f, 5.6829f)
                    lineTo(13.5f, 12.8999f)
                    lineTo(15.5f, 10.8999f)
                    lineTo(19.793f, 15.1999f)
                    lineTo(17.0f, 17.9879f)
                    horizontalLineTo(22.5f)
                    curveTo(22.8978f, 17.9879f, 23.2794f, 17.8299f, 23.5607f, 17.5486f)
                    curveTo(23.842f, 17.2673f, 24.0f, 16.8858f, 24.0f, 16.4879f)
                    verticalLineTo(10.9879f)
                    lineTo(21.207f, 13.7809f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 20.976f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.976f)
                    curveTo(0.0f, 21.7716f, 0.3161f, 22.5347f, 0.8787f, 23.0973f)
                    curveTo(1.4413f, 23.6599f, 2.2043f, 23.976f, 3.0f, 23.976f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(21.976f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 21.976f, 2.4804f, 21.8706f, 2.2929f, 21.6831f)
                    curveTo(2.1054f, 21.4956f, 2.0f, 21.2412f, 2.0f, 20.976f)
                    close()
                }
            }
        }
        .build()
        return _chatArrowDown!!
    }

private var _chatArrowDown: ImageVector? = null
