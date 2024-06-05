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

public val Icons.Filled.HandBackPointDown: ImageVector
    get() {
        if (_handBackPointDown != null) {
            return _handBackPointDown!!
        }
        _handBackPointDown = Builder(name = "HandBackPointDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(4.721f)
                curveToRelative(0.0f, 2.383f, -1.682f, 4.435f, -4.019f, 4.903f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-4.981f, 1.196f, -4.981f, 1.196f)
                verticalLineToRelative(5.681f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.34f)
                lineToRelative(-2.788f, -3.64f)
                curveToRelative(-1.696f, -1.985f, -1.588f, -4.938f, 0.249f, -6.794f)
                lineTo(5.86f, 1.481f)
                curveTo(6.802f, 0.536f, 8.08f, 0.004f, 9.414f, 0.0f)
                horizontalLineToRelative(7.586f)
                curveTo(19.761f, 0.0f, 22.0f, 2.239f, 22.0f, 5.0f)
                close()
            }
        }
        .build()
        return _handBackPointDown!!
    }

private var _handBackPointDown: ImageVector? = null
