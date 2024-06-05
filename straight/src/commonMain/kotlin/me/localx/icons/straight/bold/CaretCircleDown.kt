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

public val Icons.Bold.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) {
            return _caretCircleDown!!
        }
        _caretCircleDown = Builder(name = "CaretCircleDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, 9.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineToRelative(5.17f, 5.65f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, false, 1.66f, 0.0f)
                close()
            }
        }
        .build()
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
