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

public val Icons.Bold.UserMusic: ImageVector
    get() {
        if (_userMusic != null) {
            return _userMusic!!
        }
        _userMusic = Builder(name = "UserMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.5f)
                reflectiveCurveToRelative(0.0f, 0.001f, 0.0f, 0.002f)
                reflectiveCurveToRelative(0.0f, 0.001f, 0.0f, 0.002f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.209f, 0.859f, -2.218f, 2.0f, -2.45f)
                verticalLineToRelative(-2.553f)
                curveToRelative(0.0f, -0.199f, -0.108f, -0.322f, -0.172f, -0.378f)
                curveToRelative(-0.064f, -0.055f, -0.198f, -0.142f, -0.398f, -0.117f)
                lineToRelative(-3.0f, 0.429f)
                curveToRelative(-0.245f, 0.035f, -0.43f, 0.248f, -0.43f, 0.495f)
                verticalLineToRelative(5.575f)
                reflectiveCurveToRelative(0.0f, 0.007f, 0.0f, 0.01f)
                curveToRelative(-0.005f, 1.376f, -1.122f, 2.49f, -2.5f, 2.49f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.209f, 0.859f, -2.218f, 2.0f, -2.45f)
                verticalLineToRelative(-3.125f)
                curveToRelative(0.0f, -1.73f, 1.292f, -3.22f, 3.005f, -3.464f)
                lineToRelative(3.0f, -0.429f)
                curveToRelative(1.009f, -0.144f, 2.021f, 0.155f, 2.788f, 0.82f)
                curveToRelative(0.767f, 0.665f, 1.207f, 1.629f, 1.207f, 2.645f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 2.691f, 4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(5.0f, 6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(10.929f, 14.353f)
                curveToRelative(-0.785f, -0.234f, -1.602f, -0.353f, -2.429f, -0.353f)
                curveTo(3.813f, 14.0f, 0.0f, 17.813f, 0.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.537f, 0.0f, 1.065f, 0.077f, 1.571f, 0.228f)
                curveToRelative(0.798f, 0.237f, 1.629f, -0.215f, 1.866f, -1.009f)
                curveToRelative(0.237f, -0.794f, -0.215f, -1.629f, -1.009f, -1.866f)
                close()
            }
        }
        .build()
        return _userMusic!!
    }

private var _userMusic: ImageVector? = null
