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

public val Icons.Bold.GovernmentFlag: ImageVector
    get() {
        if (_governmentFlag != null) {
            return _governmentFlag!!
        }
        _governmentFlag = Builder(name = "GovernmentFlag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 21.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-6.046f)
                curveToRelative(1.136f, -0.215f, 2.0f, -1.213f, 2.0f, -2.411f)
                curveToRelative(0.0f, -0.899f, -0.49f, -1.727f, -1.281f, -2.157f)
                lineToRelative(-8.173f, -4.458f)
                curveToRelative(-0.015f, -0.008f, -0.031f, -0.01f, -0.046f, -0.018f)
                verticalLineToRelative(-1.41f)
                lineToRelative(2.103f, -1.489f)
                curveToRelative(0.543f, -0.362f, 0.531f, -1.163f, -0.022f, -1.509f)
                lineTo(12.878f, 0.236f)
                curveToRelative(-0.247f, -0.154f, -0.532f, -0.236f, -0.824f, -0.236f)
                curveToRelative(-0.858f, 0.0f, -1.554f, 0.696f, -1.554f, 1.554f)
                verticalLineToRelative(4.356f)
                curveToRelative(-0.015f, 0.008f, -0.031f, 0.01f, -0.045f, 0.018f)
                lineTo(2.281f, 10.386f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.79f, 0.431f, -1.28f, 1.258f, -1.28f, 2.157f)
                curveToRelative(0.0f, 1.198f, 0.863f, 2.196f, 2.0f, 2.411f)
                verticalLineToRelative(6.046f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(11.891f, 8.561f)
                curveToRelative(0.068f, -0.037f, 0.149f, -0.037f, 0.218f, 0.0f)
                lineToRelative(6.305f, 3.439f)
                lineTo(5.585f, 12.0f)
                lineToRelative(6.306f, -3.439f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _governmentFlag!!
    }

private var _governmentFlag: ImageVector? = null
