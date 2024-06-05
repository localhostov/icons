package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.CloudRainbow: ImageVector
    get() {
        if (_cloudRainbow != null) {
            return _cloudRainbow!!
        }
        _cloudRainbow = Builder(name = "CloudRainbow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -1.6f)
                curveToRelative(0.659f, -1.36f, 5.485f, -3.848f, 5.8f, -1.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                arcToRelative(3.966f, 3.966f, 0.0f, false, false, -3.2f, 1.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 16.0f)
                close()
                moveTo(16.293f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.745f, -1.667f)
                arcTo(10.012f, 10.012f, 0.0f, false, true, 23.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(8.012f, 8.012f, 0.0f, false, false, -5.963f, 2.667f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.292f, 13.0f)
                close()
                moveTo(13.62f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.9f, 8.308f)
                arcTo(13.883f, 13.883f, 0.0f, false, true, 23.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -8.659f, 3.692f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.619f, 10.0f)
                close()
                moveTo(10.0f, 8.045f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.236f, 6.4f)
                arcTo(17.974f, 17.974f, 0.0f, false, true, 23.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(15.979f, 15.979f, 0.0f, false, false, 10.764f, 7.689f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 8.045f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9f, 23.984f)
                curveToRelative(-3.687f, -0.11f, -6.613f, 0.709f, -7.773f, -2.592f)
                arcToRelative(3.626f, 3.626f, 0.0f, false, true, 2.0f, -4.258f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.424f, -3.471f)
                curveToRelative(0.137f, 0.325f, 0.287f, 0.359f, 0.588f, 0.427f)
                lineToRelative(0.176f, 0.042f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.012f, 5.012f, 0.0f, false, true, 3.559f, 6.0f)
                arcToRelative(4.949f, 4.949f, 0.0f, false, true, -3.7f, 3.7f)
                arcToRelative(5.277f, 5.277f, 0.0f, false, true, -1.066f, 0.132f)
                curveTo(12.23f, 23.975f, 10.015f, 23.984f, 7.9f, 23.984f)
                close()
            }
        }
        .build()
        return _cloudRainbow!!
    }

private var _cloudRainbow: ImageVector? = null
