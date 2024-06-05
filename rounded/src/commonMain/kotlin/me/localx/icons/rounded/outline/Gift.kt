package me.localx.icons.rounded.outline

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
                moveTo(20.0f, 7.0f)
                lineTo(18.262f, 7.0f)
                arcTo(5.137f, 5.137f, 0.0f, false, false, 20.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(0.0f, 2.622f, -2.371f, 3.53f, -4.174f, 3.841f)
                arcTo(9.332f, 9.332f, 0.0f, false, false, 15.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 3.0f)
                arcToRelative(9.332f, 9.332f, 0.0f, false, false, 1.174f, 3.841f)
                curveTo(8.371f, 6.53f, 6.0f, 5.622f, 6.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 3.0f)
                arcTo(5.137f, 5.137f, 0.0f, false, false, 5.738f, 7.0f)
                lineTo(4.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(22.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 7.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, true, -1.0f, 3.013f)
                arcTo(7.71f, 7.71f, 0.0f, false, true, 11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(2.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(8.0f)
                lineTo(7.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 19.0f)
                close()
                moveTo(20.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
