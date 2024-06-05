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

public val Icons.Outline.Igloo: ImageVector
    get() {
        if (_igloo != null) {
            return _igloo!!
        }
        _igloo = Builder(name = "Igloo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-7.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.54f)
                curveToRelative(0.299f, 0.947f, 0.46f, 1.955f, 0.46f, 3.0f)
                close()
                moveTo(20.658f, 7.0f)
                horizontalLineToRelative(-7.658f)
                lineTo(13.0f, 2.05f)
                curveToRelative(3.272f, 0.326f, 6.084f, 2.236f, 7.658f, 4.95f)
                close()
                moveTo(11.0f, 2.05f)
                lineTo(11.0f, 7.0f)
                lineTo(3.342f, 7.0f)
                curveToRelative(1.573f, -2.714f, 4.386f, -4.624f, 7.658f, -4.95f)
                close()
                moveTo(2.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.045f, 0.161f, -2.053f, 0.46f, -3.0f)
                horizontalLineToRelative(3.54f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 15.0f)
                close()
                moveTo(7.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.634f, 0.0f, -3.087f, 0.788f, -4.0f, 2.003f)
                verticalLineToRelative(-5.003f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.003f)
                curveToRelative(-0.913f, -1.216f, -2.366f, -2.003f, -4.0f, -2.003f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _igloo!!
    }

private var _igloo: ImageVector? = null
