package me.localx.icons.rounded.outline

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

public val Icons.Outline.LaughSquint: ImageVector
    get() {
        if (_laughSquint != null) {
            return _laughSquint!!
        }
        _laughSquint = Builder(name = "LaughSquint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.555f, 7.832f)
                lineTo(15.8f, 9.0f)
                lineToRelative(1.752f, 1.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.11f, 1.664f)
                lineToRelative(-3.0f, -2.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.0f, -1.664f)
                lineToRelative(3.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, 1.664f)
                close()
                moveTo(7.555f, 11.832f)
                lineTo(10.555f, 9.832f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.0f, -1.664f)
                lineToRelative(-3.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.11f, 1.664f)
                lineTo(8.2f, 9.0f)
                lineTo(6.445f, 10.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.11f, 1.664f)
                close()
                moveTo(15.99f, 14.0f)
                lineTo(8.009f, 14.0f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.955f, 1.3f)
                arcToRelative(5.178f, 5.178f, 0.0f, false, false, 9.9f, -0.007f)
                arcTo(0.994f, 0.994f, 0.0f, false, false, 15.99f, 14.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                curveToRelative(-13.248f, 0.5f, -13.245f, 19.5f, 0.0f, 20.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _laughSquint!!
    }

private var _laughSquint: ImageVector? = null
