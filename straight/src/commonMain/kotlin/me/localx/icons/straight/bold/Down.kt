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

public val Icons.Bold.Down: ImageVector
    get() {
        if (_down != null) {
            return _down!!
        }
        _down = Builder(name = "Down", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.88f, 0.0f, -1.71f, -0.35f, -2.33f, -0.97f)
                horizontalLineToRelative(-0.01f)
                reflectiveCurveTo(-0.01f, 13.0f, -0.01f, 13.0f)
                lineTo(7.0f, 13.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(7.04f)
                lineToRelative(-9.69f, 10.02f)
                curveToRelative(-0.64f, 0.64f, -1.47f, 0.98f, -2.35f, 0.98f)
                close()
                moveTo(11.8f, 20.92f)
                curveToRelative(0.07f, 0.07f, 0.15f, 0.08f, 0.2f, 0.08f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.05f, 0.0f, 0.13f, -0.01f, 0.21f, -0.09f)
                lineToRelative(4.75f, -4.91f)
                horizontalLineToRelative(-2.96f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.95f)
                lineToRelative(4.75f, 4.92f)
                close()
            }
        }
        .build()
        return _down!!
    }

private var _down: ImageVector? = null
