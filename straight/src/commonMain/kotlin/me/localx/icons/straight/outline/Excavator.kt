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

public val Icons.Outline.Excavator: ImageVector
    get() {
        if (_excavator != null) {
            return _excavator!!
        }
        _excavator = Builder(name = "Excavator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.999f, 18.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.499f, 16.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.999f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.914f)
                lineToRelative(5.0f, -5.0f)
                verticalLineToRelative(-4.251f)
                lineToRelative(-6.001f, 5.601f)
                lineToRelative(-0.004f, 1.562f)
                curveToRelative(0.002f, 0.798f, -0.31f, 1.553f, -0.876f, 2.122f)
                curveToRelative(-0.161f, 0.161f, -0.341f, 0.296f, -0.529f, 0.415f)
                curveToRelative(0.869f, 0.9f, 1.41f, 2.119f, 1.41f, 3.466f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(2.242f, 23.0f, 0.0f, 20.757f, 0.0f, 18.0f)
                curveTo(0.0f, 16.655f, 0.539f, 15.437f, 1.406f, 14.538f)
                curveTo(0.559f, 14.007f, -0.011f, 13.072f, -0.011f, 12.0f)
                lineToRelative(0.015f, -2.998f)
                lineToRelative(5.004f, -0.01f)
                lineToRelative(-0.01f, -8.002f)
                horizontalLineToRelative(4.118f)
                curveToRelative(1.182f, 0.0f, 2.257f, 0.697f, 2.739f, 1.776f)
                lineToRelative(2.777f, 6.21f)
                lineToRelative(7.474f, -6.976f)
                horizontalLineToRelative(1.894f)
                close()
                moveTo(7.0f, 2.99f)
                lineToRelative(0.007f, 6.0f)
                horizontalLineToRelative(5.439f)
                lineToRelative(-2.418f, -5.408f)
                curveToRelative(-0.161f, -0.359f, -0.519f, -0.592f, -0.913f, -0.592f)
                horizontalLineToRelative(-2.115f)
                close()
                moveTo(1.989f, 12.005f)
                curveToRelative(0.0f, 0.546f, 0.449f, 0.995f, 1.0f, 0.995f)
                horizontalLineToRelative(10.005f)
                curveToRelative(0.268f, 0.0f, 0.519f, -0.104f, 0.708f, -0.293f)
                reflectiveCurveToRelative(0.293f, -0.441f, 0.292f, -0.709f)
                lineToRelative(0.002f, -1.002f)
                lineToRelative(-12.002f, 0.003f)
                lineToRelative(-0.005f, 1.007f)
                close()
                moveTo(13.999f, 18.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
                moveTo(21.999f, 11.914f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(0.086f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-2.086f)
                close()
            }
        }
        .build()
        return _excavator!!
    }

private var _excavator: ImageVector? = null
