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

public val Icons.Filled.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) {
            return _lampDesk!!
        }
        _lampDesk = Builder(name = "LampDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.987f, 6.059f)
                curveToRelative(-0.074f, -0.75f, -0.477f, -1.419f, -1.104f, -1.836f)
                lineToRelative(-5.065f, -3.378f)
                curveTo(15.692f, 0.095f, 14.342f, -0.17f, 13.021f, 0.102f)
                curveToRelative(-1.325f, 0.271f, -2.469f, 1.052f, -3.219f, 2.197f)
                curveToRelative(-0.787f, 1.202f, -0.983f, 2.687f, -0.594f, 4.08f)
                lineToRelative(-2.157f, 2.157f)
                curveToRelative(-1.322f, 1.322f, -2.051f, 3.08f, -2.051f, 4.95f)
                verticalLineToRelative(8.515f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -1.336f, 0.521f, -2.592f, 1.465f, -3.536f)
                lineToRelative(1.68f, -1.68f)
                lineToRelative(3.077f, 4.615f)
                curveToRelative(0.417f, 0.628f, 1.087f, 1.03f, 1.837f, 1.104f)
                curveToRelative(0.084f, 0.009f, 0.167f, 0.013f, 0.25f, 0.013f)
                curveToRelative(0.662f, 0.0f, 1.296f, -0.261f, 1.769f, -0.734f)
                lineToRelative(0.835f, -0.835f)
                curveToRelative(0.982f, 0.809f, 2.437f, 0.755f, 3.355f, -0.163f)
                reflectiveCurveToRelative(0.973f, -2.373f, 0.163f, -3.355f)
                lineToRelative(0.834f, -0.834f)
                curveToRelative(0.533f, -0.533f, 0.797f, -1.27f, 0.722f, -2.02f)
                close()
            }
        }
        .build()
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
