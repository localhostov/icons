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

public val Icons.Outline.Cupcake: ImageVector
    get() {
        if (_cupcake != null) {
            return _cupcake!!
        }
        _cupcake = Builder(name = "Cupcake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.679f, 11.408f)
                arcToRelative(12.057f, 12.057f, 0.0f, false, false, -8.968f, -7.144f)
                arcToRelative(2.994f, 2.994f, 0.0f, true, false, -5.422f, 0.0f)
                arcTo(12.058f, 12.058f, 0.0f, false, false, 0.324f, 11.408f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, false, 0.353f, 3.811f)
                arcToRelative(3.989f, 3.989f, 0.0f, false, false, 1.4f, 1.284f)
                lineToRelative(0.6f, 3.372f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 7.6f, 24.0f)
                lineTo(16.4f, 24.0f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, false, 4.922f, -4.125f)
                lineToRelative(0.6f, -3.371f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, 1.4f, -1.284f)
                arcTo(4.043f, 4.043f, 0.0f, false, false, 23.679f, 11.408f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(19.357f, 19.525f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.4f, 22.0f)
                lineTo(7.6f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.954f, -2.475f)
                lineToRelative(-0.371f, -2.08f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 17.22f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.728f, 0.225f)
                close()
                moveTo(21.657f, 14.112f)
                arcTo(1.956f, 1.956f, 0.0f, false, true, 20.0f, 15.0f)
                arcToRelative(1.645f, 1.645f, 0.0f, false, false, -1.22f, 0.625f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -1.56f, 0.0f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, false, -2.44f, 0.0f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -1.56f, 0.0f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, false, -2.44f, 0.0f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -1.56f, 0.0f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, false, -2.44f, 0.0f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -1.56f, 0.0f)
                arcTo(1.643f, 1.643f, 0.0f, false, false, 4.0f, 15.0f)
                arcToRelative(1.955f, 1.955f, 0.0f, false, true, -1.656f, -0.888f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, true, -0.177f, -1.928f)
                curveToRelative(3.267f, -8.2f, 16.4f, -8.2f, 19.668f, 0.0f)
                arcTo(2.016f, 2.016f, 0.0f, false, true, 21.658f, 14.112f)
                close()
            }
        }
        .build()
        return _cupcake!!
    }

private var _cupcake: ImageVector? = null
