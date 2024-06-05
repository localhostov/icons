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
                moveTo(17.566f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(6.434f)
                lineToRelative(-0.291f, -0.485f)
                curveTo(3.283f, 18.748f, 0.0f, 12.45f, 0.0f, 6.0f)
                arcTo(5.785f, 5.785f, 0.0f, false, true, 6.0f, 0.0f)
                arcTo(12.8f, 12.8f, 0.0f, false, true, 9.915f, 0.615f)
                arcTo(7.037f, 7.037f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(7.037f, 7.037f, 0.0f, false, false, 14.085f, 0.615f)
                arcTo(12.792f, 12.792f, 0.0f, false, true, 18.0f, 0.0f)
                arcToRelative(5.785f, 5.785f, 0.0f, false, true, 6.0f, 6.0f)
                curveToRelative(0.0f, 6.45f, -3.282f, 12.748f, -6.143f, 17.515f)
                close()
                moveTo(15.0f, 22.0f)
                horizontalLineToRelative(1.432f)
                curveTo(19.086f, 17.519f, 22.0f, 11.749f, 22.0f, 6.0f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(10.752f, 10.752f, 0.0f, false, false, -3.358f, 0.536f)
                arcTo(8.959f, 8.959f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(8.953f, 8.953f, 0.0f, false, true, -2.642f, -0.464f)
                arcTo(10.758f, 10.758f, 0.0f, false, false, 6.0f, 2.0f)
                curveTo(2.045f, 2.0f, 2.0f, 5.837f, 2.0f, 6.0f)
                curveToRelative(0.0f, 5.749f, 2.914f, 11.519f, 5.568f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
