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
                moveToRelative(0.101f, 15.0f)
                horizontalLineToRelative(23.798f)
                curveToRelative(-0.465f, 2.279f, -2.484f, 4.0f, -4.899f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.414f, 0.0f, -4.434f, -1.721f, -4.899f, -4.0f)
                close()
                moveTo(19.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(7.421f)
                lineToRelative(2.319f, -2.154f)
                curveToRelative(0.403f, -0.375f, 1.038f, -0.354f, 1.413f, 0.053f)
                curveToRelative(0.376f, 0.405f, 0.353f, 1.037f, -0.052f, 1.413f)
                lineToRelative(-2.613f, 2.426f)
                curveToRelative(-0.561f, 0.561f, -1.308f, 0.843f, -2.058f, 0.843f)
                curveToRelative(-0.76f, 0.0f, -1.523f, -0.289f, -2.104f, -0.869f)
                lineToRelative(-2.587f, -2.4f)
                curveToRelative(-0.404f, -0.376f, -0.428f, -1.008f, -0.052f, -1.413f)
                curveToRelative(0.374f, -0.406f, 1.009f, -0.428f, 1.413f, -0.053f)
                lineToRelative(2.319f, 2.153f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(2.243f, 1.0f, 0.0f, 3.243f, 0.0f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _desktopArrowDown!!
    }

private var _desktopArrowDown: ImageVector? = null
