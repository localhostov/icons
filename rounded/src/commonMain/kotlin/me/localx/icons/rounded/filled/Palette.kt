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
                moveTo(20.057f, 16.8f)
                lineToRelative(0.1f, 0.1f)
                arcToRelative(1.912f, 1.912f, 0.0f, false, false, 1.769f, 0.521f)
                arcToRelative(1.888f, 1.888f, 0.0f, false, false, 1.377f, -1.177f)
                arcTo(11.924f, 11.924f, 0.0f, false, false, 24.08f, 11.7f)
                arcTo(12.155f, 12.155f, 0.0f, false, false, 12.5f, 0.007f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.083f, 12.0f)
                arcToRelative(12.014f, 12.014f, 0.0f, false, false, 12.0f, 12.0f)
                curveToRelative(0.338f, 0.0f, 0.67f, -0.022f, 1.0f, -0.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.916f, -1.0f)
                lineToRelative(-0.032f, -3.588f)
                arcTo(3.567f, 3.567f, 0.0f, false, true, 20.057f, 16.8f)
                close()
                moveTo(17.115f, 8.05f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.05f, 9.885f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.115f, 8.05f)
                close()
                moveTo(7.885f, 16.95f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.95f, 15.115f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.885f, 16.95f)
                close()
                moveTo(7.885f, 10.95f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.95f, 9.115f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.885f, 10.95f)
                close()
                moveTo(12.885f, 7.95f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 13.95f, 6.115f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.885f, 7.95f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
