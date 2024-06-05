package me.localx.icons.straight.bold

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

public val Icons.Bold.PencilPaintbrush: ImageVector
    get() {
        if (_pencilPaintbrush != null) {
            return _pencilPaintbrush!!
        }
        _pencilPaintbrush = Builder(name = "PencilPaintbrush", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                horizontalLineToRelative(-5.733f)
                curveToRelative(-2.071f, 0.0f, -4.267f, -1.791f, -4.267f, -4.0f)
                reflectiveCurveToRelative(1.679f, -4.0f, 3.75f, -4.0f)
                curveToRelative(5.0f, 0.0f, 6.25f, 8.0f, 6.25f, 8.0f)
                close()
                moveTo(22.828f, 6.834f)
                lineTo(5.662f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.662f)
                lineTo(17.167f, 1.171f)
                curveToRelative(0.753f, -0.755f, 1.759f, -1.171f, 2.83f, -1.171f)
                reflectiveCurveToRelative(2.076f, 0.416f, 2.831f, 1.171f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.756f, 0.756f, 1.172f, 1.761f, 1.172f, 2.832f)
                reflectiveCurveToRelative(-0.417f, 2.076f, -1.172f, 2.831f)
                close()
                moveTo(17.15f, 8.27f)
                lineToRelative(-1.42f, -1.42f)
                lineTo(3.0f, 19.58f)
                verticalLineToRelative(1.42f)
                horizontalLineToRelative(1.42f)
                lineToRelative(12.729f, -12.73f)
                close()
                moveTo(4.626f, 10.603f)
                lineToRelative(2.211f, -2.028f)
                lineToRelative(-3.562f, -3.881f)
                curveToRelative(-0.187f, -0.196f, -0.281f, -0.444f, -0.274f, -0.717f)
                curveToRelative(0.007f, -0.272f, 0.115f, -0.516f, 0.311f, -0.702f)
                curveToRelative(0.197f, -0.187f, 0.428f, -0.28f, 0.718f, -0.274f)
                curveToRelative(0.272f, 0.007f, 0.515f, 0.114f, 0.684f, 0.292f)
                lineToRelative(3.542f, 3.861f)
                lineToRelative(2.211f, -2.028f)
                lineToRelative(-3.561f, -3.88f)
                curveTo(6.169f, 0.47f, 5.175f, 0.029f, 4.105f, 0.001f)
                curveTo(3.046f, -0.03f, 2.02f, 0.365f, 1.244f, 1.101f)
                curveTo(0.47f, 1.837f, 0.028f, 2.831f, 0.0f, 3.901f)
                reflectiveCurveToRelative(0.363f, 2.085f, 1.081f, 2.84f)
                lineToRelative(3.543f, 3.862f)
                close()
            }
        }
        .build()
        return _pencilPaintbrush!!
    }

private var _pencilPaintbrush: ImageVector? = null
