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

public val Icons.Filled.Tamale: ImageVector
    get() {
        if (_tamale != null) {
            return _tamale!!
        }
        _tamale = Builder(name = "Tamale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.975f, 4.901f)
                lineToRelative(-0.799f, 7.188f)
                curveToRelative(-0.056f, 0.506f, -0.484f, 0.889f, -0.994f, 0.889f)
                lineTo(3.682f, 12.978f)
                curveToRelative(-0.509f, 0.0f, -0.937f, -0.383f, -0.994f, -0.889f)
                lineToRelative(-0.799f, -7.188f)
                curveTo(1.653f, 2.775f, 3.133f, 0.845f, 5.246f, 0.506f)
                curveToRelative(0.355f, -0.057f, 0.715f, -0.102f, 1.073f, -0.15f)
                lineToRelative(0.509f, 9.674f)
                curveToRelative(0.028f, 0.531f, 0.467f, 0.947f, 0.999f, 0.947f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.573f, 0.0f, 1.029f, -0.48f, 0.999f, -1.052f)
                lineTo(8.31f, 0.137f)
                curveToRelative(0.87f, -0.073f, 1.745f, -0.116f, 2.622f, -0.137f)
                verticalLineToRelative(9.978f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(12.932f, 0.0f)
                curveToRelative(0.877f, 0.02f, 1.752f, 0.063f, 2.622f, 0.137f)
                lineToRelative(-0.515f, 9.789f)
                curveToRelative(-0.03f, 0.572f, 0.426f, 1.052f, 0.999f, 1.052f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.532f, 0.0f, 0.971f, -0.416f, 0.999f, -0.947f)
                lineToRelative(0.509f, -9.674f)
                curveToRelative(0.359f, 0.048f, 0.719f, 0.093f, 1.074f, 0.15f)
                curveToRelative(2.113f, 0.339f, 3.592f, 2.268f, 3.356f, 4.395f)
                close()
                moveTo(8.843f, 15.0f)
                lineToRelative(-0.465f, 8.842f)
                curveToRelative(0.87f, 0.073f, 1.745f, 0.116f, 2.622f, 0.137f)
                verticalLineToRelative(-8.978f)
                horizontalLineToRelative(-2.157f)
                close()
                moveTo(2.311f, 15.89f)
                lineToRelative(-0.354f, 3.188f)
                curveToRelative(-0.236f, 2.127f, 1.244f, 4.057f, 3.357f, 4.395f)
                curveToRelative(0.355f, 0.057f, 0.714f, 0.102f, 1.072f, 0.15f)
                lineToRelative(0.454f, -8.622f)
                horizontalLineToRelative(-3.535f)
                curveToRelative(-0.51f, 0.0f, -0.938f, 0.383f, -0.994f, 0.89f)
                close()
                moveTo(20.694f, 15.0f)
                horizontalLineToRelative(-3.535f)
                lineToRelative(0.454f, 8.622f)
                curveToRelative(0.359f, -0.048f, 0.719f, -0.093f, 1.074f, -0.15f)
                curveToRelative(2.112f, -0.339f, 3.592f, -2.268f, 3.356f, -4.395f)
                lineToRelative(-0.355f, -3.188f)
                curveToRelative(-0.056f, -0.506f, -0.484f, -0.889f, -0.994f, -0.889f)
                close()
                moveTo(12.999f, 15.0f)
                verticalLineToRelative(8.978f)
                curveToRelative(0.877f, -0.02f, 1.752f, -0.063f, 2.622f, -0.137f)
                lineToRelative(-0.465f, -8.842f)
                horizontalLineToRelative(-2.157f)
                close()
            }
        }
        .build()
        return _tamale!!
    }

private var _tamale: ImageVector? = null
