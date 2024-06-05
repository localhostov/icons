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

public val Icons.Bold.Up: ImageVector
    get() {
        if (_up != null) {
            return _up!!
        }
        _up = Builder(name = "Up", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 11.0f)
                lineTo(-0.01f, 11.0f)
                lineTo(9.67f, 0.97f)
                curveTo(10.29f, 0.35f, 11.12f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.88f, 0.0f, 1.71f, 0.34f, 2.33f, 0.97f)
                lineToRelative(9.7f, 10.03f)
                horizontalLineToRelative(-7.04f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(10.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(2.96f)
                lineTo(12.19f, 3.07f)
                curveToRelative(-0.06f, -0.06f, -0.14f, -0.07f, -0.19f, -0.07f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.05f, 0.0f, -0.13f, 0.01f, -0.2f, 0.08f)
                lineToRelative(-4.75f, 4.92f)
                horizontalLineToRelative(2.95f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _up!!
    }

private var _up: ImageVector? = null
