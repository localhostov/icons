package me.localx.icons.straight.filled

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

public val Icons.Filled.MarketplaceStore: ImageVector
    get() {
        if (_marketplaceStore != null) {
            return _marketplaceStore!!
        }
        _marketplaceStore = Builder(name = "MarketplaceStore", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.802f, 0.0f)
                lineToRelative(2.198f, 6.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.193f, 0.0f, -2.267f, -0.525f, -3.0f, -1.357f)
                curveToRelative(-0.733f, 0.832f, -1.807f, 1.357f, -3.0f, 1.357f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.2f, 0.0f, -2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.8f, 1.382f, -3.0f, 1.382f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineToRelative(0.024f, -0.717f)
                lineTo(2.198f, 0.0f)
                horizontalLineToRelative(4.802f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(4.802f)
                close()
                moveTo(15.013f, 21.0f)
                horizontalLineToRelative(-6.023f)
                lineToRelative(-0.846f, -1.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.14f)
                lineToRelative(-0.846f, 1.0f)
                close()
                moveTo(9.928f, 19.0f)
                horizontalLineToRelative(4.157f)
                lineToRelative(0.846f, -1.0f)
                horizontalLineToRelative(7.068f)
                verticalLineToRelative(-5.35f)
                curveToRelative(-0.627f, 0.223f, -1.298f, 0.35f, -2.0f, 0.35f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.063f, 0.0f, -2.097f, -0.284f, -3.0f, -0.806f)
                curveToRelative(-0.903f, 0.522f, -1.937f, 0.806f, -3.0f, 0.806f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.062f, 0.0f, -2.095f, -0.288f, -3.0f, -0.818f)
                curveToRelative(-0.905f, 0.53f, -1.938f, 0.818f, -3.0f, 0.818f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.702f, 0.0f, -1.373f, -0.128f, -2.0f, -0.35f)
                verticalLineToRelative(5.35f)
                horizontalLineToRelative(7.082f)
                lineToRelative(0.846f, 1.0f)
                close()
            }
        }
        .build()
        return _marketplaceStore!!
    }

private var _marketplaceStore: ImageVector? = null
