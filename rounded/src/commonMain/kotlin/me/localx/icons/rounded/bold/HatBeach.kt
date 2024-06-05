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

public val Icons.Bold.HatBeach: ImageVector
    get() {
        if (_hatBeach != null) {
            return _hatBeach!!
        }
        _hatBeach = Builder(name = "HatBeach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.64f, 8.956f)
                curveToRelative(-0.853f, 0.853f, -0.853f, 2.236f, 0.0f, 3.088f)
                curveToRelative(0.464f, 0.464f, 1.084f, 0.666f, 1.691f, 0.626f)
                curveToRelative(-0.041f, 0.607f, 0.162f, 1.227f, 0.626f, 1.691f)
                curveToRelative(0.853f, 0.853f, 2.235f, 0.853f, 3.088f, 0.0f)
                curveToRelative(0.464f, -0.464f, 0.666f, -1.084f, 0.626f, -1.691f)
                curveToRelative(0.607f, 0.041f, 1.227f, -0.162f, 1.691f, -0.626f)
                curveToRelative(0.853f, -0.853f, 0.853f, -2.235f, 0.0f, -3.088f)
                curveToRelative(-0.464f, -0.464f, -1.084f, -0.666f, -1.691f, -0.626f)
                curveToRelative(0.041f, -0.607f, -0.162f, -1.227f, -0.626f, -1.691f)
                curveToRelative(-0.853f, -0.853f, -2.235f, -0.853f, -3.088f, 0.0f)
                curveToRelative(-0.464f, 0.464f, -0.666f, 1.084f, -0.626f, 1.691f)
                curveToRelative(-0.607f, -0.041f, -1.227f, 0.162f, -1.691f, 0.626f)
                close()
                moveTo(17.5f, 9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 14.5f)
                curveToRelative(0.0f, 3.706f, -5.159f, 6.5f, -12.0f, 6.5f)
                reflectiveCurveTo(0.0f, 18.206f, 0.0f, 14.5f)
                curveToRelative(0.0f, -2.209f, 1.854f, -4.149f, 5.0f, -5.329f)
                verticalLineToRelative(-0.171f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.877f, 0.0f, 1.734f, 0.161f, 2.546f, 0.478f)
                curveToRelative(0.771f, 0.302f, 1.152f, 1.171f, 0.852f, 1.943f)
                reflectiveCurveToRelative(-1.171f, 1.152f, -1.943f, 0.852f)
                curveToRelative(-0.462f, -0.181f, -0.952f, -0.272f, -1.454f, -0.272f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.17f)
                curveToRelative(0.664f, 0.448f, 1.633f, 0.974f, 2.796f, 1.208f)
                curveToRelative(0.812f, 0.164f, 1.338f, 0.954f, 1.175f, 1.767f)
                curveToRelative(-0.144f, 0.712f, -0.77f, 1.205f, -1.469f, 1.205f)
                curveToRelative(-0.098f, 0.0f, -0.197f, -0.01f, -0.297f, -0.03f)
                curveToRelative(-2.107f, -0.424f, -3.722f, -1.495f, -4.58f, -2.172f)
                curveToRelative(-1.782f, 0.754f, -2.624f, 1.693f, -2.624f, 2.353f)
                curveToRelative(0.0f, 1.427f, 3.506f, 3.5f, 9.0f, 3.5f)
                reflectiveCurveToRelative(9.0f, -2.073f, 9.0f, -3.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hatBeach!!
    }

private var _hatBeach: ImageVector? = null
