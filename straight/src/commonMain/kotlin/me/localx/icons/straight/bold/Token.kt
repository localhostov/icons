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
                moveToRelative(12.0f, 0.0f)
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
                moveTo(12.0f, 5.0f)
                curveToRelative(-3.862f, 0.0f, -7.0f, 3.138f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.138f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.138f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.138f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(16.48f, 11.188f)
                lineToRelative(-2.467f, 1.428f)
                lineToRelative(0.994f, 3.013f)
                lineToRelative(-0.561f, 0.389f)
                lineToRelative(-2.437f, -1.884f)
                lineToRelative(-2.445f, 1.892f)
                horizontalLineToRelative(-0.015f)
                lineToRelative(-0.538f, -0.404f)
                lineToRelative(0.972f, -3.051f)
                lineToRelative(-2.482f, -1.383f)
                verticalLineToRelative(-0.688f)
                horizontalLineToRelative(3.252f)
                lineToRelative(0.882f, -3.365f)
                horizontalLineToRelative(0.725f)
                lineToRelative(0.882f, 3.365f)
                horizontalLineToRelative(3.237f)
                verticalLineToRelative(0.688f)
                close()
            }
        }
        .build()
        return _token!!
    }

private var _token: ImageVector? = null
