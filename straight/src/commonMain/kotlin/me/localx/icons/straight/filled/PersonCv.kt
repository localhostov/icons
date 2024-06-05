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

public val Icons.Filled.PersonCv: ImageVector
    get() {
        if (_personCv != null) {
            return _personCv!!
        }
        _personCv = Builder(name = "PersonCv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(0.0f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.485f, 0.0f, -4.5f, 2.015f, -4.5f, 4.5f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(16.0f, 16.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.496f, -0.404f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.404f, -0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, 0.404f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.404f, 0.9f, 0.9f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(22.25f, 14.256f)
                horizontalLineToRelative(-1.632f)
                lineToRelative(-1.182f, 5.864f)
                curveToRelative(-0.015f, 0.078f, -0.037f, 0.141f, -0.057f, 0.188f)
                curveToRelative(-0.019f, -0.041f, -0.038f, -0.094f, -0.05f, -0.159f)
                lineToRelative(-1.202f, -5.893f)
                horizontalLineToRelative(-1.633f)
                lineToRelative(1.268f, 6.213f)
                curveToRelative(0.108f, 0.561f, 0.592f, 1.531f, 1.618f, 1.531f)
                reflectiveCurveToRelative(1.503f, -0.928f, 1.628f, -1.575f)
                lineToRelative(1.244f, -6.169f)
                close()
            }
        }
        .build()
        return _personCv!!
    }

private var _personCv: ImageVector? = null
