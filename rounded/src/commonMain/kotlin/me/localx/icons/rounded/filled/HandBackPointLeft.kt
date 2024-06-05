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

public val Icons.Filled.HandBackPointLeft: ImageVector
    get() {
        if (_handBackPointLeft != null) {
            return _handBackPointLeft!!
        }
        _handBackPointLeft = Builder(name = "HandBackPointLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.414f)
                verticalLineToRelative(7.586f)
                curveToRelative(0.0f, 2.761f, -2.238f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-4.721f)
                curveToRelative(-2.383f, 0.0f, -4.435f, -1.682f, -4.903f, -4.019f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-1.196f, -4.981f, -1.196f, -4.981f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.34f)
                lineToRelative(3.64f, -2.788f)
                curveToRelative(1.985f, -1.696f, 4.938f, -1.588f, 6.794f, 0.249f)
                lineToRelative(2.425f, 2.4f)
                curveToRelative(0.945f, 0.942f, 1.478f, 2.22f, 1.481f, 3.554f)
                close()
            }
        }
        .build()
        return _handBackPointLeft!!
    }

private var _handBackPointLeft: ImageVector? = null
