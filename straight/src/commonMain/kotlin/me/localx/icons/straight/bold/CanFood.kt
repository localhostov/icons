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

public val Icons.Bold.CanFood: ImageVector
    get() {
        if (_canFood != null) {
            return _canFood!!
        }
        _canFood = Builder(name = "CanFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.477f, 0.0f, 2.0f, 1.343f, 2.0f, 3.0f)
                verticalLineToRelative(16.95f)
                curveToRelative(0.0f, 2.989f, 5.387f, 4.05f, 10.0f, 4.05f)
                reflectiveCurveToRelative(10.0f, -1.061f, 10.0f, -4.05f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -4.477f, -3.0f, -10.0f, -3.0f)
                close()
                moveTo(19.0f, 5.142f)
                verticalLineToRelative(1.559f)
                curveToRelative(-0.608f, 0.488f, -3.096f, 1.299f, -7.0f, 1.299f)
                reflectiveCurveToRelative(-6.394f, -0.811f, -7.0f, -1.299f)
                verticalLineToRelative(-1.559f)
                curveToRelative(1.804f, 0.531f, 4.274f, 0.858f, 7.0f, 0.858f)
                reflectiveCurveToRelative(5.196f, -0.327f, 7.0f, -0.858f)
                close()
                moveTo(19.0f, 14.701f)
                curveToRelative(-0.608f, 0.488f, -3.096f, 1.299f, -7.0f, 1.299f)
                reflectiveCurveToRelative(-6.394f, -0.811f, -7.0f, -1.299f)
                verticalLineToRelative(-4.699f)
                curveToRelative(1.956f, 0.707f, 4.584f, 0.998f, 7.0f, 0.998f)
                reflectiveCurveToRelative(5.044f, -0.291f, 7.0f, -0.998f)
                verticalLineToRelative(4.699f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.905f, 0.0f, -6.393f, -0.812f, -7.0f, -1.299f)
                verticalLineToRelative(-1.699f)
                curveToRelative(1.956f, 0.707f, 4.584f, 0.998f, 7.0f, 0.998f)
                reflectiveCurveToRelative(5.044f, -0.291f, 7.0f, -0.998f)
                verticalLineToRelative(1.699f)
                curveToRelative(-0.607f, 0.487f, -3.095f, 1.299f, -7.0f, 1.299f)
                close()
            }
        }
        .build()
        return _canFood!!
    }

private var _canFood: ImageVector? = null
