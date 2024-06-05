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

public val Icons.Outline.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = Builder(name = "BowlChopsticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.002f, 6.007f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(19.001f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.002f, 7.007f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(4.001f, 4.007f)
                curveToRelative(0.018f, 0.0f, 0.036f, 0.0f, 0.054f, 0.0f)
                lineToRelative(18.937f, -1.0f)
                curveToRelative(0.552f, -0.029f, 0.975f, -0.5f, 0.946f, -1.052f)
                curveToRelative(-0.029f, -0.552f, -0.508f, -0.968f, -1.051f, -0.946f)
                lineTo(3.95f, 2.008f)
                curveToRelative(-0.552f, 0.029f, -0.975f, 0.5f, -0.946f, 1.052f)
                curveToRelative(0.028f, 0.533f, 0.47f, 0.947f, 0.998f, 0.947f)
                close()
                moveTo(23.196f, 11.598f)
                curveToRelative(0.768f, 1.024f, 1.002f, 2.319f, 0.642f, 3.552f)
                curveToRelative(-0.708f, 2.421f, -1.989f, 4.605f, -3.708f, 6.316f)
                curveToRelative(-1.617f, 1.61f, -3.901f, 2.534f, -6.268f, 2.534f)
                horizontalLineToRelative(-3.722f)
                curveToRelative(-2.366f, 0.0f, -4.65f, -0.924f, -6.268f, -2.533f)
                curveToRelative(-1.719f, -1.713f, -3.0f, -3.897f, -3.707f, -6.317f)
                curveToRelative(-0.36f, -1.232f, -0.126f, -2.527f, 0.642f, -3.552f)
                curveToRelative(0.762f, -1.016f, 1.927f, -1.598f, 3.196f, -1.598f)
                horizontalLineToRelative(15.995f)
                curveToRelative(1.27f, 0.0f, 2.435f, 0.582f, 3.196f, 1.598f)
                close()
                moveTo(21.596f, 12.798f)
                curveToRelative(-0.38f, -0.507f, -0.962f, -0.798f, -1.596f, -0.798f)
                lineTo(4.005f, 12.0f)
                curveToRelative(-0.634f, 0.0f, -1.216f, 0.291f, -1.596f, 0.798f)
                curveToRelative(-0.387f, 0.516f, -0.504f, 1.169f, -0.322f, 1.791f)
                curveToRelative(0.604f, 2.067f, 1.739f, 4.007f, 3.199f, 5.461f)
                curveToRelative(1.245f, 1.239f, 3.015f, 1.95f, 4.856f, 1.95f)
                horizontalLineToRelative(3.722f)
                curveToRelative(1.841f, 0.0f, 3.611f, -0.711f, 4.856f, -1.951f)
                curveToRelative(1.458f, -1.452f, 2.595f, -3.392f, 3.199f, -5.46f)
                curveToRelative(0.182f, -0.622f, 0.064f, -1.275f, -0.322f, -1.791f)
                close()
            }
        }
        .build()
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
