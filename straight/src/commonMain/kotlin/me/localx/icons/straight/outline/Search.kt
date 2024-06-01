package me.localx.icons.straight.outline

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

public val Icons.Outline.Search: ImageVector
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
                    moveTo(23.9998f, 22.5867f)
                    lineTo(17.7378f, 16.3247f)
                    curveTo(19.3644f, 14.3353f, 20.1642f, 11.7968f, 19.9716f, 9.2343f)
                    curveTo(19.7791f, 6.6717f, 18.609f, 4.2812f, 16.7034f, 2.5572f)
                    curveTo(14.7977f, 0.8332f, 12.3024f, -0.0924f, 9.7334f, -0.0282f)
                    curveTo(7.1645f, 0.0361f, 4.7185f, 1.0852f, 2.9014f, 2.9023f)
                    curveTo(1.0843f, 4.7194f, 0.0351f, 7.1654f, -0.0291f, 9.7343f)
                    curveTo(-0.0933f, 12.3033f, 0.8323f, 14.7987f, 2.5563f, 16.7043f)
                    curveTo(4.2803f, 18.6099f, 6.6708f, 19.78f, 9.2333f, 19.9725f)
                    curveTo(11.7959f, 20.1651f, 14.3344f, 19.3653f, 16.3238f, 17.7387f)
                    lineTo(22.5858f, 24.0007f)
                    lineTo(23.9998f, 22.5867f)
                    close()
                    moveTo(9.9998f, 18.0007f)
                    curveTo(8.4175f, 18.0007f, 6.8708f, 17.5315f, 5.5552f, 16.6525f)
                    curveTo(4.2396f, 15.7734f, 3.2143f, 14.524f, 2.6088f, 13.0622f)
                    curveTo(2.0032f, 11.6004f, 1.8448f, 9.9918f, 2.1535f, 8.44f)
                    curveTo(2.4622f, 6.8881f, 3.2241f, 5.4627f, 4.3429f, 4.3438f)
                    curveTo(5.4618f, 3.225f, 6.8872f, 2.4631f, 8.4391f, 2.1544f)
                    curveTo(9.9909f, 1.8457f, 11.5994f, 2.0042f, 13.0612f, 2.6097f)
                    curveTo(14.5231f, 3.2152f, 15.7725f, 4.2405f, 16.6515f, 5.5561f)
                    curveTo(17.5306f, 6.8717f, 17.9998f, 8.4185f, 17.9998f, 10.0007f)
                    curveTo(17.9974f, 12.1217f, 17.1538f, 14.1551f, 15.654f, 15.6549f)
                    curveTo(14.1542f, 17.1547f, 12.1208f, 17.9983f, 9.9998f, 18.0007f)
                    close()
                }
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
