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

public val Icons.Outline.FaceSmileHalo: ImageVector
    get() {
        if (_faceSmileHalo != null) {
            return _faceSmileHalo!!
        }
        _faceSmileHalo = Builder(name = "FaceSmileHalo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -2.026f, 0.509f, -3.935f, 1.4f, -5.61f)
                curveToRelative(0.539f, 0.275f, 1.164f, 0.516f, 1.887f, 0.72f)
                curveToRelative(-0.816f, 1.448f, -1.287f, 3.114f, -1.287f, 4.891f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.777f, -0.471f, -3.443f, -1.287f, -4.891f)
                curveToRelative(0.723f, -0.204f, 1.348f, -0.445f, 1.887f, -0.72f)
                curveToRelative(0.891f, 1.676f, 1.4f, 3.584f, 1.4f, 5.61f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(0.32f, 0.0f, 1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveToRelative(-3.0f, 2.108f, -3.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(-1.768f, 0.0f, -3.0f, 2.108f, -3.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                close()
                moveTo(17.666f, 16.746f)
                lineToRelative(-1.33f, -1.493f)
                curveToRelative(-0.02f, 0.018f, -2.005f, 1.748f, -4.336f, 1.748f)
                reflectiveCurveToRelative(-4.316f, -1.73f, -4.336f, -1.748f)
                lineToRelative(-1.33f, 1.493f)
                curveToRelative(0.103f, 0.092f, 2.559f, 2.254f, 5.666f, 2.254f)
                reflectiveCurveToRelative(5.563f, -2.162f, 5.666f, -2.254f)
                close()
                moveTo(1.0f, 3.0f)
                curveTo(1.0f, 0.216f, 9.42f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(11.0f, 0.216f, 11.0f, 3.0f)
                reflectiveCurveToRelative(-8.42f, 3.0f, -11.0f, 3.0f)
                reflectiveCurveTo(1.0f, 5.784f, 1.0f, 3.0f)
                close()
                moveTo(3.502f, 3.0f)
                curveToRelative(1.222f, 0.449f, 4.139f, 1.0f, 8.498f, 1.0f)
                reflectiveCurveToRelative(7.276f, -0.551f, 8.498f, -1.0f)
                curveToRelative(-1.222f, -0.449f, -4.139f, -1.0f, -8.498f, -1.0f)
                reflectiveCurveToRelative(-7.276f, 0.551f, -8.498f, 1.0f)
                close()
            }
        }
        .build()
        return _faceSmileHalo!!
    }

private var _faceSmileHalo: ImageVector? = null
