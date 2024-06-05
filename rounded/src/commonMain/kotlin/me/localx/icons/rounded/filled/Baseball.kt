package me.localx.icons.rounded.filled

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

public val Icons.Filled.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, -2.9f, 7.805f)
                arcToRelative(9.508f, 9.508f, 0.0f, false, true, -3.383f, -4.213f)
                lineToRelative(1.658f, -0.663f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.742f, -1.858f)
                lineToRelative(-1.466f, 0.587f)
                arcToRelative(9.421f, 9.421f, 0.0f, false, true, -0.167f, -1.658f)
                arcToRelative(9.421f, 9.421f, 0.0f, false, true, 0.163f, -1.658f)
                lineToRelative(1.466f, 0.587f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.742f, -1.858f)
                lineToRelative(-1.658f, -0.663f)
                arcToRelative(9.508f, 9.508f, 0.0f, false, true, 3.387f, -4.208f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, 2.9f, 7.8f)
                close()
                moveTo(15.857f, 16.334f)
                lineTo(14.371f, 16.929f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.742f, -1.858f)
                lineToRelative(1.644f, -0.657f)
                arcToRelative(11.545f, 11.545f, 0.0f, false, true, -0.273f, -2.414f)
                arcToRelative(11.545f, 11.545f, 0.0f, false, true, 0.273f, -2.414f)
                lineToRelative(-1.644f, -0.657f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.742f, -1.858f)
                lineToRelative(1.486f, 0.6f)
                arcToRelative(11.466f, 11.466f, 0.0f, false, true, 3.808f, -4.889f)
                arcToRelative(11.97f, 11.97f, 0.0f, false, false, -15.313f, -0.021f)
                arcToRelative(11.544f, 11.544f, 0.0f, false, true, 3.8f, 4.9f)
                lineToRelative(1.481f, -0.593f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.742f, 1.858f)
                lineToRelative(-1.643f, 0.657f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 0.268f, 2.417f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -0.272f, 2.414f)
                lineToRelative(1.643f, 0.657f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.742f, 1.858f)
                lineToRelative(-1.481f, -0.593f)
                arcToRelative(11.544f, 11.544f, 0.0f, false, true, -3.8f, 4.9f)
                arcToRelative(11.97f, 11.97f, 0.0f, false, false, 15.313f, -0.016f)
                arcToRelative(11.466f, 11.466f, 0.0f, false, true, -3.804f, -4.886f)
                close()
                moveTo(6.291f, 15.594f)
                lineTo(4.629f, 14.929f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.742f, -1.858f)
                lineToRelative(1.467f, 0.587f)
                arcToRelative(9.516f, 9.516f, 0.0f, false, false, 0.162f, -1.658f)
                arcToRelative(9.516f, 9.516f, 0.0f, false, false, -0.162f, -1.658f)
                lineToRelative(-1.467f, 0.587f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.742f, -1.858f)
                lineToRelative(1.662f, -0.665f)
                arcToRelative(9.547f, 9.547f, 0.0f, false, false, -3.372f, -4.227f)
                arcToRelative(11.937f, 11.937f, 0.0f, false, false, 0.0f, 15.642f)
                arcToRelative(9.547f, 9.547f, 0.0f, false, false, 3.372f, -4.227f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
