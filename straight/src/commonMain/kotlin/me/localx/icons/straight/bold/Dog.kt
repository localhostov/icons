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

public val Icons.Bold.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.118f, 5.0f)
                curveToRelative(-0.118f, 0.0f, -0.224f, -0.065f, -0.277f, -0.171f)
                curveToRelative(-0.564f, -1.128f, -1.698f, -1.829f, -2.959f, -1.829f)
                horizontalLineToRelative(-0.882f)
                lineTo(17.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(0.705f)
                lineToRelative(-1.55f, 4.294f)
                horizontalLineToRelative(-5.95f)
                curveToRelative(-0.808f, 0.0f, -1.583f, 0.212f, -2.262f, 0.608f)
                curveToRelative(-0.489f, -0.4f, -1.238f, -1.237f, -1.238f, -2.612f)
                lineTo(0.0f, 5.995f)
                curveToRelative(0.0f, 2.517f, 1.326f, 4.083f, 2.297f, 4.892f)
                curveToRelative(-0.195f, 0.508f, -0.296f, 1.053f, -0.296f, 1.613f)
                lineToRelative(0.003f, 11.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.814f)
                lineToRelative(1.051f, -4.186f)
                horizontalLineToRelative(0.445f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2.882f)
                close()
                moveTo(21.0f, 9.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.785f)
                lineToRelative(-1.507f, 6.0f)
                lineTo(5.001f, 16.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.401f, 0.155f, -0.777f, 0.438f, -1.061f)
                curveToRelative(0.284f, -0.283f, 0.66f, -0.439f, 1.061f, -0.439f)
                horizontalLineToRelative(8.056f)
                lineToRelative(1.804f, -4.999f)
                horizontalLineToRelative(1.521f)
                curveToRelative(0.118f, 0.0f, 0.224f, 0.065f, 0.277f, 0.171f)
                curveToRelative(0.547f, 1.093f, 1.628f, 1.784f, 2.841f, 1.827f)
                verticalLineToRelative(1.502f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
