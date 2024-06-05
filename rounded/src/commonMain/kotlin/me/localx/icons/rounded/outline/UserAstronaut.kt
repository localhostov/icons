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

public val Icons.Outline.UserAstronaut: ImageVector
    get() {
        if (_userAstronaut != null) {
            return _userAstronaut!!
        }
        _userAstronaut = Builder(name = "UserAstronaut", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.125f, 11.0f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.375f)
                curveTo(19.054f, 2.53f, 15.817f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.946f, 2.53f, 3.875f, 6.0f)
                horizontalLineToRelative(-0.375f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.537f, 1.742f, 1.621f, 3.247f, 3.049f, 4.314f)
                curveToRelative(-2.85f, 0.887f, -4.925f, 3.549f, -4.925f, 6.686f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.137f, -2.075f, -5.799f, -4.925f, -6.686f)
                curveToRelative(1.429f, -1.067f, 2.512f, -2.572f, 3.049f, -4.314f)
                close()
                moveTo(5.5f, 8.5f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.916f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.916f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.916f, -6.5f, -6.5f)
                close()
                moveTo(18.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(7.0f, 8.0f)
                curveToRelative(0.0f, -0.343f, 0.357f, -1.0f, 1.101f, -1.0f)
                horizontalLineToRelative(7.899f)
                curveToRelative(0.716f, 0.0f, 1.0f, 0.657f, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _userAstronaut!!
    }

private var _userAstronaut: ImageVector? = null
