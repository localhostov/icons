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

public val Icons.Bold.BellConcierge: ImageVector
    get() {
        if (_bellConcierge != null) {
            return _bellConcierge!!
        }
        _bellConcierge = Builder(name = "BellConcierge", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 20.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.348f)
                curveToRelative(1.738f, 0.0f, 3.152f, -1.414f, 3.152f, -3.152f)
                curveToRelative(0.0f, -6.215f, -4.578f, -11.513f, -10.5f, -12.255f)
                verticalLineToRelative(-1.093f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.091f)
                curveToRelative(-2.453f, 0.301f, -4.739f, 1.349f, -6.607f, 3.062f)
                curveTo(1.419f, 7.921f, 0.0f, 11.146f, 0.0f, 14.5f)
                verticalLineToRelative(0.474f)
                curveToRelative(0.0f, 1.668f, 1.357f, 3.026f, 3.026f, 3.026f)
                horizontalLineToRelative(7.474f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(3.0f, 15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.516f, 1.064f, -4.935f, 2.92f, -6.636f)
                curveToRelative(1.678f, -1.538f, 3.806f, -2.363f, 6.065f, -2.365f)
                curveToRelative(0.005f, 0.0f, 0.01f, 0.0f, 0.016f, 0.0f)
                curveToRelative(0.004f, 0.0f, 0.007f, 0.0f, 0.011f, 0.0f)
                curveToRelative(0.264f, 0.0f, 0.531f, 0.013f, 0.799f, 0.035f)
                curveToRelative(4.592f, 0.399f, 8.19f, 4.49f, 8.19f, 9.313f)
                curveToRelative(0.0f, 0.083f, -0.068f, 0.152f, -0.152f, 0.152f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _bellConcierge!!
    }

private var _bellConcierge: ImageVector? = null
