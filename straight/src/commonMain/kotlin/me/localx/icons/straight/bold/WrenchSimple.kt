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

public val Icons.Bold.WrenchSimple: ImageVector
    get() {
        if (_wrenchSimple != null) {
            return _wrenchSimple!!
        }
        _wrenchSimple = Builder(name = "WrenchSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.989f)
                lineToRelative(1.105f, -0.302f)
                curveToRelative(3.471f, -0.945f, 5.895f, -4.116f, 5.895f, -7.709f)
                curveToRelative(0.0f, -2.895f, -1.573f, -5.516f, -4.0f, -6.919f)
                verticalLineToRelative(6.919f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.081f)
                curveToRelative(-2.427f, 1.403f, -4.0f, 4.024f, -4.0f, 6.919f)
                curveToRelative(0.0f, 3.593f, 2.424f, 6.764f, 5.895f, 7.709f)
                lineToRelative(1.105f, 0.302f)
                verticalLineToRelative(4.989f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.762f)
                curveTo(3.826f, 19.608f, 1.0f, 15.552f, 1.0f, 11.0f)
                curveTo(1.0f, 6.058f, 4.333f, 1.697f, 9.105f, 0.396f)
                lineTo(11.0f, -0.12f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(-0.12f)
                lineToRelative(1.895f, 0.517f)
                curveToRelative(4.772f, 1.301f, 8.105f, 5.661f, 8.105f, 10.604f)
                curveToRelative(0.0f, 4.552f, -2.826f, 8.608f, -7.0f, 10.238f)
                verticalLineToRelative(2.762f)
                close()
            }
        }
        .build()
        return _wrenchSimple!!
    }

private var _wrenchSimple: ImageVector? = null
