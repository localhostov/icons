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

public val Icons.Bold.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.478f, 7.089f)
                lineToRelative(-1.516f, -1.241f)
                reflectiveCurveToRelative(-0.008f, -0.007f, -0.011f, -0.01f)
                curveToRelative(-0.004f, -0.003f, -0.008f, -0.006f, -0.011f, -0.009f)
                lineToRelative(-1.516f, -1.241f)
                curveToRelative(-0.643f, -0.525f, -1.586f, -0.43f, -2.111f, 0.21f)
                curveToRelative(-0.524f, 0.641f, -0.43f, 1.586f, 0.211f, 2.111f)
                lineToRelative(0.367f, 0.3f)
                lineToRelative(-1.031f, 1.261f)
                curveToRelative(-0.584f, -0.392f, -1.206f, -0.733f, -1.858f, -1.013f)
                lineTo(16.002f, 2.914f)
                curveToRelative(0.582f, -0.206f, 1.0f, -0.761f, 1.0f, -1.414f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.653f, 0.418f, 1.208f, 1.0f, 1.414f)
                verticalLineToRelative(4.544f)
                curveToRelative(-4.114f, 1.768f, -7.0f, 5.936f, -7.0f, 10.352f)
                curveToRelative(0.02f, 3.413f, 2.884f, 6.19f, 6.386f, 6.19f)
                horizontalLineToRelative(9.229f)
                curveToRelative(3.502f, 0.0f, 6.366f, -2.777f, 6.386f, -6.25f)
                curveToRelative(0.0f, -2.678f, -1.089f, -5.282f, -2.882f, -7.302f)
                lineToRelative(1.093f, -1.337f)
                lineToRelative(0.366f, 0.3f)
                curveToRelative(0.279f, 0.229f, 0.615f, 0.339f, 0.949f, 0.339f)
                curveToRelative(0.435f, 0.0f, 0.865f, -0.188f, 1.162f, -0.55f)
                curveToRelative(0.524f, -0.641f, 0.43f, -1.586f, -0.211f, -2.111f)
                close()
                moveTo(16.615f, 21.0f)
                lineTo(7.386f, 21.0f)
                curveToRelative(-1.857f, 0.0f, -3.376f, -1.438f, -3.386f, -3.25f)
                curveToRelative(0.0f, -0.588f, 0.077f, -1.175f, 0.222f, -1.75f)
                horizontalLineToRelative(10.278f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(5.679f, 13.0f)
                curveToRelative(1.065f, -1.412f, 2.562f, -2.532f, 4.27f, -3.069f)
                curveToRelative(0.626f, -0.197f, 1.051f, -0.776f, 1.051f, -1.431f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.655f, 0.425f, 1.234f, 1.051f, 1.431f)
                curveToRelative(3.392f, 1.066f, 5.949f, 4.427f, 5.949f, 7.862f)
                curveToRelative(-0.01f, 1.768f, -1.528f, 3.207f, -3.386f, 3.207f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
