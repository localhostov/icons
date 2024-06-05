package me.localx.icons.rounded.outline

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

public val Icons.Outline.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.067f, 15.411f)
                lineToRelative(2.075f, 1.477f)
                curveToRelative(1.062f, 0.755f, 2.317f, 1.14f, 3.572f, 1.14f)
                curveToRelative(0.893f, 0.0f, 1.787f, -0.195f, 2.612f, -0.59f)
                lineToRelative(12.953f, -5.698f)
                curveToRelative(1.486f, -0.71f, 2.133f, -2.504f, 1.441f, -4.0f)
                curveToRelative(-0.694f, -1.497f, -2.475f, -2.152f, -3.976f, -1.465f)
                lineToRelative(-3.143f, 1.402f)
                lineTo(9.982f, 3.591f)
                curveToRelative(-0.882f, -0.656f, -2.05f, -0.774f, -3.052f, -0.311f)
                lineToRelative(-0.781f, 0.366f)
                curveToRelative(-0.611f, 0.287f, -1.033f, 0.857f, -1.129f, 1.525f)
                curveToRelative(-0.096f, 0.669f, 0.148f, 1.335f, 0.654f, 1.783f)
                lineToRelative(4.204f, 3.72f)
                lineToRelative(-3.591f, 1.602f)
                lineToRelative(-3.057f, -1.122f)
                curveToRelative(-0.984f, -0.359f, -2.084f, -0.041f, -2.735f, 0.791f)
                curveToRelative(-0.392f, 0.501f, -0.556f, 1.132f, -0.462f, 1.776f)
                curveToRelative(0.099f, 0.677f, 0.475f, 1.292f, 1.033f, 1.688f)
                close()
                moveTo(7.0f, 5.457f)
                lineToRelative(0.776f, -0.364f)
                curveToRelative(0.332f, -0.154f, 0.721f, -0.113f, 1.085f, 0.151f)
                lineToRelative(5.531f, 3.418f)
                lineToRelative(-2.506f, 1.118f)
                lineTo(7.0f, 5.457f)
                close()
                moveTo(2.071f, 13.179f)
                curveToRelative(0.098f, -0.125f, 0.224f, -0.169f, 0.334f, -0.169f)
                curveToRelative(0.05f, 0.0f, 3.574f, 1.285f, 3.574f, 1.285f)
                curveToRelative(0.245f, 0.09f, 0.515f, 0.081f, 0.752f, -0.025f)
                lineToRelative(13.833f, -6.171f)
                lineToRelative(0.013f, -0.006f)
                curveToRelative(0.501f, -0.231f, 1.096f, -0.012f, 1.328f, 0.487f)
                curveToRelative(0.234f, 0.507f, 0.016f, 1.114f, -0.46f, 1.342f)
                lineToRelative(-12.953f, 5.698f)
                curveToRelative(-1.357f, 0.647f, -2.964f, 0.51f, -4.191f, -0.362f)
                lineToRelative(-2.075f, -1.476f)
                curveToRelative(-0.114f, -0.081f, -0.193f, -0.211f, -0.213f, -0.348f)
                curveToRelative(-0.015f, -0.102f, 0.005f, -0.188f, 0.058f, -0.256f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                lineTo(23.0f, 22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
