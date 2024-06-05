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

public val Icons.Bold.ConditionAlt: ImageVector
    get() {
        if (_conditionAlt != null) {
            return _conditionAlt!!
        }
        _conditionAlt = Builder(name = "ConditionAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.97f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.984f)
                lineToRelative(-4.516f, -3.266f)
                verticalLineToRelative(-1.119f)
                curveToRelative(0.913f, -0.514f, 1.53f, -1.492f, 1.53f, -2.615f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.098f, 0.59f, 2.057f, 1.47f, 2.58f)
                verticalLineToRelative(1.159f)
                lineToRelative(-4.46f, 3.261f)
                lineTo(-0.03f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.04f)
                lineToRelative(5.955f, 4.354f)
                lineToRelative(6.021f, -4.354f)
                horizontalLineToRelative(2.984f)
                close()
                moveTo(11.975f, 13.646f)
                lineToRelative(-2.934f, -2.146f)
                lineToRelative(2.934f, -2.146f)
                lineToRelative(2.966f, 2.146f)
                lineToRelative(-2.966f, 2.146f)
                close()
                moveTo(22.591f, 20.5f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.439f, 1.439f)
                close()
                moveTo(6.678f, 16.606f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-5.195f, 5.195f)
                lineTo(0.044f, 20.362f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(3.074f, -3.074f)
                close()
            }
        }
        .build()
        return _conditionAlt!!
    }

private var _conditionAlt: ImageVector? = null
