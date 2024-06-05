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
                moveTo(6.269f, 11.6f)
                lineToRelative(5.087f, 5.154f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 1.288f, 0.0f)
                lineTo(17.731f, 11.6f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, false, -0.644f, -1.575f)
                horizontalLineTo(6.913f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 6.269f, 11.6f)
                close()
            }
        }
        .build()
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
