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

public val Icons.Bold.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 0.9879f)
                    curveTo(22.6458f, 0.6346f, 22.2178f, 0.3642f, 21.7466f, 0.1961f)
                    curveTo(21.2754f, 0.0281f, 20.7728f, -0.0335f, 20.275f, 0.0159f)
                    curveTo(17.577f, 0.2769f, 8.493f, 1.4059f, 4.92f, 4.9789f)
                    curveTo(3.2422f, 6.6686f, 2.2224f, 8.9015f, 2.0441f, 11.276f)
                    curveTo(1.8657f, 13.6504f, 2.5405f, 16.0106f, 3.947f, 17.9319f)
                    lineTo(0.439f, 21.4389f)
                    curveTo(0.1576f, 21.7203f, -5.0E-4f, 22.102f, -5.0E-4f, 22.4999f)
                    curveTo(-5.0E-4f, 22.8979f, 0.1576f, 23.2796f, 0.439f, 23.5609f)
                    curveTo(0.7204f, 23.8423f, 1.102f, 24.0004f, 1.5f, 24.0004f)
                    curveTo(1.8979f, 24.0004f, 2.2796f, 23.8423f, 2.561f, 23.5609f)
                    lineTo(6.068f, 20.0529f)
                    curveTo(7.9893f, 21.4595f, 10.3495f, 22.1342f, 12.724f, 21.9559f)
                    curveTo(15.0984f, 21.7775f, 17.3313f, 20.7577f, 19.021f, 19.0799f)
                    curveTo(22.644f, 15.4569f, 23.737f, 6.3999f, 23.985f, 3.7089f)
                    curveTo(24.0319f, 3.2108f, 23.9679f, 2.7085f, 23.7976f, 2.238f)
                    curveTo(23.6273f, 1.7675f, 23.3549f, 1.3406f, 23.0f, 0.9879f)
                    close()
                    moveTo(16.9f, 16.9579f)
                    curveTo(15.7748f, 18.0767f, 14.3025f, 18.7794f, 12.7251f, 18.9505f)
                    curveTo(11.1477f, 19.1217f, 9.559f, 18.7512f, 8.22f, 17.8999f)
                    lineTo(16.561f, 9.5599f)
                    curveTo(16.8424f, 9.2786f, 17.0005f, 8.8969f, 17.0005f, 8.4989f)
                    curveTo(17.0005f, 8.101f, 16.8424f, 7.7193f, 16.561f, 7.4379f)
                    curveTo(16.2796f, 7.1565f, 15.8979f, 6.9985f, 15.5f, 6.9985f)
                    curveTo(15.102f, 6.9985f, 14.7204f, 7.1565f, 14.439f, 7.4379f)
                    lineTo(6.1f, 15.7799f)
                    curveTo(5.2487f, 14.441f, 4.8782f, 12.8522f, 5.0494f, 11.2748f)
                    curveTo(5.2206f, 9.6974f, 5.9233f, 8.2251f, 7.042f, 7.0999f)
                    curveTo(9.322f, 4.8199f, 15.751f, 3.4679f, 20.565f, 2.9999f)
                    curveTo(20.6232f, 2.9937f, 20.6821f, 3.0006f, 20.7374f, 3.0201f)
                    curveTo(20.7926f, 3.0397f, 20.8427f, 3.0714f, 20.884f, 3.1129f)
                    curveTo(20.9266f, 3.1538f, 20.9592f, 3.2039f, 20.9793f, 3.2594f)
                    curveTo(20.9994f, 3.3149f, 21.0065f, 3.3743f, 21.0f, 3.4329f)
                    curveTo(20.555f, 8.2249f, 19.216f, 14.6419f, 16.9f, 16.9579f)
                    close()
                }
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
