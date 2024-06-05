package me.localx.icons.rounded.bold

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

public val Icons.Bold.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 13.5f)
                horizontalLineToRelative(-21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(18.867f, 6.9f)
                arcToRelative(2.717f, 2.717f, 0.0f, false, false, -1.423f, -3.059f)
                quadToRelative(-0.061f, -0.031f, -0.126f, -0.057f)
                lineToRelative(-8.455f, -3.384f)
                arcToRelative(3.475f, 3.475f, 0.0f, false, false, -3.343f, 0.058f)
                arcToRelative(3.078f, 3.078f, 0.0f, false, false, -1.52f, 2.682f)
                verticalLineToRelative(2.645f)
                arcToRelative(3.218f, 3.218f, 0.0f, false, false, 3.215f, 3.215f)
                horizontalLineToRelative(8.785f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 2.867f, -2.1f)
                close()
                moveTo(14.779f, 6.0f)
                horizontalLineToRelative(-7.564f)
                arcToRelative(0.215f, 0.215f, 0.0f, false, true, -0.215f, -0.215f)
                verticalLineToRelative(-2.645f)
                curveToRelative(0.0f, -0.072f, 0.009f, -0.077f, 0.042f, -0.1f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, true, 0.193f, -0.04f)
                curveToRelative(0.082f, 0.0f, 7.544f, 3.0f, 7.544f, 3.0f)
                close()
                moveTo(8.863f, 23.6f)
                lineTo(17.318f, 20.211f)
                quadToRelative(0.064f, -0.026f, 0.126f, -0.057f)
                arcToRelative(2.718f, 2.718f, 0.0f, false, false, 1.423f, -3.06f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -2.867f, -2.094f)
                horizontalLineToRelative(-8.785f)
                arcToRelative(3.218f, 3.218f, 0.0f, false, false, -3.215f, 3.214f)
                verticalLineToRelative(2.645f)
                arcToRelative(3.076f, 3.076f, 0.0f, false, false, 1.52f, 2.681f)
                arcToRelative(3.377f, 3.377f, 0.0f, false, false, 1.713f, 0.46f)
                arcToRelative(3.553f, 3.553f, 0.0f, false, false, 1.63f, -0.4f)
                close()
                moveTo(14.779f, 18.0f)
                reflectiveCurveToRelative(-7.222f, 2.9f, -7.279f, 2.93f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.46f, 0.025f)
                curveToRelative(-0.033f, -0.02f, -0.042f, -0.025f, -0.042f, -0.1f)
                verticalLineToRelative(-2.641f)
                arcToRelative(0.215f, 0.215f, 0.0f, false, true, 0.217f, -0.214f)
                close()
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
