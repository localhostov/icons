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

public val Icons.Filled.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 20.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.15f, 0.667f, -2.04f, 1.33f, -2.725f)
                curveToRelative(0.0f, 0.0f, -0.185f, 1.725f, 0.67f, 1.725f)
                curveToRelative(1.812f, 0.0f, 0.786f, -2.59f, 2.0f, -3.991f)
                curveToRelative(1.263f, 1.263f, 4.0f, 2.675f, 4.0f, 4.991f)
                close()
                moveTo(13.01f, 20.51f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.01f, -1.01f)
                lineToRelative(-1.01f, 1.01f)
                curveToRelative(-0.558f, 0.558f, -0.558f, 1.462f, 0.0f, 2.021f)
                curveToRelative(0.558f, 0.558f, 1.462f, 0.558f, 2.02f, 0.0f)
                curveToRelative(0.558f, -0.558f, 0.558f, -1.462f, 0.0f, -2.021f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-11.132f)
                curveToRelative(-0.917f, -0.574f, -3.285f, -1.868f, -6.0f, -1.868f)
                curveToRelative(-2.732f, 0.0f, -5.088f, 1.292f, -6.0f, 1.866f)
                verticalLineToRelative(11.134f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(1.0f, 6.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(0.052f, 2.114f)
                curveTo(-0.217f, 1.04f, 0.595f, 0.0f, 1.702f, 0.0f)
                horizontalLineToRelative(20.595f)
                curveToRelative(1.107f, 0.0f, 1.919f, 1.04f, 1.651f, 2.114f)
                lineToRelative(-0.948f, 1.886f)
                lineTo(1.0f, 4.0f)
                lineTo(0.052f, 2.114f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
