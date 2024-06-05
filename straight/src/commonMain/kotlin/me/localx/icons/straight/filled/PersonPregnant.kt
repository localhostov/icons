package me.localx.icons.straight.filled

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

public val Icons.Filled.PersonPregnant: ImageVector
    get() {
        if (_personPregnant != null) {
            return _personPregnant!!
        }
        _personPregnant = Builder(name = "PersonPregnant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(14.825f, 9.537f)
                lineToRelative(-0.114f, -0.909f)
                curveToRelative(-0.187f, -1.498f, -1.467f, -2.628f, -2.977f, -2.628f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-1.51f, 0.0f, -2.79f, 1.13f, -2.977f, 2.628f)
                lineToRelative(-0.223f, 1.787f)
                lineToRelative(4.882f, 2.457f)
                lineToRelative(-0.895f, 1.789f)
                lineToRelative(-4.25f, -2.141f)
                lineToRelative(-0.935f, 7.481f)
                horizontalLineToRelative(2.133f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.713f)
                lineToRelative(0.232f, -0.674f)
                curveToRelative(0.108f, -0.313f, 1.055f, -3.112f, 1.055f, -4.826f)
                curveToRelative(0.0f, -2.146f, -1.252f, -4.068f, -3.175f, -4.963f)
                close()
            }
        }
        .build()
        return _personPregnant!!
    }

private var _personPregnant: ImageVector? = null
