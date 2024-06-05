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

public val Icons.Filled.Vihara: ImageVector
    get() {
        if (_vihara != null) {
            return _vihara!!
        }
        _vihara = Builder(name = "Vihara", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(2.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(3.021f, 8.0f)
                horizontalLineToRelative(17.958f)
                curveToRelative(0.564f, 0.0f, 1.021f, -0.436f, 1.021f, -1.0f)
                curveToRelative(0.0f, -0.486f, -0.35f, -0.981f, -0.818f, -1.109f)
                curveToRelative(-2.045f, -0.556f, -3.002f, -3.059f, -3.012f, -3.105f)
                lineToRelative(-0.169f, -0.768f)
                verticalLineToRelative(-1.018f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                reflectiveCurveToRelative(0.0f, -1.0f, 0.0f, -1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.016f)
                lineToRelative(-0.169f, 0.77f)
                curveToRelative(-0.01f, 0.046f, -0.967f, 2.55f, -3.012f, 3.105f)
                curveToRelative(-0.469f, 0.127f, -0.818f, 0.623f, -0.818f, 1.109f)
                curveToRelative(0.0f, 0.564f, 0.457f, 1.0f, 1.021f, 1.0f)
                close()
                moveTo(9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.208f, 17.888f)
                curveToRelative(-1.762f, -0.507f, -2.915f, -2.616f, -3.208f, -3.888f)
                lineTo(4.0f, 14.0f)
                curveToRelative(-0.261f, 1.185f, -1.446f, 3.364f, -3.215f, 3.886f)
                curveToRelative(-0.451f, 0.133f, -0.785f, 0.645f, -0.785f, 1.114f)
                curveToRelative(0.0f, 0.554f, 0.449f, 1.0f, 1.003f, 1.0f)
                horizontalLineToRelative(21.994f)
                curveToRelative(0.554f, 0.0f, 1.003f, -0.446f, 1.003f, -1.0f)
                curveToRelative(0.0f, -0.473f, -0.338f, -0.982f, -0.792f, -1.112f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _vihara!!
    }

private var _vihara: ImageVector? = null
