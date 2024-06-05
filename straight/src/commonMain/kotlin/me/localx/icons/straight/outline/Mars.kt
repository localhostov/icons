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

public val Icons.Outline.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.272f, 0.0f)
                horizontalLineTo(341.561f)
                verticalLineToRelative(42.57f)
                horizontalLineToRelative(97.614f)
                lineTo(293.754f, 187.991f)
                curveToRelative(-78.702f, -62.08f, -192.828f, -48.605f, -254.908f, 30.097f)
                reflectiveCurveTo(-9.758f, 410.916f, 68.944f, 472.996f)
                reflectiveCurveToRelative(192.828f, 48.605f, 254.908f, -30.097f)
                curveToRelative(51.995f, -65.917f, 51.995f, -158.893f, 0.0f, -224.81f)
                lineTo(469.272f, 72.668f)
                verticalLineToRelative(97.614f)
                horizontalLineToRelative(42.57f)
                verticalLineTo(42.57f)
                curveTo(511.842f, 19.059f, 492.783f, 0.0f, 469.272f, 0.0f)
                close()
                moveTo(181.922f, 468.275f)
                curveToRelative(-76.411f, 0.0f, -138.354f, -61.943f, -138.354f, -138.354f)
                reflectiveCurveToRelative(61.943f, -138.354f, 138.354f, -138.354f)
                reflectiveCurveToRelative(138.354f, 61.943f, 138.354f, 138.354f)
                curveTo(320.182f, 406.293f, 258.294f, 468.181f, 181.922f, 468.275f)
                close()
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
