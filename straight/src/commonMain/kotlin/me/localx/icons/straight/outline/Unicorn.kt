package me.localx.icons.straight.outline

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

public val Icons.Outline.Unicorn: ImageVector
    get() {
        if (_unicorn != null) {
            return _unicorn!!
        }
        _unicorn = Builder(name = "Unicorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.587f, 6.664f)
                curveToRelative(-1.215f, -0.583f, -2.124f, -1.376f, -2.718f, -2.369f)
                lineToRelative(-0.078f, -0.161f)
                lineToRelative(4.209f, -3.469f)
                curveToRelative(-0.201f, -0.336f, -0.166f, -0.277f, -0.367f, -0.613f)
                lineToRelative(-4.633f, 1.603f)
                lineTo(19.0f, 0.0f)
                curveToRelative(-1.426f, 0.0f, -2.618f, 0.995f, -2.924f, 2.328f)
                curveToRelative(-3.167f, 1.039f, -4.076f, 4.3f, -4.076f, 6.172f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.006f)
                curveToRelative(-1.259f, 0.0f, -2.385f, 0.586f, -3.119f, 1.5f)
                curveToRelative(-2.388f, 0.859f, -4.875f, 2.817f, -4.875f, 8.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.796f, 0.671f, -4.747f, 1.997f, -5.829f)
                curveToRelative(0.043f, 1.598f, 0.649f, 3.332f, 1.139f, 4.736f)
                curveToRelative(0.146f, 0.418f, 0.284f, 0.812f, 0.396f, 1.173f)
                lineToRelative(-0.681f, 4.92f)
                horizontalLineToRelative(6.031f)
                lineToRelative(0.5f, -4.0f)
                horizontalLineToRelative(1.617f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.396f)
                lineToRelative(0.385f, -1.811f)
                curveToRelative(0.417f, -1.46f, 0.615f, -2.415f, 0.615f, -3.895f)
                verticalLineToRelative(-2.016f)
                lineToRelative(4.0f, -0.5f)
                verticalLineToRelative(-1.467f)
                curveToRelative(0.0f, -0.956f, -0.555f, -1.839f, -1.413f, -2.252f)
                close()
                moveTo(18.0f, 9.118f)
                verticalLineToRelative(3.782f)
                curveToRelative(0.0f, 1.25f, -0.166f, 2.042f, -0.555f, 3.412f)
                lineToRelative(-0.423f, 1.98f)
                lineToRelative(-0.022f, 3.709f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.383f)
                lineToRelative(-0.5f, 4.0f)
                horizontalLineToRelative(-1.969f)
                lineToRelative(0.425f, -3.075f)
                reflectiveCurveToRelative(-0.363f, -1.146f, -0.549f, -1.677f)
                curveToRelative(-0.483f, -1.382f, -1.03f, -2.948f, -1.03f, -4.252f)
                curveToRelative(0.002f, -1.101f, 0.899f, -1.996f, 2.0f, -1.996f)
                horizontalLineToRelative(6.006f)
                verticalLineToRelative(-2.497f)
                curveToRelative(0.003f, -0.432f, 0.134f, -4.014f, 3.546f, -4.458f)
                curveToRelative(0.705f, 1.924f, 2.135f, 3.442f, 4.176f, 4.421f)
                curveToRelative(0.076f, 0.037f, 0.141f, 0.093f, 0.188f, 0.162f)
                lineToRelative(-3.91f, 0.489f)
                close()
            }
        }
        .build()
        return _unicorn!!
    }

private var _unicorn: ImageVector? = null
