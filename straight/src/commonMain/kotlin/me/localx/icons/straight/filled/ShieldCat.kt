package me.localx.icons.straight.filled

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

public val Icons.Filled.ShieldCat: ImageVector
    get() {
        if (_shieldCat != null) {
            return _shieldCat!!
        }
        _shieldCat = Builder(name = "ShieldCat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.031f, 9.737f)
                lineToRelative(-0.496f, -0.298f)
                curveToRelative(-0.969f, -0.583f, -2.102f, -0.583f, -3.07f, 0.0f)
                lineToRelative(-0.496f, 0.298f)
                lineToRelative(-0.974f, -0.541f)
                curveToRelative(0.0f, 0.752f, 0.005f, 2.803f, 0.005f, 2.803f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, 0.0f, 0.006f, -2.061f, 0.004f, -2.803f)
                lineToRelative(-0.973f, 0.541f)
                close()
                moveTo(13.0f, 13.0f)
                lineToRelative(-1.0f, 0.5f)
                lineToRelative(-1.0f, -0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.945f, 2.597f)
                lineTo(12.0f, -0.038f)
                lineToRelative(-7.945f, 2.635f)
                curveToRelative(-1.229f, 0.407f, -2.055f, 1.549f, -2.055f, 2.842f)
                verticalLineToRelative(6.525f)
                curveToRelative(0.0f, 6.563f, 7.005f, 10.576f, 9.152f, 11.65f)
                lineToRelative(0.805f, 0.402f)
                lineToRelative(0.836f, -0.336f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.281f, 9.207f, -11.716f)
                verticalLineToRelative(-6.525f)
                curveToRelative(0.0f, -1.293f, -0.825f, -2.435f, -2.055f, -2.842f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, 0.0f, -0.008f, -2.026f, 0.0f, -4.503f)
                lineToRelative(0.006f, -1.693f)
                lineToRelative(2.958f, 1.643f)
                curveToRelative(1.293f, -0.587f, 2.779f, -0.587f, 4.072f, 0.0f)
                lineToRelative(2.959f, -1.643f)
                lineToRelative(0.005f, 1.693f)
                curveToRelative(0.008f, 2.467f, 0.0f, 4.503f, 0.0f, 4.503f)
                close()
            }
        }
        .build()
        return _shieldCat!!
    }

private var _shieldCat: ImageVector? = null
