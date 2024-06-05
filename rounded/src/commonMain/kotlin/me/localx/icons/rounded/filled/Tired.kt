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

public val Icons.Filled.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(13.445f, 8.168f)
                lineTo(16.445f, 6.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, 1.664f)
                lineTo(15.8f, 9.0f)
                lineToRelative(1.752f, 1.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.11f, 1.664f)
                lineToRelative(-3.0f, -2.0f)
                arcTo(1.007f, 1.007f, 0.0f, false, true, 13.445f, 8.168f)
                close()
                moveTo(6.445f, 7.832f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, -1.664f)
                lineToRelative(3.0f, 2.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.0f, 1.664f)
                lineToRelative(-3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.11f, -1.664f)
                lineTo(8.2f, 9.0f)
                close()
                moveTo(16.789f, 17.976f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -4.793f, 0.976f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.052f, -1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, true, 5.842f, 3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.789f, 17.976f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null
