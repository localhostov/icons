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

public val Icons.Bold.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.5f)
                curveToRelative(0.0f, 3.155f, -1.569f, 6.311f, -3.998f, 8.038f)
                curveToRelative(-0.861f, 0.613f, -1.592f, 1.57f, -2.3f, 3.014f)
                curveToRelative(-0.474f, 0.968f, -1.21f, 1.806f, -2.13f, 2.421f)
                curveToRelative(-1.018f, 0.682f, -2.219f, 1.02f, -3.419f, 1.02f)
                curveToRelative(-1.31f, 0.0f, -2.619f, -0.403f, -3.693f, -1.203f)
                curveToRelative(-1.62f, -1.208f, -2.471f, -2.867f, -2.46f, -4.798f)
                lineToRelative(3.0f, 0.017f)
                curveToRelative(-0.006f, 0.98f, 0.393f, 1.735f, 1.253f, 2.376f)
                curveToRelative(1.058f, 0.789f, 2.559f, 0.827f, 3.651f, 0.095f)
                curveToRelative(0.486f, -0.326f, 0.858f, -0.746f, 1.104f, -1.248f)
                curveToRelative(0.937f, -1.911f, 1.972f, -3.226f, 3.256f, -4.139f)
                curveToRelative(1.637f, -1.165f, 2.736f, -3.412f, 2.736f, -5.593f)
                curveToRelative(0.0f, -1.848f, -0.791f, -3.615f, -2.17f, -4.848f)
                curveToRelative(-1.397f, -1.249f, -3.207f, -1.823f, -5.09f, -1.609f)
                curveToRelative(-2.889f, 0.325f, -5.275f, 2.647f, -5.676f, 5.521f)
                curveToRelative(-0.071f, 0.513f, -0.089f, 0.827f, -0.067f, 1.201f)
                lineToRelative(0.003f, 2.234f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.148f)
                curveToRelative(-0.036f, -0.579f, 0.011f, -1.109f, 0.094f, -1.701f)
                curveTo(3.679f, 3.939f, 7.175f, 0.537f, 11.404f, 0.062f)
                curveToRelative(2.702f, -0.303f, 5.411f, 0.554f, 7.425f, 2.354f)
                curveToRelative(2.016f, 1.801f, 3.171f, 4.383f, 3.171f, 7.084f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineToRelative(-0.499f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(3.499f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                verticalLineToRelative(-0.671f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(0.499f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
