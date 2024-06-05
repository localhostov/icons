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

public val Icons.Outline.ShieldSecurityRisk: ImageVector
    get() {
        if (_shieldSecurityRisk != null) {
            return _shieldSecurityRisk!!
        }
        _shieldSecurityRisk = Builder(name = "ShieldSecurityRisk", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(16.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(18.5f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.395f, 23.447f)
                curveToRelative(-0.175f, 0.351f, -0.528f, 0.553f, -0.896f, 0.553f)
                curveToRelative(-0.15f, 0.0f, -0.303f, -0.034f, -0.446f, -0.105f)
                curveToRelative(-1.512f, -0.756f, -9.053f, -4.872f, -9.053f, -11.701f)
                verticalLineToRelative(-5.321f)
                curveTo(0.0f, 4.713f, 1.377f, 2.806f, 3.426f, 2.126f)
                lineTo(9.685f, 0.051f)
                curveToRelative(0.205f, -0.068f, 0.425f, -0.068f, 0.63f, 0.0f)
                lineToRelative(6.259f, 2.075f)
                curveToRelative(2.049f, 0.68f, 3.426f, 2.587f, 3.426f, 4.746f)
                verticalLineToRelative(0.128f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-0.128f)
                curveToRelative(0.0f, -1.295f, -0.826f, -2.439f, -2.056f, -2.848f)
                lineToRelative(-5.944f, -1.971f)
                lineToRelative(-5.944f, 1.971f)
                curveToRelative(-1.23f, 0.408f, -2.056f, 1.553f, -2.056f, 2.848f)
                verticalLineToRelative(5.321f)
                curveToRelative(0.0f, 5.652f, 6.62f, 9.249f, 7.947f, 9.912f)
                curveToRelative(0.494f, 0.247f, 0.694f, 0.848f, 0.447f, 1.342f)
                close()
            }
        }
        .build()
        return _shieldSecurityRisk!!
    }

private var _shieldSecurityRisk: ImageVector? = null
