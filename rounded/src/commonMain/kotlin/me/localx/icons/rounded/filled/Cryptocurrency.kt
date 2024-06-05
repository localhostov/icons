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

public val Icons.Filled.Cryptocurrency: ImageVector
    get() {
        if (_cryptocurrency != null) {
            return _cryptocurrency!!
        }
        _cryptocurrency = Builder(name = "Cryptocurrency", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(9.171f, 14.829f)
                curveToRelative(1.56f, 1.56f, 4.098f, 1.56f, 5.657f, 0.0f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.914f, 0.915f, -2.055f, 1.46f, -3.243f, 1.659f)
                verticalLineToRelative(1.098f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.098f)
                curveToRelative(-1.188f, -0.199f, -2.328f, -0.744f, -3.243f, -1.659f)
                curveToRelative(-2.339f, -2.339f, -2.339f, -6.146f, 0.0f, -8.485f)
                curveToRelative(0.914f, -0.915f, 2.055f, -1.46f, 3.243f, -1.659f)
                verticalLineToRelative(-1.098f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.098f)
                curveToRelative(1.188f, 0.199f, 2.328f, 0.744f, 3.243f, 1.659f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(-1.023f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-1.56f, -1.56f, -4.098f, -1.56f, -5.657f, 0.0f)
                curveToRelative(-0.755f, 0.755f, -1.171f, 1.76f, -1.171f, 2.829f)
                reflectiveCurveToRelative(0.416f, 2.073f, 1.171f, 2.829f)
                close()
            }
        }
        .build()
        return _cryptocurrency!!
    }

private var _cryptocurrency: ImageVector? = null
