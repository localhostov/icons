package me.localx.icons.rounded.bold

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
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 5.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
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
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.5f)
                lineTo(3.0f, 10.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(3.0f, 18.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _grate!!
    }

private var _grate: ImageVector? = null
