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

public val Icons.Outline.Bahai: ImageVector
    get() {
        if (_bahai != null) {
            return _bahai!!
        }
        _bahai = Builder(name = "Bahai", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.179f, 23.77f)
                lineToRelative(-4.17f, -3.33f)
                lineToRelative(-4.171f, 3.33f)
                lineToRelative(-1.055f, -5.231f)
                lineToRelative(-5.335f, -0.131f)
                lineToRelative(2.555f, -4.686f)
                lineTo(-0.002f, 10.192f)
                lineToRelative(4.97f, -1.947f)
                lineToRelative(-0.798f, -5.276f)
                lineToRelative(5.059f, 1.701f)
                lineTo(12.009f, 0.115f)
                lineToRelative(2.78f, 4.555f)
                lineToRelative(5.059f, -1.701f)
                lineToRelative(-0.798f, 5.276f)
                lineToRelative(4.97f, 1.947f)
                lineToRelative(-4.004f, 3.529f)
                lineToRelative(2.555f, 4.686f)
                lineToRelative(-5.335f, 0.131f)
                lineToRelative(-1.055f, 5.231f)
                close()
                moveTo(4.771f, 16.488f)
                lineToRelative(3.656f, 0.09f)
                lineToRelative(0.723f, 3.585f)
                lineToRelative(2.858f, -2.281f)
                lineToRelative(2.858f, 2.281f)
                lineToRelative(0.723f, -3.585f)
                lineToRelative(3.656f, -0.09f)
                lineToRelative(-1.751f, -3.211f)
                lineToRelative(2.743f, -2.418f)
                lineToRelative(-3.404f, -1.334f)
                lineToRelative(0.546f, -3.616f)
                lineToRelative(-3.466f, 1.166f)
                lineToRelative(-1.905f, -3.121f)
                lineToRelative(-1.906f, 3.121f)
                lineToRelative(-3.466f, -1.166f)
                lineToRelative(0.546f, 3.616f)
                lineToRelative(-3.404f, 1.334f)
                lineToRelative(2.743f, 2.418f)
                lineToRelative(-1.751f, 3.211f)
                close()
            }
        }
        .build()
        return _bahai!!
    }

private var _bahai: ImageVector? = null
