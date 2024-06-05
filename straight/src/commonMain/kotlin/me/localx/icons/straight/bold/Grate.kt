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

public val Icons.Bold.Grate: ImageVector
    get() {
        if (_grate != null) {
            return _grate!!
        }
        _grate = Builder(name = "Grate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 3.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                close()
                moveTo(10.0f, 10.5f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 13.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7.5f)
                lineTo(3.0f, 10.5f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.0f, 13.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(17.0f, 21.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _grate!!
    }

private var _grate: ImageVector? = null
