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

public val Icons.Outline.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineTo(17.866f, 7.0f)
                arcTo(6.547f, 6.547f, 0.0f, false, false, 20.0f, 2.0f)
                lineTo(18.0f, 2.0f)
                curveToRelative(0.0f, 2.881f, -1.971f, 4.307f, -4.152f, 4.8f)
                arcTo(9.239f, 9.239f, 0.0f, false, false, 15.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 3.0f)
                arcToRelative(9.239f, 9.239f, 0.0f, false, false, 1.152f, 3.8f)
                curveTo(7.971f, 6.307f, 6.0f, 4.881f, 6.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                arcTo(6.547f, 6.547f, 0.0f, false, false, 6.134f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 7.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, true, -1.0f, 3.013f)
                arcTo(7.71f, 7.71f, 0.0f, false, true, 11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(2.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(8.0f)
                lineTo(4.0f, 22.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(22.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
