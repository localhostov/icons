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

public val Icons.Outline.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0001f, 24.0f)
                    horizontalLineTo(5.0001f)
                    curveTo(4.2076f, 24.0f, 3.4472f, 23.6864f, 2.8851f, 23.1277f)
                    curveTo(2.3231f, 22.569f, 2.0049f, 21.8105f, 2.0001f, 21.018f)
                    verticalLineTo(5.522f)
                    lineTo(12.0001f, 0.0f)
                    lineTo(22.0001f, 5.522f)
                    verticalLineTo(21.022f)
                    curveTo(21.9943f, 21.8138f, 21.6757f, 22.5713f, 21.1137f, 23.1291f)
                    curveTo(20.5517f, 23.687f, 19.792f, 24.0f, 19.0001f, 24.0f)
                    close()
                    moveTo(4.0001f, 6.692f)
                    verticalLineTo(21.018f)
                    curveTo(4.0017f, 21.2822f, 4.1078f, 21.535f, 4.2951f, 21.7212f)
                    curveTo(4.4825f, 21.9075f, 4.7359f, 22.012f, 5.0001f, 22.012f)
                    horizontalLineTo(19.0001f)
                    curveTo(19.2643f, 22.012f, 19.5178f, 21.9075f, 19.7051f, 21.7212f)
                    curveTo(19.8925f, 21.535f, 19.9985f, 21.2822f, 20.0001f, 21.018f)
                    verticalLineTo(6.692f)
                    lineTo(12.0001f, 2.274f)
                    lineTo(4.0001f, 6.692f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 8.5721f)
                    curveTo(12.8284f, 8.5721f, 13.5f, 7.9006f, 13.5f, 7.0721f)
                    curveTo(13.5f, 6.2437f, 12.8284f, 5.5721f, 12.0f, 5.5721f)
                    curveTo(11.1716f, 5.5721f, 10.5f, 6.2437f, 10.5f, 7.0721f)
                    curveTo(10.5f, 7.9006f, 11.1716f, 8.5721f, 12.0f, 8.5721f)
                    close()
                }
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null
