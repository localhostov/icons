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

public val Icons.Bold.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = Builder(name = "Rhombus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(5.324f, 5.324f, 0.0f, false, true, -3.777f, -1.561f)
                lineTo(1.565f, 15.777f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, true, 0.0f, -7.554f)
                lineTo(8.223f, 1.564f)
                arcToRelative(5.349f, 5.349f, 0.0f, false, true, 7.554f, 0.0f)
                lineToRelative(6.658f, 6.659f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, true, 0.0f, 7.554f)
                lineToRelative(-6.658f, 6.659f)
                arcTo(5.324f, 5.324f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(10.344f, 20.317f)
                arcToRelative(2.345f, 2.345f, 0.0f, false, false, 3.312f, 0.0f)
                lineToRelative(6.658f, -6.658f)
                arcToRelative(2.342f, 2.342f, 0.0f, false, false, 0.0f, -3.312f)
                lineTo(13.656f, 3.686f)
                arcToRelative(2.345f, 2.345f, 0.0f, false, false, -3.312f, 0.0f)
                lineTo(3.686f, 10.344f)
                arcToRelative(2.342f, 2.342f, 0.0f, false, false, 0.0f, 3.312f)
                close()
            }
        }
        .build()
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
