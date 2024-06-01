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

public val Icons.Filled.GlobeAlt: ImageVector
    get() {
        if (_globeAlt != null) {
            return _globeAlt!!
        }
        _globeAlt = Builder(name = "GlobeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.9999f, 8.0001f)
                    curveTo(4.9999f, 6.4179f, 5.4691f, 4.8712f, 6.3481f, 3.5556f)
                    curveTo(7.2272f, 2.24f, 8.4766f, 1.2146f, 9.9384f, 0.6091f)
                    curveTo(11.4002f, 0.0036f, 13.0087f, -0.1548f, 14.5606f, 0.1539f)
                    curveTo(16.1124f, 0.4625f, 17.5379f, 1.2245f, 18.6567f, 2.3433f)
                    curveTo(19.7755f, 3.4621f, 20.5375f, 4.8876f, 20.8462f, 6.4394f)
                    curveTo(21.1548f, 7.9913f, 20.9964f, 9.5998f, 20.3909f, 11.0616f)
                    curveTo(19.7854f, 12.5234f, 18.76f, 13.7729f, 17.4444f, 14.6519f)
                    curveTo(16.1288f, 15.531f, 14.5821f, 16.0001f, 12.9999f, 16.0001f)
                    curveTo(10.8789f, 15.9978f, 8.8454f, 15.1541f, 7.3457f, 13.6544f)
                    curveTo(5.8459f, 12.1546f, 5.0023f, 10.1211f, 4.9999f, 8.0001f)
                    close()
                    moveTo(22.9069f, 14.7731f)
                    lineTo(21.2559f, 13.6431f)
                    curveTo(20.4819f, 14.7732f, 19.4841f, 15.7323f, 18.3242f, 16.4608f)
                    curveTo(17.1643f, 17.1894f, 15.8671f, 17.6719f, 14.5131f, 17.8784f)
                    curveTo(13.1591f, 18.0849f, 11.777f, 18.0111f, 10.4527f, 17.6615f)
                    curveTo(9.1284f, 17.3118f, 7.89f, 16.6939f, 6.8143f, 15.8459f)
                    curveTo(5.7387f, 14.9979f, 4.8487f, 13.938f, 4.1996f, 12.7319f)
                    curveTo(3.5504f, 11.5258f, 3.156f, 10.1992f, 3.0407f, 8.8343f)
                    curveTo(2.9255f, 7.4695f, 3.0918f, 6.0955f, 3.5294f, 4.7976f)
                    curveTo(3.9671f, 3.4997f, 4.6667f, 2.3055f, 5.5849f, 1.2891f)
                    lineTo(4.0999f, -0.0529f)
                    curveTo(2.5989f, 1.6055f, 1.5915f, 3.6506f, 1.1917f, 5.8513f)
                    curveTo(0.7918f, 8.0521f, 1.0154f, 10.3208f, 1.8371f, 12.4012f)
                    curveTo(2.6589f, 14.4815f, 4.046f, 16.2907f, 5.8419f, 17.6241f)
                    curveTo(7.6378f, 18.9576f, 9.7707f, 19.7622f, 11.9999f, 19.9471f)
                    verticalLineTo(22.0001f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(24.0001f)
                    horizontalLineTo(17.9999f)
                    verticalLineTo(22.0001f)
                    horizontalLineTo(13.9999f)
                    verticalLineTo(19.9391f)
                    curveTo(15.775f, 19.7935f, 17.4954f, 19.2544f, 19.036f, 18.3608f)
                    curveTo(20.5767f, 17.4672f, 21.899f, 16.2416f, 22.9069f, 14.7731f)
                    close()
                }
            }
        }
        .build()
        return _globeAlt!!
    }

private var _globeAlt: ImageVector? = null
