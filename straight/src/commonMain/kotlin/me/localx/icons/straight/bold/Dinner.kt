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

public val Icons.Bold.Dinner: ImageVector
    get() {
        if (_dinner != null) {
            return _dinner!!
        }
        _dinner = Builder(name = "Dinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.121f)
                lineToRelative(-2.939f, 2.939f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.061f, -2.061f)
                verticalLineToRelative(-3.879f)
                close()
                moveTo(9.5f, 19.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.916f, -6.5f, 6.5f, -6.5f)
                curveToRelative(0.557f, 0.0f, 1.095f, 0.078f, 1.611f, 0.21f)
                curveToRelative(0.142f, -0.901f, 0.426f, -1.897f, 0.841f, -2.878f)
                curveToRelative(-0.784f, -0.21f, -1.603f, -0.333f, -2.453f, -0.333f)
                curveTo(4.262f, 3.0f, 0.0f, 7.262f, 0.0f, 12.5f)
                reflectiveCurveToRelative(4.262f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.05f, 0.0f, 3.946f, -0.66f, 5.5f, -1.768f)
                verticalLineToRelative(-4.283f)
                curveToRelative(-1.151f, 1.83f, -3.183f, 3.052f, -5.5f, 3.052f)
                close()
                moveTo(20.0f, 12.787f)
                verticalLineToRelative(11.213f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-11.213f)
                curveToRelative(-2.305f, -0.655f, -4.0f, -2.775f, -4.0f, -5.287f)
                curveToRelative(0.0f, -2.644f, 2.088f, -7.5f, 5.5f, -7.5f)
                reflectiveCurveToRelative(5.5f, 4.856f, 5.5f, 7.5f)
                curveToRelative(0.0f, 2.512f, -1.695f, 4.632f, -4.0f, 5.287f)
                close()
                moveTo(21.0f, 7.5f)
                curveToRelative(0.0f, -1.767f, -1.519f, -4.5f, -2.5f, -4.5f)
                reflectiveCurveToRelative(-2.5f, 2.733f, -2.5f, 4.5f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _dinner!!
    }

private var _dinner: ImageVector? = null
