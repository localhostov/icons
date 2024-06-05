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

public val Icons.Filled.Cowbell: ImageVector
    get() {
        if (_cowbell != null) {
            return _cowbell!!
        }
        _cowbell = Builder(name = "Cowbell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.93f, 7.3f)
                curveToRelative(-0.34f, -1.91f, -2.0f, -3.3f, -3.94f, -3.3f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-1.94f, 0.0f, -3.6f, 1.39f, -3.94f, 3.3f)
                lineTo(0.81f, 19.0f)
                lineTo(23.19f, 19.0f)
                lineToRelative(-2.27f, -11.7f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(8.14f, 21.0f)
                horizontalLineToRelative(7.72f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3.0f, -3.86f, 3.0f)
                reflectiveCurveToRelative(-3.41f, -1.28f, -3.86f, -3.0f)
                close()
            }
        }
        .build()
        return _cowbell!!
    }

private var _cowbell: ImageVector? = null
