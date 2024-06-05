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

public val Icons.Bold.CloudHailMixed: ImageVector
    get() {
        if (_cloudHailMixed != null) {
            return _cloudHailMixed!!
        }
        _cloudHailMixed = Builder(name = "CloudHailMixed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 20.0f)
                arcToRelative(1.532f, 1.532f, 0.0f, false, true, -0.365f, -0.045f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.091f, -1.819f)
                lineToRelative(1.0f, -4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.91f, 0.728f)
                lineToRelative(-1.0f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 20.0f)
                close()
                moveTo(19.076f, 19.885f)
                curveTo(26.03f, 16.9f, 25.44f, 6.489f, 17.812f, 4.923f)
                arcToRelative(0.441f, 0.441f, 0.0f, false, true, -0.325f, -0.242f)
                arcTo(8.238f, 8.238f, 0.0f, false, false, 8.558f, 0.141f)
                arcTo(8.125f, 8.125f, 0.0f, false, false, 2.025f, 6.793f)
                arcToRelative(8.289f, 8.289f, 0.0f, false, false, 0.034f, 2.952f)
                arcTo(0.428f, 0.428f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(5.824f, 5.824f, 0.0f, false, false, 0.769f, 9.148f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.668f, -2.492f)
                arcToRelative(2.805f, 2.805f, 0.0f, false, true, -0.418f, -4.437f)
                arcTo(3.416f, 3.416f, 0.0f, false, false, 5.0f, 9.173f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, true, -0.02f, -1.888f)
                arcToRelative(5.183f, 5.183f, 0.0f, false, true, 9.792f, -1.318f)
                arcToRelative(3.424f, 3.424f, 0.0f, false, false, 2.447f, 1.9f)
                curveToRelative(4.731f, 0.95f, 4.94f, 7.451f, 0.7f, 9.251f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.154f, 2.77f)
                close()
                moveTo(12.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 21.0f)
                close()
                moveTo(8.955f, 22.864f)
                lineToRelative(1.0f, -4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.91f, -0.728f)
                lineToRelative(-1.0f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.091f, 1.819f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 7.5f, 24.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.955f, 22.864f)
                close()
                moveTo(9.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 16.0f)
                close()
            }
        }
        .build()
        return _cloudHailMixed!!
    }

private var _cloudHailMixed: ImageVector? = null
