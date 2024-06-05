package me.localx.icons.straight.filled

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

public val Icons.Filled.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 15.0f)
                close()
                moveTo(13.453f, 11.961f)
                lineTo(17.693f, 7.761f)
                arcToRelative(5.893f, 5.893f, 0.0f, false, true, -0.252f, 7.677f)
                arcToRelative(5.024f, 5.024f, 0.0f, false, true, -1.345f, 0.96f)
                arcToRelative(0.168f, 0.168f, 0.0f, false, false, -0.1f, 0.133f)
                arcTo(7.048f, 7.048f, 0.0f, false, true, 8.814f, 24.0f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, -6.175f, -2.634f)
                curveToRelative(-3.274f, -3.272f, -3.531f, -8.34f, -0.575f, -11.3f)
                arcToRelative(7.171f, 7.171f, 0.0f, false, true, 5.4f, -2.056f)
                arcTo(0.256f, 0.256f, 0.0f, false, false, 7.6f, 7.9f)
                arcToRelative(5.023f, 5.023f, 0.0f, false, true, 0.96f, -1.344f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 7.722f, -0.212f)
                lineToRelative(-4.235f, 4.193f)
                close()
                moveTo(6.953f, 19.543f)
                lineTo(4.453f, 17.043f)
                lineTo(3.043f, 18.457f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                close()
                moveTo(23.482f, 0.518f)
                arcToRelative(1.767f, 1.767f, 0.0f, false, false, -2.5f, 0.0f)
                lineTo(19.0f, 2.5f)
                lineTo(19.0f, 3.656f)
                lineToRelative(-2.718f, 2.69f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, true, 0.749f, 0.623f)
                arcToRelative(6.855f, 6.855f, 0.0f, false, true, 0.662f, 0.8f)
                lineTo(20.485f, 5.0f)
                lineTo(21.5f, 5.0f)
                lineToRelative(1.982f, -1.982f)
                arcTo(1.767f, 1.767f, 0.0f, false, false, 23.482f, 0.518f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
