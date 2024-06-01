package me.localx.icons.straight.filled

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

public val Icons.Filled.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }
        _gym = Builder(name = "Gym", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.121f, 7.1221f)
                    lineTo(20.707f, 4.7071f)
                    lineTo(22.707f, 2.7071f)
                    lineTo(21.293f, 1.2931f)
                    lineTo(19.293f, 3.2931f)
                    lineTo(16.879f, 0.8791f)
                    curveTo(16.6004f, 0.6005f, 16.2697f, 0.3794f, 15.9057f, 0.2287f)
                    curveTo(15.5417f, 0.0779f, 15.1515f, 2.0E-4f, 14.7575f, 2.0E-4f)
                    curveTo(14.3635f, 2.0E-4f, 13.9733f, 0.0779f, 13.6093f, 0.2287f)
                    curveTo(13.2453f, 0.3794f, 12.9146f, 0.6005f, 12.636f, 0.8791f)
                    lineTo(9.808f, 3.7071f)
                    lineTo(14.343f, 8.2431f)
                    lineTo(8.243f, 14.3431f)
                    lineTo(3.707f, 9.8081f)
                    lineTo(0.879f, 12.6361f)
                    curveTo(0.3166f, 13.1987f, 6.0E-4f, 13.9616f, 6.0E-4f, 14.7571f)
                    curveTo(6.0E-4f, 15.5526f, 0.3166f, 16.3155f, 0.879f, 16.8781f)
                    lineTo(3.293f, 19.2931f)
                    lineTo(1.293f, 21.2931f)
                    lineTo(2.707f, 22.7071f)
                    lineTo(4.707f, 20.7071f)
                    lineTo(7.121f, 23.1211f)
                    curveTo(7.3996f, 23.3997f, 7.7303f, 23.6208f, 8.0943f, 23.7716f)
                    curveTo(8.4583f, 23.9223f, 8.8485f, 24.0f, 9.2425f, 24.0f)
                    curveTo(9.6365f, 24.0f, 10.0267f, 23.9223f, 10.3907f, 23.7716f)
                    curveTo(10.7547f, 23.6208f, 11.0854f, 23.3997f, 11.364f, 23.1211f)
                    lineTo(14.192f, 20.2931f)
                    lineTo(9.657f, 15.7571f)
                    lineTo(15.757f, 9.6571f)
                    lineTo(20.292f, 14.1921f)
                    lineTo(23.12f, 11.3641f)
                    curveTo(23.6824f, 10.8015f, 23.9984f, 10.0386f, 23.9984f, 9.2431f)
                    curveTo(23.9984f, 8.4476f, 23.6824f, 7.6847f, 23.12f, 7.1221f)
                    horizontalLineTo(23.121f)
                    close()
                }
            }
        }
        .build()
        return _gym!!
    }

private var _gym: ImageVector? = null
