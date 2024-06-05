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

public val Icons.Bold.BookQuran: ImageVector
    get() {
        if (_bookQuran != null) {
            return _bookQuran!!
        }
        _bookQuran = Builder(name = "BookQuran", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.159f, 8.0f)
                horizontalLineToRelative(1.607f)
                lineToRelative(0.45f, -1.718f)
                curveToRelative(0.031f, -0.118f, 0.137f, -0.2f, 0.259f, -0.2f)
                reflectiveCurveToRelative(0.228f, 0.082f, 0.259f, 0.2f)
                lineToRelative(0.449f, 1.718f)
                horizontalLineToRelative(1.596f)
                curveToRelative(0.137f, 0.0f, 0.248f, 0.111f, 0.248f, 0.248f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.089f, -0.047f, 0.17f, -0.124f, 0.215f)
                lineToRelative(-1.283f, 0.742f)
                lineToRelative(0.504f, 1.531f)
                curveToRelative(0.036f, 0.111f, -0.004f, 0.232f, -0.099f, 0.299f)
                curveToRelative(-0.095f, 0.066f, -0.221f, 0.063f, -0.312f, -0.008f)
                lineToRelative(-1.237f, -0.956f)
                lineToRelative(-1.238f, 0.957f)
                curveToRelative(-0.093f, 0.072f, -0.223f, 0.073f, -0.317f, 0.002f)
                curveToRelative(-0.089f, -0.067f, -0.126f, -0.182f, -0.092f, -0.288f)
                lineToRelative(0.499f, -1.56f)
                lineToRelative(-1.289f, -0.717f)
                curveToRelative(-0.079f, -0.044f, -0.127f, -0.126f, -0.127f, -0.216f)
                curveToRelative(0.0f, -0.137f, 0.111f, -0.248f, 0.248f, -0.248f)
                close()
                moveTo(23.0f, 5.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.467f, 3.467f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(4.0f, 5.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.526f, 0.0f, 1.031f, 0.091f, 1.5f, 0.257f)
                lineTo(20.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                close()
                moveTo(20.0f, 19.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                close()
                moveTo(9.431f, 12.665f)
                curveToRelative(0.805f, 0.346f, 1.369f, 0.4f, 2.069f, 0.269f)
                curveToRelative(0.215f, -0.04f, 0.219f, -0.285f, 0.06f, -0.435f)
                curveToRelative(-1.06f, -0.999f, -1.56f, -1.983f, -1.56f, -3.499f)
                reflectiveCurveToRelative(0.5f, -2.5f, 1.875f, -3.499f)
                curveToRelative(0.177f, -0.129f, 0.155f, -0.395f, -0.06f, -0.435f)
                curveToRelative(-0.7f, -0.132f, -1.578f, -0.078f, -2.384f, 0.269f)
                curveToRelative(-1.224f, 0.526f, -2.424f, 1.665f, -2.424f, 3.665f)
                reflectiveCurveToRelative(1.2f, 3.139f, 2.424f, 3.665f)
                close()
            }
        }
        .build()
        return _bookQuran!!
    }

private var _bookQuran: ImageVector? = null
