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
                moveToRelative(22.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -4.477f, -3.0f, -10.0f, -3.0f)
                reflectiveCurveTo(2.0f, 1.343f, 2.0f, 3.0f)
                verticalLineToRelative(16.95f)
                curveToRelative(0.0f, 2.989f, 5.387f, 4.05f, 10.0f, 4.05f)
                reflectiveCurveToRelative(10.0f, -1.061f, 10.0f, -4.05f)
                lineTo(22.0f, 3.0f)
                close()
                moveTo(19.0f, 14.697f)
                curveToRelative(-0.596f, 0.487f, -3.081f, 1.303f, -7.0f, 1.303f)
                reflectiveCurveToRelative(-6.405f, -0.817f, -7.0f, -1.304f)
                verticalLineToRelative(-4.7f)
                curveToRelative(1.956f, 0.708f, 4.581f, 1.004f, 7.0f, 1.004f)
                reflectiveCurveToRelative(5.044f, -0.296f, 7.0f, -1.004f)
                verticalLineToRelative(4.701f)
                close()
                moveTo(19.0f, 5.141f)
                verticalLineToRelative(1.556f)
                curveToRelative(-0.596f, 0.487f, -3.081f, 1.303f, -7.0f, 1.303f)
                reflectiveCurveToRelative(-6.405f, -0.817f, -7.0f, -1.304f)
                verticalLineToRelative(-1.556f)
                curveToRelative(1.804f, 0.531f, 4.273f, 0.859f, 7.0f, 0.859f)
                reflectiveCurveToRelative(5.196f, -0.328f, 7.0f, -0.859f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.905f, 0.0f, -6.393f, -0.812f, -7.0f, -1.299f)
                verticalLineToRelative(-1.705f)
                curveToRelative(1.956f, 0.708f, 4.581f, 1.004f, 7.0f, 1.004f)
                reflectiveCurveToRelative(5.044f, -0.296f, 7.0f, -1.004f)
                verticalLineToRelative(1.705f)
                curveToRelative(-0.607f, 0.487f, -3.095f, 1.299f, -7.0f, 1.299f)
                close()
            }
        }
        .build()
        return _canFood!!
    }

private var _canFood: ImageVector? = null
