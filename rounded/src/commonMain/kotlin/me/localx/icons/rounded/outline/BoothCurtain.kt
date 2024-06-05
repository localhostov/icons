package me.localx.icons.rounded.outline

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

public val Icons.Outline.BoothCurtain: ImageVector
    get() {
        if (_boothCurtain != null) {
            return _boothCurtain!!
        }
        _boothCurtain = Builder(name = "BoothCurtain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-10.806f)
                curveToRelative(1.996f, 3.46f, 5.069f, 5.204f, 7.257f, 6.05f)
                curveToRelative(-1.661f, 1.396f, -3.715f, 3.627f, -4.225f, 6.43f)
                curveToRelative(-0.104f, 0.567f, 0.052f, 1.15f, 0.426f, 1.599f)
                curveToRelative(0.385f, 0.461f, 0.949f, 0.726f, 1.55f, 0.726f)
                horizontalLineToRelative(1.912f)
                curveToRelative(2.288f, 0.0f, 4.08f, -1.757f, 4.08f, -4.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(13.027f, 2.0f)
                horizontalLineToRelative(2.014f)
                curveToRelative(0.195f, 3.065f, 1.289f, 5.561f, 3.277f, 7.418f)
                curveToRelative(0.192f, 0.18f, 0.438f, 0.27f, 0.683f, 0.27f)
                curveToRelative(0.267f, 0.0f, 0.534f, -0.106f, 0.73f, -0.317f)
                curveToRelative(0.377f, -0.403f, 0.355f, -1.036f, -0.048f, -1.413f)
                curveToRelative(-1.574f, -1.471f, -2.459f, -3.473f, -2.643f, -5.958f)
                horizontalLineToRelative(1.961f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.759f)
                curveToRelative(-2.557f, -0.711f, -8.536f, -3.274f, -8.973f, -11.759f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(0.0f, 1.122f, -0.914f, 2.0f, -2.08f, 2.0f)
                lineToRelative(-1.921f, 0.034f)
                curveToRelative(0.448f, -2.457f, 2.531f, -4.474f, 4.001f, -5.625f)
                verticalLineToRelative(3.591f)
                close()
                moveTo(9.0f, 17.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _boothCurtain!!
    }

private var _boothCurtain: ImageVector? = null
