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

public val Icons.Filled.Life: ImageVector
    get() {
        if (_life != null) {
            return _life!!
        }
        _life = Builder(name = "Life", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 13.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.179f, 12.735f)
                lineToRelative(-5.638f, 5.205f)
                curveToRelative(-0.169f, 0.155f, -0.352f, 0.29f, -0.541f, 0.412f)
                verticalLineToRelative(4.648f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.648f)
                curveToRelative(-0.189f, -0.123f, -0.372f, -0.257f, -0.54f, -0.412f)
                lineTo(1.821f, 12.735f)
                curveToRelative(-0.405f, -0.375f, -0.431f, -1.007f, -0.056f, -1.413f)
                curveToRelative(0.374f, -0.405f, 1.008f, -0.431f, 1.413f, -0.057f)
                lineToRelative(5.638f, 5.205f)
                curveToRelative(0.37f, 0.342f, 0.853f, 0.53f, 1.356f, 0.53f)
                horizontalLineToRelative(3.654f)
                curveToRelative(0.504f, 0.0f, 0.986f, -0.188f, 1.357f, -0.531f)
                lineToRelative(5.637f, -5.204f)
                curveToRelative(0.406f, -0.374f, 1.04f, -0.349f, 1.413f, 0.057f)
                curveToRelative(0.375f, 0.406f, 0.35f, 1.039f, -0.056f, 1.413f)
                close()
                moveTo(14.5f, 0.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 2.193f, 2.826f, 5.169f, 4.229f, 6.24f)
                curveToRelative(0.455f, 0.347f, 1.088f, 0.347f, 1.543f, 0.0f)
                curveToRelative(1.403f, -1.07f, 4.229f, -4.047f, 4.229f, -6.24f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _life!!
    }

private var _life: ImageVector? = null
