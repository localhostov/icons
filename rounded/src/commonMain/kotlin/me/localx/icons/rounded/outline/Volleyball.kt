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

public val Icons.Outline.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.07f, -0.047f)
                curveTo(114.467f, -0.047f, -0.326f, 114.746f, -0.326f, 256.349f)
                reflectiveCurveTo(114.467f, 512.744f, 256.07f, 512.744f)
                reflectiveCurveToRelative(256.395f, -114.792f, 256.395f, -256.395f)
                reflectiveCurveTo(397.673f, -0.047f, 256.07f, -0.047f)
                close()
                moveTo(466.667f, 224.0f)
                verticalLineToRelative(0.064f)
                curveToRelative(-19.353f, 12.05f, -40.515f, 20.917f, -62.677f, 26.261f)
                curveToRelative(-4.595f, -68.333f, -27.183f, -134.234f, -65.472f, -191.019f)
                curveTo(406.956f, 88.198f, 455.48f, 150.56f, 466.667f, 224.0f)
                close()
                moveTo(256.0f, 42.667f)
                curveToRelative(5.397f, 0.0f, 10.667f, 0.405f, 15.979f, 0.811f)
                curveToRelative(53.223f, 58.444f, 84.842f, 133.342f, 89.6f, 212.245f)
                curveToRelative(-29.153f, 0.997f, -58.199f, -4.013f, -85.333f, -14.72f)
                curveToRelative(-4.247f, -72.136f, -38.705f, -139.14f, -94.912f, -184.555f)
                curveTo(205.188f, 47.391f, 230.484f, 42.722f, 256.0f, 42.667f)
                close()
                moveTo(138.389f, 78.187f)
                curveToRelative(20.041f, 13.069f, 37.744f, 29.41f, 52.373f, 48.341f)
                curveTo(126.816f, 169.409f, 77.017f, 230.285f, 47.659f, 301.461f)
                curveTo(28.668f, 215.422f, 64.766f, 126.591f, 138.389f, 78.187f)
                close()
                moveTo(71.595f, 362.773f)
                curveToRelative(21.296f, -81.459f, 71.492f, -152.392f, 141.227f, -199.573f)
                curveToRelative(12.627f, 25.943f, 19.835f, 54.187f, 21.184f, 83.008f)
                curveToRelative(-58.22f, 44.242f, -94.81f, 111.213f, -100.587f, 184.107f)
                curveTo(108.191f, 412.512f, 87.102f, 389.474f, 71.595f, 362.773f)
                close()
                moveTo(256.0f, 469.333f)
                curveToRelative(-27.6f, -0.008f, -54.934f, -5.399f, -80.469f, -15.872f)
                curveToRelative(-0.47f, -27.519f, 4.398f, -54.867f, 14.336f, -80.533f)
                curveToRelative(70.121f, 31.128f, 147.992f, 40.413f, 223.467f, 26.645f)
                curveTo(373.07f, 443.969f, 315.934f, 469.303f, 256.0f, 469.333f)
                close()
                moveTo(209.067f, 334.72f)
                curveToRelative(13.523f, -20.959f, 30.63f, -39.373f, 50.539f, -54.4f)
                curveToRelative(30.156f, 12.194f, 62.363f, 18.515f, 94.891f, 18.624f)
                curveToRelative(39.574f, -0.004f, 78.615f, -9.129f, 114.091f, -26.667f)
                curveToRelative(-1.999f, 26.074f, -8.82f, 51.551f, -20.117f, 75.136f)
                curveTo(369.697f, 371.777f, 284.821f, 367.277f, 209.067f, 334.72f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
