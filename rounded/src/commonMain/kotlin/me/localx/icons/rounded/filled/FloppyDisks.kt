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

public val Icons.Filled.FloppyDisks: ImageVector
    get() {
        if (_floppyDisks != null) {
            return _floppyDisks!!
        }
        _floppyDisks = Builder(name = "FloppyDisks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(4.037f, 24.0f, 0.0f, 19.962f, 0.0f, 15.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.86f, 3.141f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(17.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(17.0f, 0.0f)
                close()
                moveTo(24.0f, 6.267f)
                verticalLineToRelative(8.733f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                lineTo(4.0f, 5.0f)
                curveTo(4.0f, 2.243f, 6.243f, 0.0f, 9.0f, 0.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(19.0f, 0.277f)
                curveToRelative(0.33f, 0.15f, 0.637f, 0.352f, 0.894f, 0.611f)
                lineToRelative(3.236f, 3.265f)
                curveToRelative(0.557f, 0.562f, 0.87f, 1.322f, 0.87f, 2.114f)
                close()
                moveTo(18.0f, 13.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                close()
                moveTo(16.0f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _floppyDisks!!
    }

private var _floppyDisks: ImageVector? = null
