package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 12.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(13.94f, 16.413f)
                curveToRelative(-0.666f, -0.218f, -1.41f, -0.413f, -1.94f, -0.413f)
                curveToRelative(-0.526f, 0.0f, -1.264f, 0.192f, -1.927f, 0.408f)
                curveToRelative(-0.911f, 0.297f, -1.454f, 1.229f, -1.277f, 2.171f)
                lineToRelative(0.856f, 3.854f)
                curveToRelative(0.203f, 0.915f, 1.015f, 1.566f, 1.952f, 1.566f)
                horizontalLineToRelative(0.846f)
                curveToRelative(0.945f, 0.0f, 1.761f, -0.662f, 1.957f, -1.586f)
                lineToRelative(0.813f, -3.846f)
                curveToRelative(0.167f, -0.937f, -0.375f, -1.859f, -1.28f, -2.154f)
                close()
                moveTo(18.206f, 15.185f)
                curveToRelative(1.394f, -2.72f, 0.89f, -5.988f, -1.256f, -8.134f)
                curveToRelative(-1.322f, -1.322f, -3.08f, -2.051f, -4.95f, -2.051f)
                reflectiveCurveToRelative(-3.628f, 0.729f, -4.95f, 2.051f)
                curveToRelative(-2.146f, 2.146f, -2.65f, 5.414f, -1.256f, 8.134f)
                curveToRelative(0.378f, 0.735f, 1.28f, 1.028f, 2.02f, 0.65f)
                curveToRelative(0.737f, -0.378f, 1.028f, -1.282f, 0.65f, -2.02f)
                curveToRelative(-0.798f, -1.556f, -0.514f, -3.422f, 0.708f, -4.644f)
                curveToRelative(1.512f, -1.512f, 4.146f, -1.512f, 5.657f, 0.0f)
                curveToRelative(1.221f, 1.222f, 1.506f, 3.088f, 0.708f, 4.644f)
                curveToRelative(-0.378f, 0.737f, -0.086f, 1.642f, 0.65f, 2.02f)
                curveToRelative(0.219f, 0.112f, 0.453f, 0.165f, 0.683f, 0.165f)
                curveToRelative(0.545f, 0.0f, 1.071f, -0.298f, 1.336f, -0.815f)
                close()
                moveTo(20.485f, 3.515f)
                curveTo(15.807f, -1.165f, 8.193f, -1.165f, 3.515f, 3.515f)
                curveTo(-1.164f, 8.193f, -1.164f, 15.807f, 3.515f, 20.485f)
                curveToRelative(0.332f, 0.332f, 0.687f, 0.647f, 1.056f, 0.938f)
                curveToRelative(0.275f, 0.218f, 0.603f, 0.323f, 0.929f, 0.323f)
                curveToRelative(0.443f, 0.0f, 0.882f, -0.195f, 1.178f, -0.57f)
                curveToRelative(0.513f, -0.65f, 0.402f, -1.594f, -0.248f, -2.106f)
                curveToRelative(-0.278f, -0.22f, -0.545f, -0.457f, -0.794f, -0.706f)
                curveToRelative(-3.509f, -3.51f, -3.509f, -9.219f, 0.0f, -12.729f)
                reflectiveCurveToRelative(9.219f, -3.508f, 12.729f, 0.0f)
                curveToRelative(3.509f, 3.51f, 3.509f, 9.219f, 0.001f, 12.727f)
                curveToRelative(-0.253f, 0.253f, -0.521f, 0.491f, -0.796f, 0.708f)
                curveToRelative(-0.649f, 0.514f, -0.76f, 1.457f, -0.246f, 2.107f)
                curveToRelative(0.514f, 0.648f, 1.458f, 0.76f, 2.107f, 0.246f)
                curveToRelative(0.364f, -0.288f, 0.718f, -0.604f, 1.054f, -0.938f)
                curveToRelative(4.679f, -4.679f, 4.679f, -12.292f, 0.0f, -16.971f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
