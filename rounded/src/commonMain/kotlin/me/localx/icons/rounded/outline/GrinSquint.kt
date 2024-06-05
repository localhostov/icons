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

public val Icons.Outline.GrinSquint: ImageVector
    get() {
        if (_grinSquint != null) {
            return _grinSquint!!
        }
        _grinSquint = Builder(name = "GrinSquint", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(6.168f, 11.555f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.387f, 0.277f)
                lineToRelative(3.0f, -2.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.0f, -1.664f)
                lineToRelative(-3.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.11f, 1.664f)
                lineTo(8.2f, 9.0f)
                lineTo(6.445f, 10.168f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.168f, 11.555f)
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
                moveTo(16.789f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.789f, 14.024f)
                close()
            }
        }
        .build()
        return _grinSquint!!
    }

private var _grinSquint: ImageVector? = null
