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

public val Icons.Filled.Interrogation: ImageVector
    get() {
        if (_interrogation != null) {
            return _interrogation!!
        }
        _interrogation = Builder(name = "Interrogation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 12.0f)
                    curveTo(24.0f, 14.3734f, 23.2962f, 16.6935f, 21.9776f, 18.6668f)
                    curveTo(20.6591f, 20.6402f, 18.7849f, 22.1783f, 16.5922f, 23.0866f)
                    curveTo(14.3995f, 23.9948f, 11.9867f, 24.2324f, 9.6589f, 23.7694f)
                    curveTo(7.3312f, 23.3064f, 5.1929f, 22.1635f, 3.5147f, 20.4853f)
                    curveTo(1.8365f, 18.8071f, 0.6936f, 16.6689f, 0.2306f, 14.3411f)
                    curveTo(-0.2324f, 12.0133f, 0.0052f, 9.6005f, 0.9135f, 7.4078f)
                    curveTo(1.8217f, 5.2151f, 3.3598f, 3.3409f, 5.3332f, 2.0224f)
                    curveTo(7.3066f, 0.7038f, 9.6266f, 0.0f, 12.0f, 0.0f)
                    curveTo(15.1815f, 0.0034f, 18.2318f, 1.2688f, 20.4815f, 3.5185f)
                    curveTo(22.7312f, 5.7682f, 23.9966f, 8.8185f, 24.0f, 12.0f)
                    close()
                    moveTo(13.0f, 14.257f)
                    curveTo(12.9875f, 13.909f, 13.0668f, 13.5639f, 13.2301f, 13.2563f)
                    curveTo(13.3933f, 12.9487f, 13.6347f, 12.6896f, 13.93f, 12.505f)
                    curveTo(14.5479f, 12.1646f, 15.0649f, 11.6668f, 15.4283f, 11.0622f)
                    curveTo(15.7918f, 10.4575f, 15.9889f, 9.7675f, 15.9995f, 9.062f)
                    curveTo(16.0102f, 8.3566f, 15.8342f, 7.6609f, 15.4892f, 7.0455f)
                    curveTo(15.1442f, 6.4301f, 14.6427f, 5.9169f, 14.0353f, 5.5579f)
                    curveTo(13.428f, 5.199f, 12.7365f, 5.007f, 12.031f, 5.0015f)
                    curveTo(11.3256f, 4.9961f, 10.6312f, 5.1773f, 10.0184f, 5.5268f)
                    curveTo(9.4055f, 5.8763f, 8.896f, 6.3817f, 8.5416f, 6.9917f)
                    curveTo(8.1871f, 7.6016f, 8.0003f, 8.2945f, 8.0f, 9.0f)
                    horizontalLineTo(10.0f)
                    curveTo(9.9998f, 8.7058f, 10.0644f, 8.4151f, 10.1894f, 8.1488f)
                    curveTo(10.3144f, 7.8824f, 10.4966f, 7.6469f, 10.723f, 7.459f)
                    curveTo(10.9495f, 7.2712f, 11.2146f, 7.1356f, 11.4994f, 7.062f)
                    curveTo(11.7843f, 6.9883f, 12.0819f, 6.9784f, 12.371f, 7.033f)
                    curveTo(12.766f, 7.1097f, 13.1293f, 7.3024f, 13.4143f, 7.5865f)
                    curveTo(13.6992f, 7.8706f, 13.8931f, 8.2332f, 13.971f, 8.628f)
                    curveTo(14.0497f, 9.0424f, 13.9954f, 9.4711f, 13.8158f, 9.8527f)
                    curveTo(13.6362f, 10.2344f, 13.3405f, 10.5495f, 12.971f, 10.753f)
                    curveTo(12.3592f, 11.1075f, 11.8536f, 11.6195f, 11.5069f, 12.2358f)
                    curveTo(11.1603f, 12.8521f, 10.9852f, 13.5501f, 11.0f, 14.257f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(14.257f)
                    close()
                    moveTo(13.0f, 17.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _interrogation!!
    }

private var _interrogation: ImageVector? = null
