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

public val Icons.Bold.Vihara: ImageVector
    get() {
        if (_vihara != null) {
            return _vihara!!
        }
        _vihara = Builder(name = "Vihara", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 12.589f)
                verticalLineToRelative(-2.589f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-2.345f, 0.0f, -3.987f, -4.493f, -4.0f, -4.529f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.001f)
                lineToRelative(-6.0f, 0.002f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.709f)
                curveToRelative(-0.015f, 0.04f, -1.64f, 4.291f, -4.0f, 4.291f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.355f)
                curveToRelative(-0.014f, 0.04f, -1.487f, 4.645f, -4.0f, 4.645f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-2.487f, 0.0f, -3.987f, -4.374f, -4.0f, -4.411f)
                close()
                moveTo(8.288f, 5.0f)
                horizontalLineToRelative(7.487f)
                curveToRelative(0.264f, 0.557f, 0.656f, 1.279f, 1.177f, 2.0f)
                lineTo(7.083f, 7.0f)
                curveToRelative(0.533f, -0.723f, 0.934f, -1.445f, 1.205f, -2.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.001f)
                lineToRelative(-10.0f, 0.002f)
                verticalLineToRelative(-2.003f)
                close()
                moveTo(5.029f, 17.0f)
                curveToRelative(0.516f, -0.721f, 0.903f, -1.442f, 1.164f, -2.0f)
                horizontalLineToRelative(11.551f)
                curveToRelative(0.267f, 0.556f, 0.664f, 1.278f, 1.191f, 2.0f)
                lineTo(5.029f, 17.0f)
                close()
            }
        }
        .build()
        return _vihara!!
    }

private var _vihara: ImageVector? = null
