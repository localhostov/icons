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

public val Icons.Filled.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.071f, 2.9359f)
                    curveTo(18.1452f, 1.9934f, 17.0418f, 1.2436f, 15.8245f, 0.73f)
                    curveTo(14.6073f, 0.2164f, 13.3003f, -0.0509f, 11.9791f, -0.0564f)
                    curveTo(10.6579f, -0.062f, 9.3488f, 0.1943f, 8.1272f, 0.6977f)
                    curveTo(6.9057f, 1.201f, 5.796f, 1.9414f, 4.8623f, 2.8762f)
                    curveTo(3.9285f, 3.8109f, 3.1893f, 4.9214f, 2.6872f, 6.1434f)
                    curveTo(2.1852f, 7.3655f, 1.9303f, 8.6749f, 1.9372f, 9.9961f)
                    curveTo(1.9442f, 11.3173f, 2.2129f, 12.624f, 2.7278f, 13.8407f)
                    curveTo(3.2426f, 15.0574f, 3.9935f, 16.16f, 4.937f, 17.0849f)
                    lineTo(12.0f, 23.9939f)
                    lineTo(19.071f, 17.0769f)
                    curveTo(20.9461f, 15.2016f, 21.9994f, 12.6583f, 21.9994f, 10.0064f)
                    curveTo(21.9994f, 7.3545f, 20.9461f, 4.8112f, 19.071f, 2.9359f)
                    close()
                    moveTo(17.0f, 13.9999f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(9.4089f)
                    curveTo(7.0012f, 9.0247f, 7.0904f, 8.646f, 7.2608f, 8.3017f)
                    curveTo(7.4312f, 7.9574f, 7.6783f, 7.6568f, 7.983f, 7.4229f)
                    lineTo(10.483f, 5.5129f)
                    curveTo(10.9194f, 5.1811f, 11.4524f, 5.0014f, 12.0005f, 5.0014f)
                    curveTo(12.5487f, 5.0014f, 13.0817f, 5.1811f, 13.518f, 5.5129f)
                    lineTo(16.018f, 7.4229f)
                    curveTo(16.3225f, 7.657f, 16.5693f, 7.9577f, 16.7395f, 8.3019f)
                    curveTo(16.9097f, 8.6462f, 16.9989f, 9.0248f, 17.0f, 9.4089f)
                    verticalLineTo(13.9999f)
                    close()
                    moveTo(14.8f, 9.0129f)
                    curveTo(14.8621f, 9.0595f, 14.9125f, 9.1199f, 14.9473f, 9.1893f)
                    curveTo(14.982f, 9.2587f, 15.0f, 9.3353f, 15.0f, 9.4129f)
                    verticalLineTo(11.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(9.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(11.9999f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(9.4089f)
                    curveTo(9.0f, 9.3313f, 9.0181f, 9.2547f, 9.0528f, 9.1853f)
                    curveTo(9.0875f, 9.1159f, 9.1379f, 9.0555f, 9.2f, 9.0089f)
                    lineTo(11.7f, 7.0999f)
                    curveTo(11.7873f, 7.0331f, 11.8941f, 6.9969f, 12.004f, 6.9969f)
                    curveTo(12.1139f, 6.9969f, 12.2208f, 7.0331f, 12.308f, 7.0999f)
                    lineTo(14.8f, 9.0129f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
