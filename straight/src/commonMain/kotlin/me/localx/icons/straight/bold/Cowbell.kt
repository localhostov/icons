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

public val Icons.Bold.Cowbell: ImageVector
    get() {
        if (_cowbell != null) {
            return _cowbell!!
        }
        _cowbell = Builder(name = "Cowbell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.82f, 21.0f)
                lineToRelative(-2.38f, -12.35f)
                curveToRelative(-0.41f, -2.12f, -2.26f, -3.65f, -4.42f, -3.65f)
                horizontalLineToRelative(-0.15f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.65f, 0.13f, -1.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.35f, 0.04f, 0.68f, 0.13f, 1.0f)
                horizontalLineToRelative(-0.15f)
                curveToRelative(-2.15f, 0.0f, -4.01f, 1.54f, -4.42f, 3.65f)
                lineTo(0.18f, 21.0f)
                horizontalLineToRelative(7.94f)
                curveToRelative(0.45f, 1.72f, 2.01f, 3.0f, 3.87f, 3.0f)
                reflectiveCurveToRelative(3.43f, -1.28f, 3.87f, -3.0f)
                horizontalLineToRelative(7.94f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(5.51f, 9.22f)
                curveToRelative(0.14f, -0.71f, 0.75f, -1.22f, 1.47f, -1.22f)
                horizontalLineToRelative(10.04f)
                curveToRelative(0.72f, 0.0f, 1.34f, 0.51f, 1.47f, 1.22f)
                lineToRelative(1.69f, 8.78f)
                lineTo(3.82f, 18.0f)
                lineToRelative(1.69f, -8.78f)
                close()
            }
        }
        .build()
        return _cowbell!!
    }

private var _cowbell: ImageVector? = null
