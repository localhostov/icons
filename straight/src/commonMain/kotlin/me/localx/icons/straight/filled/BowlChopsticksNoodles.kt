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

public val Icons.Filled.BowlChopsticksNoodles: ImageVector
    get() {
        if (_bowlChopsticksNoodles != null) {
            return _bowlChopsticksNoodles!!
        }
        _bowlChopsticksNoodles = Builder(name = "BowlChopsticksNoodles", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.298f, 11.078f)
                curveToRelative(-0.575f, -0.681f, -1.414f, -1.07f, -2.303f, -1.07f)
                horizontalLineToRelative(-8.99f)
                verticalLineToRelative(-3.001f)
                horizontalLineToRelative(11.995f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-11.995f)
                verticalLineToRelative(-1.929f)
                lineToRelative(11.978f, -0.572f)
                lineToRelative(-0.096f, -1.998f)
                lineTo(2.951f, 1.508f)
                lineToRelative(0.096f, 1.998f)
                lineToRelative(1.959f, -0.094f)
                verticalLineToRelative(1.595f)
                horizontalLineToRelative(-2.007f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.007f)
                verticalLineToRelative(3.001f)
                horizontalLineToRelative(-1.991f)
                curveToRelative(-0.889f, 0.0f, -1.729f, 0.391f, -2.304f, 1.07f)
                curveToRelative(-0.568f, 0.672f, -0.81f, 1.553f, -0.664f, 2.415f)
                curveToRelative(0.778f, 4.601f, 3.866f, 8.689f, 7.733f, 10.515f)
                horizontalLineToRelative(8.45f)
                curveToRelative(3.867f, -1.826f, 6.955f, -5.914f, 7.733f, -10.515f)
                curveToRelative(0.146f, -0.863f, -0.096f, -1.743f, -0.665f, -2.415f)
                close()
                moveTo(10.005f, 10.008f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.001f)
                close()
                moveTo(10.005f, 5.007f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.69f)
                lineToRelative(3.0f, -0.143f)
                verticalLineToRelative(1.833f)
                close()
            }
        }
        .build()
        return _bowlChopsticksNoodles!!
    }

private var _bowlChopsticksNoodles: ImageVector? = null
