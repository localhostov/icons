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

public val Icons.Outline.LightCeiling: ImageVector
    get() {
        if (_lightCeiling != null) {
            return _lightCeiling!!
        }
        _lightCeiling = Builder(name = "LightCeiling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.0f)
                curveToRelative(0.0f, -6.279f, -4.85f, -11.438f, -11.0f, -11.949f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.051f)
                curveTo(4.85f, 6.562f, 0.0f, 11.721f, 0.0f, 18.0f)
                verticalLineToRelative(2.024f)
                horizontalLineToRelative(8.002f)
                curveToRelative(0.013f, 2.194f, 1.8f, 3.976f, 3.998f, 3.976f)
                reflectiveCurveToRelative(3.984f, -1.782f, 3.998f, -3.976f)
                horizontalLineToRelative(8.002f)
                verticalLineToRelative(-2.024f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.094f, 0.0f, -1.984f, -0.884f, -1.998f, -1.976f)
                horizontalLineToRelative(3.995f)
                curveToRelative(-0.013f, 1.092f, -0.903f, 1.976f, -1.998f, 1.976f)
                close()
                moveTo(2.0f, 18.024f)
                verticalLineToRelative(-0.024f)
                curveToRelative(0.0f, -5.514f, 4.486f, -10.0f, 10.0f, -10.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                lineToRelative(-20.0f, 0.024f)
                close()
            }
        }
        .build()
        return _lightCeiling!!
    }

private var _lightCeiling: ImageVector? = null
