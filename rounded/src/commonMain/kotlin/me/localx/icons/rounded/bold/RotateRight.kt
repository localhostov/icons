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

public val Icons.Bold.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 511.494f, viewportHeight = 511.494f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.291f, 255.492f)
                curveToRelative(-16.133f, 0.143f, -29.689f, 12.161f, -31.765f, 28.16f)
                curveToRelative(-15.37f, 105.014f, -112.961f, 177.685f, -217.975f, 162.315f)
                reflectiveCurveTo(50.866f, 333.006f, 66.236f, 227.992f)
                reflectiveCurveTo(179.197f, 50.307f, 284.211f, 65.677f)
                curveToRelative(35.796f, 5.239f, 69.386f, 20.476f, 96.907f, 43.959f)
                lineToRelative(-24.107f, 24.107f)
                curveToRelative(-8.33f, 8.332f, -8.328f, 21.84f, 0.004f, 30.17f)
                curveToRelative(4.015f, 4.014f, 9.465f, 6.262f, 15.142f, 6.246f)
                horizontalLineToRelative(97.835f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                verticalLineTo(50.991f)
                curveToRelative(-0.003f, -11.782f, -9.556f, -21.331f, -21.338f, -21.329f)
                curveToRelative(-5.655f, 0.001f, -11.079f, 2.248f, -15.078f, 6.246f)
                lineToRelative(-28.416f, 28.416f)
                curveTo(320.774f, -29.34f, 159.141f, -19.568f, 65.476f, 86.152f)
                reflectiveCurveTo(-18.415f, 353.505f, 87.304f, 447.17f)
                reflectiveCurveToRelative(267.353f, 83.892f, 361.017f, -21.828f)
                curveToRelative(32.972f, -37.216f, 54.381f, -83.237f, 61.607f, -132.431f)
                curveToRelative(2.828f, -17.612f, -9.157f, -34.183f, -26.769f, -37.011f)
                curveTo(481.549f, 255.641f, 479.922f, 255.505f, 478.291f, 255.492f)
                close()
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
