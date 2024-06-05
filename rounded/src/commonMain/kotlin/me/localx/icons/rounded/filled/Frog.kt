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

public val Icons.Filled.Frog: ImageVector
    get() {
        if (_frog != null) {
            return _frog!!
        }
        _frog = Builder(name = "Frog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.27f, 4.875f)
                curveToRelative(-1.114f, -1.002f, -2.68f, -1.816f, -4.395f, -2.301f)
                curveToRelative(-0.407f, -1.482f, -1.766f, -2.574f, -3.375f, -2.574f)
                curveToRelative(-1.493f, 0.0f, -2.771f, 0.94f, -3.273f, 2.26f)
                curveTo(2.514f, 6.921f, 0.229f, 13.83f, 0.034f, 18.833f)
                curveToRelative(-0.058f, 1.502f, 0.552f, 2.921f, 1.709f, 3.935f)
                curveToRelative(0.953f, 0.834f, 2.213f, 1.232f, 3.479f, 1.232f)
                horizontalLineToRelative(9.778f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-0.596f)
                curveToRelative(-0.743f, 0.0f, -1.21f, -0.782f, -0.881f, -1.449f)
                curveToRelative(0.003f, -0.007f, 0.006f, -0.013f, 0.01f, -0.02f)
                curveToRelative(0.164f, -0.331f, 0.512f, -0.531f, 0.881f, -0.531f)
                horizontalLineToRelative(0.848f)
                curveToRelative(2.165f, 0.0f, 4.078f, 1.101f, 5.209f, 2.772f)
                curveToRelative(0.0f, 0.0f, 0.35f, -1.766f, 0.427f, -2.284f)
                lineToRelative(5.464f, 8.586f)
                curveToRelative(0.367f, 0.577f, 1.004f, 0.926f, 1.687f, 0.926f)
                horizontalLineToRelative(1.451f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.451f)
                lineToRelative(-6.392f, -10.044f)
                curveToRelative(3.059f, -0.227f, 6.949f, -1.359f, 9.275f, -3.993f)
                curveToRelative(0.798f, -0.903f, 0.725f, -2.288f, -0.163f, -3.087f)
                close()
                moveTo(15.5f, 5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _frog!!
    }

private var _frog: ImageVector? = null
