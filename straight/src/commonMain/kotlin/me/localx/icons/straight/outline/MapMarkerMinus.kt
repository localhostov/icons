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

public val Icons.Outline.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0004f, 11.0001f)
                    horizontalLineTo(8.0004f)
                    verticalLineTo(9.0001f)
                    horizontalLineTo(16.0004f)
                    verticalLineTo(11.0001f)
                    close()
                    moveTo(4.9374f, 17.0791f)
                    curveTo(3.5369f, 15.6819f, 2.5824f, 13.9006f, 2.1945f, 11.9607f)
                    curveTo(1.8066f, 10.0208f, 2.0028f, 8.0094f, 2.7583f, 6.181f)
                    curveTo(3.5138f, 4.3527f, 4.7947f, 2.7895f, 6.4388f, 1.6892f)
                    curveTo(8.0829f, 0.589f, 10.0164f, 0.0011f, 11.9947f, 0.0f)
                    curveTo(13.973f, -0.0011f, 15.9072f, 0.5846f, 17.5526f, 1.683f)
                    curveTo(19.1979f, 2.7813f, 20.4805f, 4.3431f, 21.2381f, 6.1706f)
                    curveTo(21.9957f, 7.9981f, 22.1942f, 10.0092f, 21.8085f, 11.9496f)
                    curveTo(21.4228f, 13.8899f, 20.4703f, 15.6723f, 19.0714f, 17.0711f)
                    lineTo(12.0004f, 23.9871f)
                    lineTo(4.9374f, 17.0791f)
                    close()
                    moveTo(4.0004f, 10.0001f)
                    curveTo(3.9975f, 11.0511f, 4.2031f, 12.0923f, 4.6053f, 13.0633f)
                    curveTo(5.0074f, 14.0343f, 5.5982f, 14.9159f, 6.3434f, 15.6571f)
                    lineTo(12.0004f, 21.1891f)
                    lineTo(17.6654f, 15.6491f)
                    curveTo(18.594f, 14.7179f, 19.2786f, 13.5721f, 19.6588f, 12.3131f)
                    curveTo(20.039f, 11.0541f, 20.1029f, 9.7209f, 19.845f, 8.4313f)
                    curveTo(19.587f, 7.1417f, 19.0152f, 5.9357f, 18.18f, 4.9198f)
                    curveTo(17.3448f, 3.904f, 16.272f, 3.1097f, 15.0567f, 2.6072f)
                    curveTo(13.8413f, 2.1048f, 12.5208f, 1.9098f, 11.2121f, 2.0394f)
                    curveTo(9.9034f, 2.1689f, 8.6468f, 2.6192f, 7.5536f, 3.3502f)
                    curveTo(6.4604f, 4.0812f, 5.5642f, 5.0704f, 4.9444f, 6.2303f)
                    curveTo(4.3247f, 7.3902f, 4.0004f, 8.685f, 4.0004f, 10.0001f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
