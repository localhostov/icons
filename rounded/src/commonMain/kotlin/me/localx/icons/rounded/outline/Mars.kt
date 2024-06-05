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
                moveTo(448.249f, 0.0f)
                horizontalLineTo(341.999f)
                curveToRelative(-11.736f, 0.0f, -21.25f, 9.53f, -21.25f, 21.285f)
                reflectiveCurveToRelative(9.514f, 21.285f, 21.25f, 21.285f)
                horizontalLineToRelative(97.453f)
                lineTo(294.271f, 187.991f)
                curveToRelative(-78.572f, -62.08f, -192.511f, -48.605f, -254.488f, 30.097f)
                reflectiveCurveTo(-8.742f, 410.916f, 69.83f, 472.996f)
                reflectiveCurveToRelative(192.511f, 48.605f, 254.488f, -30.097f)
                curveToRelative(51.91f, -65.917f, 51.91f, -158.893f, 0.0f, -224.81f)
                lineTo(469.5f, 72.668f)
                verticalLineToRelative(97.614f)
                curveToRelative(0.0f, 11.756f, 9.514f, 21.285f, 21.25f, 21.285f)
                reflectiveCurveToRelative(21.25f, -9.53f, 21.25f, -21.285f)
                verticalLineTo(63.856f)
                curveTo(512.0f, 28.589f, 483.458f, 0.0f, 448.249f, 0.0f)
                close()
                moveTo(182.622f, 468.275f)
                curveToRelative(-76.285f, 0.0f, -138.126f, -61.943f, -138.126f, -138.354f)
                reflectiveCurveToRelative(61.841f, -138.354f, 138.126f, -138.354f)
                reflectiveCurveToRelative(138.126f, 61.943f, 138.126f, 138.354f)
                curveTo(320.655f, 406.293f, 258.868f, 468.181f, 182.622f, 468.275f)
                close()
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
