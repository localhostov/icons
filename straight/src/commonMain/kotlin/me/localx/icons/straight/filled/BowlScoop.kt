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

public val Icons.Filled.BowlScoop: ImageVector
    get() {
        if (_bowlScoop != null) {
            return _bowlScoop!!
        }
        _bowlScoop = Builder(name = "BowlScoop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 13.0f)
                lineToRelative(1.412f, 3.584f)
                curveToRelative(1.556f, 2.493f, 4.347f, 2.46f, 6.794f, 2.432f)
                curveToRelative(0.338f, -0.005f, 1.77f, -0.01f, 2.794f, -0.013f)
                verticalLineToRelative(2.998f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.998f)
                curveToRelative(1.024f, 0.003f, 3.348f, -0.002f, 3.627f, -0.002f)
                curveToRelative(2.228f, 0.0f, 4.577f, -0.197f, 5.961f, -2.416f)
                lineToRelative(1.412f, -3.584f)
                lineTo(0.0f, 13.001f)
                close()
                moveTo(1.0f, 11.0f)
                curveTo(1.0f, 4.935f, 5.935f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(11.0f, 4.935f, 11.0f, 11.0f)
                lineTo(1.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bowlScoop!!
    }

private var _bowlScoop: ImageVector? = null
