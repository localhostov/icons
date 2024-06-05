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

public val Icons.Filled.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = Builder(name = "Rhombus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.466f, 8.465f)
                lineToRelative(-6.93f, -6.931f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -7.072f, 0.0f)
                lineTo(1.534f, 8.465f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 7.07f)
                lineToRelative(6.93f, 6.931f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 7.072f, 0.0f)
                lineToRelative(6.93f, -6.931f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -7.07f)
                close()
            }
        }
        .build()
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
