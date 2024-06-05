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

public val Icons.Bold.Warranty: ImageVector
    get() {
        if (_warranty != null) {
            return _warranty!!
        }
        _warranty = Builder(name = "Warranty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.5f)
                verticalLineToRelative(14.121f)
                lineToRelative(-3.379f, 3.379f)
                horizontalLineToRelative(-4.242f)
                lineToRelative(4.621f, -4.621f)
                verticalLineToRelative(-2.996f)
                lineToRelative(-3.325f, 3.3f)
                lineToRelative(-2.113f, -2.129f)
                lineToRelative(3.318f, -3.293f)
                curveToRelative(0.194f, -0.322f, 0.147f, -0.746f, -0.123f, -1.017f)
                curveToRelative(-0.324f, -0.324f, -0.85f, -0.324f, -1.174f, 0.0f)
                lineToRelative(-3.886f, 3.886f)
                curveToRelative(0.184f, 0.554f, 0.303f, 1.132f, 0.303f, 1.733f)
                verticalLineToRelative(5.138f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.138f)
                curveToRelative(0.0f, -0.667f, -0.26f, -1.296f, -0.732f, -1.768f)
                lineToRelative(-3.769f, -3.769f)
                curveToRelative(-0.324f, -0.324f, -0.825f, -0.404f, -1.139f, -0.18f)
                curveToRelative(-0.245f, 0.174f, -0.325f, 0.398f, -0.35f, 0.557f)
                curveToRelative(-0.03f, 0.196f, 0.008f, 0.391f, 0.11f, 0.558f)
                lineToRelative(3.319f, 3.294f)
                lineToRelative(-2.113f, 2.129f)
                lineToRelative(-3.325f, -3.321f)
                verticalLineToRelative(3.017f)
                lineToRelative(4.621f, 4.621f)
                lineTo(3.379f, 24.001f)
                lineToRelative(-3.379f, -3.379f)
                lineTo(0.0f, 6.5f)
                curveToRelative(0.0f, -1.465f, 1.265f, -2.639f, 2.761f, -2.487f)
                curveToRelative(1.301f, 0.132f, 2.239f, 1.326f, 2.239f, 2.633f)
                verticalLineToRelative(3.468f)
                curveToRelative(1.259f, -0.259f, 2.645f, 0.114f, 3.62f, 1.089f)
                lineToRelative(3.38f, 3.38f)
                lineToRelative(3.462f, -3.462f)
                curveToRelative(0.958f, -0.959f, 2.302f, -1.294f, 3.538f, -1.021f)
                verticalLineToRelative(-3.455f)
                curveToRelative(0.0f, -1.307f, 0.939f, -2.501f, 2.239f, -2.633f)
                curveToRelative(1.495f, -0.152f, 2.761f, 1.022f, 2.761f, 2.487f)
                close()
                moveTo(11.5f, 8.553f)
                curveToRelative(0.66f, 0.0f, 1.32f, -0.251f, 1.822f, -0.753f)
                lineToRelative(5.628f, -5.628f)
                lineTo(16.829f, 0.05f)
                lineToRelative(-5.329f, 5.329f)
                lineToRelative(-2.939f, -2.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(3.239f, 3.239f)
                curveToRelative(0.502f, 0.502f, 1.162f, 0.753f, 1.822f, 0.753f)
                close()
            }
        }
        .build()
        return _warranty!!
    }

private var _warranty: ImageVector? = null
