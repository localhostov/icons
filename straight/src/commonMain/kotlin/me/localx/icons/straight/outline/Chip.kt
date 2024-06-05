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

public val Icons.Outline.Chip: ImageVector
    get() {
        if (_chip != null) {
            return _chip!!
        }
        _chip = Builder(name = "Chip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(18.462f, 9.314f)
                lineToRelative(2.587f, -1.541f)
                curveToRelative(0.603f, 1.286f, 0.95f, 2.715f, 0.95f, 4.227f)
                reflectiveCurveToRelative(-0.347f, 2.941f, -0.95f, 4.227f)
                lineToRelative(-2.587f, -1.542f)
                curveToRelative(0.345f, -0.828f, 0.538f, -1.734f, 0.538f, -2.685f)
                reflectiveCurveToRelative(-0.192f, -1.858f, -0.538f, -2.686f)
                close()
                moveTo(20.023f, 6.056f)
                lineToRelative(-2.588f, 1.541f)
                curveToRelative(-1.085f, -1.337f, -2.653f, -2.261f, -4.435f, -2.518f)
                lineTo(13.0f, 2.051f)
                curveToRelative(2.875f, 0.287f, 5.386f, 1.802f, 7.023f, 4.006f)
                close()
                moveTo(11.0f, 2.051f)
                verticalLineToRelative(3.029f)
                curveToRelative(-1.782f, 0.257f, -3.35f, 1.181f, -4.435f, 2.518f)
                lineToRelative(-2.588f, -1.541f)
                curveToRelative(1.637f, -2.203f, 4.148f, -3.719f, 7.023f, -4.006f)
                close()
                moveTo(2.95f, 7.773f)
                lineToRelative(2.587f, 1.541f)
                curveToRelative(-0.345f, 0.828f, -0.538f, 1.734f, -0.538f, 2.686f)
                reflectiveCurveToRelative(0.192f, 1.858f, 0.538f, 2.685f)
                lineToRelative(-2.587f, 1.542f)
                curveToRelative(-0.603f, -1.286f, -0.95f, -2.715f, -0.95f, -4.227f)
                reflectiveCurveToRelative(0.347f, -2.941f, 0.95f, -4.227f)
                close()
                moveTo(3.977f, 17.943f)
                lineToRelative(2.588f, -1.542f)
                curveToRelative(1.085f, 1.337f, 2.653f, 2.261f, 4.435f, 2.518f)
                verticalLineToRelative(3.029f)
                curveToRelative(-2.875f, -0.287f, -5.386f, -1.802f, -7.023f, -4.006f)
                close()
                moveTo(13.0f, 21.949f)
                verticalLineToRelative(-3.029f)
                curveToRelative(1.782f, -0.257f, 3.35f, -1.181f, 4.435f, -2.518f)
                lineToRelative(2.588f, 1.542f)
                curveToRelative(-1.637f, 2.203f, -4.148f, 3.719f, -7.023f, 4.006f)
                close()
            }
        }
        .build()
        return _chip!!
    }

private var _chip: ImageVector? = null
