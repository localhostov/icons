package me.localx.icons.straight.filled

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

public val Icons.Filled.H4: ImageVector
    get() {
        if (_h4 != null) {
            return _h4!!
        }
        _h4 = Builder(name = "H4", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(22.0f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _h4!!
    }

private var _h4: ImageVector? = null
