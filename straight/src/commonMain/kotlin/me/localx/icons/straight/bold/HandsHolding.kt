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

public val Icons.Bold.HandsHolding: ImageVector
    get() {
        if (_handsHolding != null) {
            return _handsHolding!!
        }
        _handsHolding = Builder(name = "HandsHolding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(14.121f)
                lineToRelative(-3.379f, 3.379f)
                horizontalLineToRelative(-4.242f)
                lineToRelative(4.621f, -4.621f)
                verticalLineToRelative(-2.996f)
                lineToRelative(-3.325f, 3.3f)
                lineToRelative(-2.113f, -2.129f)
                lineToRelative(3.318f, -3.293f)
                curveToRelative(0.195f, -0.322f, 0.148f, -0.746f, -0.123f, -1.017f)
                curveToRelative(-0.314f, -0.314f, -0.859f, -0.314f, -1.174f, 0.0f)
                lineToRelative(-3.867f, 3.867f)
                curveToRelative(0.187f, 0.557f, 0.284f, 1.147f, 0.284f, 1.752f)
                verticalLineToRelative(5.138f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.138f)
                curveToRelative(0.0f, -0.667f, -0.26f, -1.296f, -0.732f, -1.768f)
                lineToRelative(-3.769f, -3.769f)
                curveToRelative(-0.325f, -0.325f, -0.825f, -0.404f, -1.139f, -0.18f)
                curveToRelative(-0.245f, 0.174f, -0.325f, 0.398f, -0.35f, 0.557f)
                curveToRelative(-0.03f, 0.196f, 0.008f, 0.391f, 0.11f, 0.558f)
                lineToRelative(3.319f, 3.294f)
                lineToRelative(-2.113f, 2.129f)
                lineToRelative(-3.325f, -3.321f)
                verticalLineToRelative(3.017f)
                lineToRelative(4.621f, 4.621f)
                horizontalLineTo(3.379f)
                lineToRelative(-3.379f, -3.379f)
                verticalLineTo(6.5f)
                curveToRelative(0.0f, -1.465f, 1.265f, -2.639f, 2.761f, -2.487f)
                curveToRelative(1.301f, 0.132f, 2.239f, 1.326f, 2.239f, 2.633f)
                verticalLineToRelative(3.457f)
                curveToRelative(1.259f, -0.259f, 2.646f, 0.126f, 3.62f, 1.1f)
                lineToRelative(3.38f, 3.38f)
                lineToRelative(3.462f, -3.462f)
                curveToRelative(0.927f, -0.927f, 2.294f, -1.26f, 3.538f, -1.0f)
                verticalLineToRelative(-3.476f)
                curveToRelative(0.0f, -1.307f, 0.939f, -2.501f, 2.239f, -2.633f)
                curveToRelative(1.495f, -0.152f, 2.761f, 1.022f, 2.761f, 2.487f)
                close()
            }
        }
        .build()
        return _handsHolding!!
    }

private var _handsHolding: ImageVector? = null
