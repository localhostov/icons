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

public val Icons.Filled.Trees: ImageVector
    get() {
        if (_trees != null) {
            return _trees!!
        }
        _trees = Builder(name = "Trees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.556f, 15.0f)
                horizontalLineToRelative(2.384f)
                lineToRelative(-3.958f, -6.0f)
                horizontalLineToRelative(2.154f)
                lineToRelative(-4.654f, -7.897f)
                lineToRelative(-0.076f, -0.112f)
                curveToRelative(-0.497f, -0.63f, -1.266f, -0.991f, -2.107f, -0.991f)
                reflectiveCurveToRelative(-1.612f, 0.362f, -2.108f, 0.992f)
                lineToRelative(-3.549f, 6.008f)
                horizontalLineToRelative(-2.181f)
                lineTo(10.473f, 0.08f)
                curveToRelative(-0.216f, -0.053f, -0.443f, -0.08f, -0.675f, -0.08f)
                curveToRelative(-0.843f, 0.0f, -1.611f, 0.362f, -2.108f, 0.992f)
                lineTo(2.959f, 9.0f)
                horizontalLineToRelative(2.155f)
                lineToRelative(-3.958f, 6.0f)
                horizontalLineToRelative(2.383f)
                lineTo(0.063f, 21.0f)
                horizontalLineToRelative(2.314f)
                lineToRelative(3.475f, -6.0f)
                horizontalLineToRelative(2.188f)
                lineToRelative(-3.475f, 6.0f)
                horizontalLineToRelative(3.964f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.505f)
                lineToRelative(-3.478f, -6.0f)
                close()
                moveTo(6.975f, 13.0f)
                horizontalLineToRelative(-2.104f)
                lineToRelative(2.638f, -4.0f)
                horizontalLineToRelative(2.104f)
                lineToRelative(-2.638f, 4.0f)
                close()
            }
        }
        .build()
        return _trees!!
    }

private var _trees: ImageVector? = null
