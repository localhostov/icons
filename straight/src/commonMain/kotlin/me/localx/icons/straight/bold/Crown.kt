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

public val Icons.Bold.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.2f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(1.8f)
                lineTo(6.272f, 8.076f)
                lineTo(12.0f, 2.348f)
                lineToRelative(5.728f, 5.728f)
                lineTo(24.0f, 1.8f)
                verticalLineTo(19.2f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 22.2f)
                close()
                moveTo(3.0f, 9.045f)
                verticalLineTo(19.2f)
                lineToRelative(18.0f, 0.0f)
                verticalLineTo(9.045f)
                lineToRelative(-3.272f, 3.273f)
                lineTo(12.0f, 6.59f)
                lineTo(6.272f, 12.318f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
