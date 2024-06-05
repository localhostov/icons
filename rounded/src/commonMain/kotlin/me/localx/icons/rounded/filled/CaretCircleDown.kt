package me.localx.icons.rounded.filled

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

public val Icons.Filled.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) {
            return _caretCircleDown!!
        }
        _caretCircleDown = Builder(name = "CaretCircleDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(17.731f, 11.6f)
                lineTo(12.644f, 16.75f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -1.288f, 0.0f)
                lineTo(6.269f, 11.6f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, 0.644f, -1.575f)
                lineTo(17.087f, 10.025f)
                arcTo(0.924f, 0.924f, 0.0f, false, true, 17.731f, 11.6f)
                close()
            }
        }
        .build()
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
