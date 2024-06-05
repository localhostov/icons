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

public val Icons.Filled.Columns3: ImageVector
    get() {
        if (_columns3 != null) {
            return _columns3!!
        }
        _columns3 = Builder(name = "Columns3", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _columns3!!
    }

private var _columns3: ImageVector? = null
