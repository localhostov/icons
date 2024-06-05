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

public val Icons.Bold.HandBackPointDown: ImageVector
    get() {
        if (_handBackPointDown != null) {
            return _handBackPointDown!!
        }
        _handBackPointDown = Builder(name = "HandBackPointDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.005f, 24.0f)
                curveToRelative(-0.948f, 0.0f, -1.868f, -0.332f, -2.596f, -0.952f)
                curveToRelative(-0.896f, -0.762f, -1.41f, -1.873f, -1.41f, -3.048f)
                verticalLineToRelative(-5.397f)
                lineToRelative(-3.804f, -3.968f)
                curveToRelative(-0.76f, -0.755f, -1.194f, -1.795f, -1.196f, -2.904f)
                reflectiveCurveToRelative(0.429f, -2.15f, 1.212f, -2.934f)
                lineToRelative(2.308f, -2.308f)
                curveTo(6.125f, 0.884f, 8.26f, 0.0f, 10.531f, 0.0f)
                horizontalLineToRelative(5.969f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(4.721f)
                curveToRelative(0.0f, 2.613f, -1.859f, 4.881f, -4.421f, 5.393f)
                lineToRelative(-3.579f, 0.716f)
                verticalLineToRelative(3.537f)
                curveToRelative(0.0f, 2.016f, -1.436f, 3.77f, -3.339f, 4.08f)
                curveToRelative(-0.219f, 0.036f, -0.438f, 0.053f, -0.656f, 0.053f)
                close()
                moveTo(9.0f, 20.0f)
                curveToRelative(0.0f, 0.294f, 0.129f, 0.572f, 0.353f, 0.763f)
                curveToRelative(0.132f, 0.112f, 0.417f, 0.29f, 0.826f, 0.223f)
                curveToRelative(0.46f, -0.075f, 0.821f, -0.566f, 0.821f, -1.119f)
                verticalLineToRelative(-4.766f)
                curveToRelative(0.0f, -0.715f, 0.505f, -1.331f, 1.206f, -1.471f)
                lineToRelative(4.785f, -0.957f)
                curveToRelative(1.165f, -0.233f, 2.01f, -1.264f, 2.01f, -2.452f)
                lineTo(19.001f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.969f)
                curveToRelative(-1.469f, 0.0f, -2.851f, 0.572f, -3.889f, 1.611f)
                lineToRelative(-2.309f, 2.308f)
                curveToRelative(-0.215f, 0.216f, -0.334f, 0.502f, -0.333f, 0.808f)
                curveToRelative(0.0f, 0.305f, 0.12f, 0.591f, 0.336f, 0.807f)
                lineToRelative(1.664f, 1.735f)
                verticalLineToRelative(-1.268f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _handBackPointDown!!
    }

private var _handBackPointDown: ImageVector? = null
