package me.localx.icons.straight.filled

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

public val Icons.Filled.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.305f, 16.25f)
                arcToRelative(1.888f, 1.888f, 0.0f, false, true, -1.377f, 1.177f)
                arcToRelative(1.912f, 1.912f, 0.0f, false, true, -1.769f, -0.521f)
                lineToRelative(-0.1f, -0.1f)
                arcToRelative(3.567f, 3.567f, 0.0f, false, false, -6.089f, 2.553f)
                lineToRelative(0.04f, 4.516f)
                lineToRelative(-0.924f, 0.077f)
                curveToRelative(-0.331f, 0.028f, -0.663f, 0.05f, -1.0f, 0.05f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 3.745f, 3.371f)
                arcTo(11.885f, 11.885f, 0.0f, false, true, 12.5f, 0.007f)
                arcTo(12.155f, 12.155f, 0.0f, false, true, 24.08f, 11.7f)
                arcTo(11.924f, 11.924f, 0.0f, false, true, 23.305f, 16.25f)
                close()
                moveTo(17.115f, 8.05f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 18.95f, 9.115f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.115f, 8.05f)
                close()
                moveTo(12.115f, 5.05f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.95f, 6.115f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.115f, 5.05f)
                close()
                moveTo(7.115f, 8.05f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.95f, 9.115f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.115f, 8.05f)
                close()
                moveTo(7.115f, 14.05f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.95f, 15.115f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.115f, 14.05f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
