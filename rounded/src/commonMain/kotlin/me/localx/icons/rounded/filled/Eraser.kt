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

public val Icons.Filled.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.235f, 7.42f)
                lineToRelative(4.971f, -4.953f)
                curveToRelative(0.943f, -0.946f, 2.201f, -1.468f, 3.54f, -1.468f)
                reflectiveCurveToRelative(2.596f, 0.522f, 3.541f, 1.47f)
                lineToRelative(3.254f, 3.265f)
                curveToRelative(1.939f, 1.946f, 1.939f, 5.113f, 0.0f, 7.06f)
                lineToRelative(-4.972f, 4.991f)
                lineTo(7.235f, 7.42f)
                close()
                moveTo(23.0f, 21.0f)
                horizontalLineToRelative(-8.633f)
                lineToRelative(1.791f, -1.798f)
                lineTo(5.818f, 8.832f)
                lineTo(1.459f, 13.175f)
                curveToRelative(-1.939f, 1.946f, -1.939f, 5.113f, 0.0f, 7.059f)
                lineToRelative(1.583f, 1.589f)
                curveToRelative(0.745f, 0.748f, 1.777f, 1.177f, 2.834f, 1.177f)
                horizontalLineToRelative(17.124f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
