package me.localx.icons.rounded.outline

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

public val Icons.Outline.Raindrops: ImageVector
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
                moveTo(13.0f, 11.343f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.813f, 0.422f)
                curveTo(9.311f, 15.844f, 9.0f, 17.484f, 9.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                curveToRelative(0.0f, -0.516f, -0.311f, -2.156f, -3.187f, -6.235f)
                arcTo(0.98f, 0.98f, 0.0f, false, false, 13.0f, 11.343f)
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
                moveTo(5.0f, 2.0f)
                arcToRelative(1.173f, 1.173f, 0.0f, false, false, -0.906f, 0.421f)
                curveTo(2.151f, 4.689f, 2.0f, 5.732f, 2.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 6.0f)
                curveToRelative(0.0f, -0.266f, -0.151f, -1.309f, -2.094f, -3.576f)
                arcTo(1.171f, 1.171f, 0.0f, false, false, 5.0f, 2.0f)
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
                moveTo(19.5f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.787f, 0.381f)
                curveTo(17.123f, 4.385f, 17.0f, 5.247f, 17.0f, 5.464f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -0.217f, -0.123f, -1.079f, -1.713f, -3.082f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.5f, 2.0f)
                close()
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
