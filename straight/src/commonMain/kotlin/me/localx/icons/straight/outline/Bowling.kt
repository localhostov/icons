package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Bowling: ImageVector
    get() {
        if (_bowling != null) {
            return _bowling!!
        }
        _bowling = Builder(name = "Bowling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(19.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 15.0f)
                close()
                moveTo(17.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 12.0f)
                close()
                moveTo(24.0f, 16.0f)
                arcToRelative(7.991f, 7.991f, 0.0f, false, true, -13.183f, 6.083f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -1.11f, 1.624f)
                lineTo(9.414f, 24.0f)
                lineTo(2.586f, 24.0f)
                lineToRelative(-0.293f, -0.293f)
                arcTo(9.732f, 9.732f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(11.781f, 11.781f, 0.0f, false, true, 1.736f, -5.463f)
                arcTo(8.441f, 8.441f, 0.0f, false, false, 3.0f, 8.0f)
                arcToRelative(11.618f, 11.618f, 0.0f, false, false, -0.554f, -2.175f)
                arcTo(7.168f, 7.168f, 0.0f, false, true, 2.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(7.168f, 7.168f, 0.0f, false, true, -0.446f, 1.825f)
                arcTo(11.618f, 11.618f, 0.0f, false, false, 9.0f, 8.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 0.907f, 2.839f)
                arcTo(7.987f, 7.987f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(4.0f, 4.0f)
                curveToRelative(0.016f, 0.15f, 0.211f, 0.772f, 0.354f, 1.226f)
                arcTo(10.708f, 10.708f, 0.0f, false, true, 5.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                arcToRelative(10.708f, 10.708f, 0.0f, false, true, 0.646f, -2.774f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 8.0f, 3.973f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
                moveTo(10.0f, 17.0f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -1.512f, -4.542f)
                arcTo(18.393f, 18.393f, 0.0f, false, true, 7.368f, 10.0f)
                lineTo(4.632f, 10.0f)
                arcToRelative(18.393f, 18.393f, 0.0f, false, true, -1.12f, 2.458f)
                arcTo(10.1f, 10.1f, 0.0f, false, false, 2.0f, 17.0f)
                arcToRelative(8.309f, 8.309f, 0.0f, false, false, 1.466f, 5.0f)
                lineTo(8.535f, 22.0f)
                arcTo(8.308f, 8.308f, 0.0f, false, false, 10.0f, 17.0f)
                close()
                moveTo(22.0f, 16.0f)
                arcToRelative(5.991f, 5.991f, 0.0f, false, false, -11.084f, -3.163f)
                arcTo(9.656f, 9.656f, 0.0f, false, true, 12.0f, 17.0f)
                arcToRelative(11.557f, 11.557f, 0.0f, false, true, -0.4f, 3.064f)
                arcTo(5.993f, 5.993f, 0.0f, false, false, 22.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bowling!!
    }

private var _bowling: ImageVector? = null
