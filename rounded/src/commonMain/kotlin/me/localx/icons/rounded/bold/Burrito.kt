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

public val Icons.Bold.Burrito: ImageVector
    get() {
        if (_burrito != null) {
            return _burrito!!
        }
        _burrito = Builder(name = "Burrito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, -1.136f, 0.224f)
                arcTo(4.031f, 4.031f, 0.0f, false, false, 12.0f, 0.545f)
                arcToRelative(3.962f, 3.962f, 0.0f, false, false, -4.868f, 0.678f)
                arcTo(2.959f, 2.959f, 0.0f, false, false, 6.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 4.0f)
                arcTo(3.682f, 3.682f, 0.0f, false, false, 4.0f, 6.467f)
                lineTo(4.0f, 18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 9.5f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 20.0f, 18.536f)
                lineTo(20.0f, 6.467f)
                arcTo(3.682f, 3.682f, 0.0f, false, false, 21.0f, 4.0f)
                close()
                moveTo(11.684f, 3.241f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.9f, 2.287f)
                arcToRelative(9.077f, 9.077f, 0.0f, false, false, -1.4f, 1.061f)
                arcTo(16.562f, 16.562f, 0.0f, false, false, 9.506f, 5.01f)
                arcTo(17.2f, 17.2f, 0.0f, false, true, 11.684f, 3.241f)
                close()
                moveTo(14.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.0f, 18.5f)
                lineTo(7.0f, 7.251f)
                curveToRelative(3.674f, 1.123f, 8.878f, 5.864f, 10.0f, 11.378f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 21.0f)
                close()
                moveTo(17.0f, 11.466f)
                arcToRelative(21.219f, 21.219f, 0.0f, false, false, -2.5f, -2.923f)
                arcToRelative(7.611f, 7.611f, 0.0f, false, true, 2.5f, -1.3f)
                close()
                moveTo(12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
                close()
                moveTo(12.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 13.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 17.5f)
                close()
            }
        }
        .build()
        return _burrito!!
    }

private var _burrito: ImageVector? = null
