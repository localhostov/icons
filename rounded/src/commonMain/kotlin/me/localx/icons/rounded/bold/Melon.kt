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

public val Icons.Bold.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.388f, 2.516f)
                arcTo(4.568f, 4.568f, 0.0f, false, false, 19.0f, 0.062f)
                arcToRelative(4.705f, 4.705f, 0.0f, false, false, -4.044f, 1.313f)
                lineTo(1.375f, 14.953f)
                arcTo(4.7f, 4.7f, 0.0f, false, false, 0.063f, 19.0f)
                arcToRelative(4.563f, 4.563f, 0.0f, false, false, 2.454f, 3.391f)
                arcTo(14.777f, 14.777f, 0.0f, false, false, 22.388f, 2.516f)
                close()
                moveTo(17.548f, 17.549f)
                arcTo(11.745f, 11.745f, 0.0f, false, true, 3.879f, 19.718f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -0.854f, -1.188f)
                arcTo(1.671f, 1.671f, 0.0f, false, true, 3.5f, 17.073f)
                lineTo(6.21f, 14.358f)
                arcToRelative(6.08f, 6.08f, 0.0f, false, false, 8.149f, -8.149f)
                lineTo(17.073f, 3.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.674f, 1.674f, 0.0f, false, true, 1.456f, -0.47f)
                arcToRelative(1.591f, 1.591f, 0.0f, false, true, 1.187f, 0.854f)
                arcTo(11.742f, 11.742f, 0.0f, false, true, 17.548f, 17.549f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
