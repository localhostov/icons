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

public val Icons.Filled.BadgerHoney: ImageVector
    get() {
        if (_badgerHoney != null) {
            return _badgerHoney!!
        }
        _badgerHoney = Builder(name = "BadgerHoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.113f, 11.872f)
                curveToRelative(-0.073f, 0.351f, -0.113f, 0.726f, -0.113f, 1.128f)
                horizontalLineToRelative(-0.979f)
                curveToRelative(-0.575f, 0.0f, -1.026f, -0.512f, -0.945f, -1.081f)
                curveToRelative(0.531f, -3.728f, 3.777f, -5.919f, 6.925f, -5.919f)
                lineToRelative(3.749f, 0.027f)
                curveToRelative(1.165f, 0.0f, 2.629f, -0.353f, 3.248f, -1.342f)
                curveToRelative(1.337f, -2.135f, 3.784f, -3.286f, 6.174f, -2.489f)
                lineToRelative(1.937f, 0.646f)
                curveToRelative(0.14f, 0.047f, 0.275f, 0.104f, 0.403f, 0.171f)
                curveToRelative(-2.659f, 0.053f, -4.182f, 0.339f, -5.313f, 1.889f)
                lineToRelative(-3.139f, 4.197f)
                curveToRelative(-1.007f, 1.208f, -2.487f, 1.902f, -4.061f, 1.902f)
                lineTo(3.233f, 11.001f)
                curveToRelative(-0.529f, 0.0f, -1.012f, 0.354f, -1.12f, 0.872f)
                close()
                moveTo(23.96f, 5.001f)
                curveToRelative(-3.578f, 0.01f, -4.459f, 0.139f, -5.152f, 1.089f)
                lineToRelative(-3.178f, 4.248f)
                curveToRelative(-1.421f, 1.707f, -3.461f, 2.663f, -5.63f, 2.663f)
                lineTo(2.0f, 13.001f)
                lineToRelative(1.239f, 7.11f)
                curveToRelative(0.19f, 1.093f, 1.139f, 1.89f, 2.248f, 1.89f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.42f, 0.0f, 2.495f, -1.282f, 2.247f, -2.68f)
                lineToRelative(-0.234f, -1.32f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.718f)
                curveToRelative(0.0f, 1.26f, 1.022f, 2.282f, 2.282f, 2.282f)
                horizontalLineToRelative(0.436f)
                curveToRelative(1.26f, 0.0f, 2.282f, -1.022f, 2.282f, -2.282f)
                verticalLineToRelative(-1.001f)
                curveToRelative(0.0f, -2.139f, 0.278f, -5.403f, 1.74f, -7.765f)
                curveToRelative(0.503f, -0.813f, 1.295f, -1.38f, 2.128f, -1.847f)
                curveToRelative(1.446f, -0.811f, 2.289f, -2.412f, 2.108f, -4.091f)
                lineToRelative(-0.016f, -0.014f)
                close()
            }
        }
        .build()
        return _badgerHoney!!
    }

private var _badgerHoney: ImageVector? = null
