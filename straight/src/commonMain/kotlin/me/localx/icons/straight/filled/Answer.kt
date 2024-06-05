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

public val Icons.Filled.Answer: ImageVector
    get() {
        if (_answer != null) {
            return _answer!!
        }
        _answer = Builder(name = "Answer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.113f, 6.09f)
                lineToRelative(1.156f, 4.91f)
                horizontalLineToRelative(-2.539f)
                lineToRelative(1.156f, -4.91f)
                curveToRelative(0.012f, -0.053f, 0.059f, -0.09f, 0.113f, -0.09f)
                reflectiveCurveToRelative(0.101f, 0.037f, 0.113f, 0.09f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-6.853f)
                lineToRelative(-3.847f, 3.18f)
                curveToRelative(-0.361f, 0.322f, -0.824f, 0.484f, -1.292f, 0.484f)
                curveToRelative(-0.476f, 0.0f, -0.955f, -0.168f, -1.337f, -0.508f)
                lineToRelative(-3.749f, -3.156f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(16.5f, 16.0f)
                lineToRelative(-2.422f, -10.291f)
                curveToRelative(-0.154f, -0.662f, -0.575f, -1.266f, -1.202f, -1.528f)
                curveToRelative(-1.313f, -0.55f, -2.651f, 0.221f, -2.937f, 1.458f)
                lineToRelative(-2.439f, 10.362f)
                horizontalLineToRelative(2.053f)
                lineToRelative(0.706f, -3.0f)
                horizontalLineToRelative(3.481f)
                lineToRelative(0.706f, 3.0f)
                horizontalLineToRelative(2.053f)
                close()
            }
        }
        .build()
        return _answer!!
    }

private var _answer: ImageVector? = null
