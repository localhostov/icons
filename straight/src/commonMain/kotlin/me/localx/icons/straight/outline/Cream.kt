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

public val Icons.Outline.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.184f)
                lineTo(22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                curveTo(20.0f, 2.56f, 17.028f, 0.291f, 16.9f, 0.2f)
                lineTo(16.637f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 1.0f)
                arcToRelative(1.883f, 1.883f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(10.0f, 3.0f)
                arcTo(5.648f, 5.648f, 0.0f, false, false, 4.089f, 8.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(4.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 15.0f)
                verticalLineToRelative(9.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 12.184f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(4.026f, 4.026f, 0.0f, false, false, 3.613f, -2.162f)
                arcTo(9.083f, 9.083f, 0.0f, false, true, 18.0f, 8.0f)
                lineTo(6.131f, 8.0f)
                arcTo(3.658f, 3.658f, 0.0f, false, true, 10.0f, 5.0f)
                close()
                moveTo(20.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 10.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(21.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
