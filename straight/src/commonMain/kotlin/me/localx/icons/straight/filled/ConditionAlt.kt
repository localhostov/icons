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

public val Icons.Filled.ConditionAlt: ImageVector
    get() {
        if (_conditionAlt != null) {
            return _conditionAlt!!
        }
        _conditionAlt = Builder(name = "ConditionAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.176f)
                lineToRelative(-5.858f, 4.236f)
                lineToRelative(-5.793f, -4.236f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.174f)
                lineToRelative(4.808f, -3.516f)
                lineToRelative(0.008f, -0.633f)
                curveToRelative(-1.439f, -0.435f, -2.49f, -1.773f, -2.49f, -3.351f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.586f, -1.061f, 2.929f, -2.51f, 3.357f)
                lineToRelative(-0.008f, 0.641f)
                lineToRelative(4.842f, 3.502f)
                horizontalLineToRelative(6.176f)
                close()
                moveTo(22.543f, 17.043f)
                lineToRelative(-2.043f, 2.043f)
                lineToRelative(-2.043f, -2.043f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.043f, 2.043f)
                lineToRelative(-2.043f, 2.043f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.043f, -2.043f)
                lineToRelative(2.043f, 2.043f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.043f, -2.043f)
                lineToRelative(2.043f, -2.043f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(3.419f, 21.086f)
                lineToRelative(-1.923f, -1.924f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.337f, 3.338f)
                lineToRelative(5.057f, -5.058f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.643f, 3.644f)
                close()
            }
        }
        .build()
        return _conditionAlt!!
    }

private var _conditionAlt: ImageVector? = null
