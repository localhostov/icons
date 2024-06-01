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

public val Icons.Bold.AngleDown: ImageVector
    get() {
        if (_angleDown != null) {
            return _angleDown!!
        }
        _angleDown = Builder(name = "AngleDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.5101f, 6.079f)
                    curveTo(1.7071f, 6.0787f, 1.9022f, 6.1175f, 2.0841f, 6.193f)
                    curveTo(2.266f, 6.2685f, 2.4312f, 6.3793f, 2.5701f, 6.519f)
                    lineTo(10.2431f, 14.191f)
                    curveTo(10.4752f, 14.4232f, 10.7509f, 14.6074f, 11.0542f, 14.7331f)
                    curveTo(11.3576f, 14.8587f, 11.6827f, 14.9234f, 12.0111f, 14.9234f)
                    curveTo(12.3394f, 14.9234f, 12.6646f, 14.8587f, 12.9679f, 14.7331f)
                    curveTo(13.2713f, 14.6074f, 13.5469f, 14.4232f, 13.7791f, 14.191f)
                    lineTo(21.4401f, 6.529f)
                    curveTo(21.5785f, 6.3857f, 21.744f, 6.2714f, 21.927f, 6.1928f)
                    curveTo(22.11f, 6.1142f, 22.3068f, 6.0728f, 22.506f, 6.0711f)
                    curveTo(22.7051f, 6.0694f, 22.9027f, 6.1073f, 23.087f, 6.1827f)
                    curveTo(23.2714f, 6.2582f, 23.4388f, 6.3695f, 23.5797f, 6.5104f)
                    curveTo(23.7205f, 6.6512f, 23.8319f, 6.8187f, 23.9073f, 7.003f)
                    curveTo(23.9827f, 7.1874f, 24.0207f, 7.3849f, 24.019f, 7.5841f)
                    curveTo(24.0172f, 7.7832f, 23.9758f, 7.9801f, 23.8972f, 8.1631f)
                    curveTo(23.8186f, 8.3461f, 23.7043f, 8.5116f, 23.5611f, 8.65f)
                    lineTo(15.9001f, 16.312f)
                    curveTo(14.868f, 17.3421f, 13.4693f, 17.9207f, 12.0111f, 17.9207f)
                    curveTo(10.5528f, 17.9207f, 9.1542f, 17.3421f, 8.1221f, 16.312f)
                    lineTo(0.4491f, 8.64f)
                    curveTo(0.2392f, 8.4302f, 0.0962f, 8.1629f, 0.0383f, 7.8718f)
                    curveTo(-0.0197f, 7.5807f, 0.01f, 7.279f, 0.1236f, 7.0049f)
                    curveTo(0.2372f, 6.7307f, 0.4296f, 6.4964f, 0.6764f, 6.3316f)
                    curveTo(0.9232f, 6.1667f, 1.2133f, 6.0788f, 1.5101f, 6.079f)
                    close()
                }
            }
        }
        .build()
        return _angleDown!!
    }

private var _angleDown: ImageVector? = null
