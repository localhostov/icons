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

public val Icons.Bold.SofaSize: ImageVector
    get() {
        if (_sofaSize != null) {
            return _sofaSize!!
        }
        _sofaSize = Builder(name = "SofaSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.256f, 4.074f)
                curveToRelative(-0.341f, -0.306f, -0.341f, -0.841f, 0.0f, -1.147f)
                lineTo(3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 0.0f)
                lineToRelative(2.744f, 2.926f)
                curveToRelative(0.341f, 0.306f, 0.341f, 0.841f, 0.0f, 1.147f)
                lineToRelative(-2.744f, 2.926f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 4.999f)
                verticalLineToRelative(2.0f)
                lineTo(0.256f, 4.074f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(19.0f, 11.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, 10.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }
        .build()
        return _sofaSize!!
    }

private var _sofaSize: ImageVector? = null