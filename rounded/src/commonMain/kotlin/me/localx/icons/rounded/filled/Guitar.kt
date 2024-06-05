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

public val Icons.Filled.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, -1.707f)
                lineToRelative(2.966f, -2.966f)
                arcToRelative(5.894f, 5.894f, 0.0f, false, false, -7.7f, 0.232f)
                arcToRelative(4.933f, 4.933f, 0.0f, false, false, -0.445f, 0.508f)
                arcToRelative(2.283f, 2.283f, 0.0f, false, true, -1.554f, 0.959f)
                arcToRelative(7.055f, 7.055f, 0.0f, false, false, -4.5f, 2.038f)
                curveToRelative(-2.956f, 2.957f, -2.7f, 8.025f, 0.575f, 11.3f)
                arcTo(8.8f, 8.8f, 0.0f, false, false, 8.814f, 24.0f)
                arcToRelative(7.164f, 7.164f, 0.0f, false, false, 5.122f, -2.059f)
                arcToRelative(7.055f, 7.055f, 0.0f, false, false, 2.038f, -4.5f)
                arcToRelative(2.283f, 2.283f, 0.0f, false, true, 0.959f, -1.554f)
                arcToRelative(4.933f, 4.933f, 0.0f, false, false, 0.508f, -0.445f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.232f, -7.7f)
                lineToRelative(-2.966f, 2.966f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 11.0f)
                close()
                moveTo(7.707f, 19.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(2.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.707f, 19.707f)
                close()
                moveTo(10.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 17.0f)
                close()
                moveTo(11.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 14.0f)
                close()
                moveTo(23.482f, 3.018f)
                lineToRelative(-0.214f, 0.214f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, -2.62f, 1.534f)
                lineTo(17.673f, 7.741f)
                arcToRelative(6.737f, 6.737f, 0.0f, false, false, -0.642f, -0.772f)
                arcToRelative(6.737f, 6.737f, 0.0f, false, false, -0.772f, -0.642f)
                lineToRelative(2.975f, -2.975f)
                arcTo(6.035f, 6.035f, 0.0f, false, true, 20.768f, 0.732f)
                lineToRelative(0.214f, -0.214f)
                arcToRelative(1.768f, 1.768f, 0.0f, false, true, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
