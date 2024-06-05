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

public val Icons.Bold.Raygun: ImageVector
    get() {
        if (_raygun != null) {
            return _raygun!!
        }
        _raygun = Builder(name = "Raygun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                reflectiveCurveToRelative(-1.871f, 1.023f, -4.0f, 1.963f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 1.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.181f, 0.0f, -3.842f, 0.362f, -6.492f, 1.215f)
                curveTo(5.087f, 1.262f, 2.952f, 0.978f, 0.0f, 0.978f)
                curveToRelative(0.0f, 0.0f, 1.59f, 1.286f, 2.234f, 3.582f)
                curveToRelative(-1.339f, 1.041f, -2.234f, 2.342f, -2.234f, 3.94f)
                curveToRelative(0.0f, 1.687f, 0.996f, 3.042f, 2.46f, 4.111f)
                lineTo(0.0f, 20.938f)
                verticalLineToRelative(2.062f)
                horizontalLineToRelative(7.895f)
                lineToRelative(1.983f, -7.463f)
                curveToRelative(1.546f, 0.32f, 2.878f, 0.463f, 3.622f, 0.463f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.963f)
                curveToRelative(2.129f, 0.94f, 4.0f, 1.963f, 4.0f, 1.963f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(5.588f, 20.0f)
                horizontalLineToRelative(-2.183f)
                lineToRelative(1.744f, -5.904f)
                curveToRelative(0.596f, 0.254f, 1.211f, 0.48f, 1.827f, 0.679f)
                lineToRelative(-1.389f, 5.225f)
                close()
                moveTo(12.0f, 12.885f)
                curveToRelative(-3.59f, -0.486f, -9.0f, -2.442f, -9.0f, -4.385f)
                reflectiveCurveToRelative(5.41f, -3.898f, 9.0f, -4.385f)
                verticalLineToRelative(8.77f)
                close()
            }
        }
        .build()
        return _raygun!!
    }

private var _raygun: ImageVector? = null
