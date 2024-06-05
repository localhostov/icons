package me.localx.icons.rounded.filled

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

public val Icons.Filled.Grate: ImageVector
    get() {
        if (_grate != null) {
            return _grate!!
        }
        _grate = Builder(name = "Grate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 0.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(11.0f, 24.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveTo(2.239f, 0.0f, 0.0f, 2.239f, 0.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(13.0f, 0.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.0f, 13.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(5.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _grate!!
    }

private var _grate: ImageVector? = null
