package me.localx.icons.straight.bold

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

public val Icons.Bold.FaceSleepy: ImageVector
    get() {
        if (_faceSleepy != null) {
            return _faceSleepy!!
        }
        _faceSleepy = Builder(name = "FaceSleepy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 1.38f, -0.246f, 2.7f, -0.676f, 3.935f)
                curveToRelative(-0.735f, -0.766f, -1.645f, -1.365f, -2.583f, -1.827f)
                curveToRelative(0.164f, -0.678f, 0.26f, -1.381f, 0.26f, -2.108f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                curveToRelative(1.833f, 0.0f, 3.538f, -0.554f, 4.961f, -1.498f)
                curveToRelative(0.024f, 0.174f, 0.039f, 0.342f, 0.039f, 0.498f)
                curveToRelative(0.0f, 0.931f, 0.333f, 1.777f, 0.867f, 2.457f)
                curveToRelative(-1.737f, 0.978f, -3.736f, 1.543f, -5.867f, 1.543f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(1.117f, 0.0f, 2.103f, 0.702f, 2.104f, 0.703f)
                lineToRelative(1.791f, -2.406f)
                curveToRelative(-0.178f, -0.133f, -1.802f, -1.297f, -3.896f, -1.297f)
                reflectiveCurveToRelative(-3.718f, 1.164f, -3.896f, 1.297f)
                lineToRelative(1.783f, 2.413f)
                curveToRelative(0.01f, -0.007f, 0.995f, -0.709f, 2.112f, -0.709f)
                close()
                moveTo(17.0f, 15.0f)
                reflectiveCurveToRelative(2.0f, 1.5f, 2.0f, 5.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -4.0f, -6.0f, -5.0f, -6.0f, -5.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(-1.0f, 0.0f, -3.0f, -1.0f, -3.0f, -1.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                curveToRelative(0.0f, 0.0f, -2.0f, 1.0f, -3.0f, 1.0f)
                close()
                moveTo(19.0f, 9.0f)
                reflectiveCurveToRelative(-2.0f, 1.0f, -3.0f, 1.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.0f, -1.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                close()
            }
        }
        .build()
        return _faceSleepy!!
    }

private var _faceSleepy: ImageVector? = null
