package me.localx.icons.straight.filled

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

public val Icons.Filled.Grape: ImageVector
    get() {
        if (_grape != null) {
            return _grape!!
        }
        _grape = Builder(name = "Grape", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.553f, 1.9f)
                lineTo(9.447f, 0.105f)
                arcTo(5.871f, 5.871f, 0.0f, false, true, 12.01f, 2.562f)
                arcTo(4.771f, 4.771f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineToRelative(0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                curveToRelative(-0.029f, 0.0f, -2.664f, 0.055f, -2.969f, 4.193f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.063f, 0.0f)
                curveTo(10.813f, 4.043f, 10.022f, 2.629f, 8.553f, 1.9f)
                close()
                moveTo(8.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 9.0f)
                close()
                moveTo(19.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 6.0f)
                close()
                moveTo(11.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 15.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _grape!!
    }

private var _grape: ImageVector? = null
