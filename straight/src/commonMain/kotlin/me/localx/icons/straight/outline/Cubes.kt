package me.localx.icons.straight.outline

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
                moveTo(18.5f, 9.85f)
                lineTo(18.5f, 3.56f)
                lineTo(12.99f, 0.41f)
                curveToRelative(-0.61f, -0.35f, -1.37f, -0.35f, -1.98f, 0.0f)
                lineTo(5.5f, 3.56f)
                verticalLineToRelative(6.29f)
                lineTo(0.0f, 12.99f)
                verticalLineToRelative(7.45f)
                lineToRelative(5.51f, 3.15f)
                curveToRelative(0.31f, 0.17f, 0.65f, 0.26f, 0.99f, 0.26f)
                reflectiveCurveToRelative(0.69f, -0.09f, 0.99f, -0.26f)
                lineToRelative(4.51f, -2.58f)
                lineToRelative(4.51f, 2.58f)
                curveToRelative(0.31f, 0.17f, 0.65f, 0.26f, 0.99f, 0.26f)
                reflectiveCurveToRelative(0.69f, -0.09f, 0.99f, -0.26f)
                lineToRelative(5.51f, -3.15f)
                verticalLineToRelative(-7.45f)
                lineToRelative(-5.5f, -3.14f)
                close()
                moveTo(17.5f, 15.56f)
                lineToRelative(-3.48f, -1.99f)
                lineToRelative(3.48f, -1.99f)
                lineToRelative(3.48f, 1.99f)
                lineToRelative(-3.48f, 1.99f)
                close()
                moveTo(7.5f, 5.86f)
                lineToRelative(3.5f, 2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, -2.0f)
                verticalLineToRelative(-3.98f)
                close()
                moveTo(13.0f, 11.84f)
                verticalLineToRelative(-3.98f)
                lineToRelative(3.5f, -2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, 2.0f)
                close()
                moveTo(9.98f, 13.57f)
                lineToRelative(-3.48f, 1.99f)
                lineToRelative(-3.48f, -1.99f)
                lineToRelative(3.48f, -1.99f)
                lineToRelative(3.48f, 1.99f)
                close()
                moveTo(7.5f, 17.29f)
                lineToRelative(3.5f, -2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, 2.0f)
                verticalLineToRelative(-3.98f)
                close()
                moveTo(12.0f, 2.15f)
                lineToRelative(3.48f, 1.99f)
                lineToRelative(-3.48f, 1.99f)
                lineToRelative(-3.48f, -1.99f)
                lineToRelative(3.48f, -1.99f)
                close()
                moveTo(2.0f, 15.3f)
                lineToRelative(3.5f, 2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, -2.0f)
                verticalLineToRelative(-3.98f)
                close()
                moveTo(13.0f, 15.3f)
                lineToRelative(3.5f, 2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, -2.0f)
                verticalLineToRelative(-3.98f)
                close()
                moveTo(18.5f, 21.28f)
                verticalLineToRelative(-3.98f)
                lineToRelative(3.5f, -2.0f)
                verticalLineToRelative(3.98f)
                lineToRelative(-3.5f, 2.0f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
