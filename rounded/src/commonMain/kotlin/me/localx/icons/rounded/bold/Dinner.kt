package me.localx.icons.rounded.bold

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
                moveToRelative(11.0f, 9.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.398f, -0.158f, 0.779f, -0.439f, 1.061f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(1.561f, -1.561f)
                verticalLineToRelative(-2.379f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(12.749f, 18.131f)
                curveToRelative(-0.982f, 0.568f, -2.106f, 0.869f, -3.249f, 0.869f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.916f, -6.5f, 6.5f, -6.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                curveTo(4.262f, 3.0f, 0.0f, 7.262f, 0.0f, 12.5f)
                reflectiveCurveToRelative(4.262f, 9.5f, 9.5f, 9.5f)
                curveToRelative(1.669f, 0.0f, 3.312f, -0.44f, 4.751f, -1.272f)
                curveToRelative(0.717f, -0.415f, 0.962f, -1.333f, 0.548f, -2.049f)
                curveToRelative(-0.415f, -0.717f, -1.334f, -0.961f, -2.05f, -0.547f)
                close()
                moveTo(20.0f, 12.786f)
                verticalLineToRelative(9.713f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-9.713f)
                curveToRelative(-2.305f, -0.655f, -4.0f, -2.775f, -4.0f, -5.287f)
                curveToRelative(0.0f, -2.644f, 2.088f, -7.5f, 5.5f, -7.5f)
                reflectiveCurveToRelative(5.5f, 4.856f, 5.5f, 7.5f)
                curveToRelative(0.0f, 2.512f, -1.695f, 4.632f, -4.0f, 5.287f)
                close()
                moveTo(21.0f, 7.499f)
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
