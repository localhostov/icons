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

public val Icons.Filled.HandBackPointRight: ImageVector
    get() {
        if (_handBackPointRight != null) {
            return _handBackPointRight!!
        }
        _handBackPointRight = Builder(name = "HandBackPointRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 8.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.34f)
                lineToRelative(-3.64f, -2.788f)
                curveToRelative(-1.985f, -1.696f, -4.938f, -1.588f, -6.794f, 0.249f)
                lineTo(1.481f, 5.86f)
                curveTo(0.536f, 6.802f, 0.004f, 8.08f, 0.0f, 9.414f)
                verticalLineToRelative(7.586f)
                curveTo(0.0f, 19.761f, 2.239f, 22.0f, 5.0f, 22.0f)
                horizontalLineToRelative(4.721f)
                curveToRelative(2.383f, 0.0f, 4.435f, -1.682f, 4.903f, -4.019f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(1.196f, -4.981f, 1.196f, -4.981f)
                horizontalLineToRelative(5.681f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _handBackPointRight!!
    }

private var _handBackPointRight: ImageVector? = null
