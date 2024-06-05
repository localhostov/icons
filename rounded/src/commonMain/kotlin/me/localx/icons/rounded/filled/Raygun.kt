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

public val Icons.Filled.Raygun: ImageVector
    get() {
        if (_raygun != null) {
            return _raygun!!
        }
        _raygun = Builder(name = "Raygun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.947f)
                verticalLineToRelative(6.084f)
                curveToRelative(0.0f, 0.857f, -0.919f, 1.265f, -1.447f, 0.65f)
                curveToRelative(-0.66f, -0.768f, -1.526f, -1.629f, -2.553f, -2.326f)
                verticalLineToRelative(3.645f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.938f)
                curveToRelative(0.0f, 0.913f, -0.395f, 1.771f, -1.083f, 2.356f)
                curveToRelative(-0.54f, 0.458f, -1.214f, 0.705f, -1.905f, 0.705f)
                curveToRelative(-0.156f, 0.0f, -0.312f, -0.013f, -0.469f, -0.038f)
                curveToRelative(-4.659f, -0.763f, -12.544f, -3.298f, -12.544f, -7.962f)
                curveToRelative(0.0f, -1.635f, 0.969f, -3.008f, 2.427f, -4.135f)
                curveTo(2.096f, 3.348f, 0.717f, 2.118f, 0.148f, 1.291f)
                curveTo(-0.237f, 0.73f, 0.176f, -0.037f, 0.855f, 0.001f)
                curveToRelative(2.647f, 0.15f, 5.421f, 0.718f, 7.469f, 2.036f)
                curveToRelative(1.496f, -0.465f, 2.973f, -0.796f, 4.22f, -1.0f)
                curveToRelative(0.845f, -0.139f, 1.712f, 0.104f, 2.374f, 0.667f)
                curveToRelative(0.688f, 0.585f, 1.083f, 1.443f, 1.083f, 2.356f)
                verticalLineToRelative(3.938f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.625f)
                curveToRelative(1.025f, -0.701f, 1.894f, -1.566f, 2.557f, -2.333f)
                curveToRelative(0.529f, -0.611f, 1.443f, -0.199f, 1.443f, 0.655f)
                close()
                moveTo(0.119f, 20.094f)
                curveToRelative(-0.267f, 0.933f, -0.084f, 1.912f, 0.5f, 2.687f)
                curveToRelative(0.584f, 0.774f, 1.476f, 1.219f, 2.446f, 1.219f)
                curveToRelative(1.387f, 0.0f, 2.605f, -0.937f, 2.945f, -2.222f)
                lineToRelative(1.36f, -4.017f)
                curveToRelative(-1.826f, -0.586f, -3.837f, -1.414f, -5.527f, -2.559f)
                lineTo(0.119f, 20.094f)
                close()
            }
        }
        .build()
        return _raygun!!
    }

private var _raygun: ImageVector? = null
