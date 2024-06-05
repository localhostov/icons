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

public val Icons.Bold.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif = Builder(name = "Gif", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 0.0f)
                lineTo(4.5f, 0.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 24.0f)
                lineTo(15.843f, 24.0f)
                arcToRelative(5.462f, 5.462f, 0.0f, false, false, 3.889f, -1.611f)
                lineToRelative(2.657f, -2.657f)
                arcTo(5.462f, 5.462f, 0.0f, false, false, 24.0f, 15.843f)
                lineTo(24.0f, 4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 0.0f)
                close()
                moveTo(12.75f, 3.125f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 0.625f, -0.625f)
                horizontalLineToRelative(2.013f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 0.0f, 1.25f)
                lineTo(14.0f, 3.75f)
                lineTo(14.0f, 4.888f)
                horizontalLineToRelative(1.239f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 0.0f, 1.25f)
                lineTo(14.0f, 6.138f)
                verticalLineToRelative(1.8f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, -1.25f, 0.0f)
                close()
                moveTo(9.75f, 3.125f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 1.25f, 0.0f)
                lineTo(11.0f, 7.944f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, -1.25f, 0.0f)
                close()
                moveTo(4.0f, 4.485f)
                arcTo(1.991f, 1.991f, 0.0f, false, true, 6.0f, 2.5f)
                lineTo(6.0f, 2.5f)
                arcTo(2.022f, 2.022f, 0.0f, false, true, 7.772f, 3.579f)
                arcToRelative(0.626f, 0.626f, 0.0f, true, true, -1.11f, 0.58f)
                arcTo(0.779f, 0.779f, 0.0f, false, false, 6.0f, 3.75f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, false, -0.749f, 0.751f)
                lineTo(5.251f, 6.568f)
                arcTo(0.742f, 0.742f, 0.0f, false, false, 6.0f, 7.319f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, false, 0.75f, -0.735f)
                lineTo(6.75f, 6.5f)
                lineTo(6.5f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 6.25f)
                verticalLineToRelative(0.334f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 8.568f)
                lineTo(6.0f, 8.568f)
                arcTo(1.991f, 1.991f, 0.0f, false, true, 4.0f, 6.584f)
                close()
                moveTo(3.0f, 19.5f)
                lineTo(3.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                verticalLineToRelative(4.0f)
                lineTo(17.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 19.5f)
                close()
            }
        }
        .build()
        return _gif!!
    }

private var _gif: ImageVector? = null
