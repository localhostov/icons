package me.localx.icons.straight.outline

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

public val Icons.Outline.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.769f, 14.813f)
                curveToRelative(2.0f, -0.903f, 3.231f, -2.251f, 3.231f, -3.813f)
                curveToRelative(0.0f, -2.38f, -2.851f, -4.266f, -6.942f, -4.825f)
                arcToRelative(3.132f, 3.132f, 0.0f, false, false, 0.942f, -2.175f)
                curveToRelative(0.0f, -2.243f, -2.636f, -4.0f, -6.0f, -4.0f)
                reflectiveCurveToRelative(-6.0f, 1.757f, -6.0f, 4.0f)
                arcToRelative(3.714f, 3.714f, 0.0f, false, false, 2.288f, 3.16f)
                curveToRelative(-2.034f, 0.903f, -3.288f, 2.263f, -3.288f, 3.84f)
                curveToRelative(0.0f, 1.47f, 1.092f, 2.751f, 2.888f, 3.649f)
                curveToRelative(-3.377f, 0.775f, -5.888f, 2.236f, -5.888f, 4.351f)
                curveToRelative(0.0f, 3.283f, 6.037f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(12.0f, -1.717f, 12.0f, -5.0f)
                curveToRelative(0.0f, -1.975f, -2.191f, -3.379f, -5.231f, -4.187f)
                close()
                moveTo(10.0f, 2.0f)
                curveToRelative(2.29f, 0.0f, 4.0f, 1.056f, 4.0f, 2.0f)
                reflectiveCurveToRelative(-1.71f, 2.0f, -4.0f, 2.0f)
                reflectiveCurveToRelative(-4.0f, -1.056f, -4.0f, -2.0f)
                reflectiveCurveToRelative(1.71f, -2.0f, 4.0f, -2.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveToRelative(0.0f, -1.253f, 2.853f, -3.0f, 7.5f, -3.0f)
                reflectiveCurveToRelative(7.5f, 1.747f, 7.5f, 3.0f)
                reflectiveCurveToRelative(-2.854f, 3.0f, -7.5f, 3.0f)
                reflectiveCurveToRelative(-7.5f, -1.747f, -7.5f, -3.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-6.012f, 0.0f, -10.0f, -1.806f, -10.0f, -3.0f)
                reflectiveCurveToRelative(3.988f, -3.0f, 10.0f, -3.0f)
                reflectiveCurveToRelative(10.0f, 1.806f, 10.0f, 3.0f)
                reflectiveCurveToRelative(-3.988f, 3.0f, -10.0f, 3.0f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
