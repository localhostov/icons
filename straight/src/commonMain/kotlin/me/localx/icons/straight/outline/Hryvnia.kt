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

public val Icons.Outline.Hryvnia: ImageVector
    get() {
        if (_hryvnia != null) {
            return _hryvnia!!
        }
        _hryvnia = Builder(name = "Hryvnia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.514f, 11.0f)
                lineToRelative(-5.332f, 2.0f)
                horizontalLineToRelative(9.818f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.868f)
                curveToRelative(-1.125f, 0.502f, -1.868f, 1.752f, -1.868f, 2.995f)
                curveToRelative(0.0f, 1.164f, 0.606f, 2.305f, 1.582f, 2.827f)
                curveToRelative(1.458f, 0.781f, 3.281f, 1.178f, 5.418f, 1.178f)
                curveToRelative(4.59f, 0.0f, 8.363f, -2.772f, 8.401f, -2.801f)
                lineToRelative(1.198f, 1.601f)
                curveToRelative(-0.174f, 0.131f, -4.327f, 3.2f, -9.6f, 3.2f)
                curveToRelative(-2.471f, 0.0f, -4.61f, -0.476f, -6.362f, -1.414f)
                curveToRelative(-1.627f, -0.872f, -2.638f, -2.702f, -2.638f, -4.606f)
                curveToRelative(0.0f, -1.045f, 0.322f, -2.146f, 0.885f, -2.98f)
                horizontalLineToRelative(-1.885f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.486f)
                lineToRelative(5.332f, -2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(15.132f)
                curveToRelative(1.125f, -0.502f, 1.868f, -1.635f, 1.868f, -2.877f)
                curveToRelative(0.0f, -1.148f, -0.602f, -2.193f, -1.569f, -2.727f)
                curveToRelative(-1.158f, -0.637f, -3.042f, -1.396f, -5.431f, -1.396f)
                curveToRelative(-4.495f, 0.0f, -7.268f, 2.683f, -7.295f, 2.71f)
                lineToRelative(-1.412f, -1.417f)
                curveToRelative(0.135f, -0.135f, 3.354f, -3.293f, 8.707f, -3.293f)
                curveToRelative(2.813f, 0.0f, 5.03f, 0.895f, 6.395f, 1.645f)
                curveToRelative(1.607f, 0.885f, 2.605f, 2.601f, 2.605f, 4.479f)
                curveToRelative(0.0f, 1.045f, -0.322f, 2.043f, -0.885f, 2.877f)
                horizontalLineToRelative(1.885f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.486f)
                close()
            }
        }
        .build()
        return _hryvnia!!
    }

private var _hryvnia: ImageVector? = null
