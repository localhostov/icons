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

public val Icons.Outline.HatChef: ImageVector
    get() {
        if (_hatChef != null) {
            return _hatChef!!
        }
        _hatChef = Builder(name = "HatChef", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.836f, 4.705f)
                curveToRelative(-0.763f, -3.113f, -5.05f, -4.759f, -7.676f, -3.084f)
                arcToRelative(6.16f, 6.16f, 0.0f, false, false, -8.32f, 0.0f)
                curveTo(1.409f, -1.658f, -3.587f, 7.73f, 3.326f, 10.713f)
                arcTo(0.934f, 0.934f, 0.0f, false, true, 4.0f, 11.564f)
                verticalLineTo(19.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 20.0f, 19.5f)
                verticalLineTo(11.564f)
                arcToRelative(0.934f, 0.934f, 0.0f, false, true, 0.674f, -0.851f)
                arcTo(5.017f, 5.017f, 0.0f, false, false, 23.836f, 4.705f)
                close()
                moveTo(18.0f, 19.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 22.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.588f, 2.588f, 0.0f, false, true, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(20.0f, 8.828f)
                arcToRelative(2.912f, 2.912f, 0.0f, false, false, -2.0f, 2.736f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.564f)
                arcTo(2.912f, 2.912f, 0.0f, false, false, 4.0f, 8.828f)
                arcTo(3.027f, 3.027f, 0.0f, false, true, 2.1f, 5.2f)
                curveToRelative(0.586f, -2.1f, 3.729f, -2.979f, 5.183f, -1.5f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 1.543f, -0.14f)
                curveToRelative(1.247f, -2.08f, 5.095f, -2.08f, 6.342f, 0.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 1.543f, 0.14f)
                arcToRelative(3.168f, 3.168f, 0.0f, false, true, 2.9f, -0.641f)
                horizontalLineToRelative(0.0f)
                arcTo(3.013f, 3.013f, 0.0f, false, true, 20.0f, 8.828f)
                close()
            }
        }
        .build()
        return _hatChef!!
    }

private var _hatChef: ImageVector? = null
