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

public val Icons.Outline.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 3.0f, 5.0f)
                lineTo(3.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.564f, 0.825f)
                lineTo(6.67f, 22.386f)
                lineToRelative(2.106f, 1.439f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.13f, 0.0f)
                lineToRelative(2.1f, -1.439f)
                lineToRelative(2.1f, 1.439f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.131f, 0.0f)
                lineToRelative(2.1f, -1.438f)
                lineToRelative(2.1f, 1.437f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 23.0f)
                lineTo(21.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(19.0f, 21.1f)
                lineTo(17.9f, 20.348f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.132f, 0.0f)
                lineToRelative(-2.1f, 1.439f)
                lineToRelative(-2.1f, -1.439f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.131f, 0.0f)
                lineToRelative(-2.1f, 1.439f)
                lineToRelative(-2.1f, -1.439f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.129f, 0.0f)
                lineTo(5.0f, 21.1f)
                lineTo(5.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 13.0f)
                lineTo(15.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 12.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
