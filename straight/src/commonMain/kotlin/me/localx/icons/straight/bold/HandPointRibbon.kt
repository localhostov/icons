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

public val Icons.Bold.HandPointRibbon: ImageVector
    get() {
        if (_handPointRibbon != null) {
            return _handPointRibbon!!
        }
        _handPointRibbon = Builder(name = "HandPointRibbon", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 15.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineToRelative(1.415f)
                curveToRelative(1.01f, -0.247f, 2.085f, -0.101f, 3.0f, 0.436f)
                lineTo(9.0f, 4.0f)
                lineTo(1.0f, 4.0f)
                lineToRelative(2.0f, 1.5f)
                lineToRelative(-2.0f, 1.5f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(9.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(20.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 16.649f)
                verticalLineToRelative(4.351f)
                lineTo(8.093f, 21.0f)
                lineToRelative(-3.505f, -3.288f)
                lineToRelative(3.814f, -3.948f)
                curveToRelative(0.797f, -0.797f, 0.797f, -2.089f, 0.0f, -2.886f)
                curveToRelative(-0.797f, -0.797f, -2.089f, -0.797f, -2.886f, 0.0f)
                lineToRelative(-3.516f, 3.609f)
                lineToRelative(0.002f, 0.006f)
                curveToRelative(-0.646f, 0.658f, -1.002f, 1.527f, -1.002f, 2.452f)
                curveToRelative(0.0f, 0.935f, 0.364f, 1.814f, 1.06f, 2.508f)
                lineToRelative(4.847f, 4.547f)
                horizontalLineToRelative(15.093f)
                verticalLineToRelative(-7.351f)
                curveToRelative(-0.456f, 0.219f, -0.961f, 0.351f, -1.5f, 0.351f)
                reflectiveCurveToRelative(-1.044f, -0.133f, -1.5f, -0.351f)
                close()
            }
        }
        .build()
        return _handPointRibbon!!
    }

private var _handPointRibbon: ImageVector? = null
