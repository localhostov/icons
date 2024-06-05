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

public val Icons.Bold.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.375f, 0.065f)
                curveTo(21.037f, 0.12f, 9.179f, 0.721f, 4.92f, 4.979f)
                arcTo(10.018f, 10.018f, 0.0f, false, false, 3.939f, 17.94f)
                lineTo(0.007f, 21.879f)
                lineTo(2.128f, 24.0f)
                lineTo(6.06f, 20.061f)
                arcToRelative(10.019f, 10.019f, 0.0f, false, false, 12.961f, -0.981f)
                curveToRelative(4.342f, -4.342f, 4.868f, -16.134f, 4.914f, -17.464f)
                lineTo(23.991f, 0.0f)
                close()
                moveTo(16.9f, 16.958f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -8.683f, 0.947f)
                lineToRelative(8.72f, -8.719f)
                lineTo(14.814f, 7.064f)
                lineTo(6.1f, 15.784f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 7.042f, 7.1f)
                curveToRelative(2.512f, -2.513f, 9.738f, -3.595f, 13.8f, -3.932f)
                curveTo(20.523f, 7.206f, 19.465f, 14.393f, 16.9f, 16.958f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
