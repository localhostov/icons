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

public val Icons.Bold.Medicine: ImageVector
    get() {
        if (_medicine != null) {
            return _medicine!!
        }
        _medicine = Builder(name = "Medicine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.5f, 7.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(6.5f)
                    curveTo(5.5717f, 7.0f, 4.6815f, 7.3688f, 4.0251f, 8.0251f)
                    curveTo(3.3688f, 8.6815f, 3.0f, 9.5717f, 3.0f, 10.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(10.5f)
                    curveTo(21.0f, 9.5717f, 20.6313f, 8.6815f, 19.9749f, 8.0251f)
                    curveTo(19.3185f, 7.3688f, 18.4283f, 7.0f, 17.5f, 7.0f)
                    close()
                    moveTo(18.0f, 21.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(10.5f)
                    curveTo(6.0f, 10.3674f, 6.0527f, 10.2402f, 6.1465f, 10.1464f)
                    curveTo(6.2402f, 10.0527f, 6.3674f, 10.0f, 6.5f, 10.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(17.5f)
                    curveTo(17.6326f, 10.0f, 17.7598f, 10.0527f, 17.8536f, 10.1464f)
                    curveTo(17.9473f, 10.2402f, 18.0f, 10.3674f, 18.0f, 10.5f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(13.5f, 14.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(19.5f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(11.5f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _medicine!!
    }

private var _medicine: ImageVector? = null
