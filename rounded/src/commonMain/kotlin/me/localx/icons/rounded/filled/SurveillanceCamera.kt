package me.localx.icons.rounded.filled

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

public val Icons.Filled.SurveillanceCamera: ImageVector
    get() {
        if (_surveillanceCamera != null) {
            return _surveillanceCamera!!
        }
        _surveillanceCamera = Builder(name = "SurveillanceCamera", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineToRelative(-0.382f)
                lineToRelative(0.776f, -1.553f)
                curveToRelative(0.155f, -0.31f, 0.138f, -0.678f, -0.044f, -0.973f)
                reflectiveCurveToRelative(-0.504f, -0.475f, -0.851f, -0.475f)
                lineTo(5.5f, -0.001f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.557f)
                lineToRelative(-1.52f, 4.054f)
                curveToRelative(-0.439f, 1.171f, -1.558f, 1.946f, -2.808f, 1.946f)
                lineTo(2.0f, 15.999f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.728f)
                curveToRelative(2.084f, 0.0f, 3.95f, -1.293f, 4.682f, -3.244f)
                lineToRelative(1.784f, -4.756f)
                horizontalLineToRelative(5.807f)
                curveToRelative(1.302f, 0.0f, 2.402f, -0.839f, 2.816f, -2.0f)
                horizontalLineToRelative(1.184f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(23.819f, 18.89f)
                curveToRelative(0.241f, 0.379f, 0.241f, 0.841f, 0.0f, 1.22f)
                curveToRelative(-0.911f, 1.433f, -3.026f, 3.89f, -6.819f, 3.89f)
                reflectiveCurveToRelative(-5.91f, -2.459f, -6.82f, -3.89f)
                curveToRelative(-0.24f, -0.378f, -0.24f, -0.841f, 0.0f, -1.22f)
                curveToRelative(0.911f, -1.433f, 3.026f, -3.89f, 6.82f, -3.89f)
                reflectiveCurveToRelative(5.908f, 2.457f, 6.819f, 3.89f)
                close()
                moveTo(19.0f, 19.5f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _surveillanceCamera!!
    }

private var _surveillanceCamera: ImageVector? = null
