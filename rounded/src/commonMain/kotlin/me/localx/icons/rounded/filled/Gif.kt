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

public val Icons.Filled.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif = Builder(name = "Gif", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(4.54f)
                arcToRelative(6.957f, 6.957f, 0.0f, false, true, -1.591f, 2.465f)
                lineTo(20.465f, 21.95f)
                arcTo(6.977f, 6.977f, 0.0f, false, true, 18.0f, 23.54f)
                lineTo(18.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 18.0f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(24.0f, 15.515f)
                curveToRelative(0.0f, 0.163f, -0.013f, 0.324f, -0.024f, 0.485f)
                lineTo(19.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.976f)
                curveToRelative(-0.161f, 0.011f, -0.322f, 0.024f, -0.485f, 0.024f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 24.0f, 5.0f)
                close()
                moveTo(7.0f, 7.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 6.25f, 7.0f)
                lineTo(5.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.249f)
                verticalLineToRelative(0.084f)
                arcTo(0.759f, 0.759f, 0.0f, false, true, 5.0f, 8.819f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, -0.749f, -0.751f)
                lineTo(4.251f, 6.0f)
                arcTo(0.742f, 0.742f, 0.0f, false, true, 5.0f, 5.25f)
                arcToRelative(0.779f, 0.779f, 0.0f, false, true, 0.662f, 0.409f)
                arcToRelative(0.626f, 0.626f, 0.0f, true, false, 1.11f, -0.58f)
                arcTo(2.022f, 2.022f, 0.0f, false, false, 5.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                arcTo(1.991f, 1.991f, 0.0f, false, false, 3.0f, 5.985f)
                verticalLineToRelative(2.1f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, 2.0f, 1.985f)
                lineTo(5.0f, 10.07f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 8.084f)
                close()
                moveTo(10.0f, 4.625f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -1.25f, 0.0f)
                lineTo(8.75f, 9.444f)
                arcToRelative(0.625f, 0.625f, 0.0f, true, false, 1.25f, 0.0f)
                close()
                moveTo(13.0f, 6.388f)
                lineTo(13.0f, 5.25f)
                horizontalLineToRelative(1.388f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.0f, -1.25f)
                lineTo(12.375f, 4.0f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.625f, 0.625f)
                lineTo(11.75f, 9.436f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 1.25f, 0.0f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(1.239f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.0f, -1.25f)
                close()
            }
        }
        .build()
        return _gif!!
    }

private var _gif: ImageVector? = null
