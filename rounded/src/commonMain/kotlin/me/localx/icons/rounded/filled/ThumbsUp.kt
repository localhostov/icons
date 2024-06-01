package me.localx.icons.rounded.filled

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

public val Icons.Filled.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.7732f, 7.7214f)
                    curveTo(22.3042f, 7.181f, 21.7247f, 6.7477f, 21.0737f, 6.4507f)
                    curveTo(20.4228f, 6.1538f, 19.7156f, 6.0002f, 19.0002f, 6.0004f)
                    horizontalLineTo(15.0112f)
                    lineTo(15.3472f, 3.9594f)
                    curveTo(15.466f, 3.2406f, 15.3226f, 2.5031f, 14.943f, 1.8813f)
                    curveTo(14.5634f, 1.2595f, 13.973f, 0.7949f, 13.2793f, 0.5722f)
                    curveTo(12.5857f, 0.3494f, 11.8352f, 0.3835f, 11.1645f, 0.6681f)
                    curveTo(10.4939f, 0.9526f, 9.9479f, 1.4688f, 9.6262f, 2.1224f)
                    lineTo(8.0001f, 5.4174f)
                    verticalLineTo(21.0004f)
                    horizontalLineTo(18.3002f)
                    curveTo(19.5036f, 20.9955f, 20.6653f, 20.5587f, 21.574f, 19.7695f)
                    curveTo(22.4826f, 18.9804f, 23.0777f, 17.8913f, 23.2512f, 16.7004f)
                    lineTo(23.9562f, 11.7004f)
                    curveTo(24.0558f, 10.9911f, 24.0018f, 10.2687f, 23.7977f, 9.5821f)
                    curveTo(23.5936f, 8.8956f, 23.2441f, 8.261f, 22.7732f, 7.7214f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 11.0f)
                    verticalLineTo(16.0f)
                    curveTo(0.0016f, 17.3256f, 0.5289f, 18.5964f, 1.4662f, 19.5338f)
                    curveTo(2.4036f, 20.4711f, 3.6744f, 20.9984f, 5.0f, 21.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 6.0016f, 2.4036f, 6.5289f, 1.4662f, 7.4662f)
                    curveTo(0.5289f, 8.4036f, 0.0016f, 9.6744f, 0.0f, 11.0f)
                    horizontalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
