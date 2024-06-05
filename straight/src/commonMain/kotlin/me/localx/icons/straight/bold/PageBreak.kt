package me.localx.icons.straight.bold

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

public val Icons.Bold.PageBreak: ImageVector
    get() {
        if (_pageBreak != null) {
            return _pageBreak!!
        }
        _pageBreak = Builder(name = "PageBreak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(11.121f)
                lineToRelative(5.879f, 5.879f)
                verticalLineToRelative(5.121f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 11.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(22.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _pageBreak!!
    }

private var _pageBreak: ImageVector? = null
