package me.localx.icons.rounded.bold

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

public val Icons.Bold.Token: ImageVector
    get() {
        if (_token != null) {
            return _token!!
        }
        _token = Builder(name = "Token", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                curveToRelative(-3.862f, 0.0f, -7.0f, 3.138f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.138f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.138f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.138f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(15.945f, 11.255f)
                lineToRelative(-1.656f, 1.351f)
                lineToRelative(0.687f, 2.083f)
                curveToRelative(0.092f, 0.282f, 0.0f, 0.595f, -0.237f, 0.771f)
                curveToRelative(-0.237f, 0.183f, -0.557f, 0.191f, -0.809f, 0.031f)
                lineToRelative(-1.923f, -1.251f)
                lineToRelative(-1.892f, 1.267f)
                curveToRelative(-0.114f, 0.076f, -0.252f, 0.114f, -0.389f, 0.114f)
                verticalLineToRelative(-0.008f)
                curveToRelative(-0.145f, 0.0f, -0.298f, -0.046f, -0.42f, -0.137f)
                curveToRelative(-0.237f, -0.175f, -0.336f, -0.488f, -0.244f, -0.771f)
                lineToRelative(0.656f, -2.106f)
                lineToRelative(-1.663f, -1.351f)
                curveToRelative(-0.221f, -0.191f, -0.305f, -0.496f, -0.206f, -0.771f)
                reflectiveCurveToRelative(0.366f, -0.458f, 0.656f, -0.458f)
                horizontalLineToRelative(2.098f)
                lineToRelative(0.74f, -1.992f)
                curveToRelative(0.099f, -0.275f, 0.366f, -0.458f, 0.656f, -0.458f)
                reflectiveCurveToRelative(0.557f, 0.183f, 0.656f, 0.458f)
                lineToRelative(0.74f, 1.992f)
                horizontalLineToRelative(2.098f)
                curveToRelative(0.29f, 0.0f, 0.557f, 0.183f, 0.656f, 0.458f)
                reflectiveCurveToRelative(0.015f, 0.588f, -0.206f, 0.778f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _token!!
    }

private var _token: ImageVector? = null
