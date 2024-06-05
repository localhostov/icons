package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Raindrops: ImageVector
    get() {
        if (_raindrops != null) {
            return _raindrops!!
        }
        _raindrops = Builder(name = "Raindrops", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.56f, 1.2f, -4.045f, 3.552f, -7.388f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, 4.9f, 0.0f)
                curveTo(17.805f, 13.955f, 19.0f, 16.44f, 19.0f, 18.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 13.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 0.0f, 6.0f)
                curveToRelative(0.0f, -1.26f, 0.842f, -2.855f, 2.574f, -4.877f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 4.852f, 0.0f)
                curveTo(9.158f, 3.143f, 10.0f, 4.738f, 10.0f, 6.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 9.964f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, -4.5f)
                curveToRelative(0.0f, -1.091f, 0.7f, -2.506f, 2.146f, -4.326f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, true, 4.708f, 0.0f)
                curveTo(23.3f, 2.958f, 24.0f, 4.373f, 24.0f, 5.464f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 19.5f, 9.964f)
                close()
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
