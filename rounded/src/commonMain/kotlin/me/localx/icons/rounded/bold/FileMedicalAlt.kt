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

public val Icons.Bold.FileMedicalAlt: ImageVector
    get() {
        if (_fileMedicalAlt != null) {
            return _fileMedicalAlt!!
        }
        _fileMedicalAlt = Builder(name = "FileMedicalAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 15.0f)
                lineTo(1.5f, 15.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.197f)
                lineToRelative(1.555f, -2.332f)
                curveToRelative(0.296f, -0.445f, 0.798f, -0.699f, 1.341f, -0.665f)
                curveToRelative(0.534f, 0.033f, 1.009f, 0.348f, 1.249f, 0.826f)
                lineToRelative(1.844f, 3.688f)
                lineToRelative(0.566f, -0.849f)
                curveToRelative(0.278f, -0.417f, 0.747f, -0.668f, 1.248f, -0.668f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.197f)
                lineToRelative(-1.555f, 2.332f)
                curveToRelative(-0.279f, 0.419f, -0.749f, 0.668f, -1.248f, 0.668f)
                curveToRelative(-0.579f, 0.0f, -1.103f, -0.351f, -1.342f, -0.829f)
                lineToRelative(-1.844f, -3.688f)
                lineToRelative(-0.566f, 0.849f)
                curveToRelative(-0.278f, 0.417f, -0.747f, 0.668f, -1.248f, 0.668f)
                close()
                moveTo(20.389f, 4.268f)
                lineToRelative(-2.657f, -2.657f)
                curveToRelative(-1.039f, -1.039f, -2.419f, -1.611f, -3.889f, -1.611f)
                horizontalLineToRelative(-6.343f)
                curveTo(4.467f, 0.0f, 2.0f, 2.467f, 2.0f, 5.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-10.343f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.85f, -1.611f, -3.889f)
                close()
            }
        }
        .build()
        return _fileMedicalAlt!!
    }

private var _fileMedicalAlt: ImageVector? = null
