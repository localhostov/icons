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

public val Icons.Bold.FluxCapacitor: ImageVector
    get() {
        if (_fluxCapacitor != null) {
            return _fluxCapacitor!!
        }
        _fluxCapacitor = Builder(name = "FluxCapacitor", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 15.5f)
                curveToRelative(0.0f, 2.203f, -2.036f, 3.931f, -4.329f, 3.405f)
                curveToRelative(-1.268f, -0.291f, -2.294f, -1.325f, -2.58f, -2.594f)
                curveToRelative(-0.39f, -1.73f, 0.506f, -3.292f, 1.908f, -3.961f)
                verticalLineToRelative(2.15f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.15f)
                curveToRelative(1.179f, 0.563f, 2.0f, 1.756f, 2.0f, 3.15f)
                close()
                moveTo(7.904f, 10.31f)
                curveToRelative(-0.665f, -0.497f, -0.801f, -1.439f, -0.302f, -2.102f)
                curveToRelative(0.496f, -0.662f, 1.435f, -0.797f, 2.098f, -0.302f)
                lineToRelative(1.73f, 1.292f)
                curveToRelative(0.104f, -0.516f, 0.099f, -1.071f, -0.06f, -1.645f)
                curveToRelative(-0.356f, -1.283f, -1.464f, -2.288f, -2.777f, -2.503f)
                curveToRelative(-2.383f, -0.391f, -4.415f, 1.627f, -4.05f, 4.006f)
                curveToRelative(0.193f, 1.257f, 1.116f, 2.329f, 2.317f, 2.747f)
                curveToRelative(1.026f, 0.357f, 1.969f, 0.199f, 2.756f, -0.214f)
                lineToRelative(-1.712f, -1.278f)
                close()
                moveTo(15.518f, 5.032f)
                curveToRelative(-1.252f, 0.167f, -2.325f, 1.062f, -2.782f, 2.239f)
                curveToRelative(-0.268f, 0.689f, -0.282f, 1.335f, -0.169f, 1.929f)
                lineToRelative(1.609f, -1.238f)
                curveToRelative(0.662f, -0.51f, 1.613f, -0.38f, 2.115f, 0.289f)
                curveToRelative(0.493f, 0.657f, 0.366f, 1.588f, -0.285f, 2.089f)
                lineToRelative(-1.652f, 1.271f)
                curveToRelative(0.856f, 0.445f, 1.899f, 0.574f, 3.036f, 0.047f)
                curveToRelative(1.115f, -0.517f, 1.965f, -1.562f, 2.092f, -2.785f)
                curveToRelative(0.234f, -2.262f, -1.689f, -4.144f, -3.963f, -3.84f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
            }
        }
        .build()
        return _fluxCapacitor!!
    }

private var _fluxCapacitor: ImageVector? = null
