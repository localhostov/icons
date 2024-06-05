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

public val Icons.Bold.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.01f, 17.51f)
                curveToRelative(0.558f, 0.558f, 0.558f, 1.463f, 0.0f, 2.021f)
                curveToRelative(-0.558f, 0.558f, -1.462f, 0.558f, -2.02f, 0.0f)
                curveToRelative(-0.558f, -0.558f, -0.558f, -1.463f, 0.0f, -2.021f)
                lineToRelative(1.01f, -1.01f)
                lineToRelative(1.01f, 1.01f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(1.0f, 4.0f)
                lineTo(0.052f, 2.114f)
                curveTo(-0.217f, 1.04f, 0.595f, 0.0f, 1.702f, 0.0f)
                horizontalLineToRelative(20.595f)
                curveToRelative(1.107f, 0.0f, 1.919f, 1.04f, 1.651f, 2.114f)
                lineToRelative(-0.948f, 1.886f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveToRelative(0.0f, -2.316f, -2.737f, -3.728f, -4.0f, -4.991f)
                curveToRelative(-1.214f, 1.402f, -0.188f, 3.991f, -2.0f, 3.991f)
                curveToRelative(-0.855f, 0.0f, -0.67f, -1.725f, -0.67f, -1.725f)
                curveToRelative(-0.664f, 0.685f, -1.33f, 1.574f, -1.33f, 2.725f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                close()
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                reflectiveCurveToRelative(2.686f, -2.0f, 6.0f, -2.0f)
                reflectiveCurveToRelative(6.0f, 2.0f, 6.0f, 2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
