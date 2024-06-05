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

public val Icons.Bold.VectorCircle: ImageVector
    get() {
        if (_vectorCircle != null) {
            return _vectorCircle!!
        }
        _vectorCircle = Builder(name = "VectorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.61f, 9.095f)
                curveToRelative(-1.024f, -3.734f, -3.971f, -6.681f, -7.705f, -7.705f)
                curveToRelative(-0.258f, -0.806f, -1.013f, -1.39f, -1.905f, -1.39f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.892f, 0.0f, -1.647f, 0.584f, -1.905f, 1.39f)
                curveToRelative(-3.734f, 1.024f, -6.681f, 3.971f, -7.705f, 7.705f)
                curveToRelative(-0.806f, 0.258f, -1.39f, 1.013f, -1.39f, 1.905f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.892f, 0.584f, 1.647f, 1.39f, 1.905f)
                curveToRelative(1.024f, 3.734f, 3.971f, 6.681f, 7.705f, 7.705f)
                curveToRelative(0.258f, 0.806f, 1.013f, 1.39f, 1.905f, 1.39f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.892f, 0.0f, 1.647f, -0.584f, 1.905f, -1.39f)
                curveToRelative(3.734f, -1.024f, 6.681f, -3.971f, 7.705f, -7.705f)
                curveToRelative(0.806f, -0.258f, 1.39f, -1.013f, 1.39f, -1.905f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.892f, -0.584f, -1.647f, -1.39f, -1.905f)
                close()
                moveTo(14.922f, 19.447f)
                curveToRelative(-0.24f, -0.836f, -1.009f, -1.447f, -1.922f, -1.447f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.913f, 0.0f, -1.682f, 0.612f, -1.922f, 1.447f)
                curveToRelative(-2.065f, -0.813f, -3.712f, -2.461f, -4.525f, -4.525f)
                curveToRelative(0.836f, -0.24f, 1.447f, -1.009f, 1.447f, -1.922f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.913f, -0.612f, -1.682f, -1.447f, -1.922f)
                curveToRelative(0.813f, -2.065f, 2.461f, -3.712f, 4.525f, -4.525f)
                curveToRelative(0.24f, 0.836f, 1.009f, 1.447f, 1.922f, 1.447f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.913f, 0.0f, 1.682f, -0.612f, 1.922f, -1.447f)
                curveToRelative(2.065f, 0.813f, 3.712f, 2.461f, 4.525f, 4.525f)
                curveToRelative(-0.836f, 0.24f, -1.447f, 1.009f, -1.447f, 1.922f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.913f, 0.612f, 1.682f, 1.447f, 1.922f)
                curveToRelative(-0.813f, 2.065f, -2.461f, 3.712f, -4.525f, 4.525f)
                close()
            }
        }
        .build()
        return _vectorCircle!!
    }

private var _vectorCircle: ImageVector? = null
