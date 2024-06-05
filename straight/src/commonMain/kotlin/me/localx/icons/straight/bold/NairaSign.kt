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

public val Icons.Bold.NairaSign: ImageVector
    get() {
        if (_nairaSign != null) {
            return _nairaSign!!
        }
        _nairaSign = Builder(name = "NairaSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.0f, 10.5f)
                horizontalLineToRelative(-6.17f)
                lineTo(6.93f, 1.2f)
                curveTo(6.29f, 0.19f, 5.08f, -0.27f, 3.94f, 0.06f)
                curveToRelative(-1.16f, 0.34f, -1.94f, 1.38f, -1.94f, 2.59f)
                verticalLineToRelative(7.85f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 13.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 13.5f)
                horizontalLineToRelative(6.17f)
                lineToRelative(5.89f, 9.3f)
                curveToRelative(0.5f, 0.79f, 1.35f, 1.25f, 2.25f, 1.25f)
                curveToRelative(0.25f, 0.0f, 0.5f, -0.04f, 0.75f, -0.11f)
                curveToRelative(1.16f, -0.34f, 1.94f, -1.38f, 1.94f, -2.59f)
                verticalLineToRelative(-7.85f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 10.5f)
                lineTo(5.0f, 3.76f)
                lineToRelative(4.27f, 6.74f)
                lineTo(5.0f, 10.5f)
                close()
                moveTo(19.0f, 20.24f)
                lineToRelative(-4.27f, -6.74f)
                horizontalLineToRelative(4.27f)
                verticalLineToRelative(6.74f)
                close()
            }
        }
        .build()
        return _nairaSign!!
    }

private var _nairaSign: ImageVector? = null
