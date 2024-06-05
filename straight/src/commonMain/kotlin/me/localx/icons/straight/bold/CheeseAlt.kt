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

public val Icons.Bold.CheeseAlt: ImageVector
    get() {
        if (_cheeseAlt != null) {
            return _cheeseAlt!!
        }
        _cheeseAlt = Builder(name = "CheeseAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.0f)
                curveToRelative(0.0f, 2.34f, 0.62f, 4.22f, 1.14f, 5.39f)
                curveToRelative(0.71f, 1.59f, 2.31f, 2.61f, 4.09f, 2.61f)
                lineTo(24.0f, 24.0f)
                reflectiveCurveToRelative(0.0f, -15.23f, 0.0f, -15.23f)
                lineTo(14.03f, 0.93f)
                curveTo(13.13f, 0.33f, 12.09f, 0.01f, 11.02f, 0.0f)
                curveToRelative(-1.23f, -0.01f, -2.33f, 0.35f, -3.27f, 1.06f)
                curveTo(2.89f, 4.69f, 1.03f, 10.52f, 0.63f, 11.97f)
                curveTo(0.21f, 13.26f, 0.0f, 14.63f, 0.0f, 16.0f)
                close()
                moveTo(18.17f, 8.0f)
                lineTo(5.59f, 8.0f)
                curveToRelative(0.94f, -1.58f, 2.22f, -3.25f, 3.95f, -4.54f)
                curveToRelative(0.41f, -0.31f, 0.95f, -0.47f, 1.44f, -0.46f)
                curveToRelative(0.47f, 0.0f, 0.94f, 0.14f, 1.34f, 0.4f)
                lineToRelative(5.85f, 4.6f)
                close()
                moveTo(3.0f, 16.0f)
                curveToRelative(0.0f, -2.09f, 0.76f, -3.89f, 0.88f, -4.16f)
                curveToRelative(0.23f, -0.51f, 0.76f, -0.84f, 1.35f, -0.84f)
                horizontalLineToRelative(15.77f)
                verticalLineToRelative(10.0f)
                lineTo(5.23f, 21.0f)
                curveToRelative(-0.59f, 0.0f, -1.12f, -0.33f, -1.35f, -0.84f)
                curveToRelative(-0.4f, -0.9f, -0.88f, -2.34f, -0.88f, -4.16f)
                close()
            }
        }
        .build()
        return _cheeseAlt!!
    }

private var _cheeseAlt: ImageVector? = null
