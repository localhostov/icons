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

public val Icons.Bold.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) {
            return _caretCircleUp!!
        }
        _caretCircleUp = Builder(name = "CaretCircleUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 0.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -9.0f, -9.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 12.0f, 21.0f)
                close()
                moveTo(6.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                lineTo(12.83f, 8.35f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, false, -1.66f, 0.0f)
                close()
            }
        }
        .build()
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
