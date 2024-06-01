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

public val Icons.Bold.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 4.0f)
                    verticalLineTo(3.5f)
                    curveTo(16.0f, 2.5717f, 15.6313f, 1.6815f, 14.9749f, 1.0251f)
                    curveTo(14.3185f, 0.3687f, 13.4283f, 0.0f, 12.5f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(14.5f)
                    curveTo(10.0f, 15.4283f, 10.3687f, 16.3185f, 11.0251f, 16.9749f)
                    curveTo(11.6815f, 17.6313f, 12.5717f, 18.0f, 13.5f, 18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(16.0f)
                    close()
                    moveTo(3.0f, 3.0f)
                    horizontalLineTo(12.5f)
                    curveTo(12.6326f, 3.0f, 12.7598f, 3.0527f, 12.8536f, 3.1465f)
                    curveTo(12.9473f, 3.2402f, 13.0f, 3.3674f, 13.0f, 3.5f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(21.0f, 15.0f)
                    horizontalLineTo(13.5f)
                    curveTo(13.3674f, 15.0f, 13.2402f, 14.9473f, 13.1464f, 14.8536f)
                    curveTo(13.0527f, 14.7598f, 13.0f, 14.6326f, 13.0f, 14.5f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
