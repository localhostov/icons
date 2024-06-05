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

public val Icons.Filled.MapMarkerQuestion: ImageVector
    get() {
        if (_mapMarkerQuestion != null) {
            return _mapMarkerQuestion!!
        }
        _mapMarkerQuestion = Builder(name = "MapMarkerQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 2.936f)
                curveTo(17.182f, 1.047f, 14.671f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveTo(6.818f, 1.046f, 4.929f, 2.936f)
                curveToRelative(-1.889f, 1.889f, -2.929f, 4.4f, -2.929f, 7.071f)
                reflectiveCurveToRelative(1.04f, 5.183f, 2.937f, 7.079f)
                lineToRelative(7.063f, 6.908f)
                lineToRelative(7.071f, -6.916f)
                curveToRelative(1.889f, -1.889f, 2.929f, -4.4f, 2.929f, -7.071f)
                reflectiveCurveToRelative(-1.04f, -5.182f, -2.929f, -7.071f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.929f, 11.505f)
                curveToRelative(-0.469f, 0.258f, -0.929f, 1.126f, -0.929f, 1.752f)
                verticalLineToRelative(0.743f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.743f)
                curveToRelative(0.0f, -1.19f, 0.734f, -2.827f, 1.963f, -3.504f)
                curveToRelative(0.762f, -0.42f, 1.157f, -1.254f, 1.004f, -2.125f)
                curveToRelative(-0.138f, -0.787f, -0.81f, -1.458f, -1.597f, -1.596f)
                curveToRelative(-0.605f, -0.107f, -1.195f, 0.047f, -1.655f, 0.435f)
                curveToRelative(-0.455f, 0.381f, -0.715f, 0.94f, -0.715f, 1.533f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.302f, 1.429f, -3.064f)
                curveToRelative(0.908f, -0.762f, 2.106f, -1.077f, 3.287f, -0.873f)
                curveToRelative(1.613f, 0.283f, 2.938f, 1.607f, 3.221f, 3.22f)
                curveToRelative(0.298f, 1.698f, -0.509f, 3.395f, -2.008f, 4.222f)
                close()
            }
        }
        .build()
        return _mapMarkerQuestion!!
    }

private var _mapMarkerQuestion: ImageVector? = null
