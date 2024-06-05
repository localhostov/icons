package me.localx.icons.straight.outline

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

public val Icons.Outline.Cowbell: ImageVector
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
                horizontalLineToRelative(-0.16f)
                curveToRelative(0.11f, -0.31f, 0.17f, -0.65f, 0.17f, -1.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, 0.06f, 0.69f, 0.17f, 1.0f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(-1.94f, 0.0f, -3.6f, 1.39f, -3.94f, 3.3f)
                lineTo(0.81f, 20.0f)
                horizontalLineToRelative(7.19f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                horizontalLineToRelative(7.19f)
                lineToRelative(-2.27f, -12.7f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(3.19f, 18.0f)
                lineToRelative(1.85f, -10.35f)
                curveToRelative(0.17f, -0.96f, 1.0f, -1.65f, 1.97f, -1.65f)
                horizontalLineToRelative(9.98f)
                curveToRelative(0.97f, 0.0f, 1.8f, 0.69f, 1.97f, 1.65f)
                lineToRelative(1.85f, 10.35f)
                lineTo(3.19f, 18.0f)
                close()
            }
        }
        .build()
        return _cowbell!!
    }

private var _cowbell: ImageVector? = null
