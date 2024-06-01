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

public val Icons.Bold.Presentation: ImageVector
    get() {
        if (_presentation != null) {
            return _presentation!!
        }
        _presentation = Builder(name = "Presentation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 16.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(3.5f)
                    curveTo(22.0f, 2.5717f, 21.6313f, 1.6815f, 20.9749f, 1.0251f)
                    curveTo(20.3185f, 0.3687f, 19.4283f, 0.0f, 18.5f, 0.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.5717f, 0.0f, 3.6815f, 0.3687f, 3.0251f, 1.0251f)
                    curveTo(2.3688f, 1.6815f, 2.0f, 2.5717f, 2.0f, 3.5f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(9.5f)
                    curveTo(8.5717f, 19.0f, 7.6815f, 19.3687f, 7.0251f, 20.0251f)
                    curveTo(6.3688f, 20.6815f, 6.0f, 21.5717f, 6.0f, 22.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(22.5f)
                    curveTo(9.0f, 22.3674f, 9.0527f, 22.2402f, 9.1465f, 22.1464f)
                    curveTo(9.2402f, 22.0527f, 9.3674f, 22.0f, 9.5f, 22.0f)
                    horizontalLineTo(14.5f)
                    curveTo(14.6326f, 22.0f, 14.7598f, 22.0527f, 14.8536f, 22.1464f)
                    curveTo(14.9473f, 22.2402f, 15.0f, 22.3674f, 15.0f, 22.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(22.5f)
                    curveTo(18.0f, 21.5717f, 17.6313f, 20.6815f, 16.9749f, 20.0251f)
                    curveTo(16.3185f, 19.3687f, 15.4283f, 19.0f, 14.5f, 19.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(5.0f, 3.5f)
                    curveTo(5.0f, 3.3674f, 5.0527f, 3.2402f, 5.1465f, 3.1465f)
                    curveTo(5.2402f, 3.0527f, 5.3674f, 3.0f, 5.5f, 3.0f)
                    horizontalLineTo(18.5f)
                    curveTo(18.6326f, 3.0f, 18.7598f, 3.0527f, 18.8536f, 3.1465f)
                    curveTo(18.9473f, 3.2402f, 19.0f, 3.3674f, 19.0f, 3.5f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(3.5f)
                    close()
                }
            }
        }
        .build()
        return _presentation!!
    }

private var _presentation: ImageVector? = null
