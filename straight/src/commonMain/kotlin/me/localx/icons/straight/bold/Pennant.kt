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

public val Icons.Bold.Pennant: ImageVector
    get() {
        if (_pennant != null) {
            return _pennant!!
        }
        _pennant = Builder(name = "Pennant", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.646f, 3.782f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 1.0f, 4.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.493f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(4.0f, 6.767f)
                lineTo(16.326f, 12.0f)
                lineTo(4.0f, 17.233f)
                close()
            }
        }
        .build()
        return _pennant!!
    }

private var _pennant: ImageVector? = null
