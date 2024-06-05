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

public val Icons.Filled.BoxCheck: ImageVector
    get() {
        if (_boxCheck != null) {
            return _boxCheck!!
        }
        _boxCheck = Builder(name = "BoxCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.999f, 0.005f)
                curveTo(2.238f, 0.005f, 0.0f, 2.243f, 0.0f, 5.004f)
                lineTo(0.0f, 5.004f)
                curveTo(0.0f, 6.66f, 1.343f, 8.003f, 2.999f, 8.003f)
                lineTo(20.996f, 8.003f)
                curveToRelative(1.579f, 0.019f, 2.897f, -1.201f, 2.999f, -2.776f)
                curveTo(24.116f, 2.466f, 21.975f, 0.13f, 19.214f, 0.01f)
                curveToRelative(-0.073f, -0.003f, -14.215f, -0.005f, -14.215f, -0.005f)
                close()
                moveTo(21.996f, 10.003f)
                lineTo(2.0f, 10.003f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.998f)
                curveToRelative(0.003f, 2.759f, 2.24f, 4.996f, 4.999f, 4.999f)
                horizontalLineToRelative(11.998f)
                curveToRelative(2.759f, -0.003f, 4.996f, -2.24f, 4.999f, -4.999f)
                verticalLineToRelative(-7.998f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(17.682f, 14.732f)
                lineToRelative(-4.74f, 4.414f)
                curveToRelative(-0.541f, 0.542f, -1.294f, 0.854f, -2.096f, 0.854f)
                reflectiveCurveToRelative(-1.555f, -0.312f, -2.122f, -0.879f)
                lineToRelative(-2.429f, -2.411f)
                curveToRelative(-0.392f, -0.39f, -0.394f, -1.022f, -0.005f, -1.414f)
                curveToRelative(0.39f, -0.393f, 1.021f, -0.395f, 1.415f, -0.006f)
                lineToRelative(2.432f, 2.414f)
                curveToRelative(0.383f, 0.385f, 1.039f, 0.382f, 1.416f, 0.003f)
                lineToRelative(4.766f, -4.438f)
                curveToRelative(0.403f, -0.376f, 1.038f, -0.354f, 1.413f, 0.05f)
                curveToRelative(0.377f, 0.404f, 0.354f, 1.037f, -0.05f, 1.413f)
                close()
            }
        }
        .build()
        return _boxCheck!!
    }

private var _boxCheck: ImageVector? = null
