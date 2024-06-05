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

public val Icons.Bold.CruzeiroSign: ImageVector
    get() {
        if (_cruzeiroSign != null) {
            return _cruzeiroSign!!
        }
        _cruzeiroSign = Builder(name = "CruzeiroSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.35f, 17.16f)
                lineToRelative(2.67f, 1.38f)
                curveToRelative(-1.74f, 3.37f, -5.18f, 5.46f, -8.97f, 5.46f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-5.56f, 0.0f, -10.09f, -4.53f, -10.09f, -10.09f)
                verticalLineToRelative(-3.82f)
                curveTo(2.0f, 4.53f, 6.53f, 0.0f, 12.09f, 0.0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(3.86f, 0.0f, 7.32f, 2.15f, 9.04f, 5.6f)
                lineToRelative(-2.69f, 1.34f)
                curveToRelative(-1.21f, -2.43f, -3.64f, -3.94f, -6.35f, -3.94f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-3.91f, 0.0f, -7.09f, 3.18f, -7.09f, 7.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0.0f, 2.8f, 1.63f, 5.23f, 4.0f, 6.38f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.02f)
                curveToRelative(1.01f, -0.65f, 2.21f, -1.02f, 3.5f, -1.02f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                reflectiveCurveToRelative(0.06f, 0.0f, 0.09f, 0.0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(2.66f, 0.0f, 5.08f, -1.47f, 6.3f, -3.84f)
                close()
            }
        }
        .build()
        return _cruzeiroSign!!
    }

private var _cruzeiroSign: ImageVector? = null
