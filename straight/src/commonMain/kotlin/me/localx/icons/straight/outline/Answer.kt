package me.localx.icons.straight.outline

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

public val Icons.Outline.Answer: ImageVector
    get() {
        if (_answer != null) {
            return _answer!!
        }
        _answer = Builder(name = "Answer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(6.923f)
                lineToRelative(3.749f, 3.156f)
                curveToRelative(0.382f, 0.34f, 0.861f, 0.509f, 1.337f, 0.508f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.162f, 1.292f, -0.484f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(6.853f)
                lineTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 18.0f)
                horizontalLineToRelative(-5.571f)
                lineToRelative(-4.448f, 3.645f)
                lineToRelative(-4.327f, -3.645f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(12.876f, 4.18f)
                curveToRelative(-1.313f, -0.55f, -2.651f, 0.221f, -2.937f, 1.458f)
                lineToRelative(-2.439f, 10.362f)
                horizontalLineToRelative(2.053f)
                lineToRelative(0.706f, -3.0f)
                horizontalLineToRelative(3.481f)
                lineToRelative(0.706f, 3.0f)
                horizontalLineToRelative(2.053f)
                lineToRelative(-2.422f, -10.291f)
                curveToRelative(-0.154f, -0.662f, -0.575f, -1.266f, -1.202f, -1.528f)
                close()
                moveTo(10.731f, 11.0f)
                lineToRelative(1.156f, -4.91f)
                curveToRelative(0.012f, -0.053f, 0.059f, -0.09f, 0.113f, -0.09f)
                reflectiveCurveToRelative(0.101f, 0.037f, 0.113f, 0.09f)
                lineToRelative(1.156f, 4.91f)
                horizontalLineToRelative(-2.539f)
                close()
            }
        }
        .build()
        return _answer!!
    }

private var _answer: ImageVector? = null
