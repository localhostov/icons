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

public val Icons.Filled.BugSlash: ImageVector
    get() {
        if (_bugSlash != null) {
            return _bugSlash!!
        }
        _bugSlash = Builder(name = "BugSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.43f, 20.65f)
                curveToRelative(-1.3f, 0.86f, -2.83f, 1.35f, -4.43f, 1.35f)
                curveToRelative(-2.95f, 0.0f, -5.53f, -1.61f, -6.92f, -4.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.26f)
                curveToRelative(-0.17f, -0.64f, -0.26f, -1.31f, -0.26f, -2.0f)
                curveToRelative(0.0f, -0.29f, 0.04f, -0.63f, 0.1f, -1.0f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.58f)
                curveToRelative(0.16f, -0.55f, 0.34f, -1.12f, 0.53f, -1.68f)
                lineToRelative(11.33f, 11.33f)
                close()
                moveTo(23.95f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(6.68f, 5.26f)
                curveToRelative(1.02f, -1.99f, 3.07f, -3.26f, 5.32f, -3.26f)
                curveToRelative(2.39f, 0.0f, 4.54f, 1.41f, 5.5f, 3.6f)
                curveToRelative(0.0f, 0.0f, 0.07f, 0.16f, 0.16f, 0.4f)
                horizontalLineToRelative(3.34f)
                lineTo(21.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 6.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.57f)
                curveToRelative(0.33f, 0.91f, 0.7f, 1.98f, 0.99f, 3.0f)
                horizontalLineToRelative(3.58f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.1f)
                curveToRelative(0.06f, 0.37f, 0.1f, 0.71f, 0.1f, 1.0f)
                curveToRelative(0.0f, 0.68f, -0.11f, 1.35f, -0.27f, 2.0f)
                horizontalLineToRelative(1.27f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(20.99f, 18.0f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(1.59f, 1.59f)
                verticalLineToRelative(-1.59f)
                close()
            }
        }
        .build()
        return _bugSlash!!
    }

private var _bugSlash: ImageVector? = null
