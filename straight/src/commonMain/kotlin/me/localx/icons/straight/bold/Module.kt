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

public val Icons.Bold.Module: ImageVector
    get() {
        if (_module != null) {
            return _module!!
        }
        _module = Builder(name = "Module", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.011f, 8.959f)
                verticalLineToRelative(0.041f)
                horizontalLineToRelative(-0.011f)
                verticalLineToRelative(1.815f)
                curveToRelative(0.793f, -0.387f, 1.661f, -0.636f, 2.575f, -0.742f)
                horizontalLineToRelative(0.436f)
                verticalLineToRelative(-5.18f)
                lineTo(8.511f, 0.036f)
                lineTo(0.011f, 4.893f)
                verticalLineToRelative(10.341f)
                lineToRelative(8.5f, 4.857f)
                lineToRelative(1.489f, -0.851f)
                verticalLineToRelative(-7.978f)
                lineToRelative(4.011f, -2.303f)
                close()
                moveTo(13.021f, 6.068f)
                lineToRelative(-4.526f, 2.599f)
                lineToRelative(-4.531f, -2.578f)
                lineToRelative(4.547f, -2.599f)
                lineToRelative(4.51f, 2.578f)
                close()
                moveTo(3.011f, 8.999f)
                lineToRelative(3.989f, 2.27f)
                verticalLineToRelative(4.504f)
                lineToRelative(-3.989f, -2.28f)
                verticalLineToRelative(-4.494f)
                close()
                moveTo(22.022f, 18.0f)
                curveToRelative(0.0f, -0.28f, -0.033f, -0.552f, -0.083f, -0.818f)
                lineToRelative(1.529f, -0.883f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(-1.542f, 0.89f)
                curveToRelative(-0.413f, -0.352f, -0.884f, -0.629f, -1.404f, -0.815f)
                verticalLineToRelative(-1.776f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.776f)
                curveToRelative(-0.521f, 0.186f, -0.992f, 0.463f, -1.404f, 0.815f)
                lineToRelative(-1.542f, -0.89f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(1.529f, 0.883f)
                curveToRelative(-0.049f, 0.266f, -0.083f, 0.538f, -0.083f, 0.818f)
                reflectiveCurveToRelative(0.033f, 0.552f, 0.083f, 0.818f)
                lineToRelative(-1.529f, 0.883f)
                lineToRelative(1.5f, 2.598f)
                lineToRelative(1.542f, -0.89f)
                curveToRelative(0.413f, 0.352f, 0.884f, 0.629f, 1.404f, 0.815f)
                verticalLineToRelative(1.776f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.776f)
                curveToRelative(0.521f, -0.186f, 0.992f, -0.463f, 1.404f, -0.815f)
                lineToRelative(1.542f, 0.89f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(-1.529f, -0.883f)
                curveToRelative(0.049f, -0.266f, 0.083f, -0.538f, 0.083f, -0.818f)
                close()
                moveTo(17.522f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _module!!
    }

private var _module: ImageVector? = null
