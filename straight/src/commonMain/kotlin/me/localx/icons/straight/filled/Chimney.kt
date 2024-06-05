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

public val Icons.Filled.Chimney: ImageVector
    get() {
        if (_chimney != null) {
            return _chimney!!
        }
        _chimney = Builder(name = "Chimney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 16.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(24.0f, 8.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(14.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _chimney!!
    }

private var _chimney: ImageVector? = null
