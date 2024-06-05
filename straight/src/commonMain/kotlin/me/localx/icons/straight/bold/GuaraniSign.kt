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

public val Icons.Bold.GuaraniSign: ImageVector
    get() {
        if (_guaraniSign != null) {
            return _guaraniSign!!
        }
        _guaraniSign = Builder(name = "GuaraniSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.36f, 12.49f)
                curveToRelative(-0.66f, -0.93f, -1.73f, -1.49f, -2.88f, -1.49f)
                horizontalLineToRelative(-5.99f)
                lineTo(13.49f, 4.14f)
                curveToRelative(2.44f, 0.46f, 4.54f, 2.02f, 5.68f, 4.31f)
                lineToRelative(2.69f, -1.33f)
                curveToRelative(-1.65f, -3.32f, -4.77f, -5.53f, -8.37f, -6.01f)
                lineTo(13.49f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.49f, 1.1f)
                curveTo(5.15f, 1.84f, 1.01f, 6.45f, 1.01f, 12.0f)
                reflectiveCurveToRelative(4.14f, 10.17f, 9.49f, 10.9f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.1f)
                curveToRelative(4.22f, -0.55f, 7.92f, -3.38f, 9.3f, -7.25f)
                curveToRelative(0.38f, -1.05f, 0.21f, -2.23f, -0.44f, -3.16f)
                close()
                moveTo(4.01f, 12.0f)
                curveToRelative(0.0f, -3.89f, 2.8f, -7.15f, 6.49f, -7.86f)
                verticalLineToRelative(15.72f)
                curveToRelative(-3.69f, -0.7f, -6.49f, -3.96f, -6.49f, -7.86f)
                close()
                moveTo(19.97f, 14.64f)
                curveToRelative(-0.95f, 2.66f, -3.54f, 4.69f, -6.47f, 5.22f)
                verticalLineToRelative(-5.86f)
                horizontalLineToRelative(5.99f)
                curveToRelative(0.24f, 0.0f, 0.38f, 0.16f, 0.42f, 0.22f)
                curveToRelative(0.06f, 0.09f, 0.13f, 0.24f, 0.06f, 0.42f)
                close()
            }
        }
        .build()
        return _guaraniSign!!
    }

private var _guaraniSign: ImageVector? = null
