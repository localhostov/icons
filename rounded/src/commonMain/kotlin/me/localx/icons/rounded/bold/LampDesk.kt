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

public val Icons.Bold.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) {
            return _lampDesk!!
        }
        _lampDesk = Builder(name = "LampDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.021f, 13.987f)
                curveToRelative(0.087f, 0.009f, -0.087f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(21.244f, 8.138f)
                lineToRelative(-0.796f, 0.795f)
                curveToRelative(0.345f, 0.429f, 0.552f, 0.973f, 0.552f, 1.566f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.595f, 0.0f, -1.141f, -0.208f, -1.57f, -0.555f)
                lineToRelative(-0.784f, 0.782f)
                curveToRelative(-0.498f, 0.498f, -1.146f, 0.76f, -2.125f, 0.76f)
                curveToRelative(-0.79f, -0.078f, -1.497f, -0.501f, -1.938f, -1.161f)
                lineToRelative(-2.118f, -3.171f)
                lineToRelative(-0.648f, 0.648f)
                curveToRelative(-0.851f, 0.851f, -1.318f, 1.98f, -1.318f, 3.183f)
                verticalLineToRelative(7.515f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-7.515f)
                curveToRelative(0.0f, -2.003f, 0.78f, -3.887f, 2.197f, -5.304f)
                lineToRelative(1.172f, -1.172f)
                curveToRelative(-0.593f, -1.556f, -0.445f, -3.285f, 0.457f, -4.659f)
                curveToRelative(0.768f, -1.172f, 1.938f, -1.969f, 3.297f, -2.246f)
                curveToRelative(1.356f, -0.278f, 2.738f, -0.008f, 3.892f, 0.76f)
                lineToRelative(4.826f, 3.212f)
                curveToRelative(0.661f, 0.44f, 1.085f, 1.146f, 1.164f, 1.936f)
                curveToRelative(0.078f, 0.79f, -0.199f, 1.565f, -0.761f, 2.127f)
                close()
                moveTo(18.81f, 6.328f)
                lineToRelative(-4.458f, -2.967f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.359f, -0.239f, -0.771f, -0.363f, -1.192f, -0.363f)
                curveToRelative(-0.146f, 0.0f, -0.292f, 0.015f, -0.438f, 0.045f)
                curveToRelative(-0.568f, 0.116f, -1.062f, 0.454f, -1.389f, 0.951f)
                curveToRelative(-0.456f, 0.696f, -0.414f, 1.686f, 0.104f, 2.463f)
                lineToRelative(2.897f, 4.339f)
                lineToRelative(4.475f, -4.468f)
                close()
            }
        }
        .build()
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
