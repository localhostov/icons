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

public val Icons.Filled.FirstMedal: ImageVector
    get() {
        if (_firstMedal != null) {
            return _firstMedal!!
        }
        _firstMedal = Builder(name = "FirstMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, 4.037f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.038f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(13.0f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.713f)
                lineToRelative(-0.293f, 0.293f)
                curveToRelative(-0.39f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.242f, -1.242f)
                curveToRelative(0.415f, -0.414f, 1.033f, -0.536f, 1.574f, -0.312f)
                curveToRelative(0.542f, 0.225f, 0.891f, 0.748f, 0.891f, 1.334f)
                verticalLineToRelative(7.055f)
                close()
                moveTo(13.706f, 4.145f)
                lineToRelative(0.945f, -1.915f)
                curveToRelative(0.679f, -1.376f, 2.053f, -2.23f, 3.587f, -2.23f)
                horizontalLineToRelative(2.283f)
                curveToRelative(0.692f, 0.0f, 1.324f, 0.351f, 1.689f, 0.939f)
                curveToRelative(0.366f, 0.588f, 0.401f, 1.31f, 0.095f, 1.931f)
                lineToRelative(-2.281f, 4.622f)
                curveToRelative(-1.639f, -1.751f, -3.84f, -2.96f, -6.319f, -3.347f)
                close()
                moveTo(1.718f, 2.87f)
                curveToRelative(-0.306f, -0.621f, -0.271f, -1.343f, 0.095f, -1.932f)
                curveToRelative(0.365f, -0.588f, 0.997f, -0.938f, 1.689f, -0.938f)
                horizontalLineToRelative(2.26f)
                curveToRelative(1.534f, 0.0f, 2.909f, 0.854f, 3.587f, 2.23f)
                lineToRelative(0.945f, 1.915f)
                curveToRelative(-2.471f, 0.386f, -4.667f, 1.589f, -6.304f, 3.331f)
                lineTo(1.718f, 2.87f)
                close()
            }
        }
        .build()
        return _firstMedal!!
    }

private var _firstMedal: ImageVector? = null
