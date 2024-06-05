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

public val Icons.Outline.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(20.915f, 11.106f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 12.0f, 8.0f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.0f)
                lineTo(10.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(20.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                lineTo(16.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.915f, -3.894f)
                close()
                moveTo(11.0f, 16.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                lineTo(7.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, -4.0f)
                close()
                moveTo(11.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 7.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 4.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
