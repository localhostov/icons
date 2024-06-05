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

public val Icons.Filled.SnowmanAlt: ImageVector
    get() {
        if (_snowmanAlt != null) {
            return _snowmanAlt!!
        }
        _snowmanAlt = Builder(name = "SnowmanAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.0f)
                horizontalLineToRelative(-2.657f)
                lineToRelative(-3.867f, 3.008f)
                curveToRelative(-0.257f, 2.796f, -2.615f, 4.992f, -5.476f, 4.992f)
                reflectiveCurveToRelative(-5.219f, -2.197f, -5.476f, -4.992f)
                lineToRelative(-3.867f, -3.008f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.511f)
                lineToRelative(2.804f, 2.181f)
                curveToRelative(0.195f, -0.562f, 0.481f, -1.089f, 0.848f, -1.561f)
                curveToRelative(1.094f, 1.151f, 2.639f, 1.87f, 4.348f, 1.87f)
                reflectiveCurveToRelative(3.254f, -0.719f, 4.348f, -1.87f)
                curveToRelative(0.367f, 0.472f, 0.653f, 0.999f, 0.848f, 1.561f)
                lineToRelative(2.804f, -2.181f)
                verticalLineToRelative(-2.511f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.91f, 0.0f, -5.438f, -1.666f, -6.681f, -4.094f)
                curveToRelative(-0.21f, 0.67f, -0.319f, 1.375f, -0.319f, 2.094f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -0.713f, -0.11f, -1.418f, -0.32f, -2.091f)
                curveToRelative(-1.243f, 2.427f, -3.771f, 4.091f, -6.68f, 4.091f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveTo(14.209f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _snowmanAlt!!
    }

private var _snowmanAlt: ImageVector? = null
