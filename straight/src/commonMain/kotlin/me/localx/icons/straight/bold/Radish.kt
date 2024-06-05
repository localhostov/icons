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

public val Icons.Bold.Radish: ImageVector
    get() {
        if (_radish != null) {
            return _radish!!
        }
        _radish = Builder(name = "Radish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.26f, 9.766f)
                arcToRelative(13.17f, 13.17f, 0.0f, false, false, 2.356f, -1.688f)
                arcToRelative(4.729f, 4.729f, 0.0f, false, false, -6.689f, -6.687f)
                arcToRelative(13.141f, 13.141f, 0.0f, false, false, -1.689f, 2.355f)
                arcTo(2.618f, 2.618f, 0.0f, false, false, 9.014f, 3.4f)
                curveToRelative(-0.164f, 1.876f, 1.137f, 3.555f, 1.429f, 7.16f)
                arcTo(7.592f, 7.592f, 0.0f, false, false, 6.067f, 9.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -4.442f, 1.97f)
                curveTo(0.1f, 12.517f, 0.056f, 14.831f, 0.019f, 17.069f)
                lineTo(0.0f, 23.994f)
                lineToRelative(7.725f, 0.012f)
                curveToRelative(2.0f, 0.0f, 3.974f, -0.149f, 5.337f, -1.524f)
                curveToRelative(2.489f, -2.514f, 2.565f, -5.828f, 0.337f, -8.959f)
                curveToRelative(3.925f, 0.2f, 5.239f, 1.636f, 7.207f, 1.464f)
                arcToRelative(2.617f, 2.617f, 0.0f, false, false, -0.349f, -5.221f)
                close()
                moveTo(18.048f, 3.511f)
                arcTo(1.73f, 1.73f, 0.0f, true, true, 20.5f, 5.958f)
                arcTo(30.98f, 30.98f, 0.0f, false, true, 14.623f, 9.38f)
                arcTo(31.0f, 31.0f, 0.0f, false, true, 18.048f, 3.511f)
                close()
                moveTo(10.933f, 20.373f)
                curveToRelative(-0.658f, 0.663f, -2.358f, 0.645f, -4.0f, 0.628f)
                lineTo(3.0f, 21.0f)
                lineToRelative(0.016f, -3.877f)
                curveToRelative(0.029f, -1.722f, 0.055f, -3.347f, 0.739f, -4.038f)
                arcTo(3.185f, 3.185f, 0.0f, false, true, 6.067f, 12.0f)
                arcTo(5.351f, 5.351f, 0.0f, false, true, 9.4f, 13.546f)
                lineToRelative(1.053f, 1.06f)
                curveTo(11.7f, 16.055f, 12.947f, 18.338f, 10.933f, 20.373f)
                close()
            }
        }
        .build()
        return _radish!!
    }

private var _radish: ImageVector? = null
