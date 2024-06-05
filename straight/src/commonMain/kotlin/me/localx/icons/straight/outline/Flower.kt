package me.localx.icons.straight.outline

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

public val Icons.Outline.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, -4.828f, -3.7f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.721f, -8.353f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.2f, 3.6f)
                arcToRelative(5.014f, 5.014f, 0.0f, false, true, 9.6f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.749f, 8.349f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.828f, 20.3f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(9.057f, 17.115f)
                lineToRelative(-0.062f, 1.97f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 19.0f)
                curveToRelative(0.0f, 0.043f, -0.057f, -1.885f, -0.057f, -1.885f)
                lineToRelative(1.552f, 0.91f)
                arcToRelative(2.983f, 2.983f, 0.0f, true, false, 2.926f, -5.2f)
                lineToRelative(-1.614f, -0.878f)
                lineToRelative(1.614f, -0.879f)
                arcToRelative(2.982f, 2.982f, 0.0f, true, false, -2.918f, -5.2f)
                lineTo(15.0f, 6.743f)
                lineTo(15.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                lineTo(9.0f, 6.739f)
                lineTo(7.5f, 5.868f)
                arcToRelative(2.982f, 2.982f, 0.0f, true, false, -2.918f, 5.2f)
                lineToRelative(1.614f, 0.879f)
                lineToRelative(-1.614f, 0.878f)
                arcToRelative(2.983f, 2.983f, 0.0f, true, false, 2.926f, 5.2f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
