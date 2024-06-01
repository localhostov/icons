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

public val Icons.Bold.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.415f, 12.0515f)
                    curveTo(0.42f, 9.2579f, 1.3995f, 6.5536f, 3.1846f, 4.4047f)
                    curveTo(4.9697f, 2.2559f, 7.4486f, 0.7972f, 10.1939f, 0.2801f)
                    curveTo(12.9392f, -0.237f, 15.7789f, 0.22f, 18.2235f, 1.5722f)
                    curveTo(20.668f, 2.9244f, 22.5641f, 5.0871f, 23.585f, 7.6875f)
                    lineTo(20.791f, 8.7795f)
                    curveTo(20.0282f, 6.825f, 18.6064f, 5.1985f, 16.7715f, 4.181f)
                    curveTo(14.9366f, 3.1636f, 12.804f, 2.8192f, 10.7421f, 3.2073f)
                    curveTo(8.6802f, 3.5955f, 6.8187f, 4.6918f, 5.4794f, 6.3068f)
                    curveTo(4.1401f, 7.9218f, 3.4071f, 9.9539f, 3.4071f, 12.052f)
                    curveTo(3.4071f, 14.1501f, 4.1401f, 16.1822f, 5.4794f, 17.7972f)
                    curveTo(6.8187f, 19.4122f, 8.6802f, 20.5085f, 10.7421f, 20.8966f)
                    curveTo(12.804f, 21.2848f, 14.9366f, 20.9403f, 16.7715f, 19.9229f)
                    curveTo(18.6064f, 18.9055f, 20.0282f, 17.2789f, 20.791f, 15.3245f)
                    lineTo(23.585f, 16.4165f)
                    curveTo(22.5641f, 19.0169f, 20.6679f, 21.1797f, 18.2232f, 22.5319f)
                    curveTo(15.7786f, 23.8841f, 12.9388f, 24.3409f, 10.1934f, 23.8237f)
                    curveTo(7.448f, 23.3065f, 4.9691f, 21.8477f, 3.1841f, 19.6987f)
                    curveTo(1.3991f, 17.5496f, 0.4198f, 14.8452f, 0.415f, 12.0515f)
                    close()
                }
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
