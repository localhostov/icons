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

public val Icons.Bold.Shrimp: ImageVector
    get() {
        if (_shrimp != null) {
            return _shrimp!!
        }
        _shrimp = Builder(name = "Shrimp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                curveToRelative(-2.058f, 0.0f, -5.691f, 1.977f, -7.0f, 3.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.534f, -1.8f)
                arcTo(5.227f, 5.227f, 0.0f, false, true, 8.0f, 15.314f)
                curveToRelative(0.0f, -0.129f, 0.021f, -0.252f, 0.033f, -0.377f)
                arcTo(5.659f, 5.659f, 0.0f, false, false, 11.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcToRelative(2.45f, 2.45f, 0.0f, false, true, -2.183f, -0.979f)
                arcToRelative(6.821f, 6.821f, 0.0f, false, true, 5.0f, -2.021f)
                verticalLineTo(9.994f)
                arcTo(7.947f, 7.947f, 0.0f, false, false, 21.886f, 3.0f)
                horizontalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(12.863f)
                curveTo(5.771f, 0.0f, 0.121f, 5.169f, 0.0f, 11.767f)
                arcToRelative(11.729f, 11.729f, 0.0f, false, false, 3.343f, 8.509f)
                arcTo(12.68f, 12.68f, 0.0f, false, false, 12.5f, 24.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(13.092f, 3.0f)
                arcTo(1.483f, 1.483f, 0.0f, false, false, 13.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(1.483f, 1.483f, 0.0f, false, false, -0.092f, -0.5f)
                horizontalLineToRelative(2.925f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 14.0f, 7.0f)
                horizontalLineTo(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcTo(2.083f, 2.083f, 0.0f, false, true, 13.092f, 3.0f)
                close()
                moveTo(5.4f, 18.082f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, -2.28f, -7.472f)
                arcToRelative(5.153f, 5.153f, 0.0f, false, false, 2.4f, 2.01f)
                arcToRelative(8.115f, 8.115f, 0.0f, false, false, -0.514f, 2.605f)
                arcTo(8.562f, 8.562f, 0.0f, false, false, 5.4f, 18.082f)
                close()
                moveTo(5.0f, 6.466f)
                arcTo(9.291f, 9.291f, 0.0f, false, true, 8.1f, 4.059f)
                arcTo(5.029f, 5.029f, 0.0f, false, false, 8.0f, 5.0f)
                arcTo(4.963f, 4.963f, 0.0f, false, false, 9.271f, 8.3f)
                arcTo(8.79f, 8.79f, 0.0f, false, false, 7.165f, 9.956f)
                curveTo(5.585f, 9.733f, 5.0f, 7.974f, 5.0f, 6.466f)
                close()
            }
        }
        .build()
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
