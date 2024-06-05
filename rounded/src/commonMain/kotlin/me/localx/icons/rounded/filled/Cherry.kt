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

public val Icons.Filled.Cherry: ImageVector
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
                curveTo(3.276f, 12.0f, -0.06f, 13.741f, 0.0f, 17.5f)
                curveToRelative(0.273f, 8.59f, 12.728f, 8.589f, 13.0f, 0.0f)
                curveToRelative(0.011f, -3.638f, -3.013f, -5.412f, -5.406f, -4.049f)
                arcTo(24.51f, 24.51f, 0.0f, false, true, 12.0f, 2.739f)
                arcToRelative(24.5f, 24.5f, 0.0f, false, true, 4.408f, 10.723f)
                arcToRelative(3.476f, 3.476f, 0.0f, false, false, -2.786f, -0.281f)
                curveToRelative(1.988f, 2.374f, 1.7f, 6.886f, -0.266f, 9.322f)
                curveToRelative(4.031f, 3.516f, 10.762f, 0.4f, 10.644f, -5.0f)
                curveTo(24.0f, 14.684f, 22.171f, 13.0f, 20.4f, 13.0f)
                close()
            }
        }
        .build()
        return _cherry!!
    }

private var _cherry: ImageVector? = null
