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

public val Icons.Bold.UserHeadset: ImageVector
    get() {
        if (_userHeadset != null) {
            return _userHeadset!!
        }
        _userHeadset = Builder(name = "UserHeadset", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -3.032f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(12.0f, 7.016f)
                curveToRelative(1.651f, 0.0f, 2.996f, 1.342f, 3.0f, 2.992f)
                curveToRelative(0.0f, 0.35f, -0.073f, 0.68f, -0.185f, 0.992f)
                horizontalLineToRelative(2.185f)
                curveToRelative(1.0f, 0.0f, 0.999f, -0.648f, 1.0f, -0.984f)
                verticalLineToRelative(-0.016f)
                curveToRelative(-0.009f, -3.301f, -2.697f, -5.984f, -6.0f, -5.984f)
                reflectiveCurveToRelative(-5.992f, 2.684f, -6.0f, 5.984f)
                verticalLineToRelative(0.016f)
                curveToRelative(0.005f, 1.789f, 0.801f, 3.392f, 2.051f, 4.49f)
                curveToRelative(-0.021f, -0.167f, -0.051f, -0.332f, -0.051f, -0.505f)
                curveToRelative(0.0f, -1.129f, 0.472f, -2.145f, 1.225f, -2.872f)
                curveToRelative(-0.141f, -0.347f, -0.224f, -0.723f, -0.225f, -1.12f)
                curveToRelative(0.004f, -1.65f, 1.349f, -2.992f, 3.0f, -2.992f)
                close()
                moveTo(6.872f, 4.028f)
                curveToRelative(1.529f, -1.433f, 3.531f, -2.141f, 5.63f, -2.011f)
                curveToRelative(3.924f, 0.254f, 6.999f, 3.669f, 6.999f, 7.774f)
                curveToRelative(0.0f, 1.77f, -1.439f, 3.209f, -3.209f, 3.209f)
                horizontalLineToRelative(-2.406f)
                curveToRelative(-0.244f, -0.829f, -1.002f, -1.439f, -1.91f, -1.439f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.538f, 0.0f, 1.025f, -0.215f, 1.384f, -0.561f)
                horizontalLineToRelative(2.932f)
                curveToRelative(2.872f, 0.0f, 5.209f, -2.337f, 5.209f, -5.209f)
                curveTo(21.5f, 4.634f, 17.604f, 0.342f, 12.63f, 0.021f)
                curveToRelative(-2.664f, -0.173f, -5.191f, 0.732f, -7.126f, 2.548f)
                curveToRelative(-1.787f, 1.675f, -2.861f, 3.996f, -2.99f, 6.432f)
                horizontalLineToRelative(2.003f)
                curveToRelative(0.123f, -1.903f, 0.948f, -3.654f, 2.355f, -4.973f)
                close()
            }
        }
        .build()
        return _userHeadset!!
    }

private var _userHeadset: ImageVector? = null
