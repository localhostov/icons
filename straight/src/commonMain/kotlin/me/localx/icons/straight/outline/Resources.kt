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

public val Icons.Outline.Resources: ImageVector
    get() {
        if (_resources != null) {
            return _resources!!
        }
        _resources = Builder(name = "Resources", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 2.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(7.7359f)
                    lineTo(10.329f, 3.1079f)
                    curveTo(10.1535f, 2.8039f, 9.901f, 2.5514f, 9.597f, 2.3759f)
                    curveTo(9.2929f, 2.2004f, 8.9481f, 2.108f, 8.597f, 2.108f)
                    curveTo(8.2459f, 2.108f, 7.9011f, 2.2004f, 7.597f, 2.3759f)
                    curveTo(7.293f, 2.5514f, 7.0405f, 2.8039f, 6.865f, 3.1079f)
                    lineTo(0.0f, 14.9999f)
                    horizontalLineTo(7.294f)
                    curveTo(6.9672f, 16.0886f, 6.9104f, 17.2405f, 7.1286f, 18.356f)
                    curveTo(7.3468f, 19.4716f, 7.8333f, 20.5172f, 8.5462f, 21.4026f)
                    curveTo(9.2591f, 22.2879f, 10.1769f, 22.9864f, 11.2202f, 23.4375f)
                    curveTo(12.2635f, 23.8887f, 13.401f, 24.0789f, 14.5344f, 23.9919f)
                    curveTo(15.6677f, 23.9049f, 16.7628f, 23.5432f, 17.7251f, 22.938f)
                    curveTo(18.6873f, 22.3329f, 19.4876f, 21.5025f, 20.057f, 20.5187f)
                    curveTo(20.6264f, 19.5349f, 20.9476f, 18.4272f, 20.9929f, 17.2914f)
                    curveTo(21.0382f, 16.1556f, 20.8062f, 15.0259f, 20.317f, 13.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(2.9999f)
                    close()
                    moveTo(3.464f, 12.9999f)
                    lineTo(8.6f, 4.1089f)
                    lineTo(12.148f, 10.2559f)
                    curveTo(10.5713f, 10.6884f, 9.1958f, 11.6592f, 8.26f, 12.9999f)
                    horizontalLineTo(3.464f)
                    close()
                    moveTo(14.0f, 21.9999f)
                    curveTo(13.0111f, 21.9999f, 12.0444f, 21.7066f, 11.2221f, 21.1572f)
                    curveTo(10.3999f, 20.6078f, 9.759f, 19.8269f, 9.3806f, 18.9133f)
                    curveTo(9.0022f, 17.9997f, 8.9031f, 16.9943f, 9.0961f, 16.0244f)
                    curveTo(9.289f, 15.0545f, 9.7652f, 14.1636f, 10.4645f, 13.4643f)
                    curveTo(11.1637f, 12.7651f, 12.0546f, 12.2889f, 13.0245f, 12.0959f)
                    curveTo(13.9945f, 11.903f, 14.9998f, 12.002f, 15.9134f, 12.3805f)
                    curveTo(16.827f, 12.7589f, 17.6079f, 13.3998f, 18.1573f, 14.222f)
                    curveTo(18.7068f, 15.0443f, 19.0f, 16.011f, 19.0f, 16.9999f)
                    curveTo(18.9984f, 18.3255f, 18.4711f, 19.5963f, 17.5338f, 20.5336f)
                    curveTo(16.5964f, 21.471f, 15.3256f, 21.9983f, 14.0f, 21.9999f)
                    close()
                    moveTo(22.0f, 11.9999f)
                    horizontalLineTo(18.894f)
                    curveTo(17.8336f, 10.9616f, 16.4693f, 10.2889f, 15.0f, 10.0799f)
                    verticalLineTo(4.9999f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(11.9999f)
                    close()
                }
            }
        }
        .build()
        return _resources!!
    }

private var _resources: ImageVector? = null
