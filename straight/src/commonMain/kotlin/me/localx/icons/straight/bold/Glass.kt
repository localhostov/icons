package me.localx.icons.straight.bold

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
                moveTo(0.771f, 0.0f)
                lineToRelative(3.0f, 21.0f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, 3.464f, 3.0f)
                horizontalLineToRelative(9.532f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, 3.464f, -3.0f)
                lineTo(23.229f, 0.0f)
                close()
                moveTo(17.26f, 20.571f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.494f, 0.429f)
                horizontalLineTo(7.234f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.494f, -0.429f)
                lineTo(5.372f, 11.0f)
                horizontalLineToRelative(11.1f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(4.944f)
                lineTo(4.229f, 3.0f)
                horizontalLineTo(19.771f)
                close()
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null
