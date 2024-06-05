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

public val Icons.Filled.AppleWhole: ImageVector
    get() {
        if (_appleWhole != null) {
            return _appleWhole!!
        }
        _appleWhole = Builder(name = "AppleWhole", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.923f, 7.284f)
                arcToRelative(1.549f, 1.549f, 0.0f, false, false, -1.949f, 0.152f)
                arcToRelative(8.172f, 8.172f, 0.0f, false, true, -4.0f, 1.559f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 8.0f)
                verticalLineTo(6.965f)
                arcToRelative(5.978f, 5.978f, 0.0f, false, false, 5.991f, -5.648f)
                arcTo(1.173f, 1.173f, 0.0f, false, false, 17.683f, 0.009f)
                curveToRelative(-1.855f, 0.077f, -4.583f, 1.52f, -5.151f, 3.7f)
                arcTo(8.714f, 8.714f, 0.0f, false, false, 10.711f, 0.271f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.428f, 1.4f)
                arcTo(7.542f, 7.542f, 0.0f, false, true, 10.949f, 6.0f)
                horizontalLineTo(8.5f)
                arcTo(8.771f, 8.771f, 0.0f, false, false, 0.0f, 15.0f)
                curveToRelative(-0.161f, 5.6f, 5.644f, 10.773f, 10.75f, 8.385f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.605f, 0.019f)
                arcTo(4.444f, 4.444f, 0.0f, false, false, 15.5f, 24.0f)
                curveTo(24.213f, 23.922f, 27.064f, 11.874f, 19.923f, 7.284f)
                close()
            }
        }
        .build()
        return _appleWhole!!
    }

private var _appleWhole: ImageVector? = null
