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

public val Icons.Outline.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.007f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(0.007f, 16.0f)
                arcTo(9.007f, 9.007f, 0.0f, false, true, 9.0f, 7.0f)
                lineToRelative(4.843f, -0.154f)
                lineTo(13.843f, 0.432f)
                lineToRelative(9.287f, 9.293f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 4.242f)
                lineTo(13.845f, 23.26f)
                lineTo(13.845f, 16.846f)
                lineTo(9.0f, 17.0f)
                arcTo(7.006f, 7.006f, 0.0f, false, false, 2.007f, 24.0f)
                close()
                moveTo(9.007f, 15.0f)
                lineTo(15.849f, 14.846f)
                verticalLineToRelative(3.586f)
                lineToRelative(5.874f, -5.879f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(15.844f, 5.26f)
                lineTo(15.844f, 8.846f)
                lineTo(9.0f, 9.0f)
                arcToRelative(7.006f, 7.006f, 0.0f, false, false, -7.0f, 7.0f)
                verticalLineToRelative(2.349f)
                arcTo(8.98f, 8.98f, 0.0f, false, true, 9.0f, 15.0f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
