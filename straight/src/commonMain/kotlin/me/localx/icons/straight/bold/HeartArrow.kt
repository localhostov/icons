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

public val Icons.Bold.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.561f, 19.439f)
                    lineTo(19.4f, 17.28f)
                    curveTo(21.329f, 15.159f, 23.0f, 12.621f, 23.0f, 10.161f)
                    curveTo(23.0508f, 8.5825f, 22.4743f, 7.0482f, 21.3968f, 5.8936f)
                    curveTo(20.3192f, 4.739f, 18.8282f, 4.0581f, 17.25f, 4.0f)
                    curveTo(16.4482f, 4.0214f, 15.6588f, 4.2036f, 14.9288f, 4.5358f)
                    curveTo(14.1987f, 4.8681f, 13.5428f, 5.3435f, 13.0f, 5.934f)
                    curveTo(12.4572f, 5.3435f, 11.8013f, 4.8681f, 11.0712f, 4.5358f)
                    curveTo(10.3412f, 4.2036f, 9.5518f, 4.0214f, 8.75f, 4.0f)
                    curveTo(8.0027f, 4.0007f, 7.2636f, 4.157f, 6.58f, 4.459f)
                    lineTo(2.121f, 0.0f)
                    lineTo(0.0f, 2.121f)
                    lineTo(4.236f, 6.357f)
                    curveTo(3.4288f, 7.4607f, 2.9957f, 8.7936f, 3.0f, 10.161f)
                    curveTo(3.0f, 15.42f, 10.609f, 21.061f, 12.135f, 22.135f)
                    lineTo(13.0f, 22.745f)
                    lineTo(13.865f, 22.135f)
                    curveTo(15.0521f, 21.2871f, 16.1899f, 20.3722f, 17.273f, 19.395f)
                    lineTo(19.439f, 21.561f)
                    lineTo(17.0f, 24.0f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 24.0f, 23.5196f, 23.8946f, 23.7071f, 23.7071f)
                    curveTo(23.8946f, 23.5196f, 24.0f, 23.2652f, 24.0f, 23.0f)
                    verticalLineTo(17.0f)
                    lineTo(21.561f, 19.439f)
                    close()
                    moveTo(13.0f, 19.051f)
                    curveTo(9.394f, 16.319f, 6.0f, 12.575f, 6.0f, 10.161f)
                    curveTo(5.9501f, 9.3782f, 6.2109f, 8.6074f, 6.7257f, 8.0156f)
                    curveTo(7.2405f, 7.4239f, 7.9679f, 7.0589f, 8.75f, 7.0f)
                    curveTo(10.507f, 7.0f, 11.671f, 9.071f, 11.679f, 9.085f)
                    lineTo(12.986f, 11.5f)
                    lineTo(14.317f, 9.091f)
                    curveTo(14.329f, 9.071f, 15.493f, 7.0f, 17.25f, 7.0f)
                    curveTo(18.0321f, 7.0589f, 18.7595f, 7.4239f, 19.2743f, 8.0156f)
                    curveTo(19.7891f, 8.6074f, 20.0499f, 9.3782f, 20.0f, 10.161f)
                    curveTo(20.0f, 12.575f, 16.606f, 16.319f, 13.0f, 19.051f)
                    close()
                }
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
