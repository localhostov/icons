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

public val Icons.Bold.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.074f, viewportHeight = 512.074f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.727f, 21.379f)
                curveTo(473.083f, 3.489f, 447.355f, -3.846f, 422.93f, 2.051f)
                lineTo(96.786f, 70.595f)
                curveTo(34.85f, 79.76f, -7.929f, 137.399f, 1.236f, 199.334f)
                curveToRelative(3.563f, 24.079f, 14.782f, 46.372f, 31.997f, 63.581f)
                lineToRelative(34.965f, 34.987f)
                curveToRelative(1.637f, 1.615f, 2.552f, 3.823f, 2.539f, 6.123f)
                verticalLineToRelative(64.512f)
                curveToRelative(0.047f, 40.134f, 32.57f, 72.657f, 72.704f, 72.704f)
                horizontalLineToRelative(64.512f)
                curveToRelative(2.303f, 0.0f, 4.513f, 0.913f, 6.144f, 2.539f)
                lineToRelative(34.965f, 34.965f)
                curveToRelative(21.142f, 21.282f, 49.895f, 33.259f, 79.893f, 33.28f)
                curveToRelative(12.383f, -0.01f, 24.683f, -2.035f, 36.416f, -5.995f)
                curveToRelative(40.491f, -13.447f, 69.914f, -48.61f, 76.011f, -90.837f)
                lineToRelative(68.544f, -325.12f)
                curveTo(516.084f, 65.391f, 508.789f, 39.291f, 490.727f, 21.379f)
                close()
                moveTo(66.599f, 167.0f)
                curveToRelative(5.798f, -17.913f, 21.444f, -30.848f, 40.128f, -33.173f)
                curveToRelative(0.754f, -0.1f, 1.5f, -0.228f, 2.24f, -0.384f)
                lineTo(393.17f, 73.71f)
                lineTo(134.738f, 331.992f)
                verticalLineToRelative(-27.968f)
                curveToRelative(0.047f, -19.294f, -7.637f, -37.803f, -21.333f, -51.392f)
                lineToRelative(-34.923f, -34.965f)
                curveTo(65.031f, 204.511f, 60.399f, 184.765f, 66.599f, 167.0f)
                close()
                moveTo(378.535f, 403.118f)
                curveToRelative(-0.171f, 0.747f, -0.277f, 1.493f, -0.384f, 2.24f)
                curveToRelative(-3.705f, 27.023f, -28.614f, 45.926f, -55.637f, 42.221f)
                curveToRelative(-10.676f, -1.464f, -20.581f, -6.379f, -28.203f, -13.997f)
                lineToRelative(-34.944f, -34.944f)
                curveToRelative(-13.596f, -13.7f, -32.112f, -21.383f, -51.413f, -21.333f)
                horizontalLineToRelative(-27.968f)
                lineToRelative(258.368f, -258.432f)
                lineTo(378.535f, 403.118f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
