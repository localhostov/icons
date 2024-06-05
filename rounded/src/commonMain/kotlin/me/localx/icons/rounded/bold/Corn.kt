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

public val Icons.Bold.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = Builder(name = "Corn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.964f, 10.488f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, false, -2.373f, -0.316f)
                curveToRelative(-0.246f, 0.1f, -0.465f, 0.218f, -0.7f, 0.327f)
                curveTo(18.32f, 4.715f, 15.349f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(5.68f, 4.715f, 5.107f, 10.5f)
                curveToRelative(-0.232f, -0.108f, -0.452f, -0.229f, -0.7f, -0.326f)
                arcToRelative(2.458f, 2.458f, 0.0f, false, false, -2.374f, 0.316f)
                arcTo(2.54f, 2.54f, 0.0f, false, false, 1.0f, 12.737f)
                curveTo(1.778f, 22.9f, 8.952f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(10.222f, -1.1f, 11.0f, -11.263f)
                arcTo(2.543f, 2.543f, 0.0f, false, false, 21.964f, 10.488f)
                close()
                moveTo(4.074f, 13.305f)
                curveToRelative(3.518f, 1.757f, 5.2f, 5.3f, 5.935f, 7.5f)
                curveTo(7.329f, 20.256f, 4.694f, 18.371f, 4.074f, 13.305f)
                close()
                moveTo(8.005f, 12.349f)
                arcTo(16.421f, 16.421f, 0.0f, false, true, 8.612f, 8.0f)
                lineTo(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.348f, -2.956f)
                curveTo(10.627f, 3.729f, 11.473f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(1.373f, 0.729f, 2.152f, 2.045f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 8.0f)
                horizontalLineToRelative(0.888f)
                arcTo(16.38f, 16.38f, 0.0f, false, true, 16.0f, 12.349f)
                arcTo(15.877f, 15.877f, 0.0f, false, false, 12.0f, 17.715f)
                arcTo(15.877f, 15.877f, 0.0f, false, false, 8.005f, 12.349f)
                close()
                moveTo(13.991f, 20.807f)
                curveToRelative(0.737f, -2.206f, 2.417f, -5.745f, 5.935f, -7.5f)
                curveTo(19.306f, 18.371f, 16.672f, 20.256f, 13.991f, 20.807f)
                close()
                moveTo(14.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 13.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 11.5f)
                close()
            }
        }
        .build()
        return _corn!!
    }

private var _corn: ImageVector? = null
