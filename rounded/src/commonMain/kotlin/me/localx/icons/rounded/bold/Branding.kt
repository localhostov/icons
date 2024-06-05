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

public val Icons.Bold.Branding: ImageVector
    get() {
        if (_branding != null) {
            return _branding!!
        }
        _branding = Builder(name = "Branding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.93f)
                verticalLineToRelative(11.57f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(4.59f)
                curveToRelative(1.456f, 0.0f, 2.879f, 0.593f, 3.904f, 1.626f)
                lineToRelative(2.41f, 2.43f)
                curveToRelative(1.029f, 1.037f, 1.596f, 2.413f, 1.596f, 3.874f)
                close()
                moveTo(2.0f, 0.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(10.219f)
                curveToRelative(0.0f, 1.14f, 0.453f, 2.234f, 1.259f, 3.041f)
                lineToRelative(0.741f, 0.741f)
                lineToRelative(0.741f, -0.741f)
                curveToRelative(0.806f, -0.806f, 1.259f, -1.9f, 1.259f, -3.041f)
                lineTo(4.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.475f, 19.97f)
                curveToRelative(-0.683f, 0.683f, -1.578f, 1.023f, -2.475f, 1.023f)
                reflectiveCurveToRelative(-1.792f, -0.341f, -2.475f, -1.023f)
                curveToRelative(0.0f, 0.0f, -4.489f, -4.469f, -4.525f, -4.453f)
                verticalLineToRelative(5.484f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-5.484f)
                curveToRelative(-0.037f, -0.015f, -4.525f, 4.453f, -4.525f, 4.453f)
                close()
                moveTo(12.354f, 17.849f)
                lineToRelative(4.661f, -4.661f)
                curveToRelative(-0.318f, -0.115f, -0.656f, -0.188f, -1.014f, -0.188f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.358f, 0.0f, -0.696f, 0.073f, -1.014f, 0.188f)
                lineToRelative(4.661f, 4.661f)
                curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0.0f)
                close()
            }
        }
        .build()
        return _branding!!
    }

private var _branding: ImageVector? = null
