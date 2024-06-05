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

public val Icons.Bold.GpsNavigation: ImageVector
    get() {
        if (_gpsNavigation != null) {
            return _gpsNavigation!!
        }
        _gpsNavigation = Builder(name = "GpsNavigation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.0f)
                horizontalLineToRelative(-1.696f)
                curveToRelative(-0.843f, 4.352f, -4.382f, 7.743f, -8.804f, 8.38f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.62f)
                curveToRelative(-4.421f, -0.637f, -7.96f, -4.028f, -8.804f, -8.38f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.552f)
                curveToRelative(0.39f, -4.094f, 3.143f, -7.504f, 6.876f, -8.861f)
                lineToRelative(-2.928f, 4.996f)
                reflectiveCurveToRelative(-0.799f, 1.112f, -0.965f, 3.865f)
                horizontalLineToRelative(1.465f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.221f)
                curveToRelative(0.747f, 2.694f, 2.956f, 4.785f, 5.721f, 5.349f)
                verticalLineToRelative(-1.349f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.349f)
                curveToRelative(2.765f, -0.563f, 4.974f, -2.655f, 5.721f, -5.349f)
                horizontalLineToRelative(-1.221f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.465f)
                curveToRelative(-0.166f, -2.752f, -0.965f, -3.865f, -0.965f, -3.865f)
                lineToRelative(-2.928f, -4.996f)
                curveToRelative(3.733f, 1.357f, 6.486f, 4.767f, 6.876f, 8.861f)
                horizontalLineToRelative(1.552f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.91f, 9.704f)
                curveToRelative(0.267f, 0.483f, 0.876f, 0.658f, 1.359f, 0.391f)
                lineToRelative(3.731f, -1.61f)
                lineToRelative(3.75f, 1.592f)
                curveToRelative(0.303f, 0.168f, 0.672f, 0.167f, 0.974f, -0.004f)
                curveToRelative(0.481f, -0.271f, 0.652f, -0.881f, 0.381f, -1.362f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-5.087f, 8.73f)
                curveToRelative(-0.17f, 0.302f, -0.171f, 0.671f, -0.004f, 0.974f)
                close()
            }
        }
        .build()
        return _gpsNavigation!!
    }

private var _gpsNavigation: ImageVector? = null
