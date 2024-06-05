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

public val Icons.Bold.Angel: ImageVector
    get() {
        if (_angel != null) {
            return _angel!!
        }
        _angel = Builder(name = "Angel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(8.057f, 4.867f)
                curveToRelative(0.116f, -0.7f, 0.415f, -1.337f, 0.843f, -1.867f)
                curveToRelative(0.0f, 0.0f, 0.599f, -1.0f, 3.099f, -1.0f)
                reflectiveCurveToRelative(3.099f, 1.0f, 3.099f, 1.0f)
                curveToRelative(0.428f, 0.53f, 0.727f, 1.167f, 0.843f, 1.867f)
                curveToRelative(0.657f, -0.507f, 1.057f, -1.145f, 1.057f, -1.867f)
                curveToRelative(0.0f, -1.71f, -2.149f, -3.0f, -5.0f, -3.0f)
                reflectiveCurveToRelative(-5.0f, 1.29f, -5.0f, 3.0f)
                curveToRelative(0.0f, 0.722f, 0.4f, 1.36f, 1.057f, 1.867f)
                close()
                moveTo(20.0f, 19.0f)
                verticalLineToRelative(1.398f)
                lineToRelative(1.591f, 3.602f)
                lineTo(2.409f, 24.0f)
                lineToRelative(1.591f, -3.602f)
                verticalLineToRelative(-1.398f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 17.0f)
                curveTo(0.0f, 6.0f, 2.543f, 6.0f, 3.5f, 6.0f)
                curveToRelative(3.502f, 0.0f, 6.263f, 2.781f, 7.151f, 3.79f)
                curveToRelative(0.88f, 0.277f, 1.819f, 0.277f, 2.699f, 0.0f)
                curveToRelative(0.887f, -1.009f, 3.649f, -3.79f, 7.151f, -3.79f)
                curveToRelative(0.957f, 0.0f, 3.5f, 0.0f, 3.5f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.001f, 11.344f)
                lineToRelative(2.498f, 5.656f)
                horizontalLineToRelative(0.501f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.954f)
                curveToRelative(-0.121f, -2.681f, -0.467f, -5.113f, -0.868f, -5.978f)
                curveToRelative(-1.74f, 0.189f, -3.284f, 1.508f, -4.085f, 2.322f)
                close()
                moveTo(3.047f, 15.0f)
                horizontalLineToRelative(1.954f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.501f)
                lineToRelative(2.498f, -5.656f)
                curveToRelative(-0.801f, -0.814f, -2.345f, -2.133f, -4.085f, -2.322f)
                curveToRelative(-0.401f, 0.865f, -0.747f, 3.297f, -0.868f, 5.978f)
                close()
                moveTo(16.988f, 21.0f)
                lineToRelative(-3.592f, -8.132f)
                curveToRelative(-0.917f, 0.176f, -1.872f, 0.176f, -2.789f, 0.0f)
                lineToRelative(-3.592f, 8.132f)
                horizontalLineToRelative(9.974f)
                close()
            }
        }
        .build()
        return _angel!!
    }

private var _angel: ImageVector? = null
