package me.localx.icons.straight.bold

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

public val Icons.Bold.MapMarkerCross: ImageVector
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
                    moveTo(8.1232f, 11.9261f)
                    lineTo(10.059f, 9.9913f)
                    lineTo(8.1232f, 8.0566f)
                    lineTo(10.2406f, 5.9392f)
                    lineTo(12.1753f, 7.875f)
                    lineTo(14.1101f, 5.9393f)
                    lineTo(16.2274f, 8.0566f)
                    lineTo(14.2917f, 9.9914f)
                    lineTo(16.2274f, 11.9262f)
                    lineTo(14.1101f, 14.0435f)
                    lineTo(12.1753f, 12.1077f)
                    lineTo(10.2406f, 14.0435f)
                    lineTo(8.1232f, 11.9261f)
                    close()
                    moveTo(5.0071f, 17.1267f)
                    curveTo(1.0488f, 13.2926f, 0.9481f, 6.9756f, 4.7822f, 3.0173f)
                    curveTo(8.6163f, -0.941f, 14.9332f, -1.0417f, 18.8915f, 2.7924f)
                    curveTo(18.9642f, 2.8627f, 19.0357f, 2.9342f, 19.1061f, 3.0067f)
                    curveTo(23.0028f, 6.9034f, 23.0028f, 13.221f, 19.1061f, 17.1177f)
                    lineTo(12.0506f, 24.0186f)
                    lineTo(5.0071f, 17.1267f)
                    close()
                    moveTo(5.0659f, 10.0602f)
                    curveTo(5.0612f, 11.9136f, 5.7977f, 13.692f, 7.1115f, 14.9994f)
                    lineTo(12.0507f, 19.8297f)
                    lineTo(17.0008f, 14.9874f)
                    curveTo(19.7223f, 12.2535f, 19.7122f, 7.8311f, 16.9783f, 5.1096f)
                    curveTo(14.2444f, 2.3881f, 9.822f, 2.3982f, 7.1005f, 5.1321f)
                    curveTo(5.7973f, 6.4412f, 5.0658f, 8.2131f, 5.0659f, 10.0602f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
