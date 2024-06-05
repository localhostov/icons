package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Meat: ImageVector
    get() {
        if (_meat != null) {
            return _meat!!
        }
        _meat = Builder(name = "Meat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.03f, 2.98f)
                curveTo(17.831f, -0.219f, 13.556f, -0.959f, 11.3f, 1.298f)
                curveToRelative(-4.659f, 4.659f, -5.273f, 12.306f, -5.297f, 12.629f)
                lineToRelative(-0.034f, 0.456f)
                lineToRelative(1.117f, 1.117f)
                lineToRelative(-4.279f, 4.278f)
                curveToRelative(-0.256f, -0.462f, -0.742f, -0.778f, -1.307f, -0.778f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.237f, 0.0f, 0.459f, -0.06f, 0.658f, -0.158f)
                curveToRelative(-0.098f, 0.199f, -0.158f, 0.421f, -0.158f, 0.658f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.565f, -0.317f, -1.052f, -0.779f, -1.308f)
                lineToRelative(4.279f, -4.278f)
                lineToRelative(1.116f, 1.116f)
                lineToRelative(0.456f, -0.033f)
                curveToRelative(0.324f, -0.023f, 7.981f, -0.627f, 12.64f, -5.287f)
                curveToRelative(2.256f, -2.256f, 1.518f, -6.53f, -1.682f, -9.73f)
                close()
                moveTo(10.37f, 15.956f)
                lineToRelative(-2.326f, -2.326f)
                curveToRelative(0.139f, -1.146f, 0.642f, -4.324f, 2.156f, -7.341f)
                curveToRelative(0.387f, 1.608f, 1.327f, 3.284f, 2.782f, 4.739f)
                reflectiveCurveToRelative(3.122f, 2.394f, 4.725f, 2.784f)
                curveToRelative(-3.014f, 1.504f, -6.192f, 2.005f, -7.337f, 2.144f)
                close()
                moveTo(21.298f, 11.296f)
                curveToRelative(-1.414f, 1.415f, -4.575f, 0.644f, -6.902f, -1.683f)
                curveToRelative(-1.198f, -1.198f, -2.011f, -2.618f, -2.29f, -3.998f)
                curveToRelative(-0.25f, -1.231f, -0.033f, -2.263f, 0.608f, -2.904f)
                curveToRelative(0.481f, -0.481f, 1.165f, -0.709f, 1.949f, -0.709f)
                curveToRelative(1.52f, 0.0f, 3.418f, 0.858f, 4.953f, 2.392f)
                curveToRelative(2.326f, 2.327f, 3.097f, 5.487f, 1.682f, 6.902f)
                close()
                moveTo(17.731f, 6.279f)
                curveToRelative(0.725f, 0.725f, 0.988f, 1.637f, 0.587f, 2.038f)
                reflectiveCurveToRelative(-1.313f, 0.138f, -2.038f, -0.587f)
                reflectiveCurveToRelative(-0.988f, -1.637f, -0.587f, -2.038f)
                reflectiveCurveToRelative(1.313f, -0.138f, 2.038f, 0.587f)
                close()
            }
        }
        .build()
        return _meat!!
    }

private var _meat: ImageVector? = null
