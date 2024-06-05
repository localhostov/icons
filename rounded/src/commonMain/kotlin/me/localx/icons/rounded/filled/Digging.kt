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

public val Icons.Filled.Digging: ImageVector
    get() {
        if (_digging != null) {
            return _digging!!
        }
        _digging = Builder(name = "Digging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.557f, 22.721f)
                curveToRelative(-0.516f, 0.801f, -1.395f, 1.279f, -2.351f, 1.279f)
                horizontalLineToRelative(-6.411f)
                curveToRelative(-1.05f, 0.0f, -2.001f, -0.577f, -2.482f, -1.506f)
                curveToRelative(-0.477f, -0.921f, -0.401f, -2.021f, 0.198f, -2.868f)
                lineToRelative(0.904f, -1.281f)
                lineTo(0.475f, 10.351f)
                curveToRelative(-0.47f, -0.29f, -0.615f, -0.906f, -0.325f, -1.376f)
                curveToRelative(0.29f, -0.472f, 0.906f, -0.615f, 1.376f, -0.325f)
                lineToRelative(3.241f, 2.002f)
                lineToRelative(0.956f, -2.664f)
                curveToRelative(0.289f, -0.806f, 0.91f, -1.451f, 1.705f, -1.771f)
                curveToRelative(0.795f, -0.32f, 1.689f, -0.284f, 2.456f, 0.098f)
                lineToRelative(0.47f, 0.177f)
                curveToRelative(1.148f, 0.572f, 2.022f, 1.552f, 2.461f, 2.759f)
                lineToRelative(1.105f, 3.213f)
                curveToRelative(0.178f, 0.516f, -0.091f, 1.079f, -0.604f, 1.266f)
                curveToRelative(-0.526f, 0.191f, -1.106f, -0.086f, -1.288f, -0.615f)
                lineToRelative(-1.093f, -3.18f)
                curveToRelative(-0.039f, -0.106f, -0.094f, -0.202f, -0.143f, -0.302f)
                lineToRelative(-1.392f, 3.881f)
                lineToRelative(5.171f, 3.194f)
                lineToRelative(1.842f, -2.61f)
                curveToRelative(0.584f, -0.827f, 1.528f, -1.267f, 2.549f, -1.17f)
                curveToRelative(1.011f, 0.096f, 1.863f, 0.702f, 2.281f, 1.623f)
                lineToRelative(2.509f, 5.529f)
                curveToRelative(0.39f, 0.858f, 0.317f, 1.846f, -0.194f, 2.641f)
                close()
                moveTo(11.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.252f, 14.926f)
                curveToRelative(-0.524f, -0.184f, -1.093f, 0.087f, -1.277f, 0.607f)
                lineTo(0.442f, 22.665f)
                curveToRelative(-0.185f, 0.521f, 0.087f, 1.093f, 0.607f, 1.277f)
                curveToRelative(0.111f, 0.039f, 0.224f, 0.058f, 0.335f, 0.058f)
                curveToRelative(0.411f, 0.0f, 0.797f, -0.256f, 0.942f, -0.665f)
                lineToRelative(2.532f, -7.132f)
                curveToRelative(0.185f, -0.521f, -0.087f, -1.093f, -0.607f, -1.277f)
                close()
            }
        }
        .build()
        return _digging!!
    }

private var _digging: ImageVector? = null
