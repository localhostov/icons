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

public val Icons.Filled.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.7904f, 3.2789f)
                    curveTo(15.5429f, -1.0417f, 8.597f, -1.101f, 4.2764f, 3.1466f)
                    curveTo(-0.0442f, 7.3941f, -0.1034f, 14.34f, 4.1441f, 18.6606f)
                    curveTo(4.1969f, 18.7143f, 4.2502f, 18.7675f, 4.3041f, 18.8201f)
                    lineTo(8.2366f, 22.4533f)
                    curveTo(10.3389f, 24.5099f, 13.6966f, 24.5183f, 15.8092f, 22.4722f)
                    lineTo(19.7904f, 18.7932f)
                    curveTo(24.0744f, 14.5089f, 24.0744f, 7.5631f, 19.7904f, 3.2789f)
                    close()
                    moveTo(15.7304f, 13.3228f)
                    curveTo(16.1266f, 13.7055f, 16.1375f, 14.3369f, 15.7548f, 14.733f)
                    curveTo(15.3721f, 15.1292f, 14.7408f, 15.1402f, 14.3446f, 14.7575f)
                    curveTo(14.3364f, 14.7495f, 14.3282f, 14.7413f, 14.3202f, 14.733f)
                    lineTo(12.0333f, 12.4462f)
                    lineTo(9.7465f, 14.7331f)
                    curveTo(9.3503f, 15.1157f, 8.7189f, 15.1048f, 8.3363f, 14.7086f)
                    curveTo(7.963f, 14.3221f, 7.963f, 13.7094f, 8.3363f, 13.3229f)
                    lineTo(10.6231f, 11.036f)
                    lineTo(8.3363f, 8.7492f)
                    curveTo(7.9401f, 8.3666f, 7.9291f, 7.7352f, 8.3117f, 7.339f)
                    curveTo(8.6944f, 6.9428f, 9.3257f, 6.9318f, 9.7219f, 7.3145f)
                    curveTo(9.7302f, 7.3225f, 9.7384f, 7.3307f, 9.7465f, 7.339f)
                    lineTo(12.0333f, 9.6258f)
                    lineTo(14.3201f, 7.339f)
                    curveTo(14.7028f, 6.9428f, 15.3342f, 6.9318f, 15.7303f, 7.3145f)
                    curveTo(16.1265f, 7.6972f, 16.1375f, 8.3286f, 15.7548f, 8.7247f)
                    curveTo(15.7468f, 8.733f, 15.7386f, 8.7412f, 15.7303f, 8.7492f)
                    lineTo(13.4435f, 11.036f)
                    lineTo(15.7304f, 13.3228f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
