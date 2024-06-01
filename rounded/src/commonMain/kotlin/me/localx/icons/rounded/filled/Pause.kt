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

public val Icons.Filled.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.5f, 0.0f)
                    curveTo(5.5717f, 0.0f, 4.6815f, 0.3687f, 4.0251f, 1.0251f)
                    curveTo(3.3688f, 1.6815f, 3.0f, 2.5717f, 3.0f, 3.5f)
                    verticalLineTo(20.5f)
                    curveTo(3.0f, 21.4283f, 3.3688f, 22.3185f, 4.0251f, 22.9749f)
                    curveTo(4.6815f, 23.6313f, 5.5717f, 24.0f, 6.5f, 24.0f)
                    curveTo(7.4283f, 24.0f, 8.3185f, 23.6313f, 8.9749f, 22.9749f)
                    curveTo(9.6313f, 22.3185f, 10.0f, 21.4283f, 10.0f, 20.5f)
                    verticalLineTo(3.5f)
                    curveTo(10.0f, 2.5717f, 9.6313f, 1.6815f, 8.9749f, 1.0251f)
                    curveTo(8.3185f, 0.3687f, 7.4283f, 0.0f, 6.5f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.5002f, 0.0f)
                    curveTo(16.5719f, 0.0f, 15.6817f, 0.3687f, 15.0253f, 1.0251f)
                    curveTo(14.3689f, 1.6815f, 14.0002f, 2.5717f, 14.0002f, 3.5f)
                    verticalLineTo(20.5f)
                    curveTo(14.0002f, 21.4283f, 14.3689f, 22.3185f, 15.0253f, 22.9749f)
                    curveTo(15.6817f, 23.6313f, 16.5719f, 24.0f, 17.5002f, 24.0f)
                    curveTo(18.4284f, 24.0f, 19.3186f, 23.6313f, 19.975f, 22.9749f)
                    curveTo(20.6314f, 22.3185f, 21.0002f, 21.4283f, 21.0002f, 20.5f)
                    verticalLineTo(3.5f)
                    curveTo(21.0002f, 2.5717f, 20.6314f, 1.6815f, 19.975f, 1.0251f)
                    curveTo(19.3186f, 0.3687f, 18.4284f, 0.0f, 17.5002f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
