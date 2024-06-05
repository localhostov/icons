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

public val Icons.Outline.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-0.171f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 4.171f, 2.0f)
                lineTo(4.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.022f, 7.238f)
                lineTo(3.57f, 19.62f)
                arcTo(5.007f, 5.007f, 0.0f, false, false, 8.531f, 24.0f)
                horizontalLineToRelative(6.938f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 4.961f, -4.38f)
                lineTo(21.978f, 7.238f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 23.0f, 5.0f)
                close()
                moveTo(19.117f, 14.0f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(-0.892f, -5.287f, -6.947f, -5.284f, -7.838f, 0.0f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.75f, -6.0f)
                lineTo(19.867f, 8.0f)
                close()
                moveTo(14.0f, 15.0f)
                curveToRelative(-0.105f, 3.954f, -3.895f, 3.953f, -4.0f, 0.0f)
                curveTo(10.105f, 11.046f, 13.9f, 11.047f, 14.0f, 15.0f)
                close()
                moveTo(4.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(4.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(18.445f, 19.372f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.469f, 22.0f)
                lineTo(8.531f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.977f, -2.628f)
                lineTo(5.133f, 16.0f)
                lineTo(8.081f, 16.0f)
                curveToRelative(0.892f, 5.287f, 6.948f, 5.284f, 7.838f, 0.0f)
                horizontalLineToRelative(2.948f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
