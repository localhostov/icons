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

public val Icons.Bold.UserChef: ImageVector
    get() {
        if (_userChef != null) {
            return _userChef!!
        }
        _userChef = Builder(name = "UserChef", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.845f, 23.96f)
                curveToRelative(-0.116f, 0.027f, -0.231f, 0.04f, -0.346f, 0.04f)
                curveToRelative(-0.68f, 0.0f, -1.296f, -0.465f, -1.459f, -1.155f)
                curveToRelative(-0.518f, -2.191f, -2.685f, -3.845f, -5.04f, -3.845f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.096f)
                curveToRelative(-1.492f, 0.62f, -2.675f, 1.897f, -3.04f, 3.441f)
                curveToRelative(-0.19f, 0.807f, -1.002f, 1.306f, -1.805f, 1.115f)
                curveToRelative(-0.807f, -0.19f, -1.306f, -0.999f, -1.115f, -1.805f)
                curveToRelative(0.843f, -3.566f, 4.19f, -6.155f, 7.96f, -6.155f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.771f, 0.0f, 7.118f, 2.589f, 7.96f, 6.155f)
                curveToRelative(0.19f, 0.807f, -0.309f, 1.614f, -1.115f, 1.805f)
                close()
                moveTo(4.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.577f, 0.0f, 1.544f, 0.197f, 2.475f, 0.525f)
                curveToRelative(0.625f, -0.205f, 1.792f, -0.525f, 3.025f, -0.525f)
                reflectiveCurveToRelative(2.4f, 0.32f, 3.025f, 0.525f)
                curveToRelative(0.931f, -0.328f, 1.898f, -0.525f, 2.475f, -0.525f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.211f, -0.861f, 2.22f, -2.003f, 2.45f)
                curveToRelative(0.0f, 0.017f, 0.003f, 0.033f, 0.003f, 0.05f)
                verticalLineToRelative(3.984f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-3.984f)
                curveToRelative(0.0f, -0.017f, 0.003f, -0.033f, 0.003f, -0.05f)
                curveToRelative(-1.143f, -0.23f, -2.003f, -1.239f, -2.003f, -2.45f)
                close()
                moveTo(9.0f, 8.0f)
                verticalLineToRelative(0.984f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-0.984f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _userChef!!
    }

private var _userChef: ImageVector? = null
