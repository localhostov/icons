package me.localx.icons.rounded.outline

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

public val Icons.Outline.PlaneAlt: ImageVector
    get() {
        if (_planeAlt != null) {
            return _planeAlt!!
        }
        _planeAlt = Builder(name = "PlaneAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.689f, 24.0f)
                arcToRelative(2.688f, 2.688f, 0.0f, false, true, -2.546f, -3.547f)
                lineTo(10.083f, 15.0f)
                horizontalLineTo(6.158f)
                lineToRelative(-1.08f, 1.646f)
                arcTo(2.993f, 2.993f, 0.0f, false, true, 2.569f, 18.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.556f, 2.556f, 0.0f, false, true, -2.4f, -3.434f)
                lineTo(1.1f, 12.0f)
                lineTo(0.159f, 9.44f)
                arcTo(2.555f, 2.555f, 0.0f, false, true, 0.46f, 7.1f)
                arcToRelative(2.811f, 2.811f, 0.0f, false, true, 4.6f, 0.247f)
                lineTo(6.155f, 9.0f)
                horizontalLineToRelative(3.928f)
                lineTo(8.147f, 3.563f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 0.359f, -2.442f)
                arcToRelative(2.883f, 2.883f, 0.0f, false, true, 4.817f, 0.442f)
                lineTo(17.58f, 9.0f)
                horizontalLineToRelative(3.313f)
                arcToRelative(3.084f, 3.084f, 0.0f, false, true, 3.067f, 2.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 15.0f)
                horizontalLineTo(17.58f)
                lineToRelative(-4.267f, 7.454f)
                arcTo(2.989f, 2.989f, 0.0f, false, true, 10.689f, 24.0f)
                close()
                moveTo(5.618f, 13.0f)
                horizontalLineTo(11.5f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, 0.942f, 1.335f)
                lineToRelative(-2.41f, 6.773f)
                arcToRelative(0.676f, 0.676f, 0.0f, false, false, 0.1f, 0.605f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 1.437f, -0.234f)
                lineTo(16.132f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.985f, -1.175f)
                arcTo(1.083f, 1.083f, 0.0f, false, false, 20.893f, 11.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.868f, -0.5f)
                lineTo(11.577f, 2.539f)
                arcToRelative(0.894f, 0.894f, 0.0f, false, false, -1.447f, -0.252f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, false, -0.093f, 0.621f)
                lineToRelative(2.4f, 6.757f)
                arcTo(1.006f, 1.006f, 0.0f, false, true, 11.5f, 11.0f)
                horizontalLineTo(5.618f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.834f, -0.448f)
                lineToRelative(-1.393f, -2.1f)
                curveToRelative(-0.228f, -0.421f, -1.034f, -0.637f, -1.29f, -0.21f)
                arcToRelative(0.541f, 0.541f, 0.0f, false, false, -0.065f, 0.51f)
                lineToRelative(1.072f, 2.906f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 0.69f)
                lineToRelative(-1.066f, 2.91f)
                arcTo(0.556f, 0.556f, 0.0f, false, false, 2.564f, 16.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.837f, -0.452f)
                lineToRelative(1.376f, -2.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.618f, 13.0f)
                close()
            }
        }
        .build()
        return _planeAlt!!
    }

private var _planeAlt: ImageVector? = null
