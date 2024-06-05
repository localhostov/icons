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

public val Icons.Bold.HrPerson: ImageVector
    get() {
        if (_hrPerson != null) {
            return _hrPerson!!
        }
        _hrPerson = Builder(name = "HrPerson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                lineToRelative(-3.867f, 3.867f)
                curveToRelative(0.187f, 0.557f, 0.284f, 1.147f, 0.284f, 1.752f)
                verticalLineToRelative(5.138f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.138f)
                curveToRelative(0.0f, -0.667f, -0.261f, -1.295f, -0.732f, -1.768f)
                lineToRelative(-3.769f, -3.769f)
                curveToRelative(-0.324f, -0.323f, -0.825f, -0.403f, -1.14f, -0.18f)
                curveToRelative(-0.244f, 0.173f, -0.325f, 0.398f, -0.35f, 0.556f)
                curveToRelative(-0.03f, 0.196f, 0.009f, 0.392f, 0.11f, 0.559f)
                lineToRelative(3.318f, 3.294f)
                lineToRelative(-2.113f, 2.129f)
                lineToRelative(-3.325f, -3.321f)
                verticalLineToRelative(3.017f)
                lineToRelative(4.621f, 4.621f)
                lineTo(3.379f, 24.001f)
                lineToRelative(-3.379f, -3.379f)
                lineTo(0.0f, 6.5f)
                curveToRelative(0.0f, -1.465f, 1.265f, -2.639f, 2.761f, -2.487f)
                curveToRelative(1.301f, 0.132f, 2.239f, 1.326f, 2.239f, 2.633f)
                verticalLineToRelative(3.448f)
                curveToRelative(1.258f, -0.267f, 2.628f, 0.118f, 3.62f, 1.108f)
                lineToRelative(3.38f, 3.381f)
                lineToRelative(3.462f, -3.462f)
                curveToRelative(0.958f, -0.959f, 2.303f, -1.302f, 3.538f, -1.03f)
                verticalLineToRelative(-3.446f)
                curveToRelative(0.0f, -1.307f, 0.939f, -2.501f, 2.239f, -2.633f)
                curveToRelative(1.495f, -0.152f, 2.761f, 1.022f, 2.761f, 2.487f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.0f, 11.755f)
                lineToRelative(2.047f, -2.047f)
                curveToRelative(0.566f, -0.566f, 1.229f, -0.999f, 1.952f, -1.288f)
                verticalLineToRelative(-0.42f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(0.461f)
                curveToRelative(0.738f, 0.298f, 1.435f, 0.729f, 2.033f, 1.327f)
                lineToRelative(1.967f, 1.968f)
                close()
            }
        }
        .build()
        return _hrPerson!!
    }

private var _hrPerson: ImageVector? = null
