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

public val Icons.Filled.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 5.0f)
                curveToRelative(1.817f, 0.0f, 3.526f, 0.708f, 4.812f, 1.993f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-0.907f, -0.908f, -2.114f, -1.407f, -3.397f, -1.407f)
                reflectiveCurveToRelative(-2.489f, 0.5f, -3.397f, 1.407f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(1.285f, -1.285f, 2.994f, -1.993f, 4.811f, -1.993f)
                close()
                moveTo(15.5f, 2.0f)
                curveToRelative(2.65f, 0.0f, 5.144f, 1.033f, 7.019f, 2.907f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(-2.253f, -2.252f, -5.248f, -3.493f, -8.433f, -3.493f)
                reflectiveCurveToRelative(-6.18f, 1.241f, -8.433f, 3.493f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(1.875f, -1.875f, 4.367f, -2.907f, 7.019f, -2.907f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(11.0f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
