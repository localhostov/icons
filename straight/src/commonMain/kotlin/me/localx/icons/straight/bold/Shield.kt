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

public val Icons.Bold.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.922f, 24.0f)
                lineToRelative(-0.531f, -0.237f)
                curveTo(11.007f, 23.589f, 2.0f, 19.5f, 2.0f, 12.0f)
                verticalLineTo(5.525f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.052f, 2.679f)
                lineTo(12.0f, 0.03f)
                lineToRelative(7.949f, 2.65f)
                arcTo(2.994f, 2.994f, 0.0f, false, true, 22.0f, 5.525f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 8.539f, -9.137f, 11.682f, -9.526f, 11.812f)
                close()
                moveTo(12.0f, 3.192f)
                lineTo(5.0f, 5.525f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 4.67f, 5.344f, 7.847f, 7.077f, 8.753f)
                curveTo(13.819f, 20.026f, 19.0f, 17.408f, 19.0f, 12.0f)
                verticalLineTo(5.525f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
