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

public val Icons.Bold.Venus: ImageVector
    get() {
        if (_venus != null) {
            return _venus!!
        }
        _venus = Builder(name = "Venus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9998f, 8.0f)
                    curveTo(20.0006f, 6.4818f, 19.5694f, 4.9946f, 18.7565f, 3.7124f)
                    curveTo(17.9436f, 2.4301f, 16.7826f, 1.4057f, 15.4091f, 0.7587f)
                    curveTo(14.0356f, 0.1117f, 12.5064f, -0.1312f, 11.0001f, 0.0586f)
                    curveTo(9.4938f, 0.2483f, 8.0725f, 0.8627f, 6.9024f, 1.8301f)
                    curveTo(5.7323f, 2.7975f, 4.8616f, 4.0779f, 4.3921f, 5.5217f)
                    curveTo(3.9225f, 6.9655f, 3.8735f, 8.5131f, 4.2508f, 9.9837f)
                    curveTo(4.628f, 11.4543f, 5.4159f, 12.7872f, 6.5225f, 13.8267f)
                    curveTo(7.629f, 14.8662f, 9.0085f, 15.5693f, 10.4998f, 15.854f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(7.9998f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(10.4998f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(13.4998f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(15.9998f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(13.4998f)
                    verticalLineTo(15.854f)
                    curveTo(15.3267f, 15.5033f, 16.9746f, 14.5277f, 18.1607f, 13.0946f)
                    curveTo(19.3467f, 11.6615f, 19.997f, 9.8602f, 19.9998f, 8.0f)
                    close()
                    moveTo(6.9998f, 8.0f)
                    curveTo(6.9998f, 7.0111f, 7.2931f, 6.0444f, 7.8425f, 5.2221f)
                    curveTo(8.3919f, 4.3999f, 9.1728f, 3.759f, 10.0864f, 3.3806f)
                    curveTo(11.0001f, 3.0021f, 12.0054f, 2.9031f, 12.9753f, 3.0961f)
                    curveTo(13.9452f, 3.289f, 14.8361f, 3.7652f, 15.5354f, 4.4644f)
                    curveTo(16.2346f, 5.1637f, 16.7108f, 6.0546f, 16.9038f, 7.0245f)
                    curveTo(17.0967f, 7.9944f, 16.9977f, 8.9998f, 16.6192f, 9.9134f)
                    curveTo(16.2408f, 10.827f, 15.5999f, 11.6079f, 14.7777f, 12.1573f)
                    curveTo(13.9555f, 12.7067f, 12.9888f, 13.0f, 11.9998f, 13.0f)
                    curveTo(10.6743f, 12.9984f, 9.4034f, 12.4711f, 8.4661f, 11.5338f)
                    curveTo(7.5287f, 10.5964f, 7.0014f, 9.3256f, 6.9998f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _venus!!
    }

private var _venus: ImageVector? = null
