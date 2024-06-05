package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.BrokenImage: ImageVector
    get() {
        if (_brokenImage != null) {
            return _brokenImage!!
        }
        _brokenImage = Builder(name = "BrokenImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.95f, 5.54f)
                lineToRelative(-3.49f, -3.49f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                lineTo(7.0f, 0.0f)
                curveTo(4.24f, 0.0f, 2.0f, 2.24f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(22.0f, 10.49f)
                curveToRelative(0.0f, -1.87f, -0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(18.54f, 6.95f)
                curveToRelative(0.32f, 0.32f, 0.59f, 0.67f, 0.81f, 1.05f)
                horizontalLineToRelative(-4.34f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(14.01f, 2.66f)
                curveToRelative(0.38f, 0.22f, 0.73f, 0.49f, 1.05f, 0.81f)
                lineToRelative(3.49f, 3.49f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0.0f, 0.33f, 0.0f, 0.49f, 0.02f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.98f)
                curveToRelative(0.02f, 0.16f, 0.02f, 0.32f, 0.02f, 0.49f)
                verticalLineToRelative(4.58f)
                lineToRelative(-2.41f, -2.41f)
                curveToRelative(-0.87f, -0.87f, -2.28f, -0.87f, -3.15f, 0.0f)
                lineToRelative(-2.27f, 2.27f)
                curveToRelative(-0.09f, 0.09f, -0.23f, 0.09f, -0.32f, 0.0f)
                lineToRelative(-2.27f, -2.27f)
                curveToRelative(-0.87f, -0.87f, -2.28f, -0.87f, -3.15f, 0.0f)
                lineToRelative(-2.44f, 2.44f)
                lineTo(3.99f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-1.07f)
                lineToRelative(3.86f, -3.86f)
                curveToRelative(0.09f, -0.09f, 0.23f, -0.09f, 0.32f, 0.0f)
                lineToRelative(2.27f, 2.27f)
                curveToRelative(0.87f, 0.87f, 2.28f, 0.87f, 3.15f, 0.0f)
                lineToRelative(2.27f, -2.27f)
                curveToRelative(0.09f, -0.09f, 0.23f, -0.09f, 0.32f, 0.0f)
                lineToRelative(3.83f, 3.83f)
                verticalLineToRelative(1.1f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _brokenImage!!
    }

private var _brokenImage: ImageVector? = null
