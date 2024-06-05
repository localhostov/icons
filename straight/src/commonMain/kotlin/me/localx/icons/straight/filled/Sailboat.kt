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

public val Icons.Filled.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.744f, 24.0f)
                horizontalLineToRelative(-3.53f)
                curveTo(1.272f, 24.0f, 0.153f, 16.208f, 0.143f, 16.129f)
                lineTo(-0.004f, 15.0f)
                horizontalLineToRelative(24.026f)
                lineToRelative(-0.157f, 1.137f)
                curveToRelative(-0.011f, 0.078f, -1.186f, 7.863f, -10.121f, 7.863f)
                close()
                moveTo(23.974f, 13.0f)
                horizontalLineToRelative(-11.975f)
                lineToRelative(0.009f, -12.981f)
                lineToRelative(11.966f, 12.981f)
                close()
                moveTo(9.999f, 13.0f)
                lineTo(0.127f, 13.0f)
                lineTo(10.0f, 1.865f)
                verticalLineToRelative(11.135f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
