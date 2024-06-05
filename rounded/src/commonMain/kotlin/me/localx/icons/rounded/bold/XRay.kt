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

public val Icons.Bold.XRay: ImageVector
    get() {
        if (_xRay != null) {
            return _xRay!!
        }
        _xRay = Builder(name = "XRay", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 0.0f)
                curveTo(0.672f, 0.0f, 0.0f, 0.672f, 0.0f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(18.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(17.387f, 17.547f)
                lineToRelative(-0.72f, 0.72f)
                curveToRelative(-0.469f, 0.469f, -1.105f, 0.732f, -1.768f, 0.732f)
                horizontalLineToRelative(-5.774f)
                curveToRelative(-0.663f, 0.0f, -1.299f, -0.263f, -1.768f, -0.732f)
                lineToRelative(-0.75f, -0.75f)
                curveToRelative(-1.293f, -1.293f, -0.387f, -3.503f, 1.44f, -3.518f)
                horizontalLineToRelative(0.041f)
                reflectiveCurveToRelative(2.411f, 0.0f, 2.411f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.435f)
                curveToRelative(1.843f, 0.015f, 2.756f, 2.244f, 1.453f, 3.547f)
                close()
            }
        }
        .build()
        return _xRay!!
    }

private var _xRay: ImageVector? = null
