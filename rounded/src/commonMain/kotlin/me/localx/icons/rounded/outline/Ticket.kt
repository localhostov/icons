package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, -1.941f, 1.532f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.858f, 0.0f)
                arcTo(2.02f, 2.02f, 0.0f, false, false, 8.13f, 0.0f)
                lineTo(8.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 3.0f, 5.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(8.13f, 24.0f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, 1.941f, -1.532f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.858f, 0.0f)
                arcTo(2.02f, 2.02f, 0.0f, false, false, 15.87f, 24.0f)
                lineTo(18.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(15.857f, 21.937f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.13f, 22.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 2.0f)
                lineToRelative(0.143f, 0.063f)
                arcTo(4.01f, 4.01f, 0.0f, false, false, 12.0f, 5.0f)
                arcToRelative(4.071f, 4.071f, 0.0f, false, false, 3.893f, -3.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(19.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
