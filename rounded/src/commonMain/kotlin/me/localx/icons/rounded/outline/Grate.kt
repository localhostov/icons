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

public val Icons.Outline.Grate: ImageVector
    get() {
        if (_grate != null) {
            return _grate!!
        }
        _grate = Builder(name = "Grate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(11.0f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 11.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(2.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _grate!!
    }

private var _grate: ImageVector? = null
