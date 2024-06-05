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

public val Icons.Outline.FloorLayer: ImageVector
    get() {
        if (_floorLayer != null) {
            return _floorLayer!!
        }
        _floorLayer = Builder(name = "FloorLayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.014f, 5.835f)
                lineToRelative(-7.419f, -3.558f)
                curveToRelative(-1.65f, -0.79f, -3.541f, -0.79f, -5.189f, 0.0f)
                lineTo(1.986f, 5.835f)
                curveToRelative(-1.207f, 0.579f, -1.986f, 1.818f, -1.986f, 3.156f)
                verticalLineToRelative(1.162f)
                curveToRelative(0.0f, 1.338f, 0.779f, 2.577f, 1.986f, 3.156f)
                lineToRelative(7.412f, 3.554f)
                curveToRelative(0.824f, 0.395f, 1.709f, 0.593f, 2.594f, 0.593f)
                curveToRelative(0.891f, 0.0f, 1.78f, -0.2f, 2.609f, -0.6f)
                lineToRelative(7.42f, -3.583f)
                curveToRelative(1.202f, -0.581f, 1.979f, -1.817f, 1.979f, -3.152f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0.0f, -1.338f, -0.779f, -2.577f, -1.986f, -3.156f)
                close()
                moveTo(10.271f, 4.081f)
                curveToRelative(1.1f, -0.527f, 2.361f, -0.527f, 3.459f, 0.0f)
                lineToRelative(6.957f, 3.336f)
                lineToRelative(-8.563f, 4.107f)
                curveToRelative(-0.123f, 0.074f, -0.246f, 0.0f, -0.246f, 0.0f)
                lineTo(3.313f, 7.418f)
                lineToRelative(6.958f, -3.336f)
                close()
                moveTo(2.852f, 11.505f)
                curveToRelative(-0.518f, -0.248f, -0.852f, -0.779f, -0.852f, -1.353f)
                verticalLineToRelative(-1.146f)
                lineToRelative(9.0f, 4.316f)
                verticalLineToRelative(1.995f)
                curveToRelative(-0.25f, -0.065f, -0.498f, -0.143f, -0.736f, -0.257f)
                lineToRelative(-7.412f, -3.554f)
                close()
                moveTo(21.153f, 11.472f)
                lineToRelative(-7.42f, 3.583f)
                curveToRelative(-0.237f, 0.114f, -0.484f, 0.192f, -0.732f, 0.257f)
                verticalLineToRelative(-1.99f)
                lineToRelative(9.0f, -4.316f)
                verticalLineToRelative(1.115f)
                curveToRelative(0.0f, 0.572f, -0.333f, 1.102f, -0.848f, 1.351f)
                close()
                moveTo(23.901f, 15.802f)
                curveToRelative(0.24f, 0.498f, 0.032f, 1.095f, -0.466f, 1.335f)
                lineToRelative(-8.833f, 4.265f)
                curveToRelative(-0.829f, 0.4f, -1.72f, 0.601f, -2.609f, 0.601f)
                curveToRelative(-0.885f, 0.0f, -1.77f, -0.198f, -2.594f, -0.594f)
                lineTo(0.567f, 17.176f)
                curveToRelative(-0.498f, -0.239f, -0.708f, -0.836f, -0.469f, -1.334f)
                curveToRelative(0.239f, -0.499f, 0.833f, -0.709f, 1.334f, -0.47f)
                lineToRelative(8.831f, 4.234f)
                curveToRelative(1.101f, 0.529f, 2.366f, 0.527f, 3.469f, -0.004f)
                lineToRelative(8.833f, -4.265f)
                curveToRelative(0.498f, -0.24f, 1.095f, -0.031f, 1.335f, 0.465f)
                close()
            }
        }
        .build()
        return _floorLayer!!
    }

private var _floorLayer: ImageVector? = null
