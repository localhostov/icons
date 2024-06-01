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

public val Icons.Filled.MarkerTime: ImageVector
    get() {
        if (_markerTime != null) {
            return _markerTime!!
        }
        _markerTime = Builder(name = "MarkerTime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 4.9999f)
                    curveTo(11.0111f, 4.9999f, 10.0444f, 5.2932f, 9.2222f, 5.8426f)
                    curveTo(8.3999f, 6.392f, 7.7591f, 7.1729f, 7.3806f, 8.0865f)
                    curveTo(7.0022f, 9.0002f, 6.9032f, 10.0055f, 7.0961f, 10.9754f)
                    curveTo(7.289f, 11.9453f, 7.7652f, 12.8362f, 8.4645f, 13.5355f)
                    curveTo(9.1638f, 14.2347f, 10.0547f, 14.7109f, 11.0246f, 14.9039f)
                    curveTo(11.9945f, 15.0968f, 12.9998f, 14.9978f, 13.9134f, 14.6193f)
                    curveTo(14.8271f, 14.2409f, 15.608f, 13.6f, 16.1574f, 12.7778f)
                    curveTo(16.7068f, 11.9555f, 17.0f, 10.9888f, 17.0f, 9.9999f)
                    curveTo(16.9984f, 8.6743f, 16.4711f, 7.4035f, 15.5338f, 6.4662f)
                    curveTo(14.5965f, 5.5288f, 13.3256f, 5.0015f, 12.0f, 4.9999f)
                    close()
                    moveTo(12.793f, 12.2069f)
                    lineTo(11.0f, 10.4139f)
                    verticalLineTo(6.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(9.5859f)
                    lineTo(14.207f, 10.7929f)
                    lineTo(12.793f, 12.2069f)
                    close()
                    moveTo(19.071f, 2.9359f)
                    curveTo(18.1452f, 1.9934f, 17.0418f, 1.2437f, 15.8245f, 0.7301f)
                    curveTo(14.6072f, 0.2165f, 13.3003f, -0.0508f, 11.9791f, -0.0564f)
                    curveTo(10.6579f, -0.0619f, 9.3487f, 0.1944f, 8.1272f, 0.6977f)
                    curveTo(6.9057f, 1.2011f, 5.796f, 1.9415f, 4.8622f, 2.8762f)
                    curveTo(3.9285f, 3.8109f, 3.1893f, 4.9214f, 2.6872f, 6.1435f)
                    curveTo(2.1852f, 7.3656f, 1.9302f, 8.675f, 1.9372f, 9.9962f)
                    curveTo(1.9441f, 11.3173f, 2.2128f, 12.624f, 2.7277f, 13.8408f)
                    curveTo(3.2426f, 15.0575f, 3.9935f, 16.1601f, 4.937f, 17.0849f)
                    lineTo(12.0f, 23.9939f)
                    lineTo(19.071f, 17.0779f)
                    curveTo(20.9437f, 15.2012f, 21.9953f, 12.6582f, 21.9953f, 10.0069f)
                    curveTo(21.9953f, 7.3557f, 20.9437f, 4.8127f, 19.071f, 2.9359f)
                    close()
                    moveTo(12.0f, 16.9999f)
                    curveTo(10.6156f, 16.9999f, 9.2622f, 16.5894f, 8.111f, 15.8202f)
                    curveTo(6.9599f, 15.0511f, 6.0627f, 13.9578f, 5.5329f, 12.6787f)
                    curveTo(5.0031f, 11.3996f, 4.8644f, 9.9922f, 5.1345f, 8.6343f)
                    curveTo(5.4046f, 7.2764f, 6.0713f, 6.0292f, 7.0503f, 5.0502f)
                    curveTo(8.0293f, 4.0712f, 9.2765f, 3.4045f, 10.6344f, 3.1344f)
                    curveTo(11.9923f, 2.8644f, 13.3997f, 3.003f, 14.6788f, 3.5328f)
                    curveTo(15.9579f, 4.0626f, 17.0511f, 4.9598f, 17.8203f, 6.1109f)
                    curveTo(18.5895f, 7.2621f, 19.0f, 8.6155f, 19.0f, 9.9999f)
                    curveTo(18.9979f, 11.8558f, 18.2597f, 13.6351f, 16.9474f, 14.9474f)
                    curveTo(15.6351f, 16.2596f, 13.8559f, 16.9978f, 12.0f, 16.9999f)
                    close()
                }
            }
        }
        .build()
        return _markerTime!!
    }

private var _markerTime: ImageVector? = null
