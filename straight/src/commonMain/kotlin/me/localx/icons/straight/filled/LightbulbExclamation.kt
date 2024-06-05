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

public val Icons.Filled.LightbulbExclamation: ImageVector
    get() {
        if (_lightbulbExclamation != null) {
            return _lightbulbExclamation!!
        }
        _lightbulbExclamation = Builder(name = "LightbulbExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.868f, 15.583f)
                curveToRelative(0.77f, 0.716f, 1.345f, 1.539f, 1.703f, 2.417f)
                horizontalLineToRelative(8.839f)
                curveToRelative(0.328f, -0.875f, 0.845f, -1.644f, 1.521f, -2.237f)
                curveToRelative(1.95f, -1.708f, 3.068f, -4.173f, 3.068f, -6.763f)
                curveToRelative(0.0f, -2.56f, -1.096f, -5.007f, -3.006f, -6.714f)
                curveTo(16.086f, 0.581f, 13.522f, -0.231f, 10.956f, 0.059f)
                curveTo(6.904f, 0.517f, 3.59f, 3.782f, 3.075f, 7.822f)
                curveToRelative(-0.374f, 2.931f, 0.644f, 5.76f, 2.793f, 7.761f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.007f, 20.0f)
                curveToRelative(-0.005f, 0.104f, -0.007f, 0.209f, -0.007f, 0.315f)
                verticalLineToRelative(3.685f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.851f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.1f, -0.002f, -0.149f)
                horizontalLineToRelative(8.009f)
                close()
            }
        }
        .build()
        return _lightbulbExclamation!!
    }

private var _lightbulbExclamation: ImageVector? = null
