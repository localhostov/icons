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

public val Icons.Bold.MapMarker: ImageVector
    get() {
        if (_mapMarker != null) {
            return _mapMarker!!
        }
        _mapMarker = Builder(name = "MapMarker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 8.0f)
                close()
                moveTo(24.0f, 13.374f)
                verticalLineToRelative(5.149f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, -1.738f, 3.594f)
                arcToRelative(4.249f, 4.249f, 0.0f, false, true, -3.674f, 0.774f)
                curveToRelative(-0.044f, -0.011f, -2.328f, -0.818f, -2.328f, -0.818f)
                arcToRelative(2.114f, 2.114f, 0.0f, false, false, -1.148f, 0.011f)
                lineToRelative(-5.5f, 1.706f)
                arcTo(5.275f, 5.275f, 0.0f, false, true, 8.14f, 24.0f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, -1.6f, -0.256f)
                lineToRelative(-2.739f, -0.9f)
                arcTo(5.494f, 5.494f, 0.0f, false, true, 0.0f, 17.576f)
                lineTo(0.0f, 13.5f)
                arcTo(5.52f, 5.52f, 0.0f, false, true, 1.707f, 9.462f)
                arcTo(5.294f, 5.294f, 0.0f, false, true, 4.013f, 8.2f)
                arcTo(8.084f, 8.084f, 0.0f, false, true, 6.337f, 2.374f)
                arcToRelative(7.941f, 7.941f, 0.0f, false, true, 11.326f, 0.0f)
                arcToRelative(8.088f, 8.088f, 0.0f, false, true, 2.329f, 5.652f)
                lineToRelative(0.466f, 0.163f)
                arcTo(5.517f, 5.517f, 0.0f, false, true, 24.0f, 13.373f)
                close()
                moveTo(8.471f, 11.68f)
                lineTo(11.764f, 14.9f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.484f, 0.0f)
                lineToRelative(3.3f, -3.235f)
                arcToRelative(5.134f, 5.134f, 0.0f, false, false, -0.016f, -7.182f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.945f, 4.945f, 0.0f, false, false, -7.058f, 0.0f)
                arcTo(5.14f, 5.14f, 0.0f, false, false, 8.471f, 11.68f)
                close()
                moveTo(21.0f, 13.373f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.552f, -2.358f)
                arcToRelative(8.026f, 8.026f, 0.0f, false, true, -1.785f, 2.774f)
                lineToRelative(-3.314f, 3.252f)
                arcToRelative(3.324f, 3.324f, 0.0f, false, true, -4.682f, 0.0f)
                lineTo(6.355f, 13.807f)
                arcTo(8.118f, 8.118f, 0.0f, false, true, 4.6f, 11.126f)
                arcToRelative(2.371f, 2.371f, 0.0f, false, false, -0.818f, 0.508f)
                arcTo(2.545f, 2.545f, 0.0f, false, false, 3.0f, 13.5f)
                verticalLineToRelative(4.075f)
                arcToRelative(2.487f, 2.487f, 0.0f, false, false, 1.7f, 2.409f)
                lineToRelative(2.776f, 0.908f)
                arcToRelative(2.155f, 2.155f, 0.0f, false, false, 1.272f, 0.023f)
                lineToRelative(5.511f, -1.708f)
                arcToRelative(5.158f, 5.158f, 0.0f, false, true, 2.937f, 0.015f)
                lineTo(19.383f, 20.0f)
                arcToRelative(1.256f, 1.256f, 0.0f, false, false, 1.038f, -0.249f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 21.0f, 18.522f)
                close()
            }
        }
        .build()
        return _mapMarker!!
    }

private var _mapMarker: ImageVector? = null
