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

public val Icons.Filled.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 0.0425f)
                    curveTo(9.3539f, 0.0454f, 6.817f, 1.0978f, 4.9459f, 2.9687f)
                    curveTo(3.0747f, 4.8397f, 2.0221f, 7.3764f, 2.0189f, 10.0225f)
                    curveTo(2.0189f, 12.5925f, 4.0089f, 16.6145f, 7.9339f, 21.9765f)
                    curveTo(8.4012f, 22.6166f, 9.013f, 23.1374f, 9.7195f, 23.4964f)
                    curveTo(10.4261f, 23.8554f, 11.2074f, 24.0425f, 11.9999f, 24.0425f)
                    curveTo(12.7924f, 24.0425f, 13.5738f, 23.8554f, 14.2803f, 23.4964f)
                    curveTo(14.9869f, 23.1374f, 15.5987f, 22.6166f, 16.0659f, 21.9765f)
                    curveTo(19.9909f, 16.6145f, 21.9809f, 12.5925f, 21.9809f, 10.0225f)
                    curveTo(21.9777f, 7.3764f, 20.9251f, 4.8397f, 19.054f, 2.9687f)
                    curveTo(17.1828f, 1.0978f, 14.646f, 0.0454f, 11.9999f, 0.0425f)
                    close()
                    moveTo(11.9999f, 14.0005f)
                    curveTo(11.2088f, 14.0005f, 10.4354f, 13.7659f, 9.7776f, 13.3264f)
                    curveTo(9.1198f, 12.8868f, 8.6072f, 12.2621f, 8.3044f, 11.5312f)
                    curveTo(8.0016f, 10.8003f, 7.9224f, 9.996f, 8.0768f, 9.2201f)
                    curveTo(8.2311f, 8.4442f, 8.6121f, 7.7315f, 9.1715f, 7.172f)
                    curveTo(9.7309f, 6.6126f, 10.4436f, 6.2317f, 11.2196f, 6.0773f)
                    curveTo(11.9955f, 5.923f, 12.7998f, 6.0022f, 13.5307f, 6.305f)
                    curveTo(14.2616f, 6.6077f, 14.8863f, 7.1204f, 15.3258f, 7.7782f)
                    curveTo(15.7653f, 8.436f, 15.9999f, 9.2094f, 15.9999f, 10.0005f)
                    curveTo(15.9999f, 11.0613f, 15.5785f, 12.0788f, 14.8283f, 12.8289f)
                    curveTo(14.0782f, 13.5791f, 13.0608f, 14.0005f, 11.9999f, 14.0005f)
                    close()
                }
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
