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

public val Icons.Bold.ColonSign: ImageVector
    get() {
        if (_colonSign != null) {
            return _colonSign!!
        }
        _colonSign = Builder(name = "ColonSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.17f, 19.92f)
                lineToRelative(3.72f, -13.81f)
                curveToRelative(0.36f, 0.41f, 0.67f, 0.87f, 0.92f, 1.37f)
                lineToRelative(2.69f, -1.34f)
                curveToRelative(-0.66f, -1.33f, -1.6f, -2.45f, -2.73f, -3.3f)
                lineToRelative(0.77f, -2.85f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-0.38f, 1.42f)
                curveToRelative(-0.71f, -0.22f, -1.45f, -0.36f, -2.22f, -0.41f)
                lineToRelative(0.27f, -1.02f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-0.28f, 1.03f)
                curveTo(5.79f, 1.38f, 2.0f, 5.39f, 2.0f, 10.27f)
                verticalLineToRelative(3.46f)
                curveToRelative(0.0f, 2.83f, 1.27f, 5.36f, 3.27f, 7.06f)
                lineToRelative(-0.86f, 3.21f)
                horizontalLineToRelative(3.17f)
                lineToRelative(0.43f, -1.59f)
                curveToRelative(0.69f, 0.26f, 1.43f, 0.44f, 2.19f, 0.53f)
                lineToRelative(-0.29f, 1.06f)
                horizontalLineToRelative(3.17f)
                lineToRelative(0.27f, -1.0f)
                curveToRelative(3.42f, -0.06f, 6.51f, -1.97f, 8.09f, -5.02f)
                lineToRelative(-2.67f, -1.38f)
                curveToRelative(-0.93f, 1.8f, -2.64f, 3.01f, -4.59f, 3.32f)
                close()
                moveTo(5.0f, 13.73f)
                verticalLineToRelative(-3.46f)
                curveToRelative(0.0f, -2.93f, 2.02f, -5.4f, 4.74f, -6.08f)
                lineToRelative(-3.55f, 13.2f)
                curveToRelative(-0.74f, -1.03f, -1.18f, -2.3f, -1.18f, -3.66f)
                close()
                moveTo(8.79f, 19.49f)
                lineTo(12.96f, 4.0f)
                horizontalLineToRelative(0.23f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.11f, 2.01f, 0.33f)
                lineToRelative(-4.22f, 15.67f)
                curveToRelative(-0.78f, -0.04f, -1.51f, -0.21f, -2.19f, -0.51f)
                close()
            }
        }
        .build()
        return _colonSign!!
    }

private var _colonSign: ImageVector? = null
