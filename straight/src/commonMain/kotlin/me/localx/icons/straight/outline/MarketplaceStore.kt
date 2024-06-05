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

public val Icons.Outline.MarketplaceStore: ImageVector
    get() {
        if (_marketplaceStore != null) {
            return _marketplaceStore!!
        }
        _marketplaceStore = Builder(name = "MarketplaceStore", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.0f)
                lineToRelative(-2.279f, -7.0f)
                lineTo(2.279f, 0.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, 1.474f, 0.81f, 2.75f, 2.0f, 3.444f)
                verticalLineToRelative(7.556f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.556f)
                curveToRelative(1.19f, -0.694f, 2.0f, -1.97f, 2.0f, -3.444f)
                close()
                moveTo(3.721f, 2.0f)
                horizontalLineToRelative(3.279f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.279f)
                lineToRelative(1.716f, 5.146f)
                curveToRelative(-0.075f, 1.035f, -0.941f, 1.854f, -1.995f, 1.854f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.054f, 0.0f, -1.92f, -0.819f, -1.995f, -1.854f)
                lineToRelative(1.716f, -5.146f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.086f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(5.828f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(6.086f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-4.914f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-4.914f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.201f, 0.0f, 2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.201f, 0.0f, 2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _marketplaceStore!!
    }

private var _marketplaceStore: ImageVector? = null
