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

public val Icons.Outline.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.214f)
                lineTo(22.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(7.712f, 18.0f)
                lineToRelative(1.914f, 3.879f)
                arcToRelative(3.038f, 3.038f, 0.0f, false, false, 5.721f, -1.838f)
                lineTo(15.011f, 18.0f)
                lineTo(24.0f, 18.0f)
                close()
                moveTo(2.0f, 15.0f)
                lineTo(2.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 15.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(12.655f, 16.0f)
                lineToRelative(0.719f, 4.365f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, -0.233f, 0.84f)
                arcToRelative(1.071f, 1.071f, 0.0f, false, true, -1.722f, -0.212f)
                lineTo(9.0f, 16.091f)
                lineTo(9.0f, 5.0f)
                lineTo(20.33f, 5.0f)
                lineTo(22.0f, 14.3f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
