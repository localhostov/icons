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

public val Icons.Bold.Picnic: ImageVector
    get() {
        if (_picnic != null) {
            return _picnic!!
        }
        _picnic = Builder(name = "Picnic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.118f, 8.0f)
                lineTo(0.143f, 8.0f)
                lineToRelative(1.91f, 13.008f)
                arcTo(3.519f, 3.519f, 0.0f, false, false, 5.516f, 24.0f)
                lineTo(18.627f, 24.0f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, false, 3.462f, -2.992f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(12.059f, 3.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.909f, 5.0f)
                lineTo(6.149f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.059f, 3.0f)
                close()
                moveTo(19.122f, 20.572f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.428f)
                lineTo(5.516f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.428f)
                lineTo(3.615f, 11.0f)
                lineTo(9.059f, 11.0f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(5.5f, -5.5f)
                horizontalLineToRelative(0.469f)
                close()
            }
        }
        .build()
        return _picnic!!
    }

private var _picnic: ImageVector? = null
