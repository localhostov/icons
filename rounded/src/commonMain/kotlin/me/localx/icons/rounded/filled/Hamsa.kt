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

public val Icons.Filled.Hamsa: ImageVector
    get() {
        if (_hamsa != null) {
            return _hamsa!!
        }
        _hamsa = Builder(name = "Hamsa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 17.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(23.887f, 14.065f)
                curveToRelative(-0.221f, 0.573f, -0.727f, 0.971f, -1.32f, 1.037f)
                curveToRelative(-2.537f, 0.287f, -2.566f, 2.312f, -2.566f, 2.397f)
                curveToRelative(0.0f, 4.313f, -2.187f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-4.313f, 0.0f, -6.5f, -2.187f, -6.5f, -6.5f)
                curveToRelative(-0.008f, -0.345f, -0.166f, -2.126f, -2.566f, -2.396f)
                curveToRelative(-0.594f, -0.067f, -1.1f, -0.465f, -1.32f, -1.038f)
                curveToRelative(-0.229f, -0.596f, -0.114f, -1.257f, 0.299f, -1.726f)
                curveToRelative(0.816f, -0.923f, 2.166f, -1.664f, 3.588f, -2.05f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(4.893f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(10.002f, 2.0f)
                curveTo(10.0f, 0.785f, 11.083f, -0.176f, 12.336f, 0.027f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(6.893f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(6.183f)
                curveToRelative(1.422f, 0.385f, 2.772f, 1.127f, 3.587f, 2.05f)
                curveToRelative(0.414f, 0.469f, 0.529f, 1.13f, 0.3f, 1.726f)
                close()
                moveTo(16.5f, 17.0f)
                curveToRelative(0.0f, -0.274f, -0.079f, -0.547f, -0.237f, -0.782f)
                curveToRelative(-0.643f, -0.955f, -2.251f, -2.218f, -4.263f, -2.218f)
                reflectiveCurveToRelative(-3.62f, 1.263f, -4.263f, 2.218f)
                curveToRelative(-0.158f, 0.235f, -0.237f, 0.508f, -0.237f, 0.782f)
                reflectiveCurveToRelative(0.079f, 0.547f, 0.237f, 0.782f)
                curveToRelative(0.642f, 0.954f, 2.25f, 2.218f, 4.263f, 2.218f)
                reflectiveCurveToRelative(3.62f, -1.263f, 4.263f, -2.218f)
                curveToRelative(0.158f, -0.235f, 0.237f, -0.509f, 0.237f, -0.782f)
                close()
            }
        }
        .build()
        return _hamsa!!
    }

private var _hamsa: ImageVector? = null
