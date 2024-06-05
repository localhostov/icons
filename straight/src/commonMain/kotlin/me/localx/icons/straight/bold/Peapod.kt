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

public val Icons.Bold.Peapod: ImageVector
    get() {
        if (_peapod != null) {
            return _peapod!!
        }
        _peapod = Builder(name = "Peapod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.999f, 1.457f)
                lineToRelative(-0.041f, -1.457f)
                horizontalLineToRelative(-1.458f)
                curveToRelative(-0.393f, 0.0f, -9.694f, 0.073f, -16.061f, 6.439f)
                reflectiveCurveTo(0.0f, 22.107f, 0.0f, 22.5f)
                verticalLineToRelative(1.458f)
                reflectiveCurveToRelative(1.556f, 0.044f, 1.666f, 0.044f)
                curveToRelative(1.451f, 0.0f, 9.734f, -0.281f, 15.895f, -6.441f)
                curveToRelative(6.631f, -6.631f, 6.45f, -15.72f, 6.438f, -16.104f)
                close()
                moveTo(15.439f, 15.439f)
                curveToRelative(-4.181f, 4.181f, -9.67f, 5.221f, -12.324f, 5.479f)
                curveToRelative(0.305f, -2.708f, 1.413f, -8.325f, 5.445f, -12.357f)
                curveToRelative(4.033f, -4.033f, 9.649f, -5.141f, 12.357f, -5.446f)
                curveToRelative(-0.258f, 2.656f, -1.298f, 8.144f, -5.479f, 12.325f)
                close()
                moveTo(9.5f, 12.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(7.5f, 14.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(14.5f, 7.5f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _peapod!!
    }

private var _peapod: ImageVector? = null
