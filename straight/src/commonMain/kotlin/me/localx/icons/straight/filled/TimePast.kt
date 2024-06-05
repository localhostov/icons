package me.localx.icons.straight.filled

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

public val Icons.Filled.TimePast: ImageVector
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
                arcTo(12.043f, 12.043f, 0.0f, false, false, 4.0f, 3.06f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.143f)
                arcTo(1.859f, 1.859f, 0.0f, false, false, 3.857f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.86f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 2.0f, 12.0f)
                horizontalLineTo(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                lineToRelative(0.0f, 5.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.707f, -2.707f)
                lineToRelative(0.0f, -4.586f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _timePast!!
    }

private var _timePast: ImageVector? = null
