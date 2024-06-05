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

public val Icons.Filled.DesktopArrowDown: ImageVector
    get() {
        if (_desktopArrowDown != null) {
            return _desktopArrowDown!!
        }
        _desktopArrowDown = Builder(name = "DesktopArrowDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(21.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.293f, 3.293f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.293f, 2.293f)
                verticalLineTo(1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.343f, 1.0f, 0.0f, 2.343f, 0.0f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _desktopArrowDown!!
    }

private var _desktopArrowDown: ImageVector? = null
