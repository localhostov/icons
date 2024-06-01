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

public val Icons.Bold.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.8711f, 15.992f)
                    lineTo(23.9921f, 13.871f)
                    lineTo(10.1211f, 0.0f)
                    lineTo(8.0001f, 2.121f)
                    lineTo(8.9291f, 3.05f)
                    lineTo(7.0501f, 4.929f)
                    lineTo(4.0611f, 1.939f)
                    lineTo(1.9391f, 4.061f)
                    lineTo(4.9291f, 7.05f)
                    lineTo(1.0402f, 10.939f)
                    curveTo(0.7151f, 11.264f, 0.4573f, 11.6499f, 0.2813f, 12.0745f)
                    curveTo(0.1054f, 12.4992f, 0.0149f, 12.9543f, 0.0149f, 13.414f)
                    curveTo(0.0149f, 13.8737f, 0.1054f, 14.3288f, 0.2813f, 14.7535f)
                    curveTo(0.4573f, 15.1781f, 0.7151f, 15.564f, 1.0402f, 15.889f)
                    lineTo(8.1101f, 22.959f)
                    curveTo(8.4352f, 23.2842f, 8.8211f, 23.5422f, 9.2458f, 23.7182f)
                    curveTo(9.6706f, 23.8942f, 10.1259f, 23.9848f, 10.5856f, 23.9848f)
                    curveTo(11.0454f, 23.9848f, 11.5007f, 23.8942f, 11.9254f, 23.7182f)
                    curveTo(12.3502f, 23.5422f, 12.7361f, 23.2842f, 13.0611f, 22.959f)
                    lineTo(20.9501f, 15.07f)
                    lineTo(21.8711f, 15.992f)
                    close()
                    moveTo(10.9391f, 20.839f)
                    curveTo(10.8454f, 20.9327f, 10.7182f, 20.9854f, 10.5856f, 20.9854f)
                    curveTo(10.4531f, 20.9854f, 10.3259f, 20.9327f, 10.2321f, 20.839f)
                    lineTo(3.1611f, 13.768f)
                    curveTo(3.0674f, 13.6742f, 3.0148f, 13.5471f, 3.0148f, 13.4145f)
                    curveTo(3.0148f, 13.2819f, 3.0674f, 13.1548f, 3.1611f, 13.061f)
                    lineTo(7.0501f, 9.171f)
                    lineTo(11.4391f, 13.561f)
                    lineTo(13.5611f, 11.439f)
                    lineTo(9.1711f, 7.05f)
                    lineTo(11.0501f, 5.171f)
                    lineTo(18.8291f, 12.95f)
                    lineTo(10.9391f, 20.839f)
                    close()
                    moveTo(24.0001f, 21.5f)
                    curveTo(24.0001f, 22.163f, 23.7368f, 22.7989f, 23.2679f, 23.2678f)
                    curveTo(22.7991f, 23.7366f, 22.1632f, 24.0f, 21.5001f, 24.0f)
                    curveTo(20.8371f, 24.0f, 20.2012f, 23.7366f, 19.7324f, 23.2678f)
                    curveTo(19.2635f, 22.7989f, 19.0001f, 22.163f, 19.0001f, 21.5f)
                    curveTo(19.0001f, 20.25f, 21.5001f, 17.0f, 21.5001f, 17.0f)
                    curveTo(21.5001f, 17.0f, 24.0001f, 20.119f, 24.0001f, 21.5f)
                    close()
                }
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
