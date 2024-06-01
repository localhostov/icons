package me.localx.icons.rounded.filled

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

public val Icons.Filled.EyeCrossed: ImageVector
    get() {
        if (_eyeCrossed != null) {
            return _eyeCrossed!!
        }
        _eyeCrossed = Builder(name = "EyeCrossed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.2668f, 9.4075f)
                    curveTo(22.3644f, 7.9298f, 21.2261f, 6.6098f, 19.897f, 5.5f)
                    lineTo(22.696f, 2.701f)
                    curveTo(23.0795f, 2.3039f, 23.0685f, 1.6711f, 22.6714f, 1.2876f)
                    curveTo(22.284f, 0.9134f, 21.6699f, 0.9134f, 21.2825f, 1.2876f)
                    lineTo(18.2386f, 4.3354f)
                    curveTo(16.3517f, 3.2147f, 14.1945f, 2.6305f, 11.9999f, 2.6461f)
                    curveTo(5.8112f, 2.6461f, 2.2845f, 6.8825f, 0.7331f, 9.4076f)
                    curveTo(-0.2444f, 10.9887f, -0.2444f, 12.9865f, 0.7331f, 14.5677f)
                    curveTo(1.6356f, 16.0454f, 2.7739f, 17.3654f, 4.1029f, 18.4752f)
                    lineTo(1.3039f, 21.2742f)
                    curveTo(0.9068f, 21.6577f, 0.8958f, 22.2906f, 1.2794f, 22.6876f)
                    curveTo(1.6629f, 23.0848f, 2.2957f, 23.0958f, 2.6928f, 22.7122f)
                    curveTo(2.7011f, 22.7042f, 2.7094f, 22.696f, 2.7174f, 22.6876f)
                    lineTo(5.7683f, 19.6368f)
                    curveTo(7.6528f, 20.7574f, 9.8074f, 21.3425f, 11.9999f, 21.3291f)
                    curveTo(18.1887f, 21.3291f, 21.7154f, 17.0927f, 23.2668f, 14.5676f)
                    curveTo(24.2444f, 12.9865f, 24.2444f, 10.9887f, 23.2668f, 9.4075f)
                    close()
                    moveTo(6.0022f, 11.9876f)
                    curveTo(5.9966f, 8.6806f, 8.6727f, 5.9952f, 11.9797f, 5.9896f)
                    curveTo(13.2309f, 5.9874f, 14.4514f, 6.3773f, 15.4697f, 7.1044f)
                    lineTo(14.0182f, 8.5559f)
                    curveTo(13.4089f, 8.1884f, 12.7115f, 7.9926f, 12.0f, 7.9891f)
                    curveTo(9.7917f, 7.9891f, 8.0015f, 9.7793f, 8.0015f, 11.9876f)
                    curveTo(8.005f, 12.6991f, 8.2008f, 13.3965f, 8.5683f, 14.0059f)
                    lineTo(7.1168f, 15.4573f)
                    curveTo(6.392f, 14.4455f, 6.0023f, 13.2322f, 6.0022f, 11.9876f)
                    close()
                    moveTo(12.0f, 17.9854f)
                    curveTo(10.7554f, 17.9853f, 9.5421f, 17.5956f, 8.5303f, 16.8708f)
                    lineTo(9.9817f, 15.4193f)
                    curveTo(10.5911f, 15.7868f, 11.2885f, 15.9826f, 12.0f, 15.9861f)
                    curveTo(14.2083f, 15.9861f, 15.9985f, 14.1959f, 15.9985f, 11.9876f)
                    curveTo(15.995f, 11.2761f, 15.7992f, 10.5787f, 15.4317f, 9.9693f)
                    lineTo(16.8832f, 8.5179f)
                    curveTo(18.8049f, 11.2091f, 18.1812f, 14.9487f, 15.49f, 16.8705f)
                    curveTo(14.4717f, 17.5976f, 13.2512f, 17.9875f, 12.0f, 17.9854f)
                    close()
                }
            }
        }
        .build()
        return _eyeCrossed!!
    }

private var _eyeCrossed: ImageVector? = null
