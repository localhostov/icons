package me.localx.icons.rounded.filled

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

public val Icons.Filled.HeartHealthMuscle: ImageVector
    get() {
        if (_heartHealthMuscle != null) {
            return _heartHealthMuscle!!
        }
        _heartHealthMuscle = Builder(name = "HeartHealthMuscle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.0f)
                curveToRelative(0.0f, 1.595f, -1.87f, 3.718f, -3.052f, 4.666f)
                curveToRelative(-0.556f, 0.446f, -1.339f, 0.446f, -1.895f, 0.0f)
                curveToRelative(-1.183f, -0.948f, -3.052f, -3.071f, -3.052f, -4.666f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(24.009f, 13.021f)
                curveToRelative(0.0f, -1.543f, -1.166f, -2.853f, -2.703f, -2.986f)
                curveToRelative(-0.413f, -0.036f, -0.85f, -0.058f, -1.297f, -0.058f)
                curveToRelative(-1.265f, 0.0f, -2.441f, 0.701f, -3.324f, 1.425f)
                curveToRelative(0.847f, 0.576f, 1.378f, 1.122f, 1.426f, 1.171f)
                curveToRelative(0.385f, 0.396f, 0.377f, 1.028f, -0.02f, 1.414f)
                curveToRelative(-0.194f, 0.188f, -0.445f, 0.283f, -0.697f, 0.283f)
                curveToRelative(-0.26f, 0.0f, -0.52f, -0.101f, -0.716f, -0.302f)
                curveToRelative(-0.045f, -0.044f, -2.066f, -2.013f, -4.169f, -1.968f)
                curveToRelative(-3.326f, 0.074f, -5.656f, 2.617f, -6.181f, 3.252f)
                curveToRelative(1.338f, -3.526f, 0.31f, -8.546f, 0.861f, -10.103f)
                lineToRelative(2.147f, -0.649f)
                curveToRelative(0.374f, -0.02f, 0.669f, -0.327f, 0.673f, -0.702f)
                lineToRelative(0.019f, -0.534f)
                lineToRelative(1.419f, -0.516f)
                curveToRelative(0.454f, -0.181f, 0.688f, -0.703f, 0.492f, -1.15f)
                curveTo(11.574f, 0.764f, 10.553f, -0.024f, 9.009f, -0.024f)
                curveTo(7.509f, -0.024f, 6.295f, 1.048f, 6.295f, 1.048f)
                curveTo(0.421f, 5.566f, 0.004f, 13.645f, 0.0f, 17.246f)
                curveToRelative(-0.001f, 1.082f, 0.434f, 2.111f, 1.216f, 2.858f)
                curveToRelative(1.624f, 1.552f, 5.889f, 3.895f, 10.794f, 3.895f)
                curveToRelative(4.673f, 0.0f, 8.264f, -1.276f, 10.253f, -2.202f)
                curveToRelative(1.064f, -0.495f, 1.747f, -1.553f, 1.747f, -2.727f)
                verticalLineToRelative(-6.05f)
                close()
            }
        }
        .build()
        return _heartHealthMuscle!!
    }

private var _heartHealthMuscle: ImageVector? = null
