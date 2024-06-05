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

public val Icons.Filled.HammerCrash: ImageVector
    get() {
        if (_hammerCrash != null) {
            return _hammerCrash!!
        }
        _hammerCrash = Builder(name = "HammerCrash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(19.882f, 14.787f)
                curveToRelative(0.436f, -0.341f, 0.512f, -0.969f, 0.171f, -1.403f)
                lineToRelative(-0.783f, -1.0f)
                curveToRelative(-0.341f, -0.436f, -0.97f, -0.513f, -1.403f, -0.171f)
                curveToRelative(-0.436f, 0.341f, -0.512f, 0.969f, -0.171f, 1.403f)
                lineToRelative(0.783f, 1.0f)
                curveToRelative(0.197f, 0.252f, 0.491f, 0.384f, 0.788f, 0.384f)
                curveToRelative(0.216f, 0.0f, 0.433f, -0.069f, 0.615f, -0.213f)
                close()
                moveTo(22.99f, 10.991f)
                curveToRelative(0.271f, -0.481f, 0.101f, -1.092f, -0.38f, -1.362f)
                lineToRelative(-0.888f, -0.5f)
                curveToRelative(-0.482f, -0.273f, -1.092f, -0.1f, -1.362f, 0.38f)
                curveToRelative(-0.271f, 0.481f, -0.101f, 1.092f, 0.38f, 1.362f)
                lineToRelative(0.888f, 0.5f)
                curveToRelative(0.155f, 0.088f, 0.324f, 0.129f, 0.49f, 0.129f)
                curveToRelative(0.35f, 0.0f, 0.688f, -0.184f, 0.872f, -0.509f)
                close()
                moveTo(18.201f, 9.429f)
                lineToRelative(0.454f, -0.874f)
                curveToRelative(0.373f, -0.72f, 0.441f, -1.539f, 0.191f, -2.31f)
                reflectiveCurveToRelative(-0.787f, -1.394f, -1.474f, -1.736f)
                lineTo(11.213f, 1.092f)
                curveTo(7.267f, -0.959f, 4.302f, 0.343f, 2.887f, 1.301f)
                curveToRelative(-0.597f, 0.403f, -0.927f, 1.072f, -0.883f, 1.789f)
                curveToRelative(0.043f, 0.708f, 0.446f, 1.324f, 1.076f, 1.65f)
                lineToRelative(11.097f, 5.978f)
                curveToRelative(0.433f, 0.221f, 0.896f, 0.326f, 1.354f, 0.326f)
                curveToRelative(1.086f, 0.0f, 2.138f, -0.591f, 2.671f, -1.615f)
                close()
                moveTo(6.165f, 8.674f)
                lineTo(0.314f, 19.665f)
                curveToRelative(-0.723f, 1.455f, -0.139f, 3.247f, 1.303f, 3.997f)
                curveToRelative(0.434f, 0.226f, 0.905f, 0.339f, 1.379f, 0.339f)
                curveToRelative(0.313f, 0.0f, 0.628f, -0.049f, 0.935f, -0.149f)
                curveToRelative(0.771f, -0.252f, 1.395f, -0.791f, 1.742f, -1.492f)
                lineToRelative(5.768f, -10.844f)
                lineToRelative(-5.276f, -2.842f)
                close()
            }
        }
        .build()
        return _hammerCrash!!
    }

private var _hammerCrash: ImageVector? = null
