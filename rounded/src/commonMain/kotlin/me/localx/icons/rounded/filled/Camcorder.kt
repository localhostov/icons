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

public val Icons.Filled.Camcorder: ImageVector
    get() {
        if (_camcorder != null) {
            return _camcorder!!
        }
        _camcorder = Builder(name = "Camcorder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.743f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 0.761f, -0.422f, 1.446f, -1.103f, 1.788f)
                curveToRelative(-0.286f, 0.144f, -0.593f, 0.214f, -0.899f, 0.214f)
                curveToRelative(-0.421f, 0.0f, -0.839f, -0.135f, -1.193f, -0.398f)
                lineToRelative(-0.805f, -0.6f)
                lineTo(20.0f, 9.739f)
                lineToRelative(0.805f, -0.6f)
                curveToRelative(0.61f, -0.455f, 1.412f, -0.526f, 2.092f, -0.184f)
                curveToRelative(0.681f, 0.341f, 1.103f, 1.026f, 1.103f, 1.788f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 11.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(6.086f)
                lineToRelative(-2.707f, -2.707f)
                curveToRelative(-0.187f, -0.186f, -0.444f, -0.293f, -0.707f, -0.293f)
                lineTo(1.0f, 3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveTo(0.448f, 1.0f, 1.0f, 1.0f)
                lineTo(7.672f, 1.0f)
                curveToRelative(0.801f, 0.0f, 1.555f, 0.312f, 2.121f, 0.879f)
                lineToRelative(4.215f, 4.227f)
                curveToRelative(2.269f, 0.473f, 3.992f, 2.487f, 3.992f, 4.894f)
                close()
                moveTo(15.0f, 10.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(4.0f, 9.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(14.0f, 21.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(15.0f, 10.0f)
                close()
            }
        }
        .build()
        return _camcorder!!
    }

private var _camcorder: ImageVector? = null
