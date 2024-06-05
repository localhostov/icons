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

public val Icons.Filled.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.787f, 20.656f)
                arcTo(3.789f, 3.789f, 0.0f, false, true, 0.0f, 16.87f)
                verticalLineTo(7.13f)
                arcTo(3.783f, 3.783f, 0.0f, false, true, 6.021f, 4.079f)
                lineTo(9.8f, 6.853f)
                arcToRelative(3.783f, 3.783f, 0.0f, false, true, 6.01f, -2.774f)
                lineToRelative(6.641f, 4.87f)
                arcToRelative(3.784f, 3.784f, 0.0f, false, true, 0.0f, 6.1f)
                lineToRelative(-6.641f, 4.87f)
                arcTo(3.783f, 3.783f, 0.0f, false, true, 9.8f, 17.147f)
                lineTo(6.021f, 19.921f)
                arcTo(3.775f, 3.775f, 0.0f, false, true, 3.787f, 20.656f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
