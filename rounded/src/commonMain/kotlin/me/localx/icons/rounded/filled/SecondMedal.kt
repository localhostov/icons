package me.localx.icons.rounded.filled

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

public val Icons.Filled.SecondMedal: ImageVector
    get() {
        if (_secondMedal != null) {
            return _secondMedal!!
        }
        _secondMedal = Builder(name = "SecondMedal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, 4.037f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.038f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(-0.726f, 0.0f, -1.362f, -0.437f, -1.622f, -1.111f)
                curveToRelative(-0.263f, -0.682f, -0.081f, -1.44f, 0.464f, -1.934f)
                curveToRelative(0.228f, -0.205f, 0.509f, -0.434f, 0.815f, -0.682f)
                curveToRelative(1.153f, -0.933f, 2.732f, -2.209f, 2.591f, -3.479f)
                curveToRelative(-0.05f, -0.444f, -0.483f, -0.794f, -0.988f, -0.794f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.532f, 0.0f, 2.812f, 1.105f, 2.977f, 2.572f)
                curveToRelative(0.262f, 2.359f, -1.895f, 4.103f, -3.321f, 5.257f)
                curveToRelative(-0.072f, 0.058f, -0.143f, 0.115f, -0.212f, 0.171f)
                horizontalLineToRelative(2.557f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(3.99f, 7.477f)
                lineTo(1.718f, 2.87f)
                curveToRelative(-0.306f, -0.621f, -0.271f, -1.343f, 0.095f, -1.932f)
                curveToRelative(0.365f, -0.588f, 0.997f, -0.938f, 1.689f, -0.938f)
                horizontalLineToRelative(2.26f)
                curveToRelative(1.534f, 0.0f, 2.909f, 0.854f, 3.587f, 2.23f)
                lineToRelative(0.945f, 1.915f)
                curveToRelative(-2.471f, 0.386f, -4.667f, 1.589f, -6.304f, 3.331f)
                close()
                moveTo(22.305f, 2.87f)
                lineToRelative(-2.281f, 4.622f)
                curveToRelative(-1.639f, -1.751f, -3.84f, -2.96f, -6.319f, -3.347f)
                lineToRelative(0.945f, -1.915f)
                curveToRelative(0.679f, -1.376f, 2.053f, -2.23f, 3.587f, -2.23f)
                horizontalLineToRelative(2.283f)
                curveToRelative(0.692f, 0.0f, 1.324f, 0.351f, 1.689f, 0.939f)
                curveToRelative(0.366f, 0.588f, 0.401f, 1.31f, 0.095f, 1.931f)
                close()
            }
        }
        .build()
        return _secondMedal!!
    }

private var _secondMedal: ImageVector? = null
