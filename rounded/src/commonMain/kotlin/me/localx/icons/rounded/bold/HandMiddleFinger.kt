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

public val Icons.Bold.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.578f, 8.386f)
                lineToRelative(-0.578f, -0.116f)
                verticalLineToRelative(-4.137f)
                curveToRelative(0.0f, -2.016f, -1.436f, -3.77f, -3.339f, -4.08f)
                curveToRelative(-1.171f, -0.192f, -2.356f, 0.136f, -3.252f, 0.898f)
                curveToRelative(-0.896f, 0.762f, -1.409f, 1.873f, -1.409f, 3.048f)
                verticalLineToRelative(3.145f)
                curveToRelative(-0.589f, 0.179f, -1.139f, 0.486f, -1.605f, 0.907f)
                curveToRelative(-0.315f, 0.285f, -0.583f, 0.613f, -0.797f, 0.972f)
                lineToRelative(-4.375f, 4.315f)
                curveToRelative(-0.786f, 0.781f, -1.221f, 1.821f, -1.223f, 2.929f)
                reflectiveCurveToRelative(0.429f, 2.151f, 1.213f, 2.935f)
                lineToRelative(2.308f, 2.308f)
                curveToRelative(1.604f, 1.605f, 3.739f, 2.49f, 6.01f, 2.49f)
                horizontalLineToRelative(5.97f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-4.721f)
                curveToRelative(0.0f, -2.613f, -1.859f, -4.881f, -4.422f, -5.393f)
                close()
                moveTo(19.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.97f)
                curveToRelative(-1.469f, 0.0f, -2.85f, -0.572f, -3.889f, -1.611f)
                lineToRelative(-2.308f, -2.308f)
                curveToRelative(-0.216f, -0.216f, -0.335f, -0.503f, -0.334f, -0.808f)
                curveToRelative(0.0f, -0.305f, 0.12f, -0.591f, 0.333f, -0.802f)
                lineToRelative(1.667f, -1.645f)
                verticalLineToRelative(1.674f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-4.312f)
                curveToRelative(0.0f, -0.474f, 0.253f, -0.773f, 0.403f, -0.909f)
                curveToRelative(0.259f, -0.233f, 0.603f, -0.349f, 0.942f, -0.311f)
                curveToRelative(0.424f, 0.047f, 0.844f, -0.093f, 1.159f, -0.378f)
                curveToRelative(0.315f, -0.284f, 0.495f, -0.689f, 0.495f, -1.114f)
                verticalLineToRelative(-4.477f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.763f)
                curveToRelative(0.132f, -0.112f, 0.409f, -0.293f, 0.826f, -0.223f)
                curveToRelative(0.461f, 0.075f, 0.821f, 0.566f, 0.821f, 1.119f)
                verticalLineToRelative(5.366f)
                curveToRelative(0.0f, 0.715f, 0.505f, 1.331f, 1.206f, 1.471f)
                lineToRelative(1.784f, 0.357f)
                curveToRelative(1.164f, 0.233f, 2.01f, 1.264f, 2.01f, 2.452f)
                verticalLineToRelative(4.721f)
                close()
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
