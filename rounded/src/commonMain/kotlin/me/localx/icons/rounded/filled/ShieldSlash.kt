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

public val Icons.Filled.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-3.818f, -3.818f)
                curveToRelative(1.401f, -1.923f, 2.111f, -4.083f, 2.111f, -6.432f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.159f, -1.377f, -4.066f, -3.426f, -4.746f)
                lineTo(12.315f, 0.051f)
                curveToRelative(-0.205f, -0.068f, -0.425f, -0.068f, -0.63f, 0.0f)
                lineToRelative(-6.259f, 2.075f)
                curveToRelative(-0.446f, 0.148f, -0.871f, 0.361f, -1.259f, 0.627f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(3.707f, 7.921f)
                curveToRelative(-0.287f, -0.287f, -0.717f, -0.374f, -1.09f, -0.217f)
                curveToRelative(-0.374f, 0.154f, -0.617f, 0.52f, -0.617f, 0.924f)
                verticalLineToRelative(3.415f)
                curveToRelative(0.0f, 6.562f, 7.005f, 10.576f, 9.153f, 11.65f)
                curveToRelative(0.0f, 0.0f, 0.506f, 0.307f, 0.85f, 0.307f)
                reflectiveCurveToRelative(0.79f, -0.24f, 0.79f, -0.24f)
                curveToRelative(0.643f, -0.258f, 1.927f, -0.828f, 3.312f, -1.747f)
                curveToRelative(0.25f, -0.166f, 0.413f, -0.435f, 0.442f, -0.733f)
                reflectiveCurveToRelative(-0.076f, -0.595f, -0.288f, -0.807f)
                lineTo(3.707f, 7.921f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
