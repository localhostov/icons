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

public val Icons.Bold.CaretQuareUp: ImageVector
    get() {
        if (_caretQuareUp != null) {
            return _caretQuareUp!!
        }
        _caretQuareUp = Builder(name = "CaretQuareUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                lineTo(0.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 0.0f)
                close()
                moveTo(18.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                lineTo(21.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 3.0f)
                lineTo(5.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                close()
                moveTo(17.731f, 13.4f)
                lineTo(12.644f, 8.25f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, -1.288f, 0.0f)
                lineTo(6.269f, 13.4f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, false, 0.644f, 1.575f)
                lineTo(17.087f, 14.975f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 17.731f, 13.4f)
                close()
            }
        }
        .build()
        return _caretQuareUp!!
    }

private var _caretQuareUp: ImageVector? = null
