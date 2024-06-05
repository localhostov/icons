package me.localx.icons.straight.filled

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

public val Icons.Filled.Locust: ImageVector
    get() {
        if (_locust != null) {
            return _locust!!
        }
        _locust = Builder(name = "Locust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.274f, 11.969f)
                lineToRelative(-1.617f, 7.596f)
                curveToRelative(-0.585f, -0.208f, -1.134f, -0.493f, -1.636f, -0.841f)
                lineToRelative(-0.964f, 4.245f)
                lineTo(0.0f, 22.969f)
                lineToRelative(1.302f, -5.939f)
                curveToRelative(-0.819f, -1.146f, -1.302f, -2.548f, -1.302f, -4.061f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.389f)
                lineTo(4.675f, 1.23f)
                lineToRelative(1.603f, 2.748f)
                lineToRelative(-1.761f, 7.99f)
                horizontalLineToRelative(1.757f)
                close()
                moveTo(21.432f, 13.05f)
                curveToRelative(1.273f, -0.972f, 2.569f, -2.97f, 2.569f, -7.081f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 5.819f, -2.895f, 5.996f, -3.0f, 6.0f)
                horizontalLineToRelative(-4.724f)
                reflectiveCurveToRelative(2.075f, 4.0f, 2.075f, 4.0f)
                horizontalLineToRelative(-2.253f)
                lineToRelative(-2.075f, -4.0f)
                horizontalLineToRelative(-3.704f)
                lineToRelative(-1.701f, 7.99f)
                curveToRelative(0.126f, 0.007f, 0.254f, 0.011f, 0.382f, 0.011f)
                horizontalLineToRelative(9.173f)
                lineToRelative(1.556f, 3.0f)
                horizontalLineToRelative(2.253f)
                lineToRelative(-1.556f, -3.0f)
                horizontalLineToRelative(5.574f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.033f, -1.017f, -3.833f, -2.569f, -4.919f)
                close()
                moveTo(8.32f, 11.969f)
                lineToRelative(1.078f, -5.062f)
                lineToRelative(2.626f, 5.062f)
                horizontalLineToRelative(2.253f)
                lineTo(8.603f, 1.031f)
                lineToRelative(-2.329f, 10.937f)
                horizontalLineToRelative(2.046f)
                close()
                moveTo(3.932f, 22.969f)
                horizontalLineToRelative(2.046f)
                lineToRelative(0.641f, -3.01f)
                curveToRelative(-0.684f, -0.037f, -1.343f, -0.173f, -1.962f, -0.393f)
                lineToRelative(-0.725f, 3.404f)
                close()
            }
        }
        .build()
        return _locust!!
    }

private var _locust: ImageVector? = null
