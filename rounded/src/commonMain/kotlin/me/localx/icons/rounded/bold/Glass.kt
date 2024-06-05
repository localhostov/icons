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

public val Icons.Bold.Glass: ImageVector
    get() {
        if (_glass != null) {
            return _glass!!
        }
        _glass = Builder(name = "Glass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.44f, 1.552f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 18.041f, 0.0f)
                lineTo(5.959f, 0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 1.5f, 5.136f)
                lineTo(3.77f, 21.0f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, 3.464f, 3.0f)
                horizontalLineToRelative(9.532f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, 3.464f, -3.0f)
                lineTo(22.5f, 5.137f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 21.44f, 1.552f)
                close()
                moveTo(19.526f, 4.712f)
                lineTo(17.26f, 20.571f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.494f, 0.429f)
                lineTo(7.234f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.494f, -0.429f)
                lineTo(5.372f, 11.0f)
                lineTo(15.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(4.944f, 8.0f)
                lineToRelative(-0.47f, -3.288f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.959f, 3.0f)
                lineTo(18.041f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.485f, 1.712f)
                close()
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null
