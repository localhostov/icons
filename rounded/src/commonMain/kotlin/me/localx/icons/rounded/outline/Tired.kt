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

public val Icons.Outline.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.789f, 17.976f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -4.793f, 0.976f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.052f, -1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, true, 5.842f, 3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.789f, 17.976f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(-1.249f, 21.5f, -1.244f, 2.5f, 12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(17.832f, 11.555f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.277f, -1.387f)
                lineTo(15.8f, 9.0f)
                lineToRelative(1.752f, -1.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.11f, -1.664f)
                lineToRelative(-3.0f, 2.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.0f, 1.664f)
                lineToRelative(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.387f, -0.277f)
                close()
                moveTo(7.555f, 11.832f)
                lineTo(10.555f, 9.832f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 0.0f, -1.664f)
                lineToRelative(-3.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.11f, 1.664f)
                lineTo(8.2f, 9.0f)
                lineTo(6.445f, 10.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.11f, 1.664f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null
