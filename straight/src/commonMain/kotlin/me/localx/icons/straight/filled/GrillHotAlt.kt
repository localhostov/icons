package me.localx.icons.straight.filled

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

public val Icons.Filled.GrillHotAlt: ImageVector
    get() {
        if (_grillHotAlt != null) {
            return _grillHotAlt!!
        }
        _grillHotAlt = Builder(name = "GrillHotAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 0.0f)
                close()
                moveTo(9.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 0.0f)
                close()
                moveTo(17.852f, 17.467f)
                lineToRelative(3.267f, 6.534f)
                horizontalLineToRelative(-2.236f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineToRelative(-7.932f)
                curveToRelative(0.019f, -0.166f, 0.05f, -0.329f, 0.05f, -0.5f)
                curveToRelative(0.0f, -0.529f, -0.108f, -1.029f, -0.276f, -1.5f)
                horizontalLineToRelative(7.157f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineToRelative(-7.764f)
                lineToRelative(-0.861f, 1.722f)
                curveToRelative(0.459f, 0.453f, 0.743f, 1.082f, 0.743f, 1.778f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.341f, 1.055f, -2.435f, 2.38f, -2.497f)
                lineToRelative(0.768f, -1.537f)
                curveTo(2.384f, 15.358f, 0.0f, 11.35f, 0.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 4.351f, -2.384f, 8.359f, -6.148f, 10.467f)
                close()
            }
        }
        .build()
        return _grillHotAlt!!
    }

private var _grillHotAlt: ImageVector? = null
