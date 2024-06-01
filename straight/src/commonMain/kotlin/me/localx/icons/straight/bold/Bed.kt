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

public val Icons.Bold.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 5.0f)
                    horizontalLineTo(13.5f)
                    curveTo(12.5717f, 5.0f, 11.6815f, 5.3688f, 11.0251f, 6.0251f)
                    curveTo(10.3687f, 6.6815f, 10.0f, 7.5717f, 10.0f, 8.5f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.5f)
                    curveTo(24.0f, 7.5717f, 23.6313f, 6.6815f, 22.9749f, 6.0251f)
                    curveTo(22.3185f, 5.3688f, 21.4283f, 5.0f, 20.5f, 5.0f)
                    close()
                    moveTo(13.0f, 13.0f)
                    verticalLineTo(8.5f)
                    curveTo(13.0f, 8.3674f, 13.0527f, 8.2402f, 13.1464f, 8.1465f)
                    curveTo(13.2402f, 8.0527f, 13.3674f, 8.0f, 13.5f, 8.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 8.0f, 20.7598f, 8.0527f, 20.8536f, 8.1465f)
                    curveTo(20.9473f, 8.2402f, 21.0f, 8.3674f, 21.0f, 8.5f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(13.0f)
                    close()
                    moveTo(6.5f, 12.0f)
                    curveTo(6.0055f, 12.0f, 5.5222f, 11.8534f, 5.1111f, 11.5787f)
                    curveTo(4.7f, 11.304f, 4.3795f, 10.9135f, 4.1903f, 10.4567f)
                    curveTo(4.0011f, 9.9999f, 3.9516f, 9.4972f, 4.048f, 9.0123f)
                    curveTo(4.1445f, 8.5273f, 4.3826f, 8.0819f, 4.7322f, 7.7322f)
                    curveTo(5.0819f, 7.3826f, 5.5273f, 7.1445f, 6.0123f, 7.048f)
                    curveTo(6.4972f, 6.9516f, 6.9999f, 7.0011f, 7.4567f, 7.1903f)
                    curveTo(7.9135f, 7.3795f, 8.304f, 7.7f, 8.5787f, 8.1111f)
                    curveTo(8.8534f, 8.5222f, 9.0f, 9.0056f, 9.0f, 9.5f)
                    curveTo(9.0f, 9.8283f, 8.9353f, 10.1534f, 8.8097f, 10.4567f)
                    curveTo(8.6841f, 10.76f, 8.4999f, 11.0356f, 8.2678f, 11.2678f)
                    curveTo(8.0356f, 11.4999f, 7.76f, 11.6841f, 7.4567f, 11.8097f)
                    curveTo(7.1534f, 11.9353f, 6.8283f, 12.0f, 6.5f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
