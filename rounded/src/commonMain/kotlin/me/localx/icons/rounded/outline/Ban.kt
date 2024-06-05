package me.localx.icons.rounded.outline

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

public val Icons.Outline.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(9.949f, 9.949f, 0.0f, false, true, 6.324f, 2.262f)
                lineTo(4.262f, 18.324f)
                arcTo(9.992f, 9.992f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(9.949f, 9.949f, 0.0f, false, true, -6.324f, -2.262f)
                lineTo(19.738f, 5.676f)
                arcTo(9.992f, 9.992f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
