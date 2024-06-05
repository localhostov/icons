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

public val Icons.Outline.DesktopArrowDown: ImageVector
    get() {
        if (_desktopArrowDown != null) {
            return _desktopArrowDown!!
        }
        _desktopArrowDown = Builder(name = "DesktopArrowDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -0.814f, -0.335f, -1.603f, -0.918f, -2.165f)
                curveToRelative(-0.562f, -0.541f, -1.294f, -0.819f, -1.998f, -0.796f)
                lineToRelative(-6.077f, -0.039f)
                lineToRelative(-0.014f, 2.0f)
                lineToRelative(6.121f, 0.038f)
                curveToRelative(0.209f, -0.012f, 0.413f, 0.076f, 0.58f, 0.237f)
                curveToRelative(0.194f, 0.188f, 0.306f, 0.451f, 0.306f, 0.725f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.264f, 0.102f, -0.507f, 0.286f, -0.686f)
                curveToRelative(0.193f, -0.187f, 0.446f, -0.288f, 0.791f, -0.275f)
                horizontalLineToRelative(5.923f)
                lineTo(9.0f, 1.039f)
                lineTo(3.109f, 1.039f)
                curveToRelative(-0.832f, -0.022f, -1.628f, 0.271f, -2.214f, 0.838f)
                curveToRelative(-0.578f, 0.559f, -0.896f, 1.312f, -0.896f, 2.123f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.293f, 3.293f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.293f, 2.293f)
                close()
            }
        }
        .build()
        return _desktopArrowDown!!
    }

private var _desktopArrowDown: ImageVector? = null
