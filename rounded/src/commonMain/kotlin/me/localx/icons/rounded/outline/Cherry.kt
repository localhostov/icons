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

public val Icons.Outline.Cherry: ImageVector
    get() {
        if (_cherry != null) {
            return _cherry!!
        }
        _cherry = Builder(name = "Cherry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4f, 13.0f)
                arcToRelative(3.162f, 3.162f, 0.0f, false, false, -1.98f, 0.565f)
                curveTo(18.051f, 9.492f, 16.137f, 4.98f, 12.809f, 0.411f)
                arcToRelative(1.038f, 1.038f, 0.0f, false, false, -1.618f, 0.0f)
                curveTo(7.86f, 4.984f, 5.946f, 9.5f, 5.577f, 13.575f)
                curveTo(3.275f, 12.0f, -0.059f, 13.741f, 0.0f, 17.5f)
                curveToRelative(0.0f, 6.5f, 8.625f, 8.906f, 12.0f, 3.448f)
                curveTo(15.378f, 26.407f, 24.0f, 24.0f, 24.0f, 17.5f)
                curveTo(24.0f, 14.684f, 22.171f, 13.0f, 20.4f, 13.0f)
                close()
                moveTo(12.0f, 2.739f)
                arcToRelative(24.5f, 24.5f, 0.0f, false, true, 4.408f, 10.723f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 12.0f, 14.377f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -4.4f, -0.926f)
                arcTo(24.51f, 24.51f, 0.0f, false, true, 12.0f, 2.739f)
                close()
                moveTo(6.5f, 22.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 2.0f, 17.5f)
                curveTo(2.0f, 15.63f, 3.077f, 15.0f, 3.568f, 15.0f)
                curveToRelative(1.368f, 0.025f, 1.132f, 1.025f, 2.932f, 1.0f)
                curveToRelative(1.814f, 0.016f, 1.555f, -0.982f, 2.9f, -1.0f)
                curveToRelative(0.5f, 0.0f, 1.6f, 0.63f, 1.6f, 2.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 6.5f, 22.0f)
                close()
                moveTo(17.5f, 22.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 13.0f, 17.5f)
                curveToRelative(0.0f, -1.87f, 1.077f, -2.5f, 1.568f, -2.5f)
                curveToRelative(1.368f, 0.025f, 1.132f, 1.025f, 2.932f, 1.0f)
                curveToRelative(1.814f, 0.016f, 1.555f, -0.982f, 2.9f, -1.0f)
                curveToRelative(0.5f, 0.0f, 1.6f, 0.63f, 1.6f, 2.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 17.5f, 22.0f)
                close()
            }
        }
        .build()
        return _cherry!!
    }

private var _cherry: ImageVector? = null
