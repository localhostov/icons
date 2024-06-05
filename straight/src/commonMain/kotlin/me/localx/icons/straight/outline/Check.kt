package me.localx.icons.straight.outline

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

public val Icons.Outline.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 20.53f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, -2.121f, -0.877f)
                lineTo(0.086f, 14.061f)
                lineTo(1.5f, 12.646f)
                lineToRelative(5.593f, 5.593f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineTo(22.5f, 4.246f)
                lineTo(23.914f, 5.66f)
                lineTo(9.921f, 19.653f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 7.8f, 20.53f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
