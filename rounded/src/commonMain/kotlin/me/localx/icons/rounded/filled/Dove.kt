package me.localx.icons.rounded.filled

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

public val Icons.Filled.Dove: ImageVector
    get() {
        if (_dove != null) {
            return _dove!!
        }
        _dove = Builder(name = "Dove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.311f, 3.999f)
                lineToRelative(-1.407f, -0.603f)
                curveToRelative(-0.23f, -1.371f, -0.941f, -2.428f, -2.027f, -2.972f)
                curveToRelative(-0.954f, -0.478f, -2.037f, -0.557f, -3.054f, -0.22f)
                curveToRelative(-1.014f, 0.337f, -1.835f, 1.049f, -2.299f, 1.975f)
                lineToRelative(-1.296f, 2.495f)
                curveToRelative(-2.973f, -1.198f, -4.761f, -3.302f, -4.787f, -3.325f)
                curveToRelative(-0.474f, -0.448f, -1.903f, -0.708f, -1.695f, 1.005f)
                curveToRelative(1.338f, 1.286f, 2.895f, 2.774f, 5.595f, 4.026f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.841f, 1.619f)
                curveToRelative(-2.981f, -0.813f, -5.372f, -3.605f, -7.0f, -5.521f)
                curveToRelative(-0.802f, -0.944f, -2.352f, -0.4f, -2.408f, 0.838f)
                curveToRelative(-0.012f, 0.262f, -0.09f, 1.005f, -0.092f, 1.183f)
                curveToRelative(-0.035f, 3.109f, 0.535f, 9.053f, 6.0f, 12.5f)
                lineToRelative(-6.575f, 0.427f)
                curveToRelative(-0.965f, 0.075f, -1.62f, 1.009f, -1.372f, 1.944f)
                curveToRelative(0.431f, 1.624f, 2.142f, 3.534f, 4.122f, 4.433f)
                curveToRelative(0.667f, 0.303f, 1.446f, 0.243f, 2.091f, -0.105f)
                lineToRelative(3.839f, -2.407f)
                curveToRelative(0.516f, -0.323f, 1.158f, -0.334f, 1.702f, -0.062f)
                curveToRelative(0.708f, 0.355f, 1.872f, 0.77f, 3.443f, 0.77f)
                curveToRelative(3.722f, 0.0f, 6.75f, -3.028f, 6.75f, -6.75f)
                curveToRelative(0.0f, -1.643f, -0.007f, -5.924f, -0.011f, -8.593f)
                lineToRelative(1.322f, -0.566f)
                curveToRelative(0.418f, -0.179f, 0.689f, -0.59f, 0.689f, -1.045f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.455f, -0.271f, -0.866f, -0.689f, -1.045f)
                close()
            }
        }
        .build()
        return _dove!!
    }

private var _dove: ImageVector? = null
