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

public val Icons.Bold.GrillHotAlt: ImageVector
    get() {
        if (_grillHotAlt != null) {
            return _grillHotAlt!!
        }
        _grillHotAlt = Builder(name = "GrillHotAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 0.0f)
                close()
                moveTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 0.0f)
                close()
                moveTo(18.311f, 17.268f)
                lineToRelative(3.366f, 6.732f)
                horizontalLineToRelative(-3.354f)
                lineToRelative(-0.5f, -1.0f)
                horizontalLineToRelative(-8.099f)
                curveToRelative(0.168f, -0.471f, 0.276f, -0.971f, 0.276f, -1.5f)
                reflectiveCurveToRelative(-0.108f, -1.029f, -0.276f, -1.5f)
                horizontalLineToRelative(6.599f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineToRelative(-6.646f)
                lineToRelative(-1.074f, 2.148f)
                curveToRelative(0.251f, 0.39f, 0.397f, 0.854f, 0.397f, 1.352f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.126f, 0.745f, -2.078f, 1.769f, -2.391f)
                lineToRelative(0.92f, -1.84f)
                curveTo(2.196f, 15.188f, 0.0f, 11.477f, 0.0f, 7.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 3.977f, -2.196f, 7.688f, -5.689f, 9.768f)
                close()
                moveTo(20.861f, 9.0f)
                lineTo(3.139f, 9.0f)
                curveToRelative(0.478f, 2.551f, 2.163f, 4.756f, 4.648f, 6.0f)
                horizontalLineToRelative(8.426f)
                curveToRelative(2.485f, -1.244f, 4.171f, -3.449f, 4.648f, -6.0f)
                close()
            }
        }
        .build()
        return _grillHotAlt!!
    }

private var _grillHotAlt: ImageVector? = null
