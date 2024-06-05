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

public val Icons.Outline.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.909f, 24.0f)
                arcTo(2.912f, 2.912f, 0.0f, false, true, 13.0f, 21.091f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(6.091f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, -5.418f, 1.476f)
                curveTo(3.186f, 18.463f, 0.0f, 12.279f, 0.0f, 6.0f)
                arcTo(5.785f, 5.785f, 0.0f, false, true, 6.0f, 0.0f)
                arcTo(12.8f, 12.8f, 0.0f, false, true, 9.915f, 0.615f)
                arcTo(7.037f, 7.037f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(7.037f, 7.037f, 0.0f, false, false, 14.085f, 0.615f)
                arcTo(12.792f, 12.792f, 0.0f, false, true, 18.0f, 0.0f)
                arcToRelative(5.785f, 5.785f, 0.0f, false, true, 6.0f, 6.0f)
                curveToRelative(0.0f, 6.278f, -3.186f, 12.462f, -5.582f, 16.567f)
                arcTo(2.911f, 2.911f, 0.0f, false, true, 15.909f, 24.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(6.091f)
                arcToRelative(0.911f, 0.911f, 0.0f, false, false, 1.691f, 0.469f)
                curveTo(18.97f, 17.654f, 22.0f, 11.793f, 22.0f, 6.0f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(10.752f, 10.752f, 0.0f, false, false, -3.358f, 0.536f)
                arcTo(8.959f, 8.959f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(8.953f, 8.953f, 0.0f, false, true, -2.642f, -0.464f)
                arcTo(10.758f, 10.758f, 0.0f, false, false, 6.0f, 2.0f)
                curveTo(2.045f, 2.0f, 2.0f, 5.837f, 2.0f, 6.0f)
                curveToRelative(0.0f, 5.794f, 3.03f, 11.655f, 5.31f, 15.56f)
                arcTo(0.91f, 0.91f, 0.0f, false, false, 9.0f, 21.091f)
                verticalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
