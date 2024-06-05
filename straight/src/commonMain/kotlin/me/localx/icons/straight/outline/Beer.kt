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

public val Icons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                arcToRelative(4.012f, 4.012f, 0.0f, false, false, -4.727f, -3.932f)
                arcToRelative(4.513f, 4.513f, 0.0f, false, false, -7.518f, -0.043f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 2.0f, 6.0f)
                lineTo(1.0f, 6.0f)
                lineTo(1.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(16.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 4.0f)
                curveToRelative(0.059f, 0.0f, 0.919f, 0.142f, 0.919f, 0.142f)
                lineToRelative(0.32f, -0.688f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.592f, 0.17f)
                lineToRelative(0.377f, 1.0f)
                lineToRelative(0.972f, -0.44f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(7.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 4.0f)
                close()
                moveTo(17.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
