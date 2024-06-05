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

public val Icons.Bold.CarRear: ImageVector
    get() {
        if (_carRear != null) {
            return _carRear!!
        }
        _carRear = Builder(name = "CarRear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.584f, 10.59f)
                lineToRelative(-2.579f, -7.09f)
                curveToRelative(-0.761f, -2.094f, -2.77f, -3.5f, -4.997f, -3.5f)
                lineTo(7.992f, 0.0f)
                curveTo(5.765f, 0.0f, 3.756f, 1.407f, 2.994f, 3.5f)
                lineTo(0.417f, 10.59f)
                curveToRelative(-0.276f, 0.76f, -0.417f, 1.555f, -0.417f, 2.364f)
                verticalLineToRelative(2.727f)
                curveToRelative(0.0f, 2.098f, 1.231f, 3.899f, 3.0f, 4.764f)
                verticalLineToRelative(1.555f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-1.555f)
                curveToRelative(1.769f, -0.865f, 3.0f, -2.666f, 3.0f, -4.764f)
                verticalLineToRelative(-2.727f)
                curveToRelative(0.0f, -0.809f, -0.141f, -1.604f, -0.416f, -2.364f)
                close()
                moveTo(5.813f, 4.526f)
                curveToRelative(0.332f, -0.913f, 1.208f, -1.526f, 2.179f, -1.526f)
                horizontalLineToRelative(8.016f)
                curveToRelative(0.971f, 0.0f, 1.847f, 0.613f, 2.178f, 1.526f)
                lineToRelative(1.991f, 5.474f)
                lineTo(3.824f, 10.0f)
                lineToRelative(1.99f, -5.474f)
                close()
                moveTo(18.681f, 18.0f)
                horizontalLineToRelative(-2.773f)
                curveToRelative(0.056f, -0.157f, 0.092f, -0.324f, 0.092f, -0.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.176f, 0.036f, 0.343f, 0.092f, 0.5f)
                horizontalLineToRelative(-2.773f)
                curveToRelative(-1.278f, 0.0f, -2.318f, -1.04f, -2.318f, -2.318f)
                verticalLineToRelative(-0.682f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.176f, -0.036f, -0.343f, -0.092f, -0.5f)
                horizontalLineToRelative(11.684f)
                curveToRelative(-0.056f, 0.157f, -0.092f, 0.324f, -0.092f, 0.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.682f)
                curveToRelative(0.0f, 1.278f, -1.04f, 2.318f, -2.318f, 2.318f)
                close()
            }
        }
        .build()
        return _carRear!!
    }

private var _carRear: ImageVector? = null
