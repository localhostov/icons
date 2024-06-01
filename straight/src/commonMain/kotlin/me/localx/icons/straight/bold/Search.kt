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

public val Icons.Bold.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9002f, 16.7767f)
                    curveTo(20.4968f, 14.6431f, 21.2258f, 11.9839f, 20.9406f, 9.3344f)
                    curveTo(20.6553f, 6.6849f, 19.377f, 4.2419f, 17.3629f, 2.497f)
                    curveTo(15.3488f, 0.7521f, 12.7485f, -0.165f, 10.0854f, -0.0697f)
                    curveTo(7.4223f, 0.0255f, 4.8942f, 1.126f, 3.0099f, 3.0103f)
                    curveTo(1.1256f, 4.8946f, 0.0251f, 7.4228f, -0.0702f, 10.0859f)
                    curveTo(-0.1654f, 12.7489f, 0.7517f, 15.3492f, 2.4966f, 17.3633f)
                    curveTo(4.2414f, 19.3774f, 6.6845f, 20.6557f, 9.334f, 20.941f)
                    curveTo(11.9835f, 21.2262f, 14.6427f, 20.4972f, 16.7762f, 18.9007f)
                    lineTo(21.8762f, 24.0007f)
                    lineTo(24.0002f, 21.8807f)
                    lineTo(18.9002f, 16.7767f)
                    close()
                    moveTo(10.5002f, 18.0007f)
                    curveTo(9.0169f, 18.0007f, 7.5668f, 17.5608f, 6.3335f, 16.7367f)
                    curveTo(5.1001f, 15.9126f, 4.1388f, 14.7412f, 3.5711f, 13.3708f)
                    curveTo(3.0035f, 12.0003f, 2.855f, 10.4923f, 3.1444f, 9.0375f)
                    curveTo(3.4337f, 7.5826f, 4.148f, 6.2463f, 5.1969f, 5.1974f)
                    curveTo(6.2458f, 4.1485f, 7.5822f, 3.4342f, 9.0371f, 3.1448f)
                    curveTo(10.4919f, 2.8554f, 11.9999f, 3.0039f, 13.3704f, 3.5716f)
                    curveTo(14.7408f, 4.1392f, 15.9122f, 5.1005f, 16.7363f, 6.3339f)
                    curveTo(17.5604f, 7.5673f, 18.0002f, 9.0173f, 18.0002f, 10.5007f)
                    curveTo(17.9984f, 12.4892f, 17.2076f, 14.3958f, 15.8015f, 15.8019f)
                    curveTo(14.3954f, 17.208f, 12.4888f, 17.9988f, 10.5002f, 18.0007f)
                    close()
                }
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
