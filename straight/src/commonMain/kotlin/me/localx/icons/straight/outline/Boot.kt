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

public val Icons.Outline.Boot: ImageVector
    get() {
        if (_boot != null) {
            return _boot!!
        }
        _boot = Builder(name = "Boot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.046f, 11.388f)
                lineToRelative(-4.046f, -1.121f)
                verticalLineToRelative(-4.267f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                lineTo(2.0f, 0.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -2.969f, -2.113f, -5.546f, -4.954f, -6.112f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(4.028f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.865f)
                lineToRelative(4.718f, 1.305f)
                curveToRelative(1.98f, 0.396f, 3.417f, 2.148f, 3.417f, 4.167f)
                verticalLineToRelative(2.5f)
                lineTo(4.0f, 20.0f)
                close()
            }
        }
        .build()
        return _boot!!
    }

private var _boot: ImageVector? = null
