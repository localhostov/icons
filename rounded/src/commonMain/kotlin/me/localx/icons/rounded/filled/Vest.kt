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

public val Icons.Filled.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = Builder(name = "Vest", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 17.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 15.0f)
                verticalLineToRelative(-1.666f)
                curveToRelative(0.0f, -1.019f, 0.304f, -1.998f, 0.88f, -2.83f)
                curveToRelative(0.712f, -1.031f, 1.12f, -1.943f, 1.12f, -2.504f)
                verticalLineToRelative(-2.935f)
                curveTo(3.0f, 2.793f, 4.505f, 0.863f, 6.611f, 0.265f)
                lineToRelative(4.389f, 11.914f)
                verticalLineToRelative(11.821f)
                close()
                moveTo(12.0f, 9.107f)
                lineTo(15.352f, 0.008f)
                curveToRelative(-0.21f, -0.008f, -0.341f, -0.008f, -0.352f, -0.008f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.011f, 0.0f, -0.142f, 0.0f, -0.352f, 0.008f)
                lineToRelative(3.352f, 9.099f)
                close()
                moveTo(17.0f, 17.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.666f)
                curveToRelative(0.0f, -1.019f, -0.304f, -1.998f, -0.88f, -2.83f)
                curveToRelative(-0.712f, -1.031f, -1.12f, -1.943f, -1.12f, -2.504f)
                verticalLineToRelative(-2.935f)
                curveToRelative(0.0f, -2.272f, -1.505f, -4.203f, -3.611f, -4.801f)
                lineToRelative(-4.389f, 11.914f)
                verticalLineToRelative(11.821f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null
