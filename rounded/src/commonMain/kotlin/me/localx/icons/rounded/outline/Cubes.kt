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

public val Icons.Outline.Cubes: ImageVector
    get() {
        if (_cubes != null) {
            return _cubes!!
        }
        _cubes = Builder(name = "Cubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.49f, 12.13f)
                lineToRelative(-3.99f, -2.28f)
                lineTo(18.5f, 5.3f)
                curveToRelative(0.0f, -1.07f, -0.58f, -2.07f, -1.51f, -2.6f)
                lineTo(13.49f, 0.7f)
                curveToRelative(-0.92f, -0.52f, -2.06f, -0.52f, -2.98f, 0.0f)
                lineToRelative(-3.5f, 2.0f)
                curveToRelative(-0.93f, 0.53f, -1.51f, 1.53f, -1.51f, 2.6f)
                verticalLineToRelative(4.55f)
                lineToRelative(-3.99f, 2.28f)
                curveToRelative(-0.93f, 0.53f, -1.51f, 1.53f, -1.51f, 2.6f)
                verticalLineToRelative(3.96f)
                curveToRelative(0.0f, 1.07f, 0.58f, 2.07f, 1.51f, 2.6f)
                lineToRelative(3.5f, 2.0f)
                curveToRelative(0.46f, 0.26f, 0.97f, 0.39f, 1.49f, 0.39f)
                reflectiveCurveToRelative(1.03f, -0.13f, 1.49f, -0.39f)
                lineToRelative(4.01f, -2.29f)
                lineToRelative(4.01f, 2.29f)
                curveToRelative(0.46f, 0.26f, 0.97f, 0.39f, 1.49f, 0.39f)
                reflectiveCurveToRelative(1.03f, -0.13f, 1.49f, -0.39f)
                lineToRelative(3.5f, -2.0f)
                curveToRelative(0.93f, -0.53f, 1.51f, -1.53f, 1.51f, -2.6f)
                verticalLineToRelative(-3.96f)
                curveToRelative(0.0f, -1.07f, -0.58f, -2.07f, -1.51f, -2.6f)
                close()
                moveTo(17.5f, 15.56f)
                lineToRelative(-3.48f, -1.99f)
                lineToRelative(3.48f, -1.99f)
                lineToRelative(3.48f, 1.99f)
                lineToRelative(-3.48f, 1.99f)
                close()
                moveTo(6.5f, 15.56f)
                lineToRelative(-3.48f, -1.99f)
                lineToRelative(3.48f, -1.99f)
                lineToRelative(3.48f, 1.99f)
                lineToRelative(-3.48f, 1.99f)
                close()
                moveTo(11.0f, 7.86f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, -2.0f)
                verticalLineToRelative(-3.98f)
                lineToRelative(3.5f, 2.0f)
                close()
                moveTo(16.5f, 5.86f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, 2.0f)
                verticalLineToRelative(-3.98f)
                lineToRelative(3.5f, -2.0f)
                close()
                moveTo(11.5f, 2.43f)
                curveToRelative(0.3f, -0.17f, 0.69f, -0.17f, 0.99f, 0.0f)
                lineToRelative(2.99f, 1.71f)
                lineToRelative(-3.48f, 1.99f)
                lineToRelative(-3.48f, -1.99f)
                lineToRelative(2.99f, -1.71f)
                close()
                moveTo(2.5f, 19.56f)
                curveToRelative(-0.31f, -0.18f, -0.5f, -0.51f, -0.5f, -0.87f)
                verticalLineToRelative(-3.4f)
                lineToRelative(3.5f, 2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.0f, -1.71f)
                close()
                moveTo(7.5f, 21.27f)
                verticalLineToRelative(-3.98f)
                lineToRelative(3.5f, -2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, 2.0f)
                close()
                moveTo(13.0f, 19.27f)
                verticalLineToRelative(-3.98f)
                lineToRelative(3.5f, 2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, -2.0f)
                close()
                moveTo(21.5f, 19.56f)
                lineToRelative(-3.0f, 1.71f)
                verticalLineToRelative(-3.98f)
                lineToRelative(3.5f, -2.0f)
                verticalLineToRelative(3.4f)
                curveToRelative(0.0f, 0.36f, -0.19f, 0.69f, -0.5f, 0.87f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
