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

public val Icons.Filled.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.923f, 7.284f)
                    curveTo(19.6301f, 7.0815f, 19.2765f, 6.986f, 18.9215f, 7.0137f)
                    curveTo(18.5665f, 7.0414f, 18.2319f, 7.1905f, 17.974f, 7.436f)
                    curveTo(16.8034f, 8.3029f, 15.4224f, 8.8411f, 13.974f, 8.995f)
                    curveTo(13.7142f, 8.9883f, 13.4672f, 8.8806f, 13.2854f, 8.6949f)
                    curveTo(13.1035f, 8.5091f, 13.0012f, 8.2599f, 13.0f, 8.0f)
                    verticalLineTo(6.965f)
                    curveTo(14.5321f, 6.9707f, 16.008f, 6.3878f, 17.1228f, 5.3368f)
                    curveTo(18.2377f, 4.2858f, 18.9064f, 2.8468f, 18.991f, 1.317f)
                    curveTo(19.0128f, 1.14f, 18.9941f, 0.9603f, 18.9361f, 0.7917f)
                    curveTo(18.8781f, 0.623f, 18.7824f, 0.4698f, 18.6563f, 0.3437f)
                    curveTo(18.5302f, 0.2176f, 18.377f, 0.1219f, 18.2083f, 0.0639f)
                    curveTo(18.0396f, 0.0059f, 17.86f, -0.0129f, 17.683f, 0.009f)
                    curveTo(15.828f, 0.086f, 13.1f, 1.529f, 12.532f, 3.709f)
                    curveTo(12.1918f, 2.4404f, 11.5693f, 1.2651f, 10.711f, 0.271f)
                    curveTo(10.5244f, 0.086f, 10.2725f, -0.0181f, 10.0097f, -0.0188f)
                    curveTo(9.747f, -0.0195f, 9.4945f, 0.0832f, 9.3069f, 0.2671f)
                    curveTo(9.1193f, 0.4511f, 9.0116f, 0.7015f, 9.0071f, 0.9642f)
                    curveTo(9.0027f, 1.2269f, 9.1017f, 1.4808f, 9.283f, 1.671f)
                    curveTo(10.2793f, 2.9032f, 10.8622f, 4.4178f, 10.949f, 6.0f)
                    horizontalLineTo(8.5f)
                    curveTo(6.1809f, 6.0709f, 3.9843f, 7.0577f, 2.3912f, 8.7445f)
                    curveTo(0.7982f, 10.4313f, -0.0617f, 12.6807f, -0.0f, 15.0f)
                    curveTo(-0.161f, 20.6f, 5.644f, 25.773f, 10.75f, 23.385f)
                    curveTo(11.1399f, 23.1371f, 11.5932f, 23.007f, 12.0553f, 23.0103f)
                    curveTo(12.5174f, 23.0137f, 12.9687f, 23.1504f, 13.355f, 23.404f)
                    curveTo(14.0078f, 23.7815f, 14.746f, 23.9866f, 15.5f, 24.0f)
                    curveTo(24.213f, 23.922f, 27.064f, 11.874f, 19.923f, 7.284f)
                    close()
                }
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
