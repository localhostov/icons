package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

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
                    moveTo(19.5f, 4.0f)
                    horizontalLineTo(15.449f)
                    curveTo(15.3286f, 2.903f, 14.8084f, 1.8889f, 13.9878f, 1.1511f)
                    curveTo(13.1671f, 0.4132f, 12.1035f, 0.0035f, 11.0f, 0.0f)
                    lineTo(4.5f, 0.0f)
                    curveTo(3.3069f, 0.0013f, 2.1631f, 0.4759f, 1.3195f, 1.3195f)
                    curveTo(0.4759f, 2.1631f, 0.0013f, 3.3069f, 0.0f, 4.5f)
                    lineTo(0.0f, 22.5f)
                    curveTo(0.0f, 22.8978f, 0.158f, 23.2794f, 0.4393f, 23.5607f)
                    curveTo(0.7206f, 23.842f, 1.1022f, 24.0f, 1.5f, 24.0f)
                    curveTo(1.8978f, 24.0f, 2.2794f, 23.842f, 2.5607f, 23.5607f)
                    curveTo(2.842f, 23.2794f, 3.0f, 22.8978f, 3.0f, 22.5f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(9.551f)
                    curveTo(9.6714f, 15.0969f, 10.1916f, 16.1111f, 11.0122f, 16.8489f)
                    curveTo(11.8329f, 17.5868f, 12.8965f, 17.9965f, 14.0f, 18.0f)
                    horizontalLineTo(19.5f)
                    curveTo(20.6931f, 17.9987f, 21.8369f, 17.5241f, 22.6805f, 16.6805f)
                    curveTo(23.5241f, 15.8369f, 23.9987f, 14.6931f, 24.0f, 13.5f)
                    verticalLineTo(8.5f)
                    curveTo(23.9987f, 7.3069f, 23.5241f, 6.1631f, 22.6805f, 5.3195f)
                    curveTo(21.8369f, 4.4759f, 20.6931f, 4.0013f, 19.5f, 4.0f)
                    close()
                    moveTo(3.0f, 4.5f)
                    curveTo(3.0f, 4.1022f, 3.158f, 3.7206f, 3.4393f, 3.4393f)
                    curveTo(3.7206f, 3.158f, 4.1022f, 3.0f, 4.5f, 3.0f)
                    horizontalLineTo(11.0f)
                    curveTo(11.3978f, 3.0f, 11.7794f, 3.158f, 12.0607f, 3.4393f)
                    curveTo(12.342f, 3.7206f, 12.5f, 4.1022f, 12.5f, 4.5f)
                    verticalLineTo(9.5f)
                    curveTo(12.5f, 9.8978f, 12.342f, 10.2794f, 12.0607f, 10.5607f)
                    curveTo(11.7794f, 10.842f, 11.3978f, 11.0f, 11.0f, 11.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(4.5f)
                    close()
                    moveTo(21.0f, 13.5f)
                    curveTo(21.0f, 13.8978f, 20.842f, 14.2794f, 20.5607f, 14.5607f)
                    curveTo(20.2794f, 14.842f, 19.8978f, 15.0f, 19.5f, 15.0f)
                    horizontalLineTo(14.0f)
                    curveTo(13.6408f, 14.9985f, 13.2941f, 14.8682f, 13.0229f, 14.6328f)
                    curveTo(12.7517f, 14.3973f, 12.574f, 14.0724f, 12.522f, 13.717f)
                    curveTo(13.3917f, 13.4055f, 14.1442f, 12.8335f, 14.6771f, 12.0789f)
                    curveTo(15.21f, 11.3243f, 15.4974f, 10.4238f, 15.5f, 9.5f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(19.5f)
                    curveTo(19.8978f, 7.0f, 20.2794f, 7.158f, 20.5607f, 7.4393f)
                    curveTo(20.842f, 7.7206f, 21.0f, 8.1022f, 21.0f, 8.5f)
                    verticalLineTo(13.5f)
                    close()
                }
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
