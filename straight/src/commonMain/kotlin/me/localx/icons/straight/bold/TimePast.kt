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

public val Icons.Bold.TimePast: ImageVector
    get() {
        if (_timePast != null) {
            return _timePast!!
        }
        _timePast = Builder(name = "TimePast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.032f, 12.032f, 0.0f, false, false, 3.529f, 3.529f)
                lineTo(1.0f, 1.0f)
                verticalLineTo(6.909f)
                arcTo(1.09f, 1.09f, 0.0f, false, false, 2.091f, 8.0f)
                horizontalLineTo(8.0f)
                lineTo(5.647f, 5.647f)
                arcTo(8.985f, 8.985f, 0.0f, true, true, 3.0f, 12.0f)
                horizontalLineTo(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                lineToRelative(0.0f, 6.621f)
                lineToRelative(3.439f, 3.44f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-2.561f, -2.56f)
                lineToRelative(0.0f, -5.379f)
                lineToRelative(-3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _timePast!!
    }

private var _timePast: ImageVector? = null
