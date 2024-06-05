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

public val Icons.Filled.SkeletonRibs: ImageVector
    get() {
        if (_skeletonRibs != null) {
            return _skeletonRibs!!
        }
        _skeletonRibs = Builder(name = "SkeletonRibs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(1.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.878f)
                curveTo(2.832f, 8.4f, 1.515f, 14.306f, 1.084f, 17.602f)
                curveToRelative(-0.053f, 0.122f, -0.062f, 0.498f, -0.054f, 0.549f)
                curveToRelative(-0.131f, 1.703f, 0.279f, 3.154f, 1.209f, 4.209f)
                curveToRelative(0.932f, 1.058f, 2.342f, 1.64f, 3.971f, 1.64f)
                horizontalLineToRelative(11.58f)
                curveToRelative(1.629f, 0.0f, 3.039f, -0.582f, 3.971f, -1.64f)
                curveToRelative(0.93f, -1.055f, 1.339f, -2.506f, 1.209f, -4.209f)
                curveToRelative(0.008f, -0.052f, 0.0f, -0.428f, -0.054f, -0.55f)
                curveToRelative(-0.431f, -3.297f, -1.749f, -9.203f, -3.793f, -13.602f)
                horizontalLineToRelative(3.878f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.791f, 7.0f)
                curveToRelative(0.401f, -1.07f, 0.84f, -2.084f, 1.313f, -3.0f)
                horizontalLineToRelative(3.895f)
                close()
                moveTo(3.765f, 14.0f)
                horizontalLineToRelative(7.235f)
                verticalLineToRelative(3.0f)
                lineTo(3.194f, 17.0f)
                curveToRelative(0.138f, -0.877f, 0.328f, -1.895f, 0.572f, -3.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(7.234f)
                curveToRelative(0.243f, 1.105f, 0.433f, 2.123f, 0.572f, 3.0f)
                horizontalLineToRelative(-7.806f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.758f, 12.0f)
                horizontalLineToRelative(-6.758f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.899f)
                curveToRelative(0.319f, 1.001f, 0.606f, 2.014f, 0.859f, 3.0f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(4.242f, 12.0f)
                curveToRelative(0.253f, -0.986f, 0.54f, -1.999f, 0.859f, -3.0f)
                horizontalLineToRelative(5.899f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.74f, 21.038f)
                curveToRelative(-0.445f, -0.505f, -0.686f, -1.202f, -0.726f, -2.038f)
                horizontalLineToRelative(7.987f)
                verticalLineToRelative(3.0f)
                lineTo(6.21f, 22.0f)
                curveToRelative(-1.062f, 0.0f, -1.916f, -0.333f, -2.47f, -0.962f)
                close()
                moveTo(17.79f, 22.0f)
                horizontalLineToRelative(-4.79f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.987f)
                curveToRelative(-0.041f, 0.836f, -0.282f, 1.533f, -0.727f, 2.038f)
                curveToRelative(-0.555f, 0.629f, -1.408f, 0.962f, -2.47f, 0.962f)
                close()
                moveTo(18.208f, 7.0f)
                horizontalLineToRelative(-5.208f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.895f)
                curveToRelative(0.473f, 0.916f, 0.912f, 1.93f, 1.313f, 3.0f)
                close()
            }
        }
        .build()
        return _skeletonRibs!!
    }

private var _skeletonRibs: ImageVector? = null
