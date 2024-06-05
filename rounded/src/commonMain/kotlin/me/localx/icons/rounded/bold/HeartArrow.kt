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

public val Icons.Bold.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.293f, 17.714f)
                lineToRelative(-1.229f, 1.229f)
                lineToRelative(-2.315f, -2.315f)
                curveTo(20.853f, 14.2f, 22.0f, 11.885f, 22.0f, 9.9f)
                arcTo(5.717f, 5.717f, 0.0f, false, false, 16.5f, 4.0f)
                arcToRelative(5.321f, 5.321f, 0.0f, false, false, -4.0f, 1.854f)
                arcTo(5.318f, 5.318f, 0.0f, false, false, 8.5f, 4.0f)
                arcToRelative(5.146f, 5.146f, 0.0f, false, false, -1.978f, 0.4f)
                lineTo(2.561f, 0.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.439f, 2.561f)
                lineTo(4.163f, 6.284f)
                arcTo(6.141f, 6.141f, 0.0f, false, false, 3.0f, 9.9f)
                curveToRelative(0.0f, 2.885f, 2.371f, 6.462f, 6.676f, 10.072f)
                arcToRelative(4.39f, 4.39f, 0.0f, false, false, 5.648f, 0.0f)
                curveToRelative(0.473f, -0.4f, 0.913f, -0.792f, 1.339f, -1.187f)
                lineToRelative(2.28f, 2.28f)
                lineToRelative(-1.229f, 1.229f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.423f, 24.0f)
                lineTo(23.0f, 23.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(24.0f, 18.421f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.293f, 17.714f)
                close()
                moveTo(13.393f, 17.672f)
                arcToRelative(1.414f, 1.414f, 0.0f, false, true, -1.792f, 0.0f)
                curveTo(7.472f, 14.208f, 6.0f, 11.386f, 6.0f, 9.9f)
                arcTo(2.726f, 2.726f, 0.0f, false, true, 8.5f, 7.0f)
                arcTo(2.726f, 2.726f, 0.0f, false, true, 11.0f, 9.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                arcTo(2.725f, 2.725f, 0.0f, false, true, 16.5f, 7.0f)
                arcTo(2.725f, 2.725f, 0.0f, false, true, 19.0f, 9.9f)
                curveTo(19.0f, 11.386f, 17.528f, 14.208f, 13.4f, 17.672f)
                close()
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
