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

public val Icons.Filled.HandBackPointRibbon: ImageVector
    get() {
        if (_handBackPointRibbon != null) {
            return _handBackPointRibbon!!
        }
        _handBackPointRibbon = Builder(name = "HandBackPointRibbon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                lineTo(3.431f, 7.0f)
                curveToRelative(-0.412f, 0.0f, -0.565f, -0.371f, -0.274f, -0.662f)
                lineToRelative(1.312f, -0.838f)
                lineToRelative(-1.321f, -0.815f)
                curveToRelative(-0.291f, -0.291f, -0.128f, -0.685f, 0.284f, -0.685f)
                lineTo(12.0f, 4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(4.0f, 0.0f, 4.0f, 0.0f)
                close()
                moveTo(17.981f, 10.376f)
                lineToRelative(-5.981f, -1.376f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                reflectiveCurveToRelative(-2.788f, 3.3f, -2.788f, 3.3f)
                curveToRelative(-1.696f, 1.985f, -1.588f, 4.938f, 0.249f, 6.794f)
                lineToRelative(2.4f, 2.425f)
                curveToRelative(0.942f, 0.945f, 2.22f, 1.478f, 3.554f, 1.481f)
                horizontalLineToRelative(7.586f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.238f, 5.0f, -5.0f)
                verticalLineToRelative(-3.721f)
                curveToRelative(0.0f, -2.383f, -1.682f, -4.435f, -4.019f, -4.903f)
                close()
            }
        }
        .build()
        return _handBackPointRibbon!!
    }

private var _handBackPointRibbon: ImageVector? = null
