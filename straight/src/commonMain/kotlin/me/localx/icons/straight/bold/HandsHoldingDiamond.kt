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

public val Icons.Bold.HandsHoldingDiamond: ImageVector
    get() {
        if (_handsHoldingDiamond != null) {
            return _handsHoldingDiamond!!
        }
        _handsHoldingDiamond = Builder(name = "HandsHoldingDiamond", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineTo(7.0f, 5.0f)
                lineTo(12.0f, 0.0f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(-5.0f, 5.0f)
                close()
                moveTo(21.239f, 4.013f)
                curveToRelative(-1.301f, 0.132f, -2.239f, 1.326f, -2.239f, 2.633f)
                verticalLineToRelative(3.446f)
                curveToRelative(-1.235f, -0.272f, -2.58f, 0.071f, -3.538f, 1.03f)
                lineToRelative(-3.462f, 3.462f)
                lineToRelative(-3.38f, -3.381f)
                curveToRelative(-0.991f, -0.99f, -2.362f, -1.376f, -3.62f, -1.109f)
                verticalLineToRelative(-3.448f)
                curveToRelative(0.0f, -1.308f, -0.939f, -2.501f, -2.239f, -2.633f)
                curveToRelative(-1.495f, -0.152f, -2.761f, 1.022f, -2.761f, 2.487f)
                verticalLineToRelative(14.121f)
                lineToRelative(3.379f, 3.379f)
                lineTo(7.621f, 24.0f)
                lineToRelative(-4.621f, -4.621f)
                verticalLineToRelative(-3.017f)
                lineToRelative(3.325f, 3.321f)
                lineToRelative(2.113f, -2.129f)
                lineToRelative(-3.318f, -3.294f)
                curveToRelative(-0.102f, -0.167f, -0.141f, -0.362f, -0.11f, -0.559f)
                curveToRelative(0.024f, -0.158f, 0.105f, -0.383f, 0.35f, -0.556f)
                curveToRelative(0.314f, -0.224f, 0.816f, -0.144f, 1.14f, 0.18f)
                lineToRelative(3.769f, 3.769f)
                curveToRelative(0.472f, 0.473f, 0.732f, 1.101f, 0.732f, 1.768f)
                verticalLineToRelative(5.138f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.138f)
                curveToRelative(0.0f, -0.605f, -0.097f, -1.194f, -0.284f, -1.752f)
                lineToRelative(3.867f, -3.867f)
                curveToRelative(0.324f, -0.323f, 0.85f, -0.324f, 1.174f, 0.0f)
                curveToRelative(0.271f, 0.271f, 0.317f, 0.694f, 0.123f, 1.017f)
                lineToRelative(-3.318f, 3.293f)
                lineToRelative(2.113f, 2.129f)
                lineToRelative(3.325f, -3.3f)
                verticalLineToRelative(2.996f)
                lineToRelative(-4.621f, 4.621f)
                horizontalLineToRelative(4.242f)
                lineToRelative(3.379f, -3.379f)
                lineTo(24.001f, 6.5f)
                curveToRelative(0.0f, -1.465f, -1.265f, -2.639f, -2.761f, -2.487f)
                close()
            }
        }
        .build()
        return _handsHoldingDiamond!!
    }

private var _handsHoldingDiamond: ImageVector? = null
