package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Opacity: ImageVector
    get() {
        if (_opacity != null) {
            return _opacity!!
        }
        _opacity = Builder(name = "Opacity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 8.613f, 0.485f)
                lineToRelative(0.846f, 2.878f)
                arcTo(9.007f, 9.007f, 0.0f, false, true, 12.0f, 3.0f)
                verticalLineTo(21.0f)
                arcToRelative(9.007f, 9.007f, 0.0f, false, true, -2.541f, -0.363f)
                lineToRelative(-0.846f, 2.878f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                arcToRelative(9.108f, 9.108f, 0.0f, false, true, 0.292f, -2.288f)
                lineTo(0.39f, 8.954f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, 0.0f, 6.1f)
                lineToRelative(2.9f, -0.761f)
                arcTo(9.033f, 9.033f, 0.0f, false, true, 3.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.347f, 4.3f)
                lineTo(5.793f, 1.729f)
                arcTo(12.076f, 12.076f, 0.0f, false, false, 1.547f, 6.1f)
                lineTo(4.159f, 7.579f)
                arcTo(9.05f, 9.05f, 0.0f, false, true, 7.347f, 4.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.161f, 16.424f)
                lineTo(1.549f, 17.9f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 5.8f, 22.273f)
                lineToRelative(1.553f, -2.566f)
                arcTo(9.048f, 9.048f, 0.0f, false, true, 4.161f, 16.424f)
                close()
            }
        }
        .build()
        return _opacity!!
    }

private var _opacity: ImageVector? = null
