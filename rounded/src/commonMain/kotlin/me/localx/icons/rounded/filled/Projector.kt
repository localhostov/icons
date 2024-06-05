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

public val Icons.Filled.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = Builder(name = "Projector", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.046f, -1.236f, 3.809f, -3.0f, 4.582f)
                verticalLineToRelative(1.418f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.418f)
                curveToRelative(-1.764f, -0.773f, -3.0f, -2.536f, -3.0f, -4.582f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(2.072f)
                curveToRelative(-0.047f, 0.327f, -0.072f, 0.661f, -0.072f, 1.0f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -0.2f, -0.009f, -0.398f, -0.025f, -0.593f)
                curveToRelative(1.778f, 0.767f, 3.025f, 2.537f, 3.025f, 4.593f)
                close()
                moveTo(5.0f, 14.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(14.0f, 4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(15.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                lineTo(13.0f, 3.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(17.945f, 4.832f)
                curveToRelative(0.171f, 0.113f, 0.363f, 0.168f, 0.554f, 0.168f)
                curveToRelative(0.323f, 0.0f, 0.641f, -0.156f, 0.833f, -0.445f)
                lineToRelative(1.0f, -1.5f)
                curveToRelative(0.307f, -0.46f, 0.183f, -1.08f, -0.277f, -1.387f)
                curveToRelative(-0.462f, -0.307f, -1.081f, -0.182f, -1.387f, 0.277f)
                lineToRelative(-1.0f, 1.5f)
                curveToRelative(-0.307f, 0.46f, -0.183f, 1.08f, 0.277f, 1.387f)
                close()
                moveTo(8.668f, 4.555f)
                curveToRelative(0.193f, 0.289f, 0.51f, 0.445f, 0.833f, 0.445f)
                curveToRelative(0.19f, 0.0f, 0.383f, -0.055f, 0.554f, -0.168f)
                curveToRelative(0.459f, -0.307f, 0.583f, -0.927f, 0.277f, -1.387f)
                lineToRelative(-1.0f, -1.5f)
                curveToRelative(-0.306f, -0.459f, -0.928f, -0.584f, -1.387f, -0.277f)
                curveToRelative(-0.459f, 0.307f, -0.583f, 0.927f, -0.277f, 1.387f)
                lineToRelative(1.0f, 1.5f)
                close()
            }
        }
        .build()
        return _projector!!
    }

private var _projector: ImageVector? = null
