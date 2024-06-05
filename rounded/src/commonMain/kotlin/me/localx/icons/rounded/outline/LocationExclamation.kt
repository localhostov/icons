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

public val Icons.Outline.LocationExclamation: ImageVector
    get() {
        if (_locationExclamation != null) {
            return _locationExclamation!!
        }
        _locationExclamation = Builder(name = "LocationExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.777f, 3.222f)
                curveToRelative(-2.077f, -2.077f, -4.84f, -3.222f, -7.777f, -3.222f)
                reflectiveCurveToRelative(-5.7f, 1.145f, -7.778f, 3.222f)
                curveTo(-0.067f, 7.511f, -0.067f, 14.489f, 4.25f, 18.806f)
                lineToRelative(3.942f, 3.642f)
                curveToRelative(1.024f, 1.001f, 2.377f, 1.553f, 3.808f, 1.553f)
                reflectiveCurveToRelative(2.783f, -0.552f, 3.786f, -1.533f)
                lineToRelative(3.991f, -3.688f)
                curveToRelative(4.289f, -4.289f, 4.289f, -11.268f, 0.0f, -15.557f)
                close()
                moveTo(18.391f, 17.337f)
                lineToRelative(-3.983f, 3.681f)
                curveToRelative(-1.295f, 1.268f, -3.5f, 1.287f, -4.838f, -0.02f)
                lineToRelative(-3.935f, -3.634f)
                curveToRelative(-3.509f, -3.51f, -3.509f, -9.219f, 0.0f, -12.729f)
                curveToRelative(1.7f, -1.699f, 3.961f, -2.636f, 6.364f, -2.636f)
                reflectiveCurveToRelative(4.663f, 0.937f, 6.363f, 2.636f)
                curveToRelative(3.509f, 3.51f, 3.509f, 9.219f, 0.028f, 12.701f)
                close()
                moveTo(10.999f, 11.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(13.499f, 15.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _locationExclamation!!
    }

private var _locationExclamation: ImageVector? = null
