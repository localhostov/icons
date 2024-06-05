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

public val Icons.Bold.Butter: ImageVector
    get() {
        if (_butter != null) {
            return _butter!!
        }
        _butter = Builder(name = "Butter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.036f)
                curveToRelative(0.243f, 1.694f, 1.704f, 3.0f, 3.464f, 3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.76f, 0.0f, 3.221f, -1.306f, 3.464f, -3.0f)
                horizontalLineToRelative(1.036f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.0f, 5.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 5.5f)
                curveToRelative(0.0f, -0.17f, -0.012f, -0.337f, -0.036f, -0.5f)
                horizontalLineToRelative(1.536f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                close()
                moveTo(4.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                lineTo(4.0f, 16.0f)
                lineTo(4.0f, 5.5f)
                close()
            }
        }
        .build()
        return _butter!!
    }

private var _butter: ImageVector? = null
