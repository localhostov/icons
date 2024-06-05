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

public val Icons.Bold.HandBackPointLeft: ImageVector
    get() {
        if (_handBackPointLeft != null) {
            return _handBackPointLeft!!
        }
        _handBackPointLeft = Builder(name = "HandBackPointLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 22.0f)
                horizontalLineToRelative(-4.721f)
                curveToRelative(-2.613f, 0.0f, -4.881f, -1.859f, -5.393f, -4.422f)
                lineToRelative(-0.716f, -3.578f)
                horizontalLineToRelative(-3.537f)
                curveTo(2.118f, 14.0f, 0.364f, 12.564f, 0.054f, 10.661f)
                curveToRelative(-0.19f, -1.171f, 0.137f, -2.356f, 0.898f, -3.251f)
                curveToRelative(0.762f, -0.896f, 1.873f, -1.41f, 3.048f, -1.41f)
                horizontalLineToRelative(5.397f)
                lineToRelative(3.968f, -3.804f)
                curveToRelative(0.755f, -0.76f, 1.795f, -1.194f, 2.903f, -1.196f)
                horizontalLineToRelative(0.008f)
                curveToRelative(1.105f, 0.0f, 2.145f, 0.43f, 2.927f, 1.212f)
                lineToRelative(2.308f, 2.309f)
                curveToRelative(1.605f, 1.604f, 2.49f, 3.739f, 2.49f, 6.01f)
                verticalLineToRelative(5.969f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(4.0f, 9.0f)
                curveToRelative(-0.294f, 0.0f, -0.572f, 0.129f, -0.763f, 0.353f)
                curveToRelative(-0.112f, 0.131f, -0.29f, 0.414f, -0.223f, 0.826f)
                curveToRelative(0.075f, 0.46f, 0.566f, 0.821f, 1.119f, 0.821f)
                horizontalLineToRelative(4.766f)
                curveToRelative(0.715f, 0.0f, 1.331f, 0.505f, 1.471f, 1.206f)
                lineToRelative(0.957f, 4.784f)
                curveToRelative(0.233f, 1.165f, 1.264f, 2.01f, 2.452f, 2.01f)
                horizontalLineToRelative(4.721f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-5.969f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.851f, -1.611f, -3.889f)
                lineToRelative(-2.308f, -2.309f)
                curveToRelative(-0.215f, -0.215f, -0.501f, -0.333f, -0.806f, -0.333f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.305f, 0.0f, -0.591f, 0.12f, -0.807f, 0.336f)
                lineToRelative(-1.735f, 1.664f)
                horizontalLineToRelative(1.268f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _handBackPointLeft!!
    }

private var _handBackPointLeft: ImageVector? = null
